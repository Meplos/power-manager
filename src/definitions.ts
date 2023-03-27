export interface CapacitorPowerManagerPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
