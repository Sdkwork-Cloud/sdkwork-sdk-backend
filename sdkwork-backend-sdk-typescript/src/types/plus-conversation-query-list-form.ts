/** AI Conversation Query List Form - 用于查询用户与AI代理之间的对话会话列表 */
export interface PlusConversationQueryListForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** 是否初始化默认对话（当查询结果为空时，是否自动创建默认对话会话） */
  initDefaults?: boolean;
}
