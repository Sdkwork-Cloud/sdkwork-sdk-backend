import type { OrderDispatchRuleMetadata } from './order-dispatch-rule-metadata';

/** Dispatch rule view object */
export interface PlusOrderDispatchRuleVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  id?: number;
  taskCode?: string;
  taskName?: string;
  enabled?: boolean;
  allowGrab?: boolean;
  allowAssign?: boolean;
  defaultTaskConcurrentLimit?: number;
  metadata?: OrderDispatchRuleMetadata;
}
