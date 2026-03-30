import type { PageableObject } from './pageable-object';
import type { PlusApiSecurityPolicyVO } from './plus-api-security-policy-vo';
import type { SortObject } from './sort-object';

export interface PagePlusApiSecurityPolicyVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusApiSecurityPolicyVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
