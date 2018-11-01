package com.example.diy2210.testapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    public static final int MENU = 100;
    public static final int SHOP = 101;
    public static final int PAUSE = 102;
    public static final int PLAY = 103;
    public static final int ACCELERATED = 104;

    private ToggleButton menuTB;
    private ToggleButton shopTB;
    private ToggleButton pauseTB;
    private ToggleButton playTB;
    private ToggleButton acceleratedTB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuTB = findViewById(R.id.menuTB);
        shopTB = findViewById(R.id.shopTB);
        pauseTB = findViewById(R.id.pauseTB);
        playTB = findViewById(R.id.playTB);
        acceleratedTB = findViewById(R.id.acceleratedTB);

        menuTB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAlert(MENU);
            }
        });

        shopTB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAlert(SHOP);
            }
        });

        pauseTB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAlert(PAUSE);
            }
        });

        playTB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAlert(PLAY);
            }
        });

        acceleratedTB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAlert(ACCELERATED);
            }
        });
    }

    private void startAlert(Integer i) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        switch (i) {
            case MENU:
                builder.setMessage(String.valueOf(1));
                break;
            case SHOP:
                builder.setMessage(String.valueOf(2));
                break;
            case PAUSE:
                builder.setMessage(String.valueOf(3));
                break;
            case PLAY:
                builder.setMessage(String.valueOf(4));
                break;
            case ACCELERATED:
                builder.setMessage(String.valueOf(5));
                break;
        }
        builder.setPositiveButton(R.string.ok_button,
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        dialog.dismiss();
                    }
                }).show();
    }
}
