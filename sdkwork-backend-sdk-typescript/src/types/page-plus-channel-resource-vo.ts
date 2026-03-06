import type { PageableObject } from './pageable-object';
import type { PlusChannelResourceVO } from './plus-channel-resource-vo';
import type { SortObject } from './sort-object';

export interface PagePlusChannelResourceVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusChannelResourceVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
