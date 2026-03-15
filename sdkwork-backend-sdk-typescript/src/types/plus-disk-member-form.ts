import type { DiskPermission } from './disk-permission';

/** Disk member creation form */
export interface PlusDiskMemberForm {
  /** Disk ID */
  diskId: number;
  /** User ID */
  userId: number;
  /** Disk permission */
  permission: DiskPermission;
  /** Remark */
  remark?: string;
  /** Whether the member is the owner */
  isOwner?: boolean;
}
