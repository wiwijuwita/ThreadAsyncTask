package com.wiwijuwita.threadasynctask;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by WIND-10 on 30/11/2016.
 */

public class DisplayToast implements Runnable {

    private final Context mContext;
    String mText;

    public DisplayToast(Context mContext, String text){
        this.mContext = mContext;
        mText = text;
    }

    @Override
    public void run() {
        Toast.makeText(mContext, mText, Toast.LENGTH_SHORT).show();
    }
}
