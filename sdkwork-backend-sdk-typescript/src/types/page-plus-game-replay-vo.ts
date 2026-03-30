import type { PageableObject } from './pageable-object';
import type { PlusGameReplayVO } from './plus-game-replay-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameReplayVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusGameReplayVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
