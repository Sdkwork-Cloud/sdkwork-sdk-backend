import type { PageableObject } from './pageable-object';
import type { PlusChannelResourceVO } from './plus-channel-resource-vo';
import type { SortObject } from './sort-object';

export interface PagePlusChannelResourceVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusChannelResourceVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
