/** æè½åé¡µæ¥è¯¢åæ° */
export interface PlusAgentSkillQueryListForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** å³é®è¯ï¼å¹é name/skillKey/summary/description/providerï¼ */
  keyword?: string;
  /** å½å±ç¨æ·ID */
  userId?: number;
  /** åç±»ID */
  categoryId?: number;
  /** ååID */
  packageId?: number;
  /** å¸åºç¶æ */
  marketStatus?: 'DRAFT' | 'PUBLISHED' | 'OFFLINE' | 'DEPRECATED';
  /** å¯è§æ§ */
  visibility?: 'PUBLIC' | 'PRIVATE' | 'UNLISTED';
  /** æ¥æºç±»å */
  sourceType?: 'OFFICIAL' | 'COMMUNITY' | 'ENTERPRISE' | 'PRIVATE' | 'CUSTOM';
  /** å®¡æ ¸ç¶æ */
  reviewStatus?: 'PENDING' | 'APPROVED' | 'REJECTED';
  /** æ¯å¦åç½® */
  builtin?: boolean;
  /** æ¯å¦å¯ç¨ */
  enabled?: boolean;
  /** æ¯å¦æ¨è */
  featured?: boolean;
}
