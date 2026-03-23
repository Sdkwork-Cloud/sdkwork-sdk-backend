import type { CartGroupList } from './cart-group-list';

/** è´­ç©è½¦VO */
export interface PlusShoppingCartVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ */
  updatedAt?: string;
  /** è´­ç©è½¦ID */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** è´­ç©è½¦ææè */
  owner?: 'DEFAULT' | 'USER' | 'PROJECT' | 'TENANT' | 'SYSTEM' | 'ORGANIZATION';
  /** è´­ç©è½¦ææèID */
  ownerId?: number;
  /** è´­ç©è½¦åç§° */
  name?: string;
  /** è´­ç©è½¦æè¿° */
  description?: string;
  /** è´­ç©è½¦é¡¹ç®åè¡¨ */
  groupList?: CartGroupList;
  /** è´­ç©è½¦ç¶æ */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
}
