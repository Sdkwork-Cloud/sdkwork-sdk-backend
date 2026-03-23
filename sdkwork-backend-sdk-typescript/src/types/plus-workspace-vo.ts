/** å·¥ä½åºä¿¡æ¯VO */
export interface PlusWorkspaceVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ä¸»é®IDï¼ç±æ°æ®åºèªå¨çæ */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** å·¥ä½åºåç§° */
  name?: string;
  /** å·¥ä½åºä¸å¡ä»£ç (å¯è¯»çå¯ä¸æ è¯ç¬¦) */
  code?: string;
  /** å·¥ä½åºæ é¢ */
  title?: string;
  /** å·¥ä½åºè¯¦ç»æè¿° */
  description?: string;
  /** å·¥ä½åºå¾æ  */
  icon?: string;
  /** å·¥ä½åºä¸»é¢é¢è² */
  color?: string;
  /** å·¥ä½åºç±»å(1:ä¸ªäººå·¥ä½åº, 2:å¢éå·¥ä½åº, 3:ç»ç»å·¥ä½åº, 4:é¡¹ç®å·¥ä½åº) */
  type?: 'PERSONAL' | 'TEAM' | 'ORGANIZATION' | 'PROJECT';
  /** å·¥ä½åºç¶æ(1:æ´»è·, 2:æå, 3:å·²å½æ¡£, 4:å·²å é¤) */
  status?: 'ACTIVE' | 'SUSPENDED' | 'ARCHIVED' | 'DELETED';
  /** å·¥ä½åºææèç¨æ·ID */
  ownerId?: number;
  /** å·¥ä½åºè´è´£äººç¨æ·ID */
  leaderId?: number;
  /** å·¥ä½åºè®¡åå¼å§æ¶é´ */
  startTime?: string;
  /** å·¥ä½åºè®¡åç»ææ¶é´ */
  endTime?: string;
  /** æå¤§æåæ° */
  maxMembers?: number;
  /** å½åæåæ° */
  currentMembers?: number;
  /** æå¤§å­å¨ç©ºé´(å­è) */
  maxStorage?: number;
  /** å·²ç¨å­å¨ç©ºé´(å­è) */
  usedStorage?: number;
  /** å·¥ä½åºè®¾ç½®(JSONæ ¼å¼) */
  settings?: Record<string, unknown>;
  /** è½¯å é¤ç¶æ(true:å·²å é¤, false:æ´»è·) */
  isDeleted?: boolean;
  /** å¬å¼ç¶æ(true:å¬å¼, false:ç§æ) */
  isPublic?: boolean;
  /** æ¨¡æ¿ç¶æ(true:æ¨¡æ¿å·¥ä½åº, false:æ®éå·¥ä½åº) */
  isTemplate?: boolean;
}
