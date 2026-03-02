import type { MessageBody } from './message-body';
import type { Participant } from './participant';

/** IM消息实体类 */
export interface PlusMessage {
  /** 消息在数据库中的唯一标识符 */
  id?: number;
  /** 消息的UUID，用于唯一标识一条消息 */
  uuid?: string;
  /** 消息创建时间 */
  createdAt?: string;
  /** 消息最后更新时间 */
  updatedAt?: string;
  /** 消息发送时间 */
  sendAt?: string;
  /** 会话ID */
  conversationId?: number;
  /** 消息类型 */
  type?: 'DEFAULT' | 'TEXT' | 'IMAGE' | 'FILE' | 'AUDIO' | 'VIDEO' | 'CODE' | 'MARKDOWN' | 'MIXED' | 'LOCATION' | 'MUSIC' | 'NEWS' | 'VOICE' | 'ARTICLE' | 'APP' | 'CHUNK' | 'FRAME' | 'BINARY' | 'EVENT' | 'MCP';
  /** 发送者 */
  sender?: Participant;
  /** 接收者 */
  receiver?: Participant;
  /** 群组ID（用于群聊消息） */
  groupId?: number;
  /** 消息ID（服务端生成） */
  msgId?: string;
  /** 客户端消息ID（客户端生成） */
  clientMsgId?: string;
  /** 消息数据内容 */
  body?: MessageBody;
  /** 消息元数据 */
  metadata?: Record<string, unknown>;
  content?: string;
}
