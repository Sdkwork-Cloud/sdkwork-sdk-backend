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
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
