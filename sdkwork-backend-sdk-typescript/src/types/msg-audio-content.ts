import type { AudioMediaResource } from './audio-media-resource';

/** IM音频消息内容类 */
export interface MsgAudioContent {
  /** 消息内容 */
  content?: string;
  /** 音频资源 */
  resource?: AudioMediaResource;
}
