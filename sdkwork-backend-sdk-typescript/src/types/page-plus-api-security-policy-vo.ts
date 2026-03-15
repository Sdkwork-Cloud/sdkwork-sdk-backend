import type { PageableObject } from './pageable-object';
import type { PlusApiSecurityPolicyVO } from './plus-api-security-policy-vo';
import type { SortObject } from './sort-object';

export interface PagePlusApiSecurityPolicyVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusApiSecurityPolicyVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
