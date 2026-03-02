export interface ChatOptions {
  topP?: number;
  topK?: number;
  presencePenalty?: number;
  maxTokens?: number;
  stopSequences?: string[];
  frequencyPenalty?: number;
  model?: string;
  temperature?: number;
}
