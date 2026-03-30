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
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
