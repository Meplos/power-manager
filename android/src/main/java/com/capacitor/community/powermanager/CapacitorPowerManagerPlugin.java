package com.capacitor.community.powermanager;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "CapacitorPowerManager")
public class CapacitorPowerManagerPlugin extends Plugin {

    private CapacitorPowerManager implementation;

    @Override
    public void load() {
        implementation = new CapacitorPowerManager(getContext());
    }

    @PluginMethod
    public void isExemptFromLowPowerStandby(PluginCall call) {
        bool value = this.implementation.isExemptFromLowPowerStandby();
        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }
}
