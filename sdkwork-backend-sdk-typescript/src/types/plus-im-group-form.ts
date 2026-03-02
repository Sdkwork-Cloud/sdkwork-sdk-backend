import type { ImageMediaResource } from './image-media-resource';

/** Chat group creation form */
export interface PlusImGroupForm {
  /** 群组名称 */
  name: string;
  /** 群组描述 */
  description?: string;
  /** 群组头像 */
  avatar?: ImageMediaResource;
  /** 群组公告 */
  announcement?: string;
  /** 群组成员数量 */
  memberCount: number;
  /** 最大成员数量 */
  maxMembers: number;
  /** 群组创建者ID */
  creatorId: number;
  /** 群组类型 */
  type?: 'NORMAL' | 'WORK' | 'INTEREST' | 'SUPPORT';
  /** 群组状态 */
  status?: 'ACTIVE' | 'INACTIVE' | 'DISABLED' | 'DELETED';
  /** 是否允许成员邀请新成员 */
  allowMemberInvite?: boolean;
  /** 是否需要审批才能加入 */
  requireApproval?: boolean;
}
