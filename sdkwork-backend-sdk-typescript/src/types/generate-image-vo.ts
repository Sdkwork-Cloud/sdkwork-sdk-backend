import type { ImageMediaResourceList } from './image-media-resource-list';

/** Image generation result value object */
export interface GenerateImageVO {
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
  /** Generated image resources */
  images?: ImageMediaResourceList;
}
