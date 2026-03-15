import type { PageableObject } from './pageable-object';
import type { PlusOrderDispatchRuleVO } from './plus-order-dispatch-rule-vo';
import type { SortObject } from './sort-object';

export interface PagePlusOrderDispatchRuleVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusOrderDispatchRuleVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
