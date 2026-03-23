import type { TagsContent } from './tags-content';

/** AIæç¤ºè¯­Value Object */
export interface PlusAiPromptVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ä¸»é®ID */
  id?: number;
  /** æç¤ºè¯­æ é¢ */
  title?: string;
  /** æç¤ºè¯­åå®¹ */
  content?: string;
  /** æç¤ºè¯­æè¿° */
  description?: string;
  /** å³èåç±»ID */
  categoryId?: number;
  /** æ¯å¦å¯ç¨(true:å¯ç¨,false:ç¦ç¨) */
  enabled?: boolean;
  /** æåºé¡ºåº */
  sort?: number;
  /** åæ°å®ä¹(JSONæ ¼å¼) */
  parameters?: Record<string, unknown>;
  /** åå»ºè */
  creator?: string;
  /** éç¨çAIæ¨¡å */
  model?: string;
  /** æ ç­¾(éå·åé) */
  tags?: TagsContent;
  /** ä½¿ç¨æ¬¡æ° */
  usageCount?: number;
  /** å¹³åååºæ¶é´(æ¯«ç§) */
  avgResponseTime?: number;
}
