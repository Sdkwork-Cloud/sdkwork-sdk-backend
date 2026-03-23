/** æè½åå»º/æ´æ°è¡¨å */
export interface PlusAgentSkillForm {
  /** æè½å½å±ç¨æ·IDï¼ä¸ä¼ é»è®¤å½åç¨æ· */
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
  /** ååID */
  packageId?: number;
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
  /** è®¸å¯è¯åç§° */
  licenseName?: string;
  /** æ¥æºç±»å */
  sourceType?: 'OFFICIAL' | 'COMMUNITY' | 'ENTERPRISE' | 'PRIVATE' | 'CUSTOM';
  /** å¯è§æ§ */
  visibility?: 'PUBLIC' | 'PRIVATE' | 'UNLISTED';
  /** æ¯å¦å¯ç¨ */
  enabled?: boolean;
  /** ä»·æ ¼ */
  price?: number;
  /** è´§å¸ */
  currency?: string;
  /** æ ç­¾ */
  tags?: string[];
  /** è½ååè¡¨ */
  capabilities?: string[];
  /** éç½®Schema */
  configSchema?: Record<string, unknown>;
  /** é»è®¤éç½® */
  defaultConfig?: Record<string, unknown>;
}
