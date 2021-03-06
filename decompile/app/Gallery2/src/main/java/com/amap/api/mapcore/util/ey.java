package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.util.Locale;

/* compiled from: AppInfo */
public class ey {
    private static String a = "";
    private static String b = "";
    private static String c = "";
    private static String d = "";
    private static String e = null;

    public static String a(Context context) {
        try {
            return g(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return d;
        }
    }

    public static String b(Context context) {
        try {
            if (!"".equals(a)) {
                return a;
            }
            PackageManager packageManager = context.getPackageManager();
            a = (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 0));
            return a;
        } catch (Throwable th) {
            fl.a(th, "AppInfo", "getApplicationName");
        }
    }

    public static String c(Context context) {
        try {
            if (b != null) {
                if (!"".equals(b)) {
                    return b;
                }
            }
            b = context.getPackageName();
        } catch (Throwable th) {
            fl.a(th, "AppInfo", "getpckn");
        }
        return b;
    }

    public static String d(Context context) {
        try {
            if (!"".equals(c)) {
                return c;
            }
            String str;
            c = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (c != null) {
                str = c;
            } else {
                str = "";
            }
            return str;
        } catch (Throwable th) {
            fl.a(th, "AppInfo", "getApplicationVersion");
        }
    }

    public static String e(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            byte[] digest = MessageDigest.getInstance("SHA1").digest(packageInfo.signatures[0].toByteArray());
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                String toUpperCase = Integer.toHexString(b & 255).toUpperCase(Locale.US);
                if (toUpperCase.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(toUpperCase);
                stringBuffer.append(":");
            }
            stringBuffer.append(!TextUtils.isEmpty(b) ? c(context) : packageInfo.packageName);
            e = stringBuffer.toString();
            return e;
        } catch (Throwable th) {
            fl.a(th, "AppInfo", "getpck");
            return e;
        }
    }

    static void a(String str) {
        d = str;
    }

    public static String f(Context context) {
        try {
            return g(context);
        } catch (Throwable th) {
            fl.a(th, "AppInfo", "getKey");
            return d;
        }
    }

    private static String g(Context context) throws NameNotFoundException {
        if (d == null || d.equals("")) {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                return d;
            }
            d = applicationInfo.metaData.getString("com.amap.api.v2.apikey");
            if (d == null) {
                d = "";
            }
        }
        return d;
    }
}
