/** User creation form */
export interface PlusUserForm {
  /** 用户名(唯一) */
  username: string;
  /** 密码(加密存储) */
  password: string;
  /** 密码盐值(用于加密) */
  salt?: string;
  /** 电子邮箱 */
  email?: string;
  /** 手机号码 */
  phone?: string;
  /** 用户状态(ACTIVE:活跃,INACTIVE:未激活,LOCKED:锁定,DELETED:已删除) */
  status: 'ACTIVE' | 'INACTIVE';
  /** 用户角色ID集合 */
  roleIds?: number[];
}
