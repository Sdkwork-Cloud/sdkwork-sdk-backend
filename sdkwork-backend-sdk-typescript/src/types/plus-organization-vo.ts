import type { InstallAppList } from './install-app-list';

/** ç»ç»VOå¯¹è±¡ */
export interface PlusOrganizationVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ç»ç»ID */
  id?: number;
  /** ç»ç»åç§° */
  name?: string;
  /** ç»ç»ç¼ç  */
  code?: string;
  /** ç»ç»ç¶æï¼1-æ´»è·, 2-æªæ¿æ´», 3-ç¦ç¨, 4-å·²å é¤ */
  status?: 'ACTIVE' | 'INACTIVE' | 'DISABLED' | 'DELETED';
  /** ç»ç»æè¿° */
  description?: string;
  /** ç¶ç»ç»ID */
  parentId?: number;
  /** å®è£åºç¨åè¡¨ */
  installAppList?: InstallAppList;
}
