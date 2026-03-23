import type { AssetMediaResource } from './asset-media-resource';
import type { VideoStoryboard } from './video-storyboard';

/** èæè§è²çæè¾å¥åæ° */
export interface CharacterGenerationInput {
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
  /** è§è²åç§° */
  name?: string;
  /** è§è²æè¿° */
  description?: string;
  /** è§è²å¤è§æè¿° */
  appearance?: string;
  /** è§è²æ§æ ¼ç¹ç¹ */
  personality?: string;
  /** è§è²èæ¯æäº */
  background?: string;
  /** è§è²ç±»å */
  type?: 'HUMAN' | 'PET' | 'ANIMAL' | 'ROBOT' | 'OTHER';
  /** è§è²é£æ ¼(anime/realistic/cartoon/3dç­) */
  style?: string;
  /** å§¿å¿ */
  pose?: string;
  /** è¡¨æ */
  expression?: string;
  /** æ§å« */
  gender?: string;
  /** å¹´é¾æ®µ */
  age?: string;
  /** æè£ */
  clothing?: string;
  /** å¾çå®½åº¦(åç´ ) */
  width?: number;
  /** å¾çé«åº¦(åç´ ) */
  height?: number;
  /** æ¯å¦é«æ¸ */
  hd?: boolean;
  /** æ¯å¦çæå¤è§è§ */
  multiView?: boolean;
  referenceAssetCount?: number;
}
