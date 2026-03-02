import type { EdgeObject } from './edge-object';
import type { Node } from './node';
import type { PlusAgent } from './plus-agent';

export interface Flow {
  id?: string;
  name?: string;
  description?: string;
  status?: 'DRAFT' | 'ACTIVE' | 'INACTIVE' | 'ARCHIVED';
  nodes?: Node[];
  edges?: EdgeObject[];
  subFlows?: Flow[];
  parentId?: number;
  startTime?: string;
  endTime?: string;
  parentFlow?: Flow;
  allAgents?: PlusAgent[];
  lastNode?: Node;
}
