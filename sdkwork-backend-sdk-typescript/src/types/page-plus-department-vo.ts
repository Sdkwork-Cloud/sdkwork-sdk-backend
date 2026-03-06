import type { PageableObject } from './pageable-object';
import type { PlusDepartmentVO } from './plus-department-vo';
import type { SortObject } from './sort-object';

export interface PagePlusDepartmentVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusDepartmentVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
