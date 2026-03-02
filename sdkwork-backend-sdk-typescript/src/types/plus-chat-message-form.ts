import type { MessageBody } from './message-body';
import type { PlusChatOptions } from './plus-chat-options';

/** Chat message creation form */
export interface PlusChatMessageForm {
  /** Message content (text of the message) */
  content: MessageBody;
  /** Message role (user, assistant, system, function) */
  role: 'DEFAULT' | 'USER' | 'ASSISTANT' | 'SYSTEM' | 'FUNCTION';
  /** Message type (text, image, file, etc.) */
  type: 'DEFAULT' | 'TEXT' | 'IMAGE' | 'FILE' | 'AUDIO' | 'VIDEO' | 'CODE' | 'MARKDOWN' | 'MIXED' | 'LOCATION' | 'MUSIC' | 'NEWS' | 'VOICE' | 'ARTICLE' | 'APP' | 'CHUNK' | 'FRAME' | 'BINARY' | 'EVENT' | 'MCP';
  /** Message status (sent, delivered, read, failed) */
  status: 'DEFAULT' | 'SENT' | 'DELIVERED' | 'READ' | 'FAILED' | 'PROCESSING' | 'EDITED' | 'DELETED';
  /** Conversation ID (foreign key to plus_ai_conversation.id) */
  conversationId: number;
  /** User identifier (foreign key to plus_user.id) */
  userId?: number;
  /** Parent message ID (for threaded conversations) */
  parentMessageId?: number;
  /** Message metadata (JSON format, can store additional information) */
  metadata?: Record<string, unknown>;
  /** Token count (for billing/usage tracking) */
  tokenCount?: number;
  /** Processing time in milliseconds (for performance tracking) */
  processingTime?: number;
  /** Error flag (true if message represents an error) */
  isError?: boolean;
  /** Error code (if message represents an error) */
  errorCode?: string;
  /** Error message (if message represents an error) */
  errorMessage?: string;
  /** Model ID (foreign key to plus_ai_model_info.id) */
  modelId?: number;
  /** Specific model name/identifier (e.g., "gpt-4", "claude-3-opus") */
  model?: string;
  /** Temperature setting used for this message */
  temperature?: number;
  /** Flag indicating if this message was generated with RAG (Retrieval Augmented Generation) */
  usedRag?: boolean;
  /** Chat options (temperature, top_p, etc.) stored as JSON */
  chatOptions?: PlusChatOptions;
}
