import type { ToolDefinition } from './tool-definition';
import type { ToolMetadata } from './tool-metadata';

export interface ToolCallback {
  toolDefinition?: ToolDefinition;
  toolMetadata?: ToolMetadata;
}
