import type { PageableObject } from './pageable-object';
import type { PlusGameGrowthLevelConfigVO } from './plus-game-growth-level-config-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameGrowthLevelConfigVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusGameGrowthLevelConfigVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
