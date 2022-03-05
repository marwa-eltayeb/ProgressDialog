package com.marwaeltayeb.loadingdialog;

import android.content.Context;
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
}
