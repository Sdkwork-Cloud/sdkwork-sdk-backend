import type { VideoMediaResourceList } from './video-media-resource-list';

/** Video generation result value object */
export interface GenerateVideoVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
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
