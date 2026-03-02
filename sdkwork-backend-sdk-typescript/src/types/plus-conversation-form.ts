import type { PlusChatOptions } from './plus-chat-options';
import type { TagsContent } from './tags-content';

/** Conversation creation form */
export interface PlusConversationForm {
  /** 会话UUID */
  uuid?: string;
  /** 会话标题 */
  title: string;
  /** 会话描述(可选) */
  description?: string;
  /** 用户ID(外键关联plus_user.id) */
  userId: number;
  /** 会话状态(1:活跃,2:已完成,3:已归档,4:已删除) */
  status: 'INACTIVE' | 'ACTIVE' | 'COMPLETED' | 'ARCHIVED' | 'DELETED';
  /** Agent ID(外键关联plus_ai_agent.id) */
  agentId?: number;
  /** 内容摘要(会话的简要概述) */
  summary?: string;
  /** 最后一条消息ID(外键关联plus_chat_message.id) */
  lastMessageId?: number;
  /** 消息数量 */
  messageCount: number;
  /** 会话标签(逗号分隔，如"重要,工作,项目") */
  tags?: TagsContent;
  /** 系统上下文/参数(JSON格式) */
  systemContext?: string;
  /** 用户上下文/参数(JSON格式) */
  userContext?: string;
  /** 最后交互时间 */
  lastInteractionTime?: string;
  /** 模型ID(外键关联plus_ai_model_info.id) */
  modelId?: number;
  /** 具体模型名称/标识(如"gpt-4","claude-3-opus") */
  model?: string;
  /** 知识库ID(外键关联plus_knowledge_base_info.id) */
  knowledgeBaseId?: number;
  /** 数据源ID(外键关联plus_data_source_info.id) */
  dataSourceId?: number;
  /** 聊天选项(temperature, top_p等) */
  chatOptions?: PlusChatOptions;
  /** 是否置顶会话 */
  pinned?: boolean;
  /** 会话的排序顺序，值越大越靠前 */
  sortOrder?: number;
}
