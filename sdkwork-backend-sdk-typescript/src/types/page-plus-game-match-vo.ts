import type { PageableObject } from './pageable-object';
import type { PlusGameMatchVO } from './plus-game-match-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameMatchVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusGameMatchVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
