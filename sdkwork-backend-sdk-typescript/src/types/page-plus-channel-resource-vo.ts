import type { PageableObject } from './pageable-object';
import type { PlusChannelResourceVO } from './plus-channel-resource-vo';
import type { SortObject } from './sort-object';

export interface PagePlusChannelResourceVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusChannelResourceVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
