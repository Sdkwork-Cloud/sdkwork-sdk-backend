/** èå¤©å®æåæ°æ® */
export interface ChatCompletionMetadata {
  /** å¯ç¨æä½åè¡¨ */
  actions?: string[];
  /** ä»£çç¸å³ä¿¡æ¯ */
  agent?: Record<string, unknown>;
  /** ç¶çº§èå¤©ID */
  parent_message_id?: number;
  /** ç¶çº§èå¤©UUID */
  parent_message_uuid?: string;
}
