import type { ImageMediaResource } from './image-media-resource';

/** èå¤©åä¸èè§å¾å¯¹è±¡ */
export interface PlusParticipantVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ */
  updatedAt?: string;
  /** åä¸èID */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦ */
  uuid?: string;
  /** åä¸èç±»åï¼ç¨æ·ãAIå©æç­ï¼ */
  type?: 'USER' | 'AI_ASSISTANT' | 'SYSTEM' | 'CUSTOMER_SERVICE';
  /** åä¸èåç§° */
  name?: string;
  /** åä¸èå¤´åèµæº */
  face?: ImageMediaResource;
  /** å³èçç¨æ·ID */
  userId?: number;
  /** å³èçAIå©æID */
  agentId?: number;
  /** åä¸èè§è²ï¼å¦ï¼owner-ææèãmember-æåãguest-è®¿å®¢ç­ï¼ */
  role?: 'OWNER' | 'ADMIN' | 'MEMBER' | 'GUEST' | 'AI_ASSISTANT' | 'SYSTEM';
  /** ä¸ä¸æç±»åï¼CONVERSATION-ä¼è¯ãGROUP-ç¾¤ç»ï¼ */
  contextType?: 'CONVERSATION' | 'GROUP';
  /** ä¸ä¸æIDï¼ä¼è¯IDæç¾¤ç»IDï¼ */
  contextId?: number;
  /** ä¼è¯IDï¼å½ä¸ä¸æç±»åä¸ºç¾¤ç»æ¶å­å¨ï¼ */
  conversationId?: number;
  /** ç¾¤ç»ç±»å */
  groupType?: 'NORMAL' | 'WORK' | 'INTEREST' | 'SUPPORT';
  /** ä¼è¯ç±»å */
  conversationType?: 'CHAT' | 'C2C' | 'GROUP' | 'KF';
  /** æ¯å¦ä¸ºä¸ä¸æåå»ºè */
  isCreator?: boolean;
  /** æ¯å¦å¨çº¿ */
  isOnline?: boolean;
  /** æåæ´»è·æ¶é´ */
  lastActiveTime?: string;
  /** æ¯å¦ä¸ºä¸´æ¶åä¸èï¼ç¨äºç¾¤ç»ä¸´æ¶ä¼è¯ï¼ */
  isTemporary?: boolean;
}
