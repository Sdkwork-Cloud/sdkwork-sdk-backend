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
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
