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
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
