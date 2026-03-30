export interface Message {
  messageType?: 'USER' | 'ASSISTANT' | 'SYSTEM' | 'TOOL';
  text?: string;
  metadata?: Record<string, Record<string, unknown>>;
}
