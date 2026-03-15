/** Order creation form */
export interface PlusOrderForm {
  /** Order type */
  orderType: 'DEFAULT' | 'GOODS' | 'VIRTUAL' | 'MEMBER' | 'POINTS' | 'IM_GROUP' | 'BOOKING' | 'SERVICE';
  /** User id */
  userId: number;
  /** Order subject */
  subject?: string;
  /** Order number */
  orderSn?: string;
  /** Third-party transaction id */
  transactionId?: string;
  /** Out trade no */
  outTradeNo?: string;
  /** Total amount */
  totalAmount: number;
  /** Paid amount */
  paidAmount: number;
  /** Paid points amount */
  paidPointsAmount?: number;
  /** Order status */
  status: 'DEFAULT' | 'PENDING' | 'PAID' | 'DELIVERED' | 'COMPLETED' | 'CANCELLED' | 'REFUNDING' | 'PARTIAL_REFUND' | 'FULL_REFUND';
  /** Pay time */
  payTime?: string;
  /** Expire time */
  expireTime?: string;
  /** Content type */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM';
  /** Content id */
  contentId?: number;
  /** Service task code */
  taskCode?: string;
  /** Dispatch mode */
  dispatchMode?: 'DEFAULT' | 'GRAB' | 'ASSIGN';
  /** Dispatch status */
  dispatchStatus?: 'DEFAULT' | 'PUBLISHED' | 'ASSIGNED' | 'IN_PROGRESS' | 'COMPLETED' | 'CANCELLED' | 'EXPIRED';
  /** Worker user id */
  workerUserId?: number;
  /** Dispatcher user id */
  dispatcherUserId?: number;
  /** Accepted time */
  acceptedTime?: string;
  /** Service start time */
  serviceStartTime?: string;
  /** Dispatch expire time */
  dispatchExpireTime?: string;
  /** Task payload */
  taskPayload?: Record<string, unknown>;
}
