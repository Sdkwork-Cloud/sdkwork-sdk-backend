export interface ChatMessageQueryListForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** Conversation ID (foreign key to plus_ai_conversation.id) */
  conversationId: number;
  /** Conversation Uuid (foreign key to plus_ai_conversation.uuid) */
  conversationUuid: string;
  /** Last Sync Message ID */
  lastSyncMessageId?: string;
}
