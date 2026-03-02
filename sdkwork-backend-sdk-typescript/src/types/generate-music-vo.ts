import type { AudioMediaResourceList } from './audio-media-resource-list';

/** Music generation result value object */
export interface GenerateMusicVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 请求ID */
  requestId?: string;
  /** 任务ID */
  taskId?: string;
  /** 生成任务状态 */
  taskStatus?: string;
  /** Generated audio resources */
  audios?: AudioMediaResourceList;
  /** Generated lyrics for the music */
  lyrics?: string;
}
