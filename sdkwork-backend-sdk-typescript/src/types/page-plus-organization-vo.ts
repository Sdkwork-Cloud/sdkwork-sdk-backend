import type { PageableObject } from './pageable-object';
import type { PlusOrganizationVO } from './plus-organization-vo';
import type { SortObject } from './sort-object';

export interface PagePlusOrganizationVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusOrganizationVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
