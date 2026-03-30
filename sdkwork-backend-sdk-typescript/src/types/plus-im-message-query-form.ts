/** IM消息分页查询参数 */
export interface PlusImMessageQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** 会话ID */
  conversationId?: number;
  /** 发送者ID */
  senderId?: number;
  /** 接收者ID */
  receiverId?: number;
  /** 群组ID */
  groupId?: number;
  /** 消息类型 */
  type?: 'DEFAULT' | 'TEXT' | 'IMAGE' | 'FILE' | 'AUDIO' | 'VIDEO' | 'CODE' | 'MARKDOWN' | 'MIXED' | 'LOCATION' | 'MUSIC' | 'NEWS' | 'VOICE' | 'ARTICLE' | 'APP' | 'CHUNK' | 'FRAME' | 'BINARY' | 'EVENT' | 'MCP';
}
