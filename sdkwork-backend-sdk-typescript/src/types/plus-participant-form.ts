import type { ImageMediaResource } from './image-media-resource';

/** Chat participant creation form */
export interface PlusParticipantForm {
  /** 参与者类型 (用户、AI助手等) */
  type: 'USER' | 'AI_ASSISTANT' | 'SYSTEM' | 'CUSTOMER_SERVICE';
  /** 参与者名称 */
  name: string;
  /** 参与者头像 */
  face?: ImageMediaResource;
  /** 关联的用户ID */
  userId?: number;
  /** 关联的AI助手ID */
  agentId?: number;
  /** 参与者在上下文中的角色 (如: owner, member, guest等) */
  role: 'OWNER' | 'ADMIN' | 'MEMBER' | 'GUEST' | 'AI_ASSISTANT' | 'SYSTEM';
  /** 上下文类型 (CONVERSATION:会话, GROUP:群组) */
  contextType: 'CONVERSATION' | 'GROUP';
  /** 上下文ID (可以是会话ID或群组ID) */
  contextId: number;
  /** 会话ID (当contextType为GROUP时，可以将会话ID存储在此字段) */
  conversationId?: number;
  /** 群组类型 (使用GroupType枚举) */
  groupType?: 'NORMAL' | 'WORK' | 'INTEREST' | 'SUPPORT';
  /** 会话类型 */
  conversationType: 'CHAT' | 'C2C' | 'GROUP' | 'KF';
  /** 是否是上下文创建者 */
  isCreator?: boolean;
  /** 是否在线 */
  isOnline?: boolean;
  /** 最后活跃时间 */
  lastActiveTime?: string;
  /** 是否是临时参与者 (用于在群组中选择成员建立临时会话) */
  isTemporary?: boolean;
}
