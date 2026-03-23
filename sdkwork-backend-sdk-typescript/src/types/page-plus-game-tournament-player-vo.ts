import type { PageableObject } from './pageable-object';
import type { PlusGameTournamentPlayerVO } from './plus-game-tournament-player-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameTournamentPlayerVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusGameTournamentPlayerVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
