import type { PageableObject } from './pageable-object';
import type { PlusChannelAccountVO } from './plus-channel-account-vo';
import type { SortObject } from './sort-object';

export interface PagePlusChannelAccountVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusChannelAccountVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
