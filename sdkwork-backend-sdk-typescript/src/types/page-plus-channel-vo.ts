import type { PageableObject } from './pageable-object';
import type { PlusChannelVO } from './plus-channel-vo';
import type { SortObject } from './sort-object';

export interface PagePlusChannelVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusChannelVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
