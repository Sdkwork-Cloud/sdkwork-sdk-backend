import type { DecorationModuleVO } from './decoration-module-vo';

export interface ShopDecorationRequest {
  id?: string;
  name?: string;
  status?: string;
  templateId?: string;
  modules?: DecorationModuleVO[];
}
