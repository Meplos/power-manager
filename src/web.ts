import { WebPlugin } from '@capacitor/core';

import type { CapacitorPowerManagerPlugin } from './definitions';

export class CapacitorPowerManagerWeb extends WebPlugin implements CapacitorPowerManagerPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
