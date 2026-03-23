import type { PlusVipPackVO } from './plus-vip-pack-vo';

/** VIPå¥é¤åç»VO */
export interface PlusVipPackGroupVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ä¸»é®ID */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** åºç¨ID */
  appId?: number;
  /** åç»åç§° */
  name?: string;
  /** åç»æè¿° */
  description?: string;
  /** æåºæé */
  sortWeight?: number;
  /** åç»ç¶æ */
  status?: 'DEFAULT' | 'ENABLED' | 'DISABLED';
  /** å¤æ³¨ä¿¡æ¯ */
  remark?: string;
  /** å³èçå¥é¤åè¡¨ */
  packs?: PlusVipPackVO[];
}
