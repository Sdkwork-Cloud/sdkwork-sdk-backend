import type { ChatCompletionMessage } from './chat-completion-message';
import type { ChatContext } from './chat-context';

/** Chat completion create form */
export interface ChatCompletionCreateForm {
  /** Model name */
  model?: string;
  /** Chat messages */
  messages?: ChatCompletionMessage[];
  /** Sampling temperature */
  temperature?: number;
  /** Number of candidates */
  n?: number;
  /** Whether to stream */
  stream?: boolean;
  /** Stop words */
  stop?: string[];
  /** User ID */
  user?: string;
  /** Tool info */
  tool?: string;
  /** Top p */
  top_p?: number;
  /** Max tokens */
  max_tokens?: number;
  /** Presence penalty */
  presence_penalty?: number;
  /** Frequency penalty */
  frequency_penalty?: number;
  /** Logit bias */
  logit_bias?: Record<string, number>;
  /** Response format switch */
  response_format?: boolean;
  /** System fingerprint */
  system_fingerprint?: string;
  /** Chat context */
  chat_context?: ChatContext;
}
