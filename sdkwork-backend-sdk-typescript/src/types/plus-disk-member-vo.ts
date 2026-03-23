import type { DiskPermission } from './disk-permission';

/** ç£çæåVOï¼å°è£ç£çæåçæ ¸å¿ä¿¡æ¯ */
export interface PlusDiskMemberVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ */
  updatedAt?: string;
  /** ä¸»é®ID */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** çæ¬å·ï¼ä¹è§éæ§å¶ï¼ */
  v?: number;
  /** å³èç£çID */
  diskId?: number;
  /** ç¨æ·ID */
  userId?: number;
  /** æåæééåï¼ä½è¿ç®è¡¨ç¤ºï¼ */
  permission?: DiskPermission;
  /** æåå¤æ³¨ä¿¡æ¯ */
  remark?: string;
  /** æ¯å¦ä¸ºç£çææè */
  isOwner?: boolean;
}
