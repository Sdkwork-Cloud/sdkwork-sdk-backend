/** 聊天完成元数据 */
export interface ChatCompletionMetadata {
  /** 可用操作列表 */
  actions?: string[];
  /** 代理相关信息 */
  agent?: Record<string, Record<string, unknown>>;
  /** 父级聊天ID */
  parent_message_id?: number;
  /** 父级聊天UUID */
  parent_message_uuid?: string;
}
