/** 数据库Schema定义VO */
export interface PlusSchemaVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** Schema ID */
  id?: number;
  /** Schema名称 */
  name?: string;
  /** Schema描述 */
  description?: string;
  /** 状态(0-禁用,1-启用) */
  status?: number;
  /** 表数量 */
  tableCount?: number;
  /** 最后同步时间 */
  lastSyncTime?: string;
  /** 是否默认Schema */
  isDefault?: boolean;
  /** 所属数据源ID */
  datasourceId?: number;
  /** 表ID列表 */
  tableIds?: number[];
}
