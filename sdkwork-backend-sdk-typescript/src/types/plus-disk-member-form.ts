import type { DiskPermission } from './disk-permission';

/** Disk member creation form */
export interface PlusDiskMemberForm {
  /** 关联的磁盘ID */
  diskId: number;
  /** 用户ID */
  userId: number;
  /** 成员权限集合（位运算表示） */
  permission: DiskPermission;
  /** 成员备注信息 */
  remark?: string;
  /** 是否为磁盘所有者 */
  isOwner: boolean;
}
