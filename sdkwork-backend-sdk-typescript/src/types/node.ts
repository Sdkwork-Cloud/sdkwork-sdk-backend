import type { PlusAgent } from './plus-agent';

export interface Node {
  id?: string;
  name?: string;
  description?: string;
  type?: 'START' | 'END' | 'TASK' | 'SUB_FLOW' | 'FORK' | 'JOIN';
  properties?: Record<string, unknown>;
  startTime?: string;
  endTime?: string;
  agents?: PlusAgent[];
}
