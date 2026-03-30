/** VIP package group creation form */
export interface PlusVipPackGroupForm {
  /** Application ID */
  appId?: number;
  /** Scope type */
  scopeType?: 'DEFAULT' | 'GLOBAL' | 'APP';
  /** Scope ID */
  scopeId?: number;
  /** Group key */
  groupKey?: string;
  /** Group name */
  name: string;
  /** Group description */
  description?: string;
  /** Sort weight */
  sortWeight?: number;
  /** Group status */
  status?: 'DEFAULT' | 'ENABLED' | 'DISABLED';
  /** Remark */
  remark?: string;
}
