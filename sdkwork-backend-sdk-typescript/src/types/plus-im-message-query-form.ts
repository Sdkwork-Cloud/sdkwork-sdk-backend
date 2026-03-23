/** IMæ¶æ¯åé¡µæ¥è¯¢åæ° */
export interface PlusImMessageQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** ä¼è¯ID */
  conversationId?: number;
  /** åéèID */
  senderId?: number;
  /** æ¥æ¶èID */
  receiverId?: number;
  /** ç¾¤ç»ID */
  groupId?: number;
  /** æ¶æ¯ç±»å */
  type?: 'DEFAULT' | 'TEXT' | 'IMAGE' | 'FILE' | 'AUDIO' | 'VIDEO' | 'CODE' | 'MARKDOWN' | 'MIXED' | 'LOCATION' | 'MUSIC' | 'NEWS' | 'VOICE' | 'ARTICLE' | 'APP' | 'CHUNK' | 'FRAME' | 'BINARY' | 'EVENT' | 'MCP';
}
