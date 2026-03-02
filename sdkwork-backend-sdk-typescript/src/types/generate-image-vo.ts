import type { ImageMediaResourceList } from './image-media-resource-list';

/** Image generation result value object */
export interface GenerateImageVO {
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
  /** Generated image resources */
  images?: ImageMediaResourceList;
}
