import type { ToolDefinition } from './tool-definition';
import type { ToolMetadata } from './tool-metadata';

export interface ToolCallback {
  toolMetadata?: ToolMetadata;
  toolDefinition?: ToolDefinition;
}
