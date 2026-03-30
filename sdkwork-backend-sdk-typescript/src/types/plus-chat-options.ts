import type { AudioParameters } from './audio-parameters';
import type { FunctionTool } from './function-tool';
import type { ResponseFormat } from './response-format';
import type { StreamOptions } from './stream-options';
import type { WebSearchOptions } from './web-search-options';

export interface PlusChatOptions {
  streamUsage?: boolean;
  model?: string;
  frequency_penalty?: number;
  logit_bias?: Record<string, number>;
  logprobs?: boolean;
  top_logprobs?: number;
  max_tokens?: number;
  max_completion_tokens?: number;
  n?: number;
  modalities?: string[];
  audio?: AudioParameters;
  presence_penalty?: number;
  response_format?: ResponseFormat;
  stream_options?: StreamOptions;
  stream?: boolean;
  seed?: number;
  stop?: string[];
  temperature?: number;
  top_p?: number;
  tools?: FunctionTool[];
  tool_choice?: Record<string, unknown>;
  user?: string;
  parallel_tool_calls?: boolean;
  store?: boolean;
  metadata?: Record<string, string>;
  reasoning_effort?: string;
  verbosity?: string;
  web_search_options?: WebSearchOptions;
}
