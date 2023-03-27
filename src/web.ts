import { WebPlugin } from '@capacitor/core';

import type { CapacitorPowerManagerPlugin } from './definitions';

export class CapacitorPowerManagerWeb extends WebPlugin implements CapacitorPowerManagerPlugin {
 isExemptFromLowPowerStandby() {
  console.error("Not implement for the web. Return always true");
    return {value: true};
 }
}
