import type { PageableObject } from './pageable-object';
import type { PlusGameGrowthAccountVO } from './plus-game-growth-account-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameGrowthAccountVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusGameGrowthAccountVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
