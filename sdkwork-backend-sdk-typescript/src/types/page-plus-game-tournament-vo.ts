import type { PageableObject } from './pageable-object';
import type { PlusGameTournamentVO } from './plus-game-tournament-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameTournamentVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusGameTournamentVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
