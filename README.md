# titanium_module_emoji_android
* emoji module for titanium android
* lmxbitihero@126.com

## Description

This Module wrappers Emoji icons for Titanium Android platform.

## Accessing the emoji Module

To access this module from JavaScript, you would do the following:

    var emoji = require("com.mamashai.emoji");

The emoji variable is a reference to the Module object.

## Reference

emoji.createLabel
emoji.createTextField
emoji.createTextArea

## Usage
```ruby
emoji.createLabel({
		top: 2*factor,
		left: 10*factor,
		right: 10*factor,
		height: Ti.UI.SIZE,
		text: "😁font 10",
		color: "blue",
		font: {fontSize: 14*factor},
		backgroundColor: "red"
})
```

if you want to pass html to label, try:
```ruby
emoji.createLabel({
		top: 2*factor,
		left: 10*factor,
		right: 10*factor,
		height: Ti.UI.SIZE,
		html: "😁from web html, font 20 <a href='http://twitter.com'>twitter</a>",
		color: "blue",
		font: {fontSize: 14*factor},
		backgroundColor: "red"
})
```

```ruby
emoji.createTextField({
		value: "😳text field font 20",
		top: 2*factor,
		left: 10*factor,
		right: 10*factor,
		height: Ti.UI.SIZE,
		font: {fontSize: 20*factor}
});
	
emoji.createTextArea({
		value: "😁text area font 14",
		top: 2*factor,
		left: 10*factor,
		right: 10*factor,
		height: 60*factor,
		font: {fontSize: 14*factor}
});
```
