import type { AssetMediaResource } from './asset-media-resource';
import type { VideoStoryboard } from './video-storyboard';

/** é³æçæè¾å¥åæ° */
export interface AudioEffectGenerationInput {
  /** ä»»å¡æ é¢ */
  title?: string;
  /** ä¸»æç¤ºè¯ */
  prompt?: string;
  /** ååæç¤ºè¯ */
  negativePrompt?: string;
  /** åèèµæºåè¡¨(æ¯æå¾ç/è§é¢/é³é¢ç­ä»»æç±»å) */
  referenceAssets?: AssetMediaResource[];
  /** è§é¢æäºæ¿ */
  storyboard?: VideoStoryboard;
  /** çæåæ° */
  parameters?: Record<string, unknown>;
  /** çææ°é */
  n?: number;
  /** éæºç§å­ */
  seed?: number;
  /** è¾åºæ ¼å¼ */
  format?: string;
  /** é³ææè¿° */
  description?: string;
  /** é³æç±»å«(nature/urban/mechanical/human/ambientç­) */
  category?: string;
  /** é³ææ¶é¿(ç§) */
  duration?: number;
  /** éæ ·ç */
  sampleRate?: number;
  /** æ¯ç¹ç */
  bitRate?: number;
  /** å£°éæ° */
  channels?: number;
  /** æ¯å¦å¾ªç¯ */
  loop?: boolean;
  /** æ·¡å¥æ¶é¿(ç§) */
  fadeIn?: number;
  /** æ·¡åºæ¶é¿(ç§) */
  fadeOut?: number;
  referenceAssetCount?: number;
}
