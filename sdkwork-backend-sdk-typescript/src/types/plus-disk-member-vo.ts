import type { DiskPermission } from './disk-permission';

/** 磁盘成员VO，封装磁盘成员的核心信息 */
export interface PlusDiskMemberVO {
  /** 创建时间 */
  createdAt?: string;
  /** 最后更新时间 */
  updatedAt?: string;
  /** 主键ID */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 版本号（乐观锁控制） */
  v?: number;
  /** 关联磁盘ID */
  diskId?: number;
  /** 用户ID */
  userId?: number;
  /** 成员权限集合（位运算表示） */
  permission?: DiskPermission;
  /** 成员备注信息 */
  remark?: string;
  /** 是否为磁盘所有者 */
  isOwner?: boolean;
}
