package utest.common.icon;

import java.awt.Dimension;
import java.net.URL;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.fest.assertions.Assertions;
import org.fest.swing.timing.Condition;
import org.fest.swing.timing.Pause;
import org.junit.Before;
import org.junit.Test;
import org.pushingpixels.flamingo.api.common.AsynchronousLoadListener;
import org.pushingpixels.flamingo.api.common.AsynchronousLoading;
import org.pushingpixels.flamingo.api.common.icon.IcoWrapperResizableIcon;

public class IcoIconResizingTestCase {
	protected IcoWrapperResizableIcon icon;

	@Before
	public void setUp() throws Exception {
		URL resource = IcoIconResizingTestCase.class.getClassLoader()
				.getResource("utest/common/edit-paste.ico");
		Assertions.assertThat(resource).isNotNull();
		this.icon = IcoWrapperResizableIcon.getIcon(resource, new Dimension(32,
				32));
		Assertions.assertThat(this.icon).isNotNull();
		Pause.pause(new Condition("Waiting to load icon") {
			@Override
			public boolean test() {
				return !((AsynchronousLoading) icon).isLoading();
			}
		});
	}

	@Test
	public void noCompletedMessageOnSettingSameHeight() {
		final int[] count = new int[] { 0 };
		final CountDownLatch latch = new CountDownLatch(1);
		AsynchronousLoadListener listener = new AsynchronousLoadListener() {
			@Override
			public void completed(boolean success) {
				count[0]++;
				latch.countDown();
			}
		};
		this.icon.addAsynchronousLoadListener(listener);
		// verify the icon height
		Assertions.assertThat(this.icon.getIconHeight()).isEqualTo(32);
		// set the icon height to the same value
		this.icon.setDimension(new Dimension(32, 32));
		try {
			// latch.await should not return true as that would mean that
			// the asynchronous load listener was notified
			Assertions.assertThat(latch.await(3, TimeUnit.SECONDS)).isFalse();
		} catch (InterruptedException ie) {
			Assertions.assertThat(true).isFalse();
		}
		Assertions.assertThat(count[0]).isEqualTo(0);
		this.icon.removeAsynchronousLoadListener(listener);
	}

	@Test
	public void completedMessageOnSettingDifferentHeight() {
		final int[] count = new int[] { 0 };
		final CountDownLatch latch = new CountDownLatch(1);
		AsynchronousLoadListener listener = new AsynchronousLoadListener() {
			@Override
			public void completed(boolean success) {
				if (success) {
					count[0]++;
				}
				latch.countDown();
			}
		};
		this.icon.addAsynchronousLoadListener(listener);
		// verify the icon height
		Assertions.assertThat(this.icon.getIconHeight()).isEqualTo(32);
		// set the icon height to different value
		this.icon.setDimension(new Dimension(16, 16));
		try {
			latch.await();
		} catch (InterruptedException ie) {
			Assertions.assertThat(true).isFalse();
		}
		Assertions.assertThat(count[0]).isEqualTo(1);
		this.icon.removeAsynchronousLoadListener(listener);
	}

	@Test
	public void changedHeightOnSettingDifferentHeight() {
		final CountDownLatch latch = new CountDownLatch(1);
		AsynchronousLoadListener listener = new AsynchronousLoadListener() {
			@Override
			public void completed(boolean success) {
				latch.countDown();
			}
		};
		this.icon.addAsynchronousLoadListener(listener);
		// verify the icon height
		Assertions.assertThat(this.icon.getIconHeight()).isEqualTo(32);
		// set the icon height to different value
		this.icon.setDimension(new Dimension(16, 16));
		try {
			latch.await();
		} catch (InterruptedException ie) {
			Assertions.assertThat(true).isFalse();
		}
		Assertions.assertThat(icon.getIconHeight()).isEqualTo(16);
		this.icon.removeAsynchronousLoadListener(listener);
	}
}
