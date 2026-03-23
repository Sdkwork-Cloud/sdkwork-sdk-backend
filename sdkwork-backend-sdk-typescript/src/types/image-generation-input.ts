import type { AssetMediaResource } from './asset-media-resource';
import type { VideoStoryboard } from './video-storyboard';

/** å¾ççæè¾å¥åæ° */
export interface ImageGenerationInput {
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
  /** å¾çå®½åº¦(åç´ ) */
  width?: number;
  /** å¾çé«åº¦(åç´ ) */
  height?: number;
  /** å¾çå°ºå¯¸é¢è®¾ */
  size?: string;
  /** å¾çè´¨é(standard/hd) */
  quality?: string;
  /** å¾çé£æ ¼(vivid/natural) */
  style?: string;
  /** CFG Scale */
  cfgScale?: number;
  /** æ¨çæ­¥æ° */
  steps?: number;
  /** éæ ·å¨ç±»å */
  sampler?: string;
  /** å¾çå¾å¼ºåº¦(0.0-1.0) */
  strength?: number;
  /** æ¯å¦å¯ç¨å®å¨æ£æ¥ */
  safetyChecker?: boolean;
  /** å®½é«æ¯(16:9/9:16/1:1ç­) */
  aspectRatio?: string;
  referenceAssetCount?: number;
}
