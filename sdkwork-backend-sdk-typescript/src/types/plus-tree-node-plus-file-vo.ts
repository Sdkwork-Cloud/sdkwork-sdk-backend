import type { PlusFileVO } from './plus-file-vo';

export interface PlusTreeNodePlusFileVO {
  data?: PlusFileVO;
  parent?: PlusTreeNodePlusFileVO;
  children?: PlusTreeNodePlusFileVO[];
  index?: number;
  root?: boolean;
  leaf?: boolean;
  childrenCount?: number;
  depth?: number;
}
