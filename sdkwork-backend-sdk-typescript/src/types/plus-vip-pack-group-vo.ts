import type { PlusVipPackVO } from './plus-vip-pack-vo';

/** VIP package group view object */
export interface PlusVipPackGroupVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** Primary key */
  id?: number;
  /** UUID */
  uuid?: string;
  /** Application ID */
  appId?: number;
  /** Scope type */
  scopeType?: 'DEFAULT' | 'GLOBAL' | 'APP';
  /** Scope ID */
  scopeId?: number;
  /** Stable group key */
  groupKey?: string;
  /** Group name */
  name?: string;
  /** Group description */
  description?: string;
  /** Sort weight */
  sortWeight?: number;
  /** Group status */
  status?: 'DEFAULT' | 'ENABLED' | 'DISABLED';
  /** Remark */
  remark?: string;
  /** Packs under the group */
  packs?: PlusVipPackVO[];
}
