import type { PageableObject } from './pageable-object';
import type { PlusGameArenaVO } from './plus-game-arena-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameArenaVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusGameArenaVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
