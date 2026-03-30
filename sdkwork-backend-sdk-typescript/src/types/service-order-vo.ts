/** Service order action result */
export interface ServiceOrderVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** Order id */
  orderId?: number;
  /** Order number */
  orderSn?: string;
  /** Task code */
  taskCode?: string;
  /** Dispatch mode */
  dispatchMode?: 'DEFAULT' | 'GRAB' | 'ASSIGN';
  /** Dispatch status */
  dispatchStatus?: 'DEFAULT' | 'PUBLISHED' | 'ASSIGNED' | 'IN_PROGRESS' | 'COMPLETED' | 'CANCELLED' | 'EXPIRED';
  /** Worker user id */
  workerUserId?: number;
  /** Dispatch expire time */
  dispatchExpireTime?: string;
  /** Success */
  success?: boolean;
  /** Message */
  message?: string;
}
