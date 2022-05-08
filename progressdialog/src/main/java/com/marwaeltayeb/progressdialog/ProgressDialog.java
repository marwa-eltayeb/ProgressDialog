package com.marwaeltayeb.progressdialog;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

public class ProgressDialog {

    /**
     * AlertDialog variable to setup and control the ProgressDialog
     */
    private final AlertDialog progressDialog;
    /**
     *  View to control the main layout of ProgressDialog
     */
    private final LinearLayout progressDialogLayout;
    /**
     * View to control the message of ProgressDialog
     */
    private final TextView txtFeedBack;
    /**
     * View to control the progressBar of ProgressDialog
     */
    private final ProgressBar progressBar;
    /**
     * View to control the percentage of ProgressDialog
     */
    private final TextView txtProgressbarPercent;

    public ProgressDialog(Context context) {
        final View view = LayoutInflater.from(context).inflate(R.layout.layout_progress_dialog, null);

        progressDialog = new AlertDialog.Builder(context).create();
        progressDialog.setView(view);

        progressDialogLayout = view.findViewById(R.id.progressDialogLayout);
        txtFeedBack = view.findViewById(R.id.txtFeedBack);
        progressBar = view.findViewById(R.id.progressBar);
        txtProgressbarPercent = view.findViewById(R.id.txtProgressbarPercent);
    }

    /**
     * Set the text of the FeedBack
     * @param text of the FeedBack
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setText(String text) {
        this.txtFeedBack.setText(text);
        return this;
    }

    /**
     * Set the size of the FeedBack text
     * @param size of the FeedBack text
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setTextSize(float size) {
        this.txtFeedBack.setTextSize(size);
        return this;
    }

    /**
     * Set the visibility of FeedBack text.
     * @param visibility value of the feedback text (VISIBLE, INVISIBLE or GONE)
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setTextVisibility(int visibility) {
        this.txtFeedBack.setVisibility(visibility);
        return this;
    }

    /**
     * Set the color of the FeedBack text.
     * @param color of the FeedBack text
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setTextColor(int color){
        this.txtFeedBack.setTextColor(color);
        return this;
    }

    /**
     * Set the color of the FeedBack text background
     * @param color of the FeedBack text background
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setTextBackground(int color){
        this.txtFeedBack.setBackgroundColor(color);
        return this;
    }

    /**
     * Set the padding of the FeedBack text
     * @param  left padding of the FeedBack text
     * @param  top padding of the FeedBack text
     * @param  right padding of the FeedBack text
     * @param  bottom padding of the FeedBack text
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setTextPadding(int left, int top, int right, int bottom){
        this.txtFeedBack.setPadding( left,  top,  right,  bottom);
        return this;
    }

    /**
     * Set the padding of the FeedBack text
     * @param  padding of the FeedBack text
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setTextPadding(int padding){
        this.txtFeedBack.setPadding( padding,  padding,  padding,  padding);
        return this;
    }

    /**
     * Set the bottom padding of the FeedBack text
     * @param  bottom padding of the FeedBack text
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setTextPaddingBottom(int bottom){
        this.txtFeedBack.setPadding( txtFeedBack.getPaddingLeft(),  txtFeedBack.getPaddingTop(),  txtFeedBack.getPaddingRight(),  bottom);
        return this;
    }

    /**
     * Set the custom shape of the FeedBack text
     * @param shape of the FeedBack text
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setTextShape(int shape){
        this.txtFeedBack.setBackgroundResource(shape);
        return this;
    }

    /**
     * Set the font of the FeedBack text
     * @param font of the FeedBack text
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setTextFont(Typeface font){
        this.txtFeedBack.setTypeface(font);
        return this;
    }

    /**
     * Show ProgressDialog
     */
    public void show(){
        this.progressDialog.show();
    }

    /**
     * Hide ProgressDialog
     */
    public void hide(){
        this.progressDialog.hide();
    }

    /**
     * Dismiss ProgressDialog
     */
    public void dismiss() {
        this.progressDialog.dismiss();
    }

    /**
     * Cancel ProgressDialog
     */
    public void cancel() {
        this.progressDialog.cancel();
    }

    /**
     * @return true if ProgressDialog is showing
     */
    public boolean isShowing() {
        return this.progressDialog.isShowing();
    }

