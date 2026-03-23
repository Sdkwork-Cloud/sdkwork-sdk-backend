import type { MusicMediaResource } from './music-media-resource';

/** IMé³ä¹æ¶æ¯åå®¹ç±» */
export interface MsgMusicContent {
  /** æ¶æ¯åå®¹ */
  content?: string;
  /** é³é¢èµæº */
  resource?: MusicMediaResource;
  /** é³ä¹æ é¢ */
  title?: string;
  /** é³ä¹èºæ¯å®¶ææ­æ */
  artist?: string;
  /** é³ä¹ä¸è¾åç§° */
  album?: string;
  /** é³ä¹æ¶é¿(ç§) */
  duration?: number;
}
