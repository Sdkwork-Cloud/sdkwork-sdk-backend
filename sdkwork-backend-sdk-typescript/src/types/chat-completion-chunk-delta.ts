import type { ChatCompletionAudio } from './chat-completion-audio';
import type { ChatCompletionMessageToolCall } from './chat-completion-message-tool-call';

/** 聊天消息对象，包含消息的角色、内容和工具调用信息 */
export interface ChatCompletionChunkDelta {
  /** 消息发送者角色，可能的值："system"（系统消息）、"user"（用户消息）、"assistant"（助手消息）、"function"（函数返回结果消息）、"tool"（工具返回结果消息） */
  role: string;
  /** 消息内容，对于工具/函数返回结果消息，content为对应的返回结果 */
  content: string;
  /** 音频消息 */
  audio?: ChatCompletionAudio;
  /** 仅适用于 reasoner 模型。内容为 assistant 消息中在最终答案之前的推理内容 */
  reasoning_content?: string;
  /** 工具调用列表，仅当role为"assistant"且需要调用工具时存在 */
  tool_calls?: ChatCompletionMessageToolCall[];
}
