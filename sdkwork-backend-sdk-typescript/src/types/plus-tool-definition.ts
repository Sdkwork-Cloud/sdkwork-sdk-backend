import type { HttpApiDefinition } from './http-api-definition';

export interface PlusToolDefinition {
  id?: number;
  uuid?: string;
  type?: 'HTTP' | 'TOOL' | 'MCP' | 'SCRIPT';
  name?: string;
  description?: string;
  inputSchema?: string;
  buildIn?: boolean;
  httpDefinition?: HttpApiDefinition;
}
