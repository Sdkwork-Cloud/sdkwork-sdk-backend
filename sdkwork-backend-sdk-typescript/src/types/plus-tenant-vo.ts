import type { InstallAppList } from './install-app-list';

/** ç§æ·Value Object */
export interface PlusTenantVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ç§æ·ID */
  id?: number;
  /** ç§æ·åç§° */
  name?: string;
  /** ç§æ·å¯ä¸ç¼ç  */
  code?: string;
  /** ç§æ·ç¶æ */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  /** ç§æ·æè¿° */
  description?: string;
  /** ç§æ·ç®¡çåç¨æ·ID */
  adminUserId?: number;
  /** ç§æ·è¿ææ¶é´ */
  expireTime?: string;
  /** å®è£åºç¨åè¡¨ */
  installAppList?: InstallAppList;
}
