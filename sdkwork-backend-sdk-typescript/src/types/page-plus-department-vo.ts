import type { PageableObject } from './pageable-object';
import type { PlusDepartmentVO } from './plus-department-vo';
import type { SortObject } from './sort-object';

export interface PagePlusDepartmentVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusDepartmentVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
