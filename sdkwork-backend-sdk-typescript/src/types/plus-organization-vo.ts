import type { InstallAppList } from './install-app-list';

/** 组织VO对象 */
export interface PlusOrganizationVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 组织ID */
  id?: number;
  /** 组织名称 */
  name?: string;
  /** 组织编码 */
  code?: string;
  /** 组织状态：1-活跃, 2-未激活, 3-禁用, 4-已删除 */
  status?: 'ACTIVE' | 'INACTIVE' | 'DISABLED' | 'DELETED';
  /** 组织描述 */
  description?: string;
  /** 父组织ID */
  parentId?: number;
  /** 安装应用列表 */
  installAppList?: InstallAppList;
}
