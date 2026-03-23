import type { DecorationModuleVO } from './decoration-module-vo';

export interface ShopDecorationVO {
  id?: string;
  name?: string;
  status?: string;
  templateId?: string;
  modules?: DecorationModuleVO[];
  lastPublishTime?: string;
}
