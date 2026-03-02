import type { FileMediaResource } from './file-media-resource';

/** IM文件消息内容类 */
export interface MsgFileContent {
  /** 消息内容 */
  content?: string;
  /** 文件资源 */
  resource?: FileMediaResource;
}
