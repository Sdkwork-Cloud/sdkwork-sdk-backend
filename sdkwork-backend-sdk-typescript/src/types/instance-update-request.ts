export interface InstanceUpdateRequest {
  instanceId?: string;
  appId?: string;
  version?: string;
  url?: string;
  linkedWechatId?: string;
  linkedWechatName?: string;
  linkedMiniProgramId?: string;
  linkedMiniProgramName?: string;
  configData?: Record<string, Record<string, unknown>>;
}
