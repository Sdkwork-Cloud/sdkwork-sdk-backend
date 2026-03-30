import type { PageableObject } from './pageable-object';
import type { PlusGameChallengeVO } from './plus-game-challenge-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameChallengeVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusGameChallengeVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
