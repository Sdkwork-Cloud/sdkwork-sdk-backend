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
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
