import type { PageableObject } from './pageable-object';
import type { PlusChannelAccountVO } from './plus-channel-account-vo';
import type { SortObject } from './sort-object';

export interface PagePlusChannelAccountVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusChannelAccountVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
