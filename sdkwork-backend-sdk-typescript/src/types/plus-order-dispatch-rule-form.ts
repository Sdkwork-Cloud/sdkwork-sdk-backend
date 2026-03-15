import type { OrderDispatchRuleMetadata } from './order-dispatch-rule-metadata';

/** Dispatch rule form */
export interface PlusOrderDispatchRuleForm {
  /** Task code */
  taskCode: string;
  /** Task name */
  taskName: string;
  /** Enabled */
  enabled?: boolean;
  /** Allow grab */
  allowGrab?: boolean;
  /** Allow assign */
  allowAssign?: boolean;
  /** Default task concurrent limit */
  defaultTaskConcurrentLimit: number;
  /** Rule metadata */
  metadata?: OrderDispatchRuleMetadata;
}
