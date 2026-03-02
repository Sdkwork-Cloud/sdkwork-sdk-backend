import type { ChatCompletionChunkDelta } from './chat-completion-chunk-delta';
import type { LogProbInfo } from './log-prob-info';

/** 流式聊天完成响应中的选项对象，包含模型生成的响应内容块 */
export interface ChatCompletionChunkChoice {
  /** 选项索引 */
  index: number;
  /** 模型生成的消息增量内容，客户端需要将所有chunk的delta拼接起来形成完整消息 */
  delta?: ChatCompletionChunkDelta;
  /** 日志概率信息（仅在请求时指定了logprobs参数时返回） */
  logprobs?: LogProbInfo;
  /** 完成原因，可能的值："stop"（正常停止）、"length"（达到长度限制）、"function_call"（需要调用函数）等，在流式响应中只有最后一个chunk会包含非null的完成原因 */
  finish_reason?: string;
}
