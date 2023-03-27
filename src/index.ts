import { registerPlugin } from '@capacitor/core';

import type { CapacitorPowerManagerPlugin } from './definitions';

const CapacitorPowerManager = registerPlugin<CapacitorPowerManagerPlugin>('CapacitorPowerManager', {
  web: () => import('./web').then(m => new m.CapacitorPowerManagerWeb()),
});

export * from './definitions';
export { CapacitorPowerManager };
