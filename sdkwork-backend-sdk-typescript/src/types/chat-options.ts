export interface ChatOptions {
  model?: string;
  temperature?: number;
  topP?: number;
  topK?: number;
  maxTokens?: number;
  stopSequences?: string[];
  frequencyPenalty?: number;
  presencePenalty?: number;
}
