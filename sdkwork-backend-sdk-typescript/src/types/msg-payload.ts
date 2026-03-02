import type { MsgAudioContent } from './msg-audio-content';
import type { MsgFileContent } from './msg-file-content';
import type { MsgImageContent } from './msg-image-content';
import type { MsgLocationContent } from './msg-location-content';
import type { MsgMusicContent } from './msg-music-content';
import type { MsgTextContent } from './msg-text-content';
import type { MsgVideoContent } from './msg-video-content';

/** IM消息载体类 */
export interface MsgPayload {
  /** 音频消息内容 */
  audio?: MsgAudioContent;
  /** 文件消息内容 */
  file?: MsgFileContent;
  /** 图片消息内容 */
  image?: MsgImageContent;
  /** 位置消息内容 */
  location?: MsgLocationContent;
  /** 音乐消息内容 */
  music?: MsgMusicContent;
  /** 文本消息内容 */
  text?: MsgTextContent;
  /** 视频消息内容 */
  video?: MsgVideoContent;
}
