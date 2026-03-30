import type { MusicMediaResource } from './music-media-resource';

/** IM音乐消息内容类 */
export interface MsgMusicContent {
  /** 消息内容 */
  content?: string;
  /** 音频资源 */
  resource?: MusicMediaResource;
  /** 音乐标题 */
  title?: string;
  /** 音乐艺术家或歌手 */
  artist?: string;
  /** 音乐专辑名称 */
  album?: string;
  /** 音乐时长(秒) */
  duration?: number;
}
