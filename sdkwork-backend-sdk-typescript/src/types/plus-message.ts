import type { MessageBody } from './message-body';
import type { Participant } from './participant';

/** IMæ¶æ¯å®ä½ç±» */
export interface PlusMessage {
  /** æ¶æ¯å¨æ°æ®åºä¸­çå¯ä¸æ è¯ç¬¦ */
  id?: number;
  /** æ¶æ¯çUUIDï¼ç¨äºå¯ä¸æ è¯ä¸æ¡æ¶æ¯ */
  uuid?: string;
  /** æ¶æ¯åå»ºæ¶é´ */
  createdAt?: string;
  /** æ¶æ¯æåæ´æ°æ¶é´ */
  updatedAt?: string;
  /** æ¶æ¯åéæ¶é´ */
  sendAt?: string;
  /** ä¼è¯ID */
  conversationId?: number;
  /** æ¶æ¯ç±»å */
  type?: 'DEFAULT' | 'TEXT' | 'IMAGE' | 'FILE' | 'AUDIO' | 'VIDEO' | 'CODE' | 'MARKDOWN' | 'MIXED' | 'LOCATION' | 'MUSIC' | 'NEWS' | 'VOICE' | 'ARTICLE' | 'APP' | 'CHUNK' | 'FRAME' | 'BINARY' | 'EVENT' | 'MCP';
  /** åéè */
  sender?: Participant;
  /** æ¥æ¶è */
  receiver?: Participant;
  /** ç¾¤ç»IDï¼ç¨äºç¾¤èæ¶æ¯ï¼ */
  groupId?: number;
  /** æ¶æ¯IDï¼æå¡ç«¯çæï¼ */
  msgId?: string;
  /** å®¢æ·ç«¯æ¶æ¯IDï¼å®¢æ·ç«¯çæï¼ */
  clientMsgId?: string;
  /** æ¶æ¯æ°æ®åå®¹ */
  body?: MessageBody;
  /** æ¶æ¯åæ°æ® */
  metadata?: Record<string, unknown>;
  content?: string;
}
