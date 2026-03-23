import type { AssetMediaResource } from './asset-media-resource';
import type { VideoStoryboard } from './video-storyboard';

/** é³é¢çæè¾å¥åæ°(è¯­é³åæTTS) */
export interface AudioGenerationInput {
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
  /** å¾è½¬æ¢ææ¬ */
  text?: string;
  /** è¯­é³æ è¯ */
  voice?: string;
  /** è¯´è¯äººID */
  voiceSpeakerId?: number;
  /** è¯­è¨ä»£ç  */
  language?: string;
  /** è¯­é(0.25-4.0) */
  speed?: number;
  /** é³è°(0.5-2.0) */
  pitch?: number;
  /** é³é(0-100) */
  volume?: number;
  /** éæ ·ç */
  sampleRate?: number;
  /** æ¯ç¹ç */
  bitRate?: number;
  /** å£°éæ° */
  channels?: number;
  /** ææç±»å(neutral/happy/sad/angryç­) */
  emotion?: string;
  referenceAssetCount?: number;
}
