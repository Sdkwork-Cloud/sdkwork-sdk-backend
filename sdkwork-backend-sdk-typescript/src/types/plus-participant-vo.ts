import type { ImageMediaResource } from './image-media-resource';

/** 聊天参与者视图对象 */
export interface PlusParticipantVO {
  /** 创建时间 */
  createdAt?: string;
  /** 最后更新时间 */
  updatedAt?: string;
  /** 参与者ID */
  id?: number;
  /** 通用唯一标识符 */
  uuid?: string;
  /** 参与者类型（用户、AI助手等） */
  type?: 'USER' | 'AI_ASSISTANT' | 'SYSTEM' | 'CUSTOMER_SERVICE';
  /** 参与者名称 */
  name?: string;
  /** 参与者头像资源 */
  face?: ImageMediaResource;
  /** 关联的用户ID */
  userId?: number;
  /** 关联的AI助手ID */
  agentId?: number;
  /** 参与者角色（如：owner-所有者、member-成员、guest-访客等） */
  role?: 'OWNER' | 'ADMIN' | 'MEMBER' | 'GUEST' | 'AI_ASSISTANT' | 'SYSTEM';
  /** 上下文类型（CONVERSATION-会话、GROUP-群组） */
  contextType?: 'CONVERSATION' | 'GROUP';
  /** 上下文ID（会话ID或群组ID） */
  contextId?: number;
  /** 会话ID（当上下文类型为群组时存储） */
  conversationId?: number;
  /** 群组类型 */
  groupType?: 'NORMAL' | 'WORK' | 'INTEREST' | 'SUPPORT';
  /** 会话类型 */
  conversationType?: 'CHAT' | 'C2C' | 'GROUP' | 'KF';
  /** 是否为上下文创建者 */
  isCreator?: boolean;
  /** 是否在线 */
  isOnline?: boolean;
  /** 最后活跃时间 */
  lastActiveTime?: string;
  /** 是否为临时参与者（用于群组临时会话） */
  isTemporary?: boolean;
}
