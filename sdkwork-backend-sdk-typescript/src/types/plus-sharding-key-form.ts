/** Sharding key creation form */
export interface PlusShardingKeyForm {
  /** Sharding key */
  shardingKey: string;
  /** Tenant ID */
  tenantId: number;
  /** Owner type */
  owner: 'DEFAULT' | 'TENANT' | 'ORGANIZATION';
  /** Owner ID */
  ownerId: number;
  /** Status */
  status: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  /** Description */
  description?: string;
}
