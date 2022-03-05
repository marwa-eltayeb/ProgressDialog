package com.marwaeltayeb.loadingdialog;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

public class LoadingDialog {

    private final AlertDialog loadingDialog;
    private final LinearLayout loadingDialogLayout;
    private final TextView txtFeedBack;
    private final ProgressBar progressBar;

    public LoadingDialog(Context context) {
        final View view = LayoutInflater.from(context).inflate(R.layout.layout_loading_dialog, null);

        loadingDialog = new AlertDialog.Builder(context).create();
        loadingDialog.setView(view);

        loadingDialogLayout = view.findViewById(R.id.loadingDialogLayout);
        txtFeedBack = view.findViewById(R.id.txtFeedBack);
        progressBar = view.findViewById(R.id.progressBar);
    }

    public LoadingDialog setText(String text) {
        this.txtFeedBack.setText(text);
        return this;
    }

    public LoadingDialog setTextSize(float size) {
        this.txtFeedBack.setTextSize(size);
        return this;
    }

    public LoadingDialog setTextVisibility(int visibility) {
        this.txtFeedBack.setVisibility(visibility);
        return this;
    }

    public LoadingDialog setTextColor(int color){
        this.txtFeedBack.setTextColor(color);
        return this;
    }

    public LoadingDialog setTextBackground(int color){
        this.txtFeedBack.setBackgroundColor(color);
        return this;
    }

    public LoadingDialog setTextPadding(int left, int top, int right, int bottom){
        this.txtFeedBack.setPadding( left,  top,  right,  bottom);
        return this;
    }

    public LoadingDialog setTextPadding(int padding){
        this.txtFeedBack.setPadding( padding,  padding,  padding,  padding);
        return this;
    }

    public LoadingDialog setTextPaddingBottom(int padding){
        this.txtFeedBack.setPadding( txtFeedBack.getPaddingLeft(),  txtFeedBack.getPaddingTop(),  txtFeedBack.getPaddingRight(),  padding);
        return this;
    }

    public LoadingDialog setTextShape(int shape){
        this.txtFeedBack.setBackgroundResource(shape);
        return this;
    }

    public LoadingDialog setTextFont(Typeface typeface){
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

    public LoadingDialog setTitle(String title) {
        this.loadingDialog.setTitle(title);
        return this;
    }

    public LoadingDialog setCustomTitle(View customTitle) {
        this.loadingDialog.setCustomTitle(customTitle);
        return this;
    }

    public LoadingDialog setMessage(String message) {
        this.loadingDialog.setMessage(message);
        return this;
    }

    public LoadingDialog setIcon(int resID) {
        this.loadingDialog.setIcon(resID);
        return this;
    }

    public LoadingDialog setOnShowListener(DialogInterface.OnShowListener listener) {
        this.loadingDialog.setOnShowListener(listener);
        return this;
    }

    public LoadingDialog setOnCancelListener(DialogInterface.OnCancelListener listener) {
        this.loadingDialog.setOnCancelListener(listener);
        return this;
    }

    public LoadingDialog setOnDismissListener(DialogInterface.OnDismissListener listener) {
        this.loadingDialog.setOnDismissListener(listener);
        return this;
    }

    public LoadingDialog setCancelable(boolean cancelable) {
        this.loadingDialog.setCancelable(cancelable);
        return this;
    }

    public LoadingDialog setDialogDimAmount(float amount) {
        loadingDialog.getWindow().setDimAmount(amount);
        return this;
    }

    public LoadingDialog setDialogTransparent(){
        loadingDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        return this;
    }

    public LoadingDialog setDialogBackground(int color){
        this.loadingDialogLayout.setBackgroundColor(color);
        return this;
    }

    public LoadingDialog setDialogBackgroundDrawable(Drawable drawable) {
        this.loadingDialogLayout.setBackground(drawable);
        return this;
    }

    
}
