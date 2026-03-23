export interface ChatOptions {
  frequencyPenalty?: number;
  maxTokens?: number;
  stopSequences?: string[];
  presencePenalty?: number;
  temperature?: number;
  model?: string;
  topP?: number;
  topK?: number;
}
