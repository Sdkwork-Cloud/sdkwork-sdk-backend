import type { OrderDispatchRuleMetadata } from './order-dispatch-rule-metadata';

/** Dispatch rule view object */
export interface PlusOrderDispatchRuleVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
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
