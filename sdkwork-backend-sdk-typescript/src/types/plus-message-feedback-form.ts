/** Chat Message Feedback Form */
export interface PlusMessageFeedbackForm {
  /** 消息ID */
  id?: string;
  /** 会话ID */
  conversationId?: string;
  /** 反馈内容 */
  rating?: string;
}
