import type { PlusChatOptions } from './plus-chat-options';

/** P lu sC on ve rs at io nO pe nF or m */
export interface PlusConversationOpenForm {
  conversationId?: string;
  /** æµ¼æ°³ç½UUID */
  uuid?: string;
  /** æµ¼æ°³ç½éå¬î½ */
  userId: number;
  /** Agent ID(æ¾¶æ ­æ­éå® ä»plus_ai_agent.id) */
  agentId?: number;
  /** é­ã¨çæ´æD(æ¾¶æ ­æ­éå® ä»plus_knowledge_base_info.id) */
  knowledgeBaseId?: number;
  /** éçåµå©§æD(æ¾¶æ ­æ­éå® ä»plus_data_source_info.id) */
  dataSourceId?: number;
  /** é±å©ãé«å¤ã(temperature, top_pç»? */
  chatOptions?: PlusChatOptions;
}
