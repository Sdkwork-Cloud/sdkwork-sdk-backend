import type { ConfigItemVO } from './config-item-vo';

export interface ConfigDefinitionVO {
  appId?: string;
  items?: ConfigItemVO[];
  updatedAt?: string;
}
