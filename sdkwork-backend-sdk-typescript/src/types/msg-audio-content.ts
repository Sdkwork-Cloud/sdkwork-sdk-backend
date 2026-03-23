import type { AudioMediaResource } from './audio-media-resource';

/** IMé³é¢æ¶æ¯åå®¹ç±» */
export interface MsgAudioContent {
  /** æ¶æ¯åå®¹ */
  content?: string;
  /** é³é¢èµæº */
  resource?: AudioMediaResource;
}
