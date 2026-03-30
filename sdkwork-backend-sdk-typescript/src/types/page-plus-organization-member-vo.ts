import type { PageableObject } from './pageable-object';
import type { PlusOrganizationMemberVO } from './plus-organization-member-vo';
import type { SortObject } from './sort-object';

export interface PagePlusOrganizationMemberVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusOrganizationMemberVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
