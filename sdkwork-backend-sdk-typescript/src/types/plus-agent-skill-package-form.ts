/** æè½åååå»º/æ´æ°è¡¨å */
export interface PlusAgentSkillPackageForm {
  /** å½å±ç¨æ·IDï¼ä¸ä¼ é»è®¤å½åç¨æ· */
  userId?: number;
  /** ååæ è¯ï¼machine keyï¼ */
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
  /** æ¯å¦å¯ç¨ */
  enabled?: boolean;
  /** æ¯å¦æ¨è */
  featured?: boolean;
  /** æåºæé */
  sortWeight?: number;
  /** æ ç­¾ */
  tags?: string[];
}
