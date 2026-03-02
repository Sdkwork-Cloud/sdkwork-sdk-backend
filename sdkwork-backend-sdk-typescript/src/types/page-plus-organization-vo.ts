import type { PageableObject } from './pageable-object';
import type { PlusOrganizationVO } from './plus-organization-vo';
import type { SortObject } from './sort-object';

export interface PagePlusOrganizationVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusOrganizationVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
