/** 工作区信息VO */
export interface PlusWorkspaceVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 主键ID，由数据库自动生成 */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 工作区名称 */
  name?: string;
  /** 工作区业务代码(可读的唯一标识符) */
  code?: string;
  /** 工作区标题 */
  title?: string;
  /** 工作区详细描述 */
  description?: string;
  /** 工作区图标 */
  icon?: string;
  /** 工作区主题颜色 */
  color?: string;
  /** 工作区类型(1:个人工作区, 2:团队工作区, 3:组织工作区, 4:项目工作区) */
  type?: 'PERSONAL' | 'TEAM' | 'ORGANIZATION' | 'PROJECT';
  /** 工作区状态(1:活跃, 2:暂停, 3:已归档, 4:已删除) */
  status?: 'ACTIVE' | 'SUSPENDED' | 'ARCHIVED' | 'DELETED';
  /** 工作区所有者用户ID */
  ownerId?: number;
  /** 工作区负责人用户ID */
  leaderId?: number;
  /** 工作区计划开始时间 */
  startTime?: string;
  /** 工作区计划结束时间 */
  endTime?: string;
  /** 最大成员数 */
  maxMembers?: number;
  /** 当前成员数 */
  currentMembers?: number;
  /** 最大存储空间(字节) */
  maxStorage?: number;
  /** 已用存储空间(字节) */
  usedStorage?: number;
  /** 工作区设置(JSON格式) */
  settings?: string;
  /** 软删除状态(true:已删除, false:活跃) */
  isDeleted?: boolean;
  /** 公开状态(true:公开, false:私有) */
  isPublic?: boolean;
  /** 模板状态(true:模板工作区, false:普通工作区) */
  isTemplate?: boolean;
}
