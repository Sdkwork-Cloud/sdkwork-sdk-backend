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
  description?: string;
  metadata?: AgentMetadata;
  uuid?: string;
  systemPrompt?: Prompt;
  tools?: PromptToolDescription[];
  chatContext?: ChatContext;
  chatOptions?: ChatOptions;
  executionContext?: AgentExecutionContext;
  instructions?: string[];
  faceURL?: string;
  prompts?: Record<string, Prompt>;
  accountConfig?: LlmAccountConfig;
  chatMemory?: IPlusChatMemory;
  toolCallbackProvider?: ToolCallbackProvider;
  promptPath?: string;
  promptContextOptimizer?: PromptContextOptimizer;
  nextActions?: string[];
}
