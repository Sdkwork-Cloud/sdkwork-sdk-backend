import type { HttpApiDefinition } from './http-api-definition';
import type { PlusToolDefinition } from './plus-tool-definition';

/** Tool creation form */
export interface PlusAiToolForm {
  /** Tool name */
  name: string;
  /** Tool description */
  description?: string;
  /** Tool type */
  type: 'HTTP' | 'TOOL' | 'MCP' | 'SCRIPT';
  /** Tool status */
  status: 'ACTIVE' | 'INACTIVE';
  /** Whether the tool is enabled */
  enabled: boolean;
  /** HTTP API definition */
  httpApiDefinition?: HttpApiDefinition;
  /** Tool definition */
  toolDefinition: PlusToolDefinition;
}
