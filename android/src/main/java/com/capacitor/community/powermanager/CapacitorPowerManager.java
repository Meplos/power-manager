
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

    public String isExemptFromLowPowerStandby() {
        bool value = pm.isExemptFromLowPowerStandby();
        return value;
    }
}
