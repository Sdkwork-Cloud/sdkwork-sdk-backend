import type { PageableObject } from './pageable-object';
import type { PlusGameGrowthAccountVO } from './plus-game-growth-account-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameGrowthAccountVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusGameGrowthAccountVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
