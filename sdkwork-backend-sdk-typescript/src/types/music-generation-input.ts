import type { AssetMediaResource } from './asset-media-resource';
import type { VideoStoryboard } from './video-storyboard';

/** é³ä¹çæè¾å¥åæ° */
export interface MusicGenerationInput {
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
  /** æ­è¯ */
  lyrics?: string;
  /** é³ä¹æ¶é¿(ç§) */
  duration?: number;
  /** æµæ´¾(pop/rock/jazz/classical/edmç­) */
  genre?: string;
  /** é£æ ¼ */
  style?: string;
  /** éåº¦BPM */
  tempo?: number;
  /** è°å¼(C major/A minorç­) */
  key?: string;
  /** æå·(4/4/3/4ç­) */
  timeSignature?: string;
  /** æç»ª(happy/sad/energetic/calmç­) */
  mood?: string;
  /** ä¹å¨ */
  instruments?: string;
  /** æ¯å¦çº¯é³ä¹(æ äººå£°) */
  instrumental?: boolean;
  /** æ¯å¦é«æ¸ */
  hd?: boolean;
  referenceAssetCount?: number;
}
