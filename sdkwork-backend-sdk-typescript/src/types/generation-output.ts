import type { AssetMediaResource } from './asset-media-resource';

/** AIçæä»»å¡è¾åºç»æ */
export interface GenerationOutput {
  /** çæç»æèµæºåè¡¨ */
  resources?: AssetMediaResource[];
  /** ä¸»ç»æURL(å¼å®¹æ§æ¥å£) */
  primaryUrl?: string;
  /** ç»æURLåè¡¨(å¼å®¹æ§æ¥å£) */
  urls?: string[];
  /** çæèæ¶(æ¯«ç§) */
  durationMs?: number;
  /** æ¶èTokenæ° */
  tokenUsage?: number;
  /** æ¶èè´¹ç¨ */
  cost?: number;
  /** æ¨¡åçæ¬ */
  modelVersion?: string;
  /** çæç§å­ */
  seed?: number;
  /** æ©å±åæ°æ® */
  metadata?: Record<string, unknown>;
  /** åå»ºæ¶é´ */
  createdAt?: string;
  resourceCount?: number;
  primaryResource?: AssetMediaResource;
}
