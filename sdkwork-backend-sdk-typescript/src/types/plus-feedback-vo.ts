/** 反馈信息VO */
export interface PlusFeedbackVO {
  /** 创建时间，实体首次持久化时设置 */
  createdAt?: string;
  /** 最后更新时间，实体修改时更新 */
  updatedAt?: string;
  /** 主键ID，由数据库自动生成 */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 版本号，用于乐观锁控制 */
  version?: number;
  /** 用户ID(外键关联plus_user.id) */
  userId?: number;
}
