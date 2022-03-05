package com.marwaeltayeb.loadingdialog;

import android.content.Context;
import android.graphics.Typeface;
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
}
