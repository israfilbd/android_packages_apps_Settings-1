
package com.android.settings.deviceinfo;

import android.os.SystemProperties;

public class VersionUtils {
    public static String getPixelageVersion(){
        return SystemProperties.get("ro.pixelage.version","");
    }
}
