# ProgressDialog

![Build](https://github.com/Marwa-Eltayeb/ProgressDialog/actions/workflows/build.yml/badge.svg)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/5c303c206cc94911a42b855e8ee6f419)](https://www.codacy.com/gh/Marwa-Eltayeb/ProgressDialog/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Marwa-Eltayeb/ProgressDialog&amp;utm_campaign=Badge_Grade)
[![CodeFactor](https://www.codefactor.io/repository/github/marwa-eltayeb/progressdialog/badge)](https://www.codefactor.io/repository/github/marwa-eltayeb/progressdialog)
[![Min API Level](https://img.shields.io/badge/API-%2B17-brightgreen)]()
![Maven Central](https://img.shields.io/maven-central/v/io.github.marwa-eltayeb/progressdialog)

Android Library to create various kinds of Custom Progress Dialog 

<img src="media/default_dialog.gif" alt="animated" width="24%"/> <img src="media/colorful_dialog.gif" alt="animated" width="24%"/>
<img src="media/changing_quarter_dialog.gif" alt="animated" width="24%"/> <img src="media/sunset_dialog.gif" alt="animated" width="24%"/>

<img src="media/charging_dialog.gif" alt="animated" width="24%"/> <img src="media/rotating_image_dialog.gif" alt="animated" width="24%"/>
<img src="media/gradient_dialog.gif" alt="animated" width="24%"/> <img src="media/scanning_dialog.gif" alt="animated" width="24%"/>

### Why using ProgressDialog is an asset?

- You have various kinds of dialogs.
- You create your own dialog and use them.
- You can change your ProgressDialog width and height.
- You can customize ProgressDialog title (change text color, size, font and visibility).
- You can customize Feedback message (change color, size, font and visibility).
- You can customize your ProgressBar (change color, size, font and visibility).
- You can add many shapes as a ProgressBar.
- You can use your favorite image as a ProgressBar.
- And much more...

### Add ProgressDialog to your project

From Maven Central
```gradle
implementation 'io.github.marwa-eltayeb:progressdialog:1.0.0'
```

### Code Example

```java

TextView customTitle = new TextView(this);
customTitle.setText(getResources().getString(R.string.please_wait));
customTitle.setPadding(20, 30, 20, 30);
customTitle.setTextSize(20F);
customTitle.setBackgroundColor(getResources().getColor(R.color.pink));
customTitle.setTextColor(Color.WHITE);

ProgressDialog progressDialog = new ProgressDialog(this)
    .setDialogPadding(50)
    .setCustomTitle(customTitle)
    .setTextSize(18)
    .setProgressBarColor(getResources().getColor(R.color.pink))
    .setText("Loading...");

progressDialog.show();
```

### Documentation

ProgressDialog Library is designed with a fluent interface concept which makes it easily customized.

Set ProgressDialog title.
```java
setTitle(String title);
```

Set ProgressDialog custom title.
```java
setCustomTitle(View customTitle)
```

Set ProgressDialog message.
```java
setMessage(String message)
```

Set ProgressDialog icon.
```java
setIcon(int resID)
```

Set ProgressDialog background color.
```java
setDialogBackground(int color)
```

Set ProgressDialog background drawable.
```java
setDialogBackgroundDrawable(Drawable drawable)
```

Set whether ProgressDialog is cancelable.
```java
setCancelable(boolean cancelable)
```

Set ProgressDialog dim amount.
```java
setDialogDimAmount(float amount)
```

Set ProgressDialog to transparent.
```java
setDialogTransparent()
```

Set ProgressDialog padding.
```java
setDialogPadding(int padding)
```

Set ProgressDialog gravity.
```java
setDialogGravity(int position)
```

Set ProgressDialog height.
```java
setDialogHeight(int height)
```

Set ProgressDialog width.
```java
setDialogWidth(int width)
```

Show ProgressDialog.
```java
show()
```

Hide ProgressDialog.
```java
dismiss()
```

Dismiss ProgressDialog.
```java
dismiss()
```

Cancel ProgressDialog.
```java
cancel()
```

Set a listener when ProgressDialog is shown.
```java
setOnShowListener(DialogInterface.OnShowListener listener)
```

Set a listener when ProgressDialog is canceled.
```java
setOnCancelListener(DialogInterface.OnCancelListener listener)
```

Set a listener when ProgressDialog is dismissed.
```java
setOnDismissListener(DialogInterface.OnDismissListener listener)
```

Set ProgressBar color
```java
setProgressBarColor(int color)
```

Set ProgressBar background color 
```java
setProgressBarBackGround(int color)
```

Set ProgressBar background color 
```java
setProgressBarBackGround(Drawable drawable)
```
Define the drawable used to draw the ProgressBar
```java
setProgressDrawable(Drawable drawable)
```

Set ProgressBar visibility
```java
setProgressBarVisibility(int visibility)
```

Set the current progress to the specified value.
```java
setProgress(int progress)
```

Set the upper range of the ProgressBar max.
```java
setProgressMax(int max)
```

Define the drawable used to draw the ProgressBar in indeterminate mode.
```java
setProgressBarShape(Drawable drawable)
```

Set ProgressBar padding
```java
setProgressBarPadding(int padding)
```

Set the Percentage of Progressbar
```java
setProgressbarPercent(String text)
```

Set the text of the FeedBack text
```java
setText(String text)
```

Set the size of the FeedBack text
```java
setTextSize(float size)
```

Set the visibility of FeedBack Text
```java
setTextVisibility(int visibility)
```

Set the color of the FeedBack text
```java
setTextColor(int color)
```

Set the color of the FeedBack text background
```java
setTextBackground(int color)
```

Set the padding of the FeedBack text
```java
setTextPadding(int left, int top, int right, int bottom)
```

Set the padding of the FeedBack text
```java
setTextPadding(int padding)
```

Set the bottom padding of the FeedBack text
```java
setTextPaddingBottom(int bottom)
```

Set the custom shape of the FeedBack text
```java
setTextShape(int shape)
```

Set the font of the FeedBack text
```java
setTextFont(Typeface font)
```


