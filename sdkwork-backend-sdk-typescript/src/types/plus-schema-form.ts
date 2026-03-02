/** Schema creation form */
export interface PlusSchemaForm {
  /** Schema名称 */
  name: string;
  /** Schema描述 */
  description?: string;
  /** 状态(0-禁用,1-启用) */
  status: number;
  /** 表数量 */
  tableCount?: number;
  /** 最后同步时间 */
  lastSyncTime?: string;
  /** 是否默认Schema */
  isDefault?: boolean;
  /** 所属数据源ID */
  datasourceId: number;
}
