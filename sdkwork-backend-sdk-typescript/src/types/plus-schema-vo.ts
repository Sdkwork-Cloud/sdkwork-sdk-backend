/** æ°æ®åºSchemaå®ä¹VO */
export interface PlusSchemaVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** Schema ID */
  id?: number;
  /** Schemaåç§° */
  name?: string;
  /** Schemaæè¿° */
  description?: string;
  /** ç¶æ(0-ç¦ç¨,1-å¯ç¨) */
  status?: number;
  /** è¡¨æ°é */
  tableCount?: number;
  /** æååæ­¥æ¶é´ */
  lastSyncTime?: string;
  /** æ¯å¦é»è®¤Schema */
  isDefault?: boolean;
  /** æå±æ°æ®æºID */
  datasourceId?: number;
  /** è¡¨IDåè¡¨ */
  tableIds?: number[];
}
