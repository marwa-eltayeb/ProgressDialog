package com.marwaeltayeb.loadingdialog;

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

    private final AlertDialog loadingDialog;
    private final LinearLayout loadingDialogLayout;
    private final TextView txtFeedBack;
    private final ProgressBar progressBar;

    public ProgressDialog(Context context) {
        final View view = LayoutInflater.from(context).inflate(R.layout.layout_progress_dialog, null);

        loadingDialog = new AlertDialog.Builder(context).create();
        loadingDialog.setView(view);

        loadingDialogLayout = view.findViewById(R.id.loadingDialogLayout);
        txtFeedBack = view.findViewById(R.id.txtFeedBack);
        progressBar = view.findViewById(R.id.progressBar);
    }

    public ProgressDialog setText(String text) {
        this.txtFeedBack.setText(text);
        return this;
    }

    public ProgressDialog setTextSize(float size) {
        this.txtFeedBack.setTextSize(size);
        return this;
    }

    public ProgressDialog setTextVisibility(int visibility) {
        this.txtFeedBack.setVisibility(visibility);
        return this;
    }

    public ProgressDialog setTextColor(int color){
        this.txtFeedBack.setTextColor(color);
        return this;
    }

    public ProgressDialog setTextBackground(int color){
        this.txtFeedBack.setBackgroundColor(color);
        return this;
    }

    public ProgressDialog setTextPadding(int left, int top, int right, int bottom){
        this.txtFeedBack.setPadding( left,  top,  right,  bottom);
        return this;
    }

    public ProgressDialog setTextPadding(int padding){
        this.txtFeedBack.setPadding( padding,  padding,  padding,  padding);
        return this;
    }

    public ProgressDialog setTextPaddingBottom(int padding){
        this.txtFeedBack.setPadding( txtFeedBack.getPaddingLeft(),  txtFeedBack.getPaddingTop(),  txtFeedBack.getPaddingRight(),  padding);
        return this;
    }

    public ProgressDialog setTextShape(int shape){
        this.txtFeedBack.setBackgroundResource(shape);
        return this;
    }

    public ProgressDialog setTextFont(Typeface typeface){
        this.txtFeedBack.setTypeface(typeface);
        return this;
    }

    public void show(){
        this.loadingDialog.show();
    }

    public void hide(){
        this.loadingDialog.hide();
    }

    public void dismiss() {
        this.loadingDialog.dismiss();
    }

    public void cancel() {
        this.loadingDialog.cancel();
    }

    public boolean isShowing() {
        return this.loadingDialog.isShowing();
    }

    public ProgressDialog setTitle(String title) {
        this.loadingDialog.setTitle(title);
        return this;
    }

    public ProgressDialog setCustomTitle(View customTitle) {
        this.loadingDialog.setCustomTitle(customTitle);
        return this;
    }

    public ProgressDialog setMessage(String message) {
        this.loadingDialog.setMessage(message);
        return this;
    }

    public ProgressDialog setIcon(int resID) {
        this.loadingDialog.setIcon(resID);
        return this;
    }

    public ProgressDialog setOnShowListener(DialogInterface.OnShowListener listener) {
        this.loadingDialog.setOnShowListener(listener);
        return this;
    }

    public ProgressDialog setOnCancelListener(DialogInterface.OnCancelListener listener) {
        this.loadingDialog.setOnCancelListener(listener);
        return this;
    }

    public ProgressDialog setOnDismissListener(DialogInterface.OnDismissListener listener) {
        this.loadingDialog.setOnDismissListener(listener);
        return this;
    }

    public ProgressDialog setCancelable(boolean cancelable) {
        this.loadingDialog.setCancelable(cancelable);
        return this;
    }

    public ProgressDialog setDialogDimAmount(float amount) {
        loadingDialog.getWindow().setDimAmount(amount);
        return this;
    }

    public ProgressDialog setDialogTransparent(){
        loadingDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        return this;
    }

    public ProgressDialog setDialogBackground(int color){
        this.loadingDialogLayout.setBackgroundColor(color);
        return this;
    }

    public ProgressDialog setDialogBackgroundDrawable(Drawable drawable) {
        this.loadingDialogLayout.setBackground(drawable);
        return this;
    }

    public ProgressDialog setDialogPadding(int padding){
        this.loadingDialogLayout.setPadding( padding,  padding,  padding,  padding);
        return this;
    }

    public ProgressDialog setDialogGravity(int position){
        loadingDialog.getWindow().setGravity(position);
        return this;
    }

    public ProgressDialog setDialogHeight(int height) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(loadingDialog.getWindow().getAttributes());
        layoutParams.height = height;
        loadingDialog.getWindow().setAttributes(layoutParams);
        return this;
    }

    public ProgressDialog setDialogWidth(int width) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(loadingDialog.getWindow().getAttributes());
        layoutParams.width = width;
        loadingDialog.getWindow().setAttributes(layoutParams);
        return this;
    }

    public ProgressDialog setProgressBarColor(int color){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            this.progressBar.getIndeterminateDrawable().setColorFilter(new BlendModeColorFilter(color, BlendMode.SRC_ATOP));
        } else {
            this.progressBar.getIndeterminateDrawable().setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
        }
        return this;
    }

    public ProgressDialog setProgressBarBackGround(int color){
        this.progressBar.setBackgroundColor(color);
        return this;
    }

    public ProgressDialog setProgressBarBackGround(Drawable drawable){
        this.progressBar.setBackground(drawable);
        return this;
    }

    public ProgressDialog hideProgressBar(){
        this.progressBar.setVisibility(View.INVISIBLE);
        return this;
    }

    public ProgressDialog showProgressBar(){
        this.progressBar.setVisibility(View.VISIBLE);
        return this;
    }
    
    public ProgressDialog setProgressBarShape(Drawable drawable) {
        this.progressBar.setIndeterminateDrawable(drawable);
        return this;
    }
}
