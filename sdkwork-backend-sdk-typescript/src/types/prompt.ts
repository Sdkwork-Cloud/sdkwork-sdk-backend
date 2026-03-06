import type { ChatOptions } from './chat-options';
import type { Message } from './message';
import type { SystemMessage } from './system-message';
import type { UserMessage } from './user-message';

export interface Prompt {
  contents?: string;
  options?: ChatOptions;
  instructions?: Message[];
  lastUserOrToolResponseMessage?: Message;
  systemMessages?: SystemMessage[];
  userMessages?: UserMessage[];
  userMessage?: UserMessage;
  systemMessage?: SystemMessage;
}
