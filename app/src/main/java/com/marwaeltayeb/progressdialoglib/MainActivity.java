package com.marwaeltayeb.progressdialoglib;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.marwaeltayeb.progressdialog.ProgressDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button defaultDialogButton = findViewById(R.id.defaultDialogButton);
        defaultDialogButton.setOnClickListener(view -> launchDefaultProgressDialog());

        Button colorfulDialogButton = findViewById(R.id.colorfulDialogButton);
        colorfulDialogButton.setOnClickListener(view -> launchColorfulProgressDialog());

        Button gradientDialogButton = findViewById(R.id.gradientDialogButton);
        gradientDialogButton.setOnClickListener(view -> launchGradientProgressDialog());

        Button transparentDialogButton = findViewById(R.id.transparentDialogButton);
        transparentDialogButton.setOnClickListener(view -> launchTransparentProgressDialog());

        Button sunsetDialogButton = findViewById(R.id.sunsetDialogButton);
        sunsetDialogButton.setOnClickListener(view -> launchSunsetDialog());

        Button chargingDialogButton = findViewById(R.id.chargingDialogButton);
        chargingDialogButton.setOnClickListener(view -> launchChargingProgressDialog());

        Button rotatingImageDialogButton = findViewById(R.id.rotatingImageDialogButton);
        rotatingImageDialogButton.setOnClickListener(view -> launchRotatingImageDialog());

        Button changingQuarterDialogButton = findViewById(R.id.changingQuarterDialogButton);
        changingQuarterDialogButton.setOnClickListener(view -> launchChangingQuarterDialog());
    }

    private void launchDefaultProgressDialog(){
        ProgressDialog progressDialog = new ProgressDialog(this)
                .setDialogPadding(50)
                .setTitle("Please Wait..")
                .setText("Preparing to download...");

        progressDialog.show();
    }

    private void launchColorfulProgressDialog(){

        TextView textView = new TextView(this);
        textView.setText(getResources().getString(R.string.please_wait));
        textView.setPadding(20, 30, 20, 30);
        textView.setTextSize(20F);
        textView.setBackgroundColor(getResources().getColor(R.color.pink));
        textView.setTextColor(Color.WHITE);

        ProgressDialog progressDialog = new ProgressDialog(this)
                .setDialogPadding(50)
                .setCustomTitle(textView)
                .setTextSize(18)
                .setProgressBarColor(getResources().getColor(R.color.pink))
                .setText("Loading...");

        progressDialog.show();
    }

    private void launchGradientProgressDialog(){

        ProgressDialog progressDialog = new ProgressDialog(this)
                .setDialogPadding(30)
                .setDialogBackground(Color.BLACK)
                .setTextSize(18)
                .setTextColor(getResources().getColor(R.color.orange))
                .setTextFont(Typeface.MONOSPACE)
                .setProgressBarShape(ContextCompat.getDrawable(this, R.drawable.gradient_progress))
                .setText("Loading...");

        progressDialog.show();
    }

    private void launchTransparentProgressDialog(){

        ProgressDialog progressDialog = new ProgressDialog(this)
                .setDialogPadding(50)
                .setDialogTransparent()
                .setDialogDimAmount(0)
                .setTextSize(18)
                .setTextColor(Color.BLACK)
                .setProgressBarColor(Color.RED)
                .setText("Loading...");

        progressDialog.show();
    }

    private void launchSunsetDialog(){

        TextView textView = new TextView(this);
        textView.setText(getResources().getString(R.string.sunset));
        textView.setPadding(20, 30, 20, 30);
        textView.setTextSize(20F);
        textView.setBackgroundColor(getResources().getColor(R.color.dark_red));
        textView.setTextColor(Color.WHITE);

        ProgressDialog progressDialog = new ProgressDialog(this)
                .setDialogPadding(50)
                .setCustomTitle(textView)
                .setTextSize(18)
                .setProgressBarPadding(20)
                .setProgressBarShape(ContextCompat.getDrawable(this, R.drawable.animated_images))
                .setText("Waiting...");

        progressDialog.show();
    }

    private void launchChargingProgressDialog(){

        ProgressDialog progressDialog = new ProgressDialog(this)
                .setDialogPadding(50)
                .setTextSize(18)
                .setDialogBackground(Color.BLACK)
                .setTextColor(Color.WHITE)
                .setProgressBarPadding(10)
                .setProgressBarShape(ContextCompat.getDrawable(this,R.drawable.battery_charge_fill))
                .setText("Charging...");

        progressDialog.show();
    }

    private void launchRotatingImageDialog(){
        ProgressDialog progressDialog = new ProgressDialog(this)
                .setDialogPadding(50)
                .setTextSize(18)
                .setDialogBackground(Color.BLACK)
                .setTextColor(Color.WHITE)
                .setProgressBarPadding(10)
                .setProgressBarShape(ContextCompat.getDrawable(this,R.drawable.rotating_image))
                .setText("Loading...");

        progressDialog.show();
    }

    private void launchScanningDialog(){
        ProgressDialog progressDialog = new ProgressDialog(this)
                .setDialogPadding(50)
                .setTextSize(18)
                .setDialogBackground(Color.BLACK)
                .setTextColor(getResources().getColor(R.color.dark_green))
                .setProgressBarPadding(15)
                .setProgressBarShape(ContextCompat.getDrawable(this,R.drawable.scanning))
                .setText("Scanning...");

        progressDialog.show();
    }

    private void launchChangingQuarterDialog(){
        ProgressDialog progressDialog = new ProgressDialog(this)
                .setDialogPadding(50)
                .setTextSize(16)
                .setDialogBackground(Color.WHITE)
                .setTextColor(getResources().getColor(R.color.teal))
                .setProgressBarPadding(10)
                .setTextFont(Typeface.MONOSPACE)
                .setProgressBarShape(ContextCompat.getDrawable(this, R.drawable.quarters))
                .setText("Preparing...");

        progressDialog.show();
    }
}