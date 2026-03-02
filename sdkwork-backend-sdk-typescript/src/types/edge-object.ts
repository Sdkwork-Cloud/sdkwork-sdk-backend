export interface EdgeObject {
  id?: string;
  name?: string;
  description?: string;
  sourceNodeId?: string;
  targetNodeId?: string;
  type?: 'NORMAL' | 'CONDITIONAL';
  condition?: unknown;
}
