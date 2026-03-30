import type { ChatCompletionChoice } from './chat-completion-choice';
import type { ChatCompletionMetadata } from './chat-completion-metadata';
import type { CompletionUsage } from './completion-usage';
import type { PlusAgent } from './plus-agent';

/** 大模型的聊天完成响应结果 */
export interface ChatCompletion {
  /** 响应的唯一标识符 */
  id: string;
  /** 对象类型，通常为"chat.completion" */
  object: string;
  /** 响应创建的时间戳（Unix时间，以秒为单位） */
  created: number;
  /** 用于生成响应的模型名称 */
  model: string;
  /** 响应选项列表 */
  choices: ChatCompletionChoice[];
  /** 使用统计信息 */
  usage?: CompletionUsage;
  /** metadata */
  metadata?: ChatCompletionMetadata;
  content?: string;
  agent?: PlusAgent;
  /** 系统指纹，用于识别模型版本和配置 */
  system_fingerprint?: string;
}
