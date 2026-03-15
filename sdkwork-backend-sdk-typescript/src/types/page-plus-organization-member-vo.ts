import type { PageableObject } from './pageable-object';
import type { PlusOrganizationMemberVO } from './plus-organization-member-vo';
import type { SortObject } from './sort-object';

export interface PagePlusOrganizationMemberVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusOrganizationMemberVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
