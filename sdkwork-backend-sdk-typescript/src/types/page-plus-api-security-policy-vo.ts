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
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
