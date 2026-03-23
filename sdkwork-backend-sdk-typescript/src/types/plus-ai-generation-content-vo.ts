import type { GenerationInputParams } from './generation-input-params';
import type { GenerationOutput } from './generation-output';

/** AIçæåå®¹è¯¦æVO */
export interface PlusAiGenerationContentVO {
  /** åå»ºæ¶é´ï¼å®ä½é¦æ¬¡æä¹åæ¶è®¾ç½® */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ï¼å®ä½ä¿®æ¹æ¶æ´æ° */
  updatedAt?: string;
  /** ä¸»é®IDï¼ç±æ°æ®åºèªå¨çæ */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** çæ¬å·ï¼ç¨äºä¹è§éæ§å¶ */
  version?: number;
  /** çæåå®¹çæ é¢ */
  title?: string;
  /** çæåå®¹çæè¿°ä¿¡æ¯ */
  description?: string;
  /** åå®¹ç±»å */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM' | 'JOB';
  /** å³èåå®¹ID */
  contentId?: number;
  /** åå®¹åæ°æ® */
  metadata?: Record<string, unknown>;
  /** è¾å¥åæ° */
  inputParams?: GenerationInputParams;
  /** è¾åºç»æ */
  output?: GenerationOutput;
  /** çæåå®¹çæ ¼å¼ */
  contentFormat?: string;
  /** çæåå®¹çå­å¨URL */
  contentUrl?: string;
  /** çæåå®¹çæä»¶å¤§å° */
  fileSize?: number;
}
