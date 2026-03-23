import type { MsgAudioContent } from './msg-audio-content';
import type { MsgFileContent } from './msg-file-content';
import type { MsgImageContent } from './msg-image-content';
import type { MsgLocationContent } from './msg-location-content';
import type { MsgMusicContent } from './msg-music-content';
import type { MsgTextContent } from './msg-text-content';
import type { MsgVideoContent } from './msg-video-content';

/** IMæ¶æ¯è½½ä½ç±» */
export interface MsgPayload {
  /** é³é¢æ¶æ¯åå®¹ */
  audio?: MsgAudioContent;
  /** æä»¶æ¶æ¯åå®¹ */
  file?: MsgFileContent;
  /** å¾çæ¶æ¯åå®¹ */
  image?: MsgImageContent;
  /** ä½ç½®æ¶æ¯åå®¹ */
  location?: MsgLocationContent;
  /** é³ä¹æ¶æ¯åå®¹ */
  music?: MsgMusicContent;
  /** ææ¬æ¶æ¯åå®¹ */
  text?: MsgTextContent;
  /** è§é¢æ¶æ¯åå®¹ */
  video?: MsgVideoContent;
}
