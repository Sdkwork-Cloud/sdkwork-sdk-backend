import type { AssetMediaResource } from './asset-media-resource';
import type { VideoStoryboard } from './video-storyboard';

/** AIçæä»»å¡è¾å¥åæ°åºç±» */
export interface BaseGenerationInput {
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
  referenceAssetCount?: number;
}
