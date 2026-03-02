import type { PlusChatOptions } from './plus-chat-options';

/** AI Conversation Form - 用于创建或更新用户与AI代理之间的对话会话 */
export interface PlusConversationOpenForm {
  conversationId?: string;
  /** 会话UUID */
  uuid?: string;
  /** 会话标题 */
  title: string;
  /** 用户ID(外键关联plus_user.id) */
  userId: number;
  /** Agent ID(外键关联plus_ai_agent.id) */
  agentId?: number;
  /** 知识库ID(外键关联plus_knowledge_base_info.id) */
  knowledgeBaseId?: number;
  /** 数据源ID(外键关联plus_data_source_info.id) */
  dataSourceId?: number;
  /** 聊天选项(temperature, top_p等) */
  chatOptions?: PlusChatOptions;
}
