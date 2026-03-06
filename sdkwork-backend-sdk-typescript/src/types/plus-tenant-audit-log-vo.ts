/** 租户审计日志值对象 */
export interface PlusTenantAuditLogVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 日志ID */
  id?: number;
  /** 租户ID */
  tenantId?: number;
  /** 操作动作 */
  action?: string;
  /** 所属模块 */
  module?: string;
  /** 操作人 */
  operator?: string;
  /** 操作说明 */
  description?: string;
  /** 结果状态 */
  result?: string;
  /** 操作时间 */
  createTime?: string;
  /** 来源IP */
  ip?: string;
}
