import type { PageableObject } from './pageable-object';
import type { PlusGameMatchVO } from './plus-game-match-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameMatchVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusGameMatchVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
