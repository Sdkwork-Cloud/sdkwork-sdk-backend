import type { PageableObject } from './pageable-object';
import type { PlusGameLeaderboardEntryVO } from './plus-game-leaderboard-entry-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameLeaderboardEntryVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusGameLeaderboardEntryVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
