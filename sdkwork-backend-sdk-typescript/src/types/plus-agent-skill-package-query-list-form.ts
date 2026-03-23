/** æè½ååæ¥è¯¢åæ° */
export interface PlusAgentSkillPackageQueryListForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** å³é®è¯ï¼å¹é name/packageKey/summary/descriptionï¼ */
  keyword?: string;
  /** å½å±ç¨æ·ID */
  userId?: number;
  /** åç±»ID */
  categoryId?: number;
  /** æ¯å¦å¯ç¨ */
  enabled?: boolean;
  /** æ¯å¦æ¨è */
  featured?: boolean;
}
