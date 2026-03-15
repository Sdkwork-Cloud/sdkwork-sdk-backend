import type { OrderWorkerDispatchMetadata } from './order-worker-dispatch-metadata';

/** Worker dispatch profile form */
export interface PlusOrderWorkerDispatchProfileForm {
  /** Worker user id */
  userId: number;
  /** Rating level */
  ratingLevel?: string;
  /** Enabled */
  enabled?: boolean;
  /** Global max in progress */
  globalMaxInProgress: number;
  /** Worker metadata */
  metadata?: OrderWorkerDispatchMetadata;
}
