/** Sharding key creation form */
export interface PlusShardingKeyForm {
  /** 分片Key */
  shardingKey: string;
  /** 租户ID */
  tenantId: number;
  /** 数据拥有者 */
  owner: 'DEFAULT' | 'TENANT' | 'ORGANIZATION';
  /** 数据拥有者ID */
  ownerId: number;
  /** 数据状态 */
  status: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  /** 描述 */
  description?: string;
}
