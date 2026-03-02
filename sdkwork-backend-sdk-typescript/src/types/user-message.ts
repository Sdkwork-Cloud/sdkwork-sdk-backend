import type { Media } from './media';

export interface UserMessage {
  messageType?: 'USER' | 'ASSISTANT' | 'SYSTEM' | 'TOOL';
  metadata?: Record<string, unknown>;
  media?: Media[];
  text?: string;
}
