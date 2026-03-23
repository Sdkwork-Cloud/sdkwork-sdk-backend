/** æè½ç®¡çVO */
export interface PlusAgentSkillVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** æè½ID */
  id?: number;
  /** æè½UUID */
  uuid?: string;
  /** ç§æ·ID */
  tenantId?: number;
  /** ç»ç»ID */
  organizationId?: number;
  /** å½å±ç¨æ·ID */
  userId?: number;
  /** æè½å¯ä¸æ è¯ */
  skillKey?: string;
  /** æè½åç§° */
  name?: string;
  /** æè½ç®ä» */
  summary?: string;
  /** æè½æè¿° */
  description?: string;
  /** æè½å¾æ  */
  icon?: string;
  /** æè½å°é¢å¾ */
  coverImage?: string;
  /** åç±»ID */
  categoryId?: number;
  /** åç±»åç§° */
  categoryName?: string;
  /** ååID */
  packageId?: number;
  /** åååç§° */
  packageName?: string;
  /** æä¾å */
  provider?: string;
  /** çæ¬ */
  version?: string;
  /** è¿è¡æ¶ */
  runtime?: string;
  /** å¥å£ */
  entrypoint?: string;
  /** manifestå°å */
  manifestUrl?: string;
  /** ä»£ç ä»åºå°å */
  repositoryUrl?: string;
  /** ä¸»é¡µå°å */
  homepageUrl?: string;
  /** ææ¡£å°å */
  documentationUrl?: string;
  /** è®¸å¯è¯ */
  licenseName?: string;
  /** æ¥æºç±»å */
  sourceType?: 'OFFICIAL' | 'COMMUNITY' | 'ENTERPRISE' | 'PRIVATE' | 'CUSTOM';
  /** å¸åºç¶æ */
  marketStatus?: 'DRAFT' | 'PUBLISHED' | 'OFFLINE' | 'DEPRECATED';
  /** å¯è§æ§ */
  visibility?: 'PUBLIC' | 'PRIVATE' | 'UNLISTED';
  /** å®¡æ ¸ç¶æ */
  reviewStatus?: 'PENDING' | 'APPROVED' | 'REJECTED';
  /** å®¡æ ¸æè§ */
  reviewComment?: string;
  /** å®¡æ ¸äººç¨æ·ID */
  reviewedBy?: number;
  /** å®¡æ ¸æ¶é´ */
  reviewedAt?: string;
  /** æ¯å¦åç½® */
  builtin?: boolean;
  /** æ¯å¦å¯ç¨ */
  enabled?: boolean;
  /** æ¯å¦æ¨è */
  featured?: boolean;
  /** æ¨èæé */
  recommendWeight?: number;
  /** ä»·æ ¼ */
  price?: number;
  /** è´§å¸ */
  currency?: string;
  /** å®è£æ¬¡æ° */
  installCount?: number;
  /** è¯ååå¼ */
  ratingAvg?: number;
  /** è¯åæ¬¡æ° */
  ratingCount?: number;
  /** æ ç­¾ */
  tags?: string[];
  /** è½ååè¡¨ */
  capabilities?: string[];
  /** éç½®schema */
  configSchema?: Record<string, unknown>;
  /** é»è®¤éç½® */
  defaultConfig?: Record<string, unknown>;
  /** æè¿åå¸æ¶é´ */
  latestPublishedAt?: string;
}
