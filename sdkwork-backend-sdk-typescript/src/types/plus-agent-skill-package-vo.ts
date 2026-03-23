/** æè½ååç®¡çVO */
export interface PlusAgentSkillPackageVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ååID */
  id?: number;
  /** ååUUID */
  uuid?: string;
  /** ç§æ·ID */
  tenantId?: number;
  /** ç»ç»ID */
  organizationId?: number;
  /** å½å±ç¨æ·ID */
  userId?: number;
  /** ååæ è¯ */
  packageKey?: string;
  /** åååç§° */
  name?: string;
  /** ååç®ä» */
  summary?: string;
  /** ååæè¿° */
  description?: string;
  /** ååå¾æ  */
  icon?: string;
  /** å°é¢å¾ */
  coverImage?: string;
  /** åç±»ID */
  categoryId?: number;
  /** åç±»åç§° */
  categoryName?: string;
  /** æ ç­¾ */
  tags?: string[];
  /** æ¯å¦å¯ç¨ */
  enabled?: boolean;
  /** æ¯å¦æ¨è */
  featured?: boolean;
  /** æåºæé */
  sortWeight?: number;
  /** å³èæè½æ°é */
  skillCount?: number;
  /** æè¿åå¸æ¶é´ */
  latestPublishedAt?: string;
}
