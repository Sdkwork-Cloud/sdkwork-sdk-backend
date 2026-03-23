import type { PageableObject } from './pageable-object';
import type { PlusGameArenaVO } from './plus-game-arena-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameArenaVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusGameArenaVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
