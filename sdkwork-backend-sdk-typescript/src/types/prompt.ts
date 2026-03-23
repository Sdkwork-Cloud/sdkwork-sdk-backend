import type { ChatOptions } from './chat-options';
import type { Message } from './message';
import type { SystemMessage } from './system-message';
import type { UserMessage } from './user-message';

export interface Prompt {
  contents?: string;
  instructions?: Message[];
  lastUserOrToolResponseMessage?: Message;
  userMessages?: UserMessage[];
  systemMessage?: SystemMessage;
  userMessage?: UserMessage;
  systemMessages?: SystemMessage[];
  options?: ChatOptions;
}
