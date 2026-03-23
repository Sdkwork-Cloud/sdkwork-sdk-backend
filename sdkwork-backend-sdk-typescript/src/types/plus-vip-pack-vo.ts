import type { PlusVipLevelVO } from './plus-vip-level-vo';

/** VIPå¥é¤VO */
export interface PlusVipPackVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ä¸»é®ID */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** å¥é¤åç§° */
  name?: string;
  /** å¥é¤æè¿° */
  description?: string;
  /** æå±åç»ID */
  groupId?: number;
  /** å³èçVIPç­çº§ID */
  vipLevelId?: number;
  /** å¥é¤ä»·æ ¼(å) */
  price?: number;
  /** èµ éçµç¹æ°é */
  pointAmount?: number;
  /** VIPæ¶é¿(å¤©) */
  vipDurationDays?: number;
  /** å¥é¤ç¶æ */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE';
  /** æåºæé */
  sortWeight?: number;
  /** å¥é¤æææå¼å§æ¶é´ */
  validFrom?: string;
  /** å¥é¤æææç»ææ¶é´ */
  validTo?: string;
  /** å¤æ³¨ä¿¡æ¯ */
  remark?: string;
  /** å³èçVIPç­çº§éå */
  vipLevel?: PlusVipLevelVO;
}
