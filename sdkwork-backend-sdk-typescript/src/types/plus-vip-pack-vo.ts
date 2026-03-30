import type { PlusVipLevelVO } from './plus-vip-level-vo';

/** VIP package view object */
export interface PlusVipPackVO {
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
  /** Package name */
  name?: string;
  /** Package description */
  description?: string;
  /** Package group ID */
  groupId?: number;
  /** VIP level ID */
  vipLevelId?: number;
  /** Price */
  price?: number;
  /** Point amount */
  pointAmount?: number;
  /** VIP duration days */
  vipDurationDays?: number;
  /** Billing cycle */
  billingCycle?: 'DEFAULT' | 'MONTHLY' | 'QUARTERLY' | 'YEARLY' | 'CUSTOM';
  /** Package status */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE';
  /** Sort weight */
  sortWeight?: number;
  /** Valid from */
  validFrom?: string;
  /** Valid to */
  validTo?: string;
  /** Remark */
  remark?: string;
  /** VIP level details */
  vipLevel?: PlusVipLevelVO;
}
