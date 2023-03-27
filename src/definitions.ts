export interface CapacitorPowerManagerPlugin {
  isExemptFromLowPowerStandby() : LowPowerResponse
}

export interface LowPowerResponse {
  value: boolean,
}
