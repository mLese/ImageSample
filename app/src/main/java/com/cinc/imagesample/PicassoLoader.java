package com.cinc.imagesample;

import android.content.Context;
import android.util.Log;
import android.widget.ImageView;

import com.cinc.palms.ImageLoader;
import com.squareup.picasso.Picasso;

import static java.lang.System.load;

/**
 * Created by michaellese on 8/15/17.
 */

public class PicassoLoader implements ImageLoader {
    @Override
    public void loadImage(Context context, String url, ImageView view) {
        Log.d("Picasso", "Loading with picasso");
        Picasso.with(context).load(url).into(view);
    }
}
