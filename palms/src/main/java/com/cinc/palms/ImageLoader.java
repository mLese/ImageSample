package com.cinc.palms;

import android.content.Context;
import android.widget.ImageView;

/**
 * Created by michaellese on 8/15/17.
 */

public interface ImageLoader {
    void loadImage(Context context, String url, ImageView view);
}
