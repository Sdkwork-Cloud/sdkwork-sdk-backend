import type { AgentDefinition } from './agent-definition';
import type { AgentExecutionContext } from './agent-execution-context';
import type { AgentMetadata } from './agent-metadata';
import type { ChatContext } from './chat-context';
import type { ChatOptions } from './chat-options';
import type { IPlusChatMemory } from './iplus-chat-memory';
import type { LlmAccountConfig } from './llm-account-config';
import type { Prompt } from './prompt';
import type { PromptContextOptimizer } from './prompt-context-optimizer';
import type { PromptToolDescription } from './prompt-tool-description';
import type { ToolCallbackProvider } from './tool-callback-provider';

export interface PlusAgent {
  name?: string;
  id?: number;
  definition?: AgentDefinition;
  uuid?: string;
  nextActions?: string[];
  chatMemory?: IPlusChatMemory;
  executionContext?: AgentExecutionContext;
  accountConfig?: LlmAccountConfig;
  toolCallbackProvider?: ToolCallbackProvider;
  promptContextOptimizer?: PromptContextOptimizer;
  promptPath?: string;
  description?: string;
  metadata?: AgentMetadata;
  faceURL?: string;
  prompts?: Record<string, Prompt>;
  systemPrompt?: Prompt;
  instructions?: string[];
  chatOptions?: ChatOptions;
  chatContext?: ChatContext;
  tools?: PromptToolDescription[];
}
