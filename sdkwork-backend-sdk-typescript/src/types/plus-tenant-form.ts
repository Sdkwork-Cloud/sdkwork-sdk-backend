import type { InstallAppList } from './install-app-list';

/** Install app list */
export interface PlusTenantForm {
  /** Tenant name */
  name: string;
  /** Tenant code */
  code: string;
  /** Tenant status */
  status: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  /** Tenant description */
  description?: string;
  /** Administrator user ID */
  adminUserId: number;
  /** Expiration time */
  expireTime?: string;
  /** Installed applications */
  installAppList?: InstallAppList;
}
