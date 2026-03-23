import type { ImageMediaResource } from './image-media-resource';

/** IMå¾çæ¶æ¯åå®¹ç±» */
export interface MsgImageContent {
  /** æ¶æ¯åå®¹ */
  content?: string;
  /** å¾çèµæº */
  resource?: ImageMediaResource;
}
