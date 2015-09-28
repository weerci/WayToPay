package com.production.kriate.waytopay.tools;

import android.content.Context;
import android.content.pm.PackageManager;

/**
 * Общие функции для программы
 */
public class WayToPayUtils {
    public static String getVersionName(Context ctx) {
        String versionName = null;
        try {
            versionName = ctx.getPackageManager().getPackageInfo(ctx.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return versionName;
    }
}