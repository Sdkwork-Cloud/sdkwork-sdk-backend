/** 项目信息VO对象(维护项目基本信息、状态及关联关系) */
export interface PlusProjectVO {
  /** 创建时间，实体首次持久化时设置 */
  createdAt?: string;
  /** 最后更新时间，实体修改时更新 */
  updatedAt?: string;
  /** 主键ID，由数据库自动生成 */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 项目名称(唯一标识) */
  name?: string;
  /** 项目编码(业务编码) */
  code?: string;
  /** 项目描述(详细功能说明) */
  description?: string;
  /** 项目状态(1:规划中,2:进行中,3:已暂停,4:已完成,5:已取消) */
  status?: 'PLANNING' | 'IN_PROGRESS' | 'SUSPENDED' | 'COMPLETED' | 'CANCELED';
  /** 项目负责人ID(关联用户表) */
  leaderId?: number;
  /** 项目开始时间 */
  startTime?: string;
  /** 项目结束时间 */
  endTime?: string;
  /** 项目预算金额(单位：分) */
  budgetAmount?: number;
  /** 是否删除(true:已删除,false:未删除) */
  isDeleted?: boolean;
}
