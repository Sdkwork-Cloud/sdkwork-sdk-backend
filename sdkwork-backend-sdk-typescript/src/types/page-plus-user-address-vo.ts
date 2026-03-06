import type { PageableObject } from './pageable-object';
import type { PlusUserAddressVO } from './plus-user-address-vo';
import type { SortObject } from './sort-object';

export interface PagePlusUserAddressVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusUserAddressVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
