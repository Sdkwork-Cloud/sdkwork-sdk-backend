import type { PageableObject } from './pageable-object';
import type { PlusUserAddressVO } from './plus-user-address-vo';
import type { SortObject } from './sort-object';

export interface PagePlusUserAddressVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusUserAddressVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
