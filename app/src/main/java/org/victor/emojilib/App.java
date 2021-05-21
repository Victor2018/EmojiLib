package org.victor.emojilib;

import android.app.Application;
import android.util.Log;

import org.victor.emoji.library.LQRUIKit;

/**
 * Created by Administrator on 2016/12/28.
 */

public class App extends Application {
    private static App instance;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("App","onCreate.....................");
        LQRUIKit.init(getApplicationContext());
    }

    public App() {
        instance = this;
    }

    public static App get() {
        return instance;
    }
}
