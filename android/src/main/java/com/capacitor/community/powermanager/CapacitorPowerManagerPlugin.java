package com.capacitor.community.powermanager;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.capacitor.community.powermanager.CapacitorPowerManager;

@CapacitorPlugin(name = "CapacitorPowerManager")
public class CapacitorPowerManagerPlugin extends Plugin {

    private CapacitorPowerManager implementation;

    @Override
    public void load() {
        this.implementation = new CapacitorPowerManager(getContext());
    }

    @PluginMethod
    public void isIgnoringBatteryOptimizations(PluginCall call) {
        String feature = call.getString("feature");
        Boolean value = this.implementation.isIgnoringBatteryOptimizations(feature);

        JSObject ret = new JSObject();
        ret.put("value", value);
        call.resolve(ret);
    }
}
