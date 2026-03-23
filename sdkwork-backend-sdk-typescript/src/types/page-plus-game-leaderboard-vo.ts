import type { PageableObject } from './pageable-object';
import type { PlusGameLeaderboardVO } from './plus-game-leaderboard-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameLeaderboardVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusGameLeaderboardVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
