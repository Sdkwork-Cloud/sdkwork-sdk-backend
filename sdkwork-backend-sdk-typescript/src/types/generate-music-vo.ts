import type { AudioMediaResourceList } from './audio-media-resource-list';

/** Music generation result value object */
export interface GenerateMusicVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** Request ID */
  requestId?: string;
  /** Task ID */
  taskId?: string;
  /** Task status */
  taskStatus?: string;
  /** Generated audio resources */
  audios?: AudioMediaResourceList;
  /** Generated lyrics for the music */
  lyrics?: string;
}
