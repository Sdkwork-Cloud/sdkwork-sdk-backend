import type { PageableObject } from './pageable-object';
import type { PlusGameLeaderboardVO } from './plus-game-leaderboard-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameLeaderboardVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusGameLeaderboardVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
