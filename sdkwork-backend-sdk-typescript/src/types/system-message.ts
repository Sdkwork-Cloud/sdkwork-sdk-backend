export interface SystemMessage {
  messageType?: 'USER' | 'ASSISTANT' | 'SYSTEM' | 'TOOL';
  metadata?: Record<string, unknown>;
  text?: string;
}
