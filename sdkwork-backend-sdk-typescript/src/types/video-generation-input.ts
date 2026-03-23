import type { AssetMediaResource } from './asset-media-resource';
import type { VideoStoryboard } from './video-storyboard';

/** è§é¢çæè¾å¥åæ° */
export interface VideoGenerationInput {
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
  /** è§é¢å®½åº¦(åç´ ) */
  width?: number;
  /** è§é¢é«åº¦(åç´ ) */
  height?: number;
  /** è§é¢æ¶é¿(ç§) */
  duration?: number;
  /** å¸§ç(FPS) */
  fps?: number;
  /** è§é¢é£æ ¼(cinematic/anime/realisticç­) */
  style?: string;
  /** å®½é«æ¯(16:9/9:16/1:1ç­) */
  aspectRatio?: string;
  /** è¿å¨å¼ºåº¦(1-255) */
  motionStrength?: number;
  /** æåæºè¿å¨ç±»å(zoom_in/zoom_out/pan_left/pan_rightç­) */
  cameraMotion?: string;
  /** æ¯å¦å¾ªç¯è§é¢ */
  loop?: boolean;
  /** æ¯å¦é«æ¸ */
  hd?: boolean;
  /** æ¯å¦çæå­å¹ */
  subtitle?: boolean;
  textToVideo?: boolean;
  referenceAssetCount?: number;
}
