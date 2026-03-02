import type { ChatCompletionChunkChoice } from './chat-completion-chunk-choice';
import type { ChatCompletionMetadata } from './chat-completion-metadata';
import type { CompletionUsage } from './completion-usage';
import type { PlusAgent } from './plus-agent';

/** 聊天完成Stream方式的响应对象，用于流式传输的聊天模型响应 */
export interface ChatCompletionChunk {
  /** 响应的唯一标识符，同一流式响应的所有chunk共享相同的id */
  id: string;
  /** 对象类型，流式响应固定为"chat.completion.chunk" */
  object: string;
  /** 响应创建的时间戳（Unix时间，以秒为单位） */
  created: number;
  /** 用于生成响应的模型名称 */
  model: string;
  /** 响应选项列表，包含当前chunk的增量内容 */
  choices: ChatCompletionChunkChoice[];
  /** 使用情况统计信息 */
  usage?: CompletionUsage;
  /** metadata */
  metadata?: ChatCompletionMetadata;
  content?: string;
  agent?: PlusAgent;
  reasoningContent?: string;
  /** 系统指纹，用于识别模型版本和配置 */
  system_fingerprint?: string;
}
