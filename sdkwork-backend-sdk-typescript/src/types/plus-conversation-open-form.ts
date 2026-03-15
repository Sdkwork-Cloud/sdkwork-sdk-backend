import type { PlusChatOptions } from './plus-chat-options';

/** P lu sC on ve rs at io nO pe nF or m */
export interface PlusConversationOpenForm {
  conversationId?: string;
  /** 浼氳瘽UUID */
  uuid?: string;
  /** 浼氳瘽鏍囬 */
  userId: number;
  /** Agent ID(澶栭敭鍏宠仈plus_ai_agent.id) */
  agentId?: number;
  /** 鐭ヨ瘑搴揑D(澶栭敭鍏宠仈plus_knowledge_base_info.id) */
  knowledgeBaseId?: number;
  /** 鏁版嵁婧怚D(澶栭敭鍏宠仈plus_data_source_info.id) */
  dataSourceId?: number;
  /** 鑱婂ぉ閫夐」(temperature, top_p绛? */
  chatOptions?: PlusChatOptions;
}
