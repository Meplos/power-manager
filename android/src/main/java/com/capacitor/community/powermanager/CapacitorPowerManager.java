package com.capacitor.community.powermanager;

import android.content.Context;
import android.os.PowerManager;
import android.util.Log;

public class CapacitorPowerManager {
    private Context context;
    private PowerManager pm;

    public CapacitorPowerManager(Context context) {
        this.context = context;
        this.pm = (PowerManager) context.getSystemService(Context.POWER_SERVICE);
    }

    public Boolean isIgnoringBatteryOptimizations(String feature) {
        Boolean value = this.pm.isIgnoringBatteryOptimizations(feature);
        return value;
    }
}
