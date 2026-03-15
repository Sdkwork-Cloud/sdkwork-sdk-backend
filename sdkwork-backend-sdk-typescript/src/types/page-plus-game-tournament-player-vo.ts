import type { PageableObject } from './pageable-object';
import type { PlusGameTournamentPlayerVO } from './plus-game-tournament-player-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameTournamentPlayerVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusGameTournamentPlayerVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
