import type { PageableObject } from './pageable-object';
import type { PlusOrderDispatchRuleVO } from './plus-order-dispatch-rule-vo';
import type { SortObject } from './sort-object';

export interface PagePlusOrderDispatchRuleVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusOrderDispatchRuleVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