    /**
     * Set the title of the ProgressDialog
     * @param title of the ProgressDialog
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setTitle(String title) {
        this.progressDialog.setTitle(title);
        return this;
    }

    /**
     * Set the custom title of the ProgressDialog
     * @param customTitle of the ProgressDialog
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setCustomTitle(View customTitle) {
        this.progressDialog.setCustomTitle(customTitle);
        return this;
    }

    /**
     * Set the message of the ProgressDialog
     * @param message of the ProgressDialog
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setMessage(String message) {
        this.progressDialog.setMessage(message);
        return this;
    }

    /**
     * Set the icon of the ProgressDialog
     * @param resID - the resourceId of the drawable to use as the icon or 0 if you don't want an icon
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setIcon(int resID) {
        this.progressDialog.setIcon(resID);
        return this;
    }

    /**
     * Set a listener to be invoked when the ProgressDialog is shown.
     * @param listener DialogInterface.OnShowListener listener to use.
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setOnShowListener(DialogInterface.OnShowListener listener) {
        this.progressDialog.setOnShowListener(listener);
        return this;
    }

    /**
     * Set a listener to be invoked when the ProgressDialog is canceled.
     * @param listener DialogInterface.OnCancelListener listener to use.
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setOnCancelListener(DialogInterface.OnCancelListener listener) {
        this.progressDialog.setOnCancelListener(listener);
        return this;
    }

    /**
     * Set a listener to be invoked when the ProgressDialog is dismissed.
     * @param listener DialogInterface.OnDismissListener listener to use.
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setOnDismissListener(DialogInterface.OnDismissListener listener) {
        this.progressDialog.setOnDismissListener(listener);
        return this;
    }

    /**
     * Set whether this ProgressDialog is cancelable
     * @param cancelable the dialog will not be cancelled by the end user if the value is false
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setCancelable(boolean cancelable) {
        this.progressDialog.setCancelable(cancelable);
        return this;
    }

    /**
     * Set dim amount for ProgressDialog
     * @param amount of the dim attribute
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setDialogDimAmount(float amount) {
        progressDialog.getWindow().setDimAmount(amount);
        return this;
    }

    /**
     * Set ProgressDialog to transparent
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setDialogTransparent(){
        progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        return this;
    }

    /**
     * Set the Background color of the ProgressDialog
     * @param color of the ProgressDialog Background
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setDialogBackground(int color){
        this.progressDialogLayout.setBackgroundColor(color);
        return this;
    }

    /**
     * Set the Background color of the ProgressDialog
     * @param drawable - The Drawable to use as the background, or null to remove the background
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setDialogBackgroundDrawable(Drawable drawable) {
        this.progressDialogLayout.setBackground(drawable);
        return this;
    }

    /**
     * Set the padding of the ProgressDialog
     * @param  padding of the ProgressDialog
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setDialogPadding(int padding){
        this.progressDialogLayout.setPadding( padding,  padding,  padding,  padding);
        return this;
    }

    /**
     * Set the gravity of the ProgressDialog
     * @param  position – The position of ProgressDialog.
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setDialogGravity(int position){
        progressDialog.getWindow().setGravity(position);
        return this;
    }

    /**
     * Set the height of the ProgressDialog
     * @param height - value of the ProgressDialog layout
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setDialogHeight(int height) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(progressDialog.getWindow().getAttributes());
        layoutParams.height = height;
        progressDialog.getWindow().setAttributes(layoutParams);
        return this;
    }

    /**
     * Set the width of the ProgressDialog
     * @param width - value of the ProgressDialog layout
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setDialogWidth(int width) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(progressDialog.getWindow().getAttributes());
        layoutParams.width = width;
        progressDialog.getWindow().setAttributes(layoutParams);
        return this;
    }

    /**
     * Set the color of ProgressBar
     * @param color of the ProgressBar
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setProgressBarColor(int color){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            this.progressBar.getIndeterminateDrawable().setColorFilter(new BlendModeColorFilter(color, BlendMode.SRC_ATOP));
        } else {
            this.progressBar.getIndeterminateDrawable().setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
        }
        return this;
    }

    /**
     * Set the background color of ProgressBar
     * @param color of the ProgressBar
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setProgressBarBackGround(int color){
        this.progressBar.setBackgroundColor(color);
        return this;
    }

    /**
     * Set the background color of ProgressBar
     * @param drawable – The Drawable to use as the background, or null to remove the background
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setProgressBarBackGround(Drawable drawable){
        this.progressBar.setBackground(drawable);
        return this;
    }

    /**
     * Define the drawable used to draw the progress bar in progress mode.
     * @param drawable – the new drawable
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setProgressDrawable(Drawable drawable){
        this.progressBar.setProgressDrawable(drawable);
        return this;
    }

    /**
     * Set the visibility state of ProgressBar.
     * @param  visibility - value of ProgressBar (VISIBLE, INVISIBLE or GONE)
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setProgressBarVisibility(int visibility){
        this.progressBar.setVisibility(View.INVISIBLE);
        return this;
    }

    /**
     * Set the current progress to the specified value.
     * @param progress – the new progress
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setProgress(int progress){
        progressBar.setProgress(progress);
        return this;
    }

    /**
     * Set the upper range of the progress bar max.
     * @param max – the upper range of this progress bar.
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setProgressMax(int max){
        progressBar.setMax(max);
        return this;
    }

    /**
     * Define the drawable used to draw the progress bar in indeterminate mode.
     * @param drawable – the new drawable
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setProgressBarShape(Drawable drawable) {
        this.progressBar.setIndeterminateDrawable(drawable);
        return this;
    }

    /**
     * Set the padding of the Progressbar
     * @param  padding of the ProgressDialog
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setProgressBarPadding(int padding){
        this.progressBar.setPadding( padding,  padding,  padding,  padding);
        return this;
    }

    /**
     * Set the Percentage of Progressbar
     * @param text - percentage of Progressbar
     * @return the instance of ProgressDialog to make a chain of function easily
     */
    public ProgressDialog setProgressbarPercent(String text) {
        this.txtProgressbarPercent.setText(text);
        return this;
    }
}
