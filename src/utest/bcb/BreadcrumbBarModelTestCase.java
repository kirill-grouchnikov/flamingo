package utest.bcb;

import java.io.File;
import java.util.Arrays;

import junit.framework.TestCase;

import org.pushingpixels.flamingo.api.bcb.BreadcrumbBarModel;
import org.pushingpixels.flamingo.api.bcb.BreadcrumbItem;

public class BreadcrumbBarModelTestCase extends TestCase {
	public void testEmptyStringModel() {
		BreadcrumbBarModel<String> model = new BreadcrumbBarModel<String>();
		assertEquals(model.getItemCount(), 0);
		assertNull(model.getItem(0));
		assertEquals(model.getItems().size(), 0);
	}

	public void testEmptyFileModel() {
		BreadcrumbBarModel<File> model = new BreadcrumbBarModel<File>();
		assertEquals(model.getItemCount(), 0);
		assertNull(model.getItem(0));
		assertEquals(model.getItems().size(), 0);
	}

	public void testAddingToStringModel() {
		BreadcrumbBarModel<String> model = new BreadcrumbBarModel<String>();

		BreadcrumbItem<String> item1 = new BreadcrumbItem<String>("key1",
				"data1");
		model.addLast(item1);
		assertEquals(model.getItemCount(), 1);
		assertEquals(model.getItem(0), item1);
		assertNull(model.getItem(-1));
		assertNull(model.getItem(1));
		assertEquals(model.getItems().size(), 1);
		assertEquals(model.getItems().get(0), item1);

		BreadcrumbItem<String> item2 = new BreadcrumbItem<String>("key2",
				"data2");
		model.addLast(item2);
		assertEquals(model.getItemCount(), 2);
		assertEquals(model.getItem(0), item1);
		assertEquals(model.getItem(1), item2);
		assertNull(model.getItem(-1));
		assertNull(model.getItem(2));
		assertEquals(model.getItems().size(), 2);
		assertEquals(model.getItems().get(0), item1);
		assertEquals(model.getItems().get(1), item2);
	}

	public void testReplacingInStringModel() {
		BreadcrumbBarModel<String> model = new BreadcrumbBarModel<String>();

		BreadcrumbItem<String> item1 = new BreadcrumbItem<String>("key1",
				"data1");
		model.addLast(item1);
		BreadcrumbItem<String> item2 = new BreadcrumbItem<String>("key2",
				"data2");
		model.addLast(item2);

		BreadcrumbItem<String> item3 = new BreadcrumbItem<String>("key3",
				"data3");
		model.replace(Arrays.asList(item3));

		assertEquals(model.getItemCount(), 1);
		assertEquals(model.getItem(0), item3);
		assertNull(model.getItem(-1));
		assertNull(model.getItem(1));
		assertEquals(model.getItems().size(), 1);
		assertEquals(model.getItems().get(0), item3);

		BreadcrumbItem<String> item4 = new BreadcrumbItem<String>("key4",
				"data4");
		BreadcrumbItem<String> item5 = new BreadcrumbItem<String>("key5",
				"data5");
		model.replace(Arrays.asList(item4, item5));

		assertEquals(model.getItemCount(), 2);
		assertEquals(model.getItem(0), item4);
		assertEquals(model.getItem(1), item5);
		assertNull(model.getItem(-1));
		assertNull(model.getItem(2));
		assertEquals(model.getItems().size(), 2);
		assertEquals(model.getItems().get(0), item4);
		assertEquals(model.getItems().get(1), item5);

		model.replace(Arrays.asList(item4));

		assertEquals(model.getItemCount(), 1);
		assertEquals(model.getItem(0), item4);
		assertNull(model.getItem(-1));
		assertNull(model.getItem(1));
		assertEquals(model.getItems().size(), 1);
		assertEquals(model.getItems().get(0), item4);
	}

	public void testResettingInStringModel() {
		BreadcrumbBarModel<String> model = new BreadcrumbBarModel<String>();

		BreadcrumbItem<String> item1 = new BreadcrumbItem<String>("key1",
				"data1");
		model.addLast(item1);
		BreadcrumbItem<String> item2 = new BreadcrumbItem<String>("key2",
				"data2");
		model.addLast(item2);

		model.reset();

		assertEquals(model.getItemCount(), 0);
		assertNull(model.getItem(0));
		assertNull(model.getItem(-1));
		assertNull(model.getItem(1));
		assertEquals(model.getItems().size(), 0);

		BreadcrumbItem<String> item3 = new BreadcrumbItem<String>("key3",
				"data3");
		model.replace(Arrays.asList(item3));

		assertEquals(model.getItemCount(), 1);
		assertEquals(model.getItem(0), item3);
		assertNull(model.getItem(-1));
		assertNull(model.getItem(1));
		assertEquals(model.getItems().size(), 1);
		assertEquals(model.getItems().get(0), item3);

		model.reset();

		assertEquals(model.getItemCount(), 0);
		assertNull(model.getItem(0));
		assertNull(model.getItem(-1));
		assertNull(model.getItem(1));
		assertEquals(model.getItems().size(), 0);
	}

	public void testRemovingFromStringModel() {
		BreadcrumbBarModel<String> model = new BreadcrumbBarModel<String>();

		BreadcrumbItem<String> item1 = new BreadcrumbItem<String>("key1",
				"data1");
		model.addLast(item1);
		BreadcrumbItem<String> item2 = new BreadcrumbItem<String>("key2",
				"data2");
		model.addLast(item2);
		model.removeLast();

		assertEquals(model.getItemCount(), 1);
		assertEquals(model.getItem(0), item1);
		assertNull(model.getItem(-1));
		assertNull(model.getItem(1));
		assertEquals(model.getItems().size(), 1);
		assertEquals(model.getItems().get(0), item1);

		BreadcrumbItem<String> item3 = new BreadcrumbItem<String>("key3",
				"data3");
		model.addLast(item3);
		BreadcrumbItem<String> item4 = new BreadcrumbItem<String>("key4",
				"data4");
		model.addLast(item4);
		model.removeLast();

		assertEquals(model.getItemCount(), 2);
		assertEquals(model.getItem(0), item1);
		assertEquals(model.getItem(1), item3);
		assertNull(model.getItem(-1));
		assertNull(model.getItem(2));
		assertEquals(model.getItems().size(), 2);
		assertEquals(model.getItems().get(0), item1);
		assertEquals(model.getItems().get(1), item3);
	}

	public void testIndexOfStringModel() {
		BreadcrumbBarModel<String> model = new BreadcrumbBarModel<String>();

		BreadcrumbItem<String> item1 = new BreadcrumbItem<String>("key1",
				"data1");
		model.addLast(item1);
		BreadcrumbItem<String> item2 = new BreadcrumbItem<String>("key2",
				"data2");
		model.addLast(item2);
		
		assertEquals(model.indexOf(item1), 0);
		assertEquals(model.indexOf(item2), 1);

		BreadcrumbItem<String> item3 = new BreadcrumbItem<String>("key3",
				"data3");
		
		assertEquals(model.indexOf(item3), -1);
		
		model.addLast(item3);

		assertEquals(model.indexOf(item1), 0);
		assertEquals(model.indexOf(item2), 1);
		assertEquals(model.indexOf(item3), 2);
	}
}
