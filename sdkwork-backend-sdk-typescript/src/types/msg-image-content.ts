import type { ImageMediaResource } from './image-media-resource';

/** IM图片消息内容类 */
export interface MsgImageContent {
  /** 消息内容 */
  content?: string;
  /** 图片资源 */
  resource?: ImageMediaResource;
}
