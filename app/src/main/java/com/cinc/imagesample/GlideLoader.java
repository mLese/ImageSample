package com.cinc.imagesample;

import android.content.Context;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.cinc.palms.ImageLoader;

/**
 * Created by michaellese on 8/15/17.
 */

public class GlideLoader implements ImageLoader {
    @Override
    public void loadImage(Context context, String url, ImageView view) {
        Log.d("Glide", "Loading with glide");
        Glide.with(context).load(url).into(view);
    }
}
