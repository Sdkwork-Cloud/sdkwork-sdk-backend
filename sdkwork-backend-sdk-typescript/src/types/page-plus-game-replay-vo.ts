import type { PageableObject } from './pageable-object';
import type { PlusGameReplayVO } from './plus-game-replay-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameReplayVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusGameReplayVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
