import type { ImageMediaResource } from './image-media-resource';

/** Chat participant creation form */
export interface PlusParticipantForm {
  /** Participant type */
  type: 'USER' | 'AI_ASSISTANT' | 'SYSTEM' | 'CUSTOMER_SERVICE';
  /** Display name */
  name: string;
  /** Avatar resource */
  face?: ImageMediaResource;
  /** User ID */
  userId?: number;
  /** Agent ID */
  agentId?: number;
  /** Participant role */
  role: 'OWNER' | 'ADMIN' | 'MEMBER' | 'GUEST' | 'AI_ASSISTANT' | 'SYSTEM';
  /** Context type */
  contextType: 'CONVERSATION' | 'GROUP';
  /** Context ID */
  contextId: number;
  /** Conversation ID */
  conversationId?: number;
  /** Group type */
  groupType?: 'NORMAL' | 'WORK' | 'INTEREST' | 'SUPPORT';
  /** Conversation type */
  conversationType: 'CHAT' | 'C2C' | 'GROUP' | 'KF';
  /** Whether the participant is the creator */
  isCreator?: boolean;
  /** Whether the participant is online */
  isOnline?: boolean;
  /** Last active time */
  lastActiveTime?: string;
  /** Whether the participant is temporary */
  isTemporary?: boolean;
}
