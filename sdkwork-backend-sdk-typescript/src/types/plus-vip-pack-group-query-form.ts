/** VIP 套餐组查询 Form */
export interface PlusVipPackGroupQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** 应用ID */
  appId?: number;
  /** 作用域类型 */
  scopeType?: 'DEFAULT' | 'GLOBAL' | 'APP';
  /** 作用域ID */
  scopeId?: number;
  /** 套餐组标识 */
  groupKey?: string;
  /** 应用ID列表 */
  appIdIn?: number[];
}
