/** ç§æ·å®¡è®¡æ¥å¿å¼å¯¹è±¡ */
export interface PlusTenantAuditLogVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** æ¥å¿ID */
  id?: number;
  /** ç§æ·ID */
  tenantId?: number;
  /** æä½å¨ä½ */
  action?: string;
  /** æå±æ¨¡å */
  module?: string;
  /** æä½äºº */
  operator?: string;
  /** æä½è¯´æ */
  description?: string;
  /** ç»æç¶æ */
  result?: string;
  /** æä½æ¶é´ */
  createTime?: string;
  /** æ¥æºIP */
  ip?: string;
}
