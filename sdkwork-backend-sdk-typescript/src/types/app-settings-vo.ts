export interface AppSettingsVO {
  appId?: string;
  autoDeploy?: boolean;
  autoStart?: boolean;
  menuEnabled?: boolean;
  auditEnabled?: boolean;
  maintainers?: string[];
  notes?: string;
  updatedAt?: string;
}
