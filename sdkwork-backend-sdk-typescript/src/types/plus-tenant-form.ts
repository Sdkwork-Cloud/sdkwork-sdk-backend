import type { InstallAppList } from './install-app-list';

/** Install app list */
export interface PlusTenantForm {
  /** 租户名称 */
  name: string;
  /** 租户唯一编码 */
  code: string;
  /** 租户状态 */
  status: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  /** 租户描述 */
  description?: string;
  /** 租户管理员用户ID */
  adminUserId?: number;
  /** 租户过期时间 */
  expireTime?: string;
  /** 安装应用列表 */
  installAppList?: InstallAppList;
}
