import type { ChatCompletionMessage } from './chat-completion-message';
import type { LogProbInfo } from './log-prob-info';

/** 聊天完成响应中的选项对象 */
export interface ChatCompletionChoice {
  /** 选项索引 */
  index: number;
  /** 模型生成的消息 */
  message: ChatCompletionMessage;
  /** 日志概率信息（仅在请求时指定了logprobs参数时返回） */
  logprobs?: LogProbInfo;
  /** 完成原因，可能的值："stop"（正常停止）、"length"（达到长度限制）、"function_call"（需要调用函数）等 */
  finish_reason: string;
}
