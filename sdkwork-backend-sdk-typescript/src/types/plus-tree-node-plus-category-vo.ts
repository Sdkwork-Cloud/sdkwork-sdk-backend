import type { PlusCategoryVO } from './plus-category-vo';

export interface PlusTreeNodePlusCategoryVO {
  data?: PlusCategoryVO;
  parent?: PlusTreeNodePlusCategoryVO;
  children?: PlusTreeNodePlusCategoryVO[];
  index?: number;
  root?: boolean;
  leaf?: boolean;
  childrenCount?: number;
  depth?: number;
}
