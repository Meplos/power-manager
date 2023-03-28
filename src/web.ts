import { WebPlugin } from '@capacitor/core';

import type { CapacitorPowerManagerPlugin, LowPowerResponse } from './definitions';

export class CapacitorPowerManagerWeb extends WebPlugin implements CapacitorPowerManagerPlugin {
  isIgnoringBatteryOptimizations(): Promise<LowPowerResponse> {
    
    throw new Error('Method not implemented.');
  }

}