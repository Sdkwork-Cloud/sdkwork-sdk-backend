import type { PageableObject } from './pageable-object';
import type { PlusOrganizationVO } from './plus-organization-vo';
import type { SortObject } from './sort-object';

export interface PagePlusOrganizationVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusOrganizationVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
