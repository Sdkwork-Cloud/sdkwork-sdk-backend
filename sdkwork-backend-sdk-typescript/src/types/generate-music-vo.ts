import type { AudioMediaResourceList } from './audio-media-resource-list';

/** Music generation result value object */
export interface GenerateMusicVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
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
