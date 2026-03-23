import type { TagsContent } from './tags-content';

/** æ°æ®æºä¿¡æ¯VO */
export interface PlusDatasourceVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** æ°æ®æºID */
  id?: number;
  /** æ°æ®æºåç§° */
  name?: string;
  /** æ°æ®æºç±»å(å¦MySQL, PostgreSQL, MongoDBç­) */
  type?: 1 | 2 | 3 | 4 | 5 | 6 | 7 | 99;
  /** æ°æ®æºç¶æ(ACTIVE:æ´»è·,INACTIVE:æªæ¿æ´»,ERROR:éè¯¯) */
  status?: 1 | 0 | -1 | -2;
  /** æ°æ®æºæè¿° */
  description?: string;
  /** è¿æ¥éç½®ä¿¡æ¯(JSONæ ¼å¼) */
  connectionConfig?: unknown;
  /** æ°æ®æºURL */
  url?: string;
  /** æ°æ®æºåå»ºè/ææè */
  owner?: string;
  /** æåæåè¿æ¥æ¶é´ */
  lastConnectedAt?: string;
  /** è¿æ¥è¶æ¶æ¶é´(ç§) */
  connectionTimeout?: number;
  /** æ ç­¾(éå·åé) */
  tags?: TagsContent;
  /** æ°æ®åºçæ¬ */
  dbVersion?: string;
  /** å®å¨çº§å«(0-ä½,1-ä¸­,2-é«) */
  securityLevel?: number;
  /** è®¿é®è®¡æ° */
  accessCount?: number;
  /** UIæ¾ç¤ºå¾æ  */
  icon?: string;
  /** UIæ¾ç¤ºé¢è²(HEX) */
  color?: string;
  /** å³èSchema IDåè¡¨ */
  schemaIds?: number[];
}
