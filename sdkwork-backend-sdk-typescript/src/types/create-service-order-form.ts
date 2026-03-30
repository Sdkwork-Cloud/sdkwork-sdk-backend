/** Create service order form */
export interface CreateServiceOrderForm {
  /** Publisher user id */
  publisherUserId?: number;
  /** Order subject */
  subject?: string;
  /** Task code */
  taskCode: string;
  /** Dispatch mode */
  dispatchMode: 'DEFAULT' | 'GRAB' | 'ASSIGN';
  /** Order total amount */
  totalAmount: number;
  /** Dispatch expire time */
  dispatchExpireTime?: string;
  /** Order expire time */
  expireTime?: string;
  /** Task payload */
  taskPayload?: Record<string, Record<string, unknown>>;
  /** Remark */
  remark?: string;
}
