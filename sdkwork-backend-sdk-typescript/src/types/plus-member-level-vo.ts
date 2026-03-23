/** ä¼åç­çº§VOï¼åå«ç­çº§åç§°ãæéç§¯åãç¹ææè¿°ç­ä¿¡æ¯ */
export interface PlusMemberLevelVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ä¼åç­çº§ID */
  id?: number;
  /** æå±ä¼åå¡ID */
  cardId?: number;
  /** ç­çº§åç§°ï¼å¦âé¶å¡âãâéå¡â */
  levelName?: string;
  /** åçº§æéç§¯åéå¼ */
  requiredPoints?: number;
  /** ç­çº§ç¹ææè¿° */
  description?: string;
  /** ç­çº§ç¶æï¼å¯ç¨/ç¦ç¨ */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DELETED';
}
