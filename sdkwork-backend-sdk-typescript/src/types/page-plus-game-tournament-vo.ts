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
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
