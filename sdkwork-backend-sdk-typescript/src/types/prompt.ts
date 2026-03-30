import type { ChatOptions } from './chat-options';
import type { Message } from './message';
import type { SystemMessage } from './system-message';
import type { UserMessage } from './user-message';

export interface Prompt {
  contents?: string;
  userMessage?: UserMessage;
  userMessages?: UserMessage[];
  systemMessages?: SystemMessage[];
  systemMessage?: SystemMessage;
  instructions?: Message[];
  options?: ChatOptions;
  lastUserOrToolResponseMessage?: Message;
}
