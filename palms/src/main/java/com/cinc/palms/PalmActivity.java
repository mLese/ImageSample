package com.cinc.palms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public abstract class PalmActivity extends AppCompatActivity {

    ImageLoader loader;
    ImageView image;
    protected Button switchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = (ImageView) findViewById(R.id.image);
        switchButton = (Button) findViewById(R.id.switch_button);
    }

    protected void setLoader(ImageLoader loader) {
        this.loader = loader;
        loadImage();
    }

    private void loadImage() {
        loader.loadImage(this, "https://i.imgur.com/9M0kNKx.png", image);
    }
}
