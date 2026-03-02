import type { VideoMediaResource } from './video-media-resource';

/** IM视频消息内容类 */
export interface MsgVideoContent {
  /** 消息内容 */
  content?: string;
  /** 视频资源 */
  resource?: VideoMediaResource;
}
