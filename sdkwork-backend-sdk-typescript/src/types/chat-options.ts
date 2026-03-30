export interface ChatOptions {
  temperature?: number;
  model?: string;
  topK?: number;
  topP?: number;
  stopSequences?: string[];
  presencePenalty?: number;
  maxTokens?: number;
  frequencyPenalty?: number;
}
