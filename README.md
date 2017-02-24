## Flamingo - advanced components for modern Swing applications

### Resizable icons

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/flamingo/master/www/images/thumbs/learn/resizable-icon.png" width="248" height="274" border=0 align="right">

The `ResizableIcon` extends the core `Icon` interface to allow scaling the icon visuals at runtime. This is especially relevant for controls that can be dynamically resized. This class is used extensively in Flamingo for such controls as ribbon buttons or file viewer panel, but can be used in core and third-party components as well.

The core library provides helper classes to expose a variety of image formats as `ResizableIcon`s, including SVG, SVGZ, ICO and all `ImageIO`-supported formats. Additional helper classes allow decorating, filtering and layering icons to create more advanced functionality.

Want to learn more? Browse the following packages:

* `org.pushingpixels.flamingo.common.icon`
* `org.pushingpixels.flamingo.svg`

### Breadcrumb bar

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/flamingo/master/www/images/thumbs/learn/breadcrumb-bar.png" width="310" height="170" border=0 align="left">

`BreadcrumbBar` facilitates quick navigation of multi-level hierarchies, such as file systems or XML documents. This functionality is commonly found in many web sites and is the main navigation tool in the Windows Explorer application.

The core library provides helper classes to expose a variety of navigation sources as breadcrumb bars, such as local and remote file systems, SVN repositories and tree models.

Want to learn more? Browse the following packages:

* `org.pushingpixels.flamingo.bcb`
* `org.pushingpixels.flamingo.bcb.core`

### Command buttons

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/flamingo/master/www/images/thumbs/learn/command-button.png" width="372" height="367" border=0 align="right">

The `JCommandButton` and `JCommandToggleButton` provide a broad spectrum of functionality expected from modern UI button components. A short list of features available in Flamingo command buttons includes:

* Dynamic resizing, including scaling icons and text flow.
* Support for popup buttons and split buttons.
* Richer popup contents.
* Auto-repeat mode for invoking the associated actions as long as the button is pressed.
* Action-on-rollover mode for invoking the associated actions (one-time or auto-repeat) on rollover.

Want to learn more? Browse the test applications in the `test.common` package.

### Command button strips and panels

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/flamingo/master/www/images/thumbs/learn/command-button-strip-panel.png" width="336" height="367" border=0 align="left">

`JCommandButtonStrip` allows hosting a number of command buttons in a single row or column, providing continuous visuals for the buttons.

`JCommandButtonPanel` allows hosting a number of command buttons in either row-fill or column-fill grid. Notable features include:

* Button grouping with associated titles
* Single selection mode when hosting toggle command buttons
* Central change of icon size for all hosted buttons

`AbstractFileViewPanel` extends the `JCommandButtonPanel` functionality, targetting file browser applications. Notable additional features include:

* Filtering for visibility
* Progress tracking and load cancellation
* API integration with the breadcrumb bar component

### Ribbon

<img src="https://raw.githubusercontent.com/kirill-grouchnikov/flamingo/master/www/images/thumbs/learn/ribbon.png" width="340" height="210" border=0 align="right">

`JRibbon` provides the functionality of Microsoft Office 2007 Command Bar. A short list of features includes:

* Ribbon tasks and ribbon task bands.
* In-ribbon galleries.
* Contextual ribbon task groups.
* Taskbar components.
* Dynamic adaptive resizing.

Want to learn more? Browse the `org.pushingpixels.flamingo.ribbon` package.
