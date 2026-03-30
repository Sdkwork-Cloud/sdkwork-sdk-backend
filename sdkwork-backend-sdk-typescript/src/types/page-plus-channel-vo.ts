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
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
