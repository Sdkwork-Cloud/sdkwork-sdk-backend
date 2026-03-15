import type { PageableObject } from './pageable-object';
import type { PlusGameTournamentVO } from './plus-game-tournament-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameTournamentVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusGameTournamentVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
