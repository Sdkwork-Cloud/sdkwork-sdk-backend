import type { PlusFileVO } from './plus-file-vo';

export interface PlusTreeNodePlusFileVO {
  data?: PlusFileVO;
  parent?: PlusTreeNodePlusFileVO;
  children?: PlusTreeNodePlusFileVO[];
  index?: number;
  root?: boolean;
  leaf?: boolean;
  depth?: number;
  childrenCount?: number;
}
