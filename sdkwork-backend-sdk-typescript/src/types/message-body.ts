import type { AudioMediaResource } from './audio-media-resource';
import type { ChatCompletion } from './chat-completion';
import type { ChatCompletionChunk } from './chat-completion-chunk';
import type { ChatState } from './chat-state';
import type { GroupInfo } from './group-info';
import type { MsgPayload } from './msg-payload';

export interface MessageBody {
  id?: string;
  completion?: ChatCompletion;
  payload?: MsgPayload;
  chunk?: ChatCompletionChunk;
  audioFrame?: AudioMediaResource;
  groupInfos?: Record<string, GroupInfo>;
  groups?: Record<string, ChatCompletionChunk[]>;
  thinkStart?: number;
  thinkEnd?: number;
  state?: ChatState;
}
