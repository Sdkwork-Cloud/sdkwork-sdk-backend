import type { VideoMediaResource } from './video-media-resource';

/** IMè§é¢æ¶æ¯åå®¹ç±» */
export interface MsgVideoContent {
  /** æ¶æ¯åå®¹ */
  content?: string;
  /** è§é¢èµæº */
  resource?: VideoMediaResource;
}
