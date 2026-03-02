/** 系统角色VO类 */
export interface PlusRoleVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 角色ID */
  id?: number;
  /** 角色编码(唯一) */
  code?: string;
  /** 角色名称 */
  name?: string;
  /** 角色描述 */
  description?: string;
  /** 角色状态(ACTIVE:活跃,INACTIVE:未激活,LOCKED:锁定) */
  status?: 'ACTIVE' | 'INACTIVE';
}
