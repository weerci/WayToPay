package com.production.kriate.waytopay;

import android.app.Application;
import android.support.annotation.NonNull;

/**
 * Created by weerc on 28.09.2015.
 */
public class App extends Application {
    @NonNull
    static final String MAIL = "grizzlidev@gmail.com";

    public  App() { instance = this;}

    private static App instance;
}
