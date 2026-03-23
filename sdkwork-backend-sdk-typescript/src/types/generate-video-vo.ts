import type { VideoMediaResourceList } from './video-media-resource-list';

/** Video generation result value object */
export interface GenerateVideoVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** Request ID for tracking */
  requestId?: string;
  /** Task ID from the generation service */
  taskId?: string;
  /** Task status */
  taskStatus?: string;
  /** Generated video resources */
  videos?: VideoMediaResourceList;
  /** Status of the generation task */
  status?: string;
}
