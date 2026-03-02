import type { ChatCompletionMessage } from './chat-completion-message';
import type { ChatContext } from './chat-context';

/** 聊天补全创建请求参数 */
export interface ChatCompletionCreateForm {
  /** 要使用的模型ID */
  model: string;
  /** 用于生成聊天补全的消息列表 */
  messages: ChatCompletionMessage[];
  /** 采样温度，控制输出随机性 */
  temperature?: number;
  /** 生成的聊天补全选项数量 */
  n?: number;
  /** 是否流式返回部分进度 */
  stream?: boolean;
  /** 停止序列，最多4个，遇到时停止生成 */
  stop?: string[];
  /** 最终用户的唯一标识符 */
  user?: string;
  /** 要使用的工具名称 */
  tool?: string;
  /** 核采样参数，替代温度采样 */
  top_p?: number;
  /** 生成的最大token数 */
  max_tokens?: number;
  /** 存在惩罚，控制新主题引入 */
  presence_penalty?: number;
  /** 频率惩罚，减少重复内容 */
  frequency_penalty?: number;
  /** 修改指定token出现的可能性 */
  logit_bias?: Record<string, number>;
  /** 是否返回JSON格式响应 */
  response_format?: boolean;
  /** 模型的系统指纹 */
  system_fingerprint?: string;
  /** 聊天上下文 */
  chat_context?: ChatContext;
}
