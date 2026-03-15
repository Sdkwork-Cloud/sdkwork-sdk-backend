import type { PlusChatOptions } from './plus-chat-options';
import type { TagsContent } from './tags-content';

/** Conversation creation form */
export interface PlusConversationForm {
  /** Conversation UUID */
  uuid?: string;
  /** Conversation title */
  title?: string;
  /** Conversation description */
  description?: string;
  /** User ID */
  userId: number;
  /** Conversation status */
  status?: 'INACTIVE' | 'ACTIVE' | 'COMPLETED' | 'ARCHIVED' | 'DELETED';
  /** Agent ID */
  agentId: number;
  /** Conversation summary */
  summary?: string;
  /** Last message ID */
  lastMessageId?: number;
  /** Message count */
  messageCount?: number;
  /** Conversation tags */
  tags?: TagsContent;
  /** System context */
  systemContext?: string;
  /** User context */
  userContext?: string;
  /** Last interaction time */
  lastInteractionTime?: string;
  /** Model ID */
  modelId?: number;
  /** Model name */
  model?: string;
  /** Knowledge base ID */
  knowledgeBaseId?: number;
  /** Data source ID */
  dataSourceId?: number;
  /** Chat options */
  chatOptions?: PlusChatOptions;
  /** Whether the conversation is pinned */
  pinned?: boolean;
  /** Conversation sort order */
  sortOrder?: number;
}
