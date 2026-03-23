import type { PageableObject } from './pageable-object';
import type { PlusDepartmentVO } from './plus-department-vo';
import type { SortObject } from './sort-object';

export interface PagePlusDepartmentVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusDepartmentVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
