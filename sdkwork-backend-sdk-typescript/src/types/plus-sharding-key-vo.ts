/** 分片键值对象 */
export interface PlusShardingKeyVO {
  /** 创建时间 */
  createdAt?: string;
  /** 最后更新时间 */
  updatedAt?: string;
  /** 主键ID */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 分片Key */
  shardingKey?: string;
  /** 租户ID */
  tenantId?: number;
  /** 数据拥有者 */
  owner?: 'DEFAULT' | 'TENANT' | 'ORGANIZATION';
  /** 数据拥有者ID */
  ownerId?: number;
  /** 数据状态 */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  /** 描述 */
  description?: string;
}
