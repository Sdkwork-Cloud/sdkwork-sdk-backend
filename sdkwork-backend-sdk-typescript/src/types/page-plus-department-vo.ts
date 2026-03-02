import type { PageableObject } from './pageable-object';
import type { PlusDepartmentVO } from './plus-department-vo';
import type { SortObject } from './sort-object';

export interface PagePlusDepartmentVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusDepartmentVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
