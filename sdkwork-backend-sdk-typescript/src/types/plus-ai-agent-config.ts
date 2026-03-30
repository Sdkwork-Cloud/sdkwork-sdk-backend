/** Configuration for AI agent behavior and settings */
export interface PlusAiAgentConfig {
  /** Welcome message displayed when a user starts a conversation */
  welcome?: string;
  /** List of suggested questions that users can ask the agent */
  questions?: string[];
  /** Enable conversation memory functionality */
  saveFiles?: boolean;
  /** Enable conversation memory functionality */
  enableMemory?: boolean;
  /** Maximum number of messages to keep in conversation history */
  maxHistoryMessages?: number;
  /** Whether to use knowledge base for answering questions */
  useKnowledgeBase?: boolean;
  /** properties as key-value pairs */
  properties?: Record<string, Record<string, unknown>>;
}
