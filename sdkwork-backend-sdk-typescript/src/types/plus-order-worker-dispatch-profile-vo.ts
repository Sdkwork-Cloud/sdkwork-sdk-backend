import type { OrderWorkerDispatchMetadata } from './order-worker-dispatch-metadata';

/** Worker dispatch profile view object */
export interface PlusOrderWorkerDispatchProfileVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  id?: number;
  userId?: number;
  ratingLevel?: string;
  enabled?: boolean;
  globalMaxInProgress?: number;
  metadata?: OrderWorkerDispatchMetadata;
}
