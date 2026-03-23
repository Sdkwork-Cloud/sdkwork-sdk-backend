import type { OrderWorkerDispatchMetadata } from './order-worker-dispatch-metadata';

/** Worker dispatch profile view object */
export interface PlusOrderWorkerDispatchProfileVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  id?: number;
  userId?: number;
  ratingLevel?: string;
  enabled?: boolean;
  globalMaxInProgress?: number;
  metadata?: OrderWorkerDispatchMetadata;
}
