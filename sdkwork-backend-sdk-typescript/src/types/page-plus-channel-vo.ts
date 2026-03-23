import type { PageableObject } from './pageable-object';
import type { PlusChannelVO } from './plus-channel-vo';
import type { SortObject } from './sort-object';

export interface PagePlusChannelVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusChannelVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
