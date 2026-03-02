/** 用户角色关联关系VO */
export interface PlusUserRoleVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 用户ID(复合主键之一) */
  userId?: number;
  /** 角色ID(复合主键之一) */
  roleId?: number;
}
