import type { ResourceUsageVO } from './resource-usage-vo';

export interface AppInstanceVO {
  id?: string;
  appId?: string;
  appName?: string;
  appIcon?: string;
  version?: string;
  env?: string;
  status?: string;
  url?: string;
  port?: number;
  uptime?: string;
  resourceUsage?: ResourceUsageVO;
  installedAt?: string;
  linkedWechatId?: string;
  linkedWechatName?: string;
  linkedMiniProgramId?: string;
  linkedMiniProgramName?: string;
  configData?: Record<string, Record<string, unknown>>;
}
