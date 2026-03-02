import type { ChatCompletionMetadata } from './chat-completion-metadata';
import type { PlusAgent } from './plus-agent';

export interface GroupInfo {
  id?: string;
  object?: string;
  created?: number;
  model?: string;
  systemFingerprint?: string;
  metadata?: ChatCompletionMetadata;
  agent?: PlusAgent;
}
