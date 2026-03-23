import type { PlusTreeParentMetadata } from './plus-tree-parent-metadata';
import type { TagsContent } from './tags-content';

/** AIåç±»VOï¼ç¨äºç®¡çä¸ååå®¹ç±»å(å¦AgentãToolãPromptç­)çåç±» */
export interface PlusCategoryVO {
  parentUuid?: string;
  parentMetadata?: PlusTreeParentMetadata;
  /** ä¸»é®IDï¼ç±æ°æ®åºèªå¨çæ */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** åå»ºæ¶é´ï¼å®ä½é¦æ¬¡æä¹åæ¶è®¾ç½® */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ï¼å®ä½ä¿®æ¹æ¶æ´æ° */
  updatedAt?: string;
  /** åç±»åç§° */
  name?: string;
  /** åç±»æè¿° */
  description?: string;
  /** åç±»ç±»å(1:Agentåç±»,2:Toolåç±»,3:Promptåç±»,4:å¶ä»åç±») */
  type?: 'DEFAULT' | 'AGENT' | 'TOOL' | 'PROMPT' | 'FEEDS' | 'PRODUCT' | 'COURSE' | 'NEWS' | 'BOOK' | 'VIDEO' | 'AUDIO' | 'MUSIC' | 'SAAS' | 'PPT' | 'EVENTS' | 'NOTARY' | 'SHOP' | 'VOICE_SPEAK' | 'SOUND_EFFECT' | 'SKILLS' | 'SKILLS_COLLECTION' | 'PLUGIN' | 'MCP' | 'KNOWLEDGE_BASE' | 'RECRUIT' | 'OTHER';
  /** åç±»å¾æ URL/è·¯å¾ */
  icon?: string;
  /** æåºæé(å¼è¶å¤§æåºè¶é å) */
  sortWeight?: number;
  /** ç¶åç±»ID */
  parentId?: number;
  /** åç±»è·¯å¾(æ ¼å¼:1,2,3è¡¨ç¤ºä»æ ¹åç±»å°å½ååç±»çIDè·¯å¾) */
  path?: string[];
  /** å¯è§æ§æ å¿(0:éè,1:å¯è§) */
  visible?: number;
  /** åç±»ç¶æ(1:å¯ç¨,2:ç¦ç¨,3:å é¤) */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DELETED';
  /** å­åç±»åè¡¨ */
  children?: PlusCategoryVO[];
  /** æ ç­¾ */
  tags?: TagsContent;
  /** åç±»å±æ§IDåè¡¨ */
  attributeIds?: number[];
}
