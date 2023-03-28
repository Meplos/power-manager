export interface CapacitorPowerManagerPlugin {
  isIgnoringBatteryOptimizations(feature: string): Promise<LowPowerResponse>
}

export interface LowPowerResponse {
  value: boolean,
}
