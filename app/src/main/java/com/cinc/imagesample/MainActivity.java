package com.cinc.imagesample;

import android.os.Bundle;
import android.view.View;

import com.cinc.palms.PalmActivity;

public class MainActivity extends PalmActivity {

    PicassoLoader picassoLoader;
    GlideLoader glideLoader;
    boolean picasso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        picassoLoader = new PicassoLoader();
        glideLoader = new GlideLoader();

        picasso = true;
        switchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (picasso) {
                    setLoader(picassoLoader);
                } else {
                    setLoader(glideLoader);
                }
                picasso = !picasso;
            }
        });
    }
}
