import type { AssetMediaResource } from './asset-media-resource';
import type { VideoStoryboard } from './video-storyboard';

/** è¯­é³è¯´è¯äººçæè¾å¥åæ° */
export interface VoiceSpeakerGenerationInput {
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
  /** è¯´è¯äººåç§° */
  speakerName?: string;
  /** è¯´è¯äººID(å·²æè¯´è¯äºº) */
  speakerId?: string;
  /** è¯­è¨ä»£ç  */
  language?: string;
  /** è¯­é(0.25-4.0) */
  speed?: number;
  /** é³è°(0.5-2.0) */
  pitch?: number;
  /** é³é(0-100) */
  volume?: number;
  /** ææç±»å(neutral/happy/sad/angryç­) */
  emotion?: string;
  /** æ¯å¦ä¿å­è¯´è¯äºº */
  saveSpeaker?: boolean;
  voiceClone?: boolean;
  usingExistingSpeaker?: boolean;
  referenceAssetCount?: number;
}
