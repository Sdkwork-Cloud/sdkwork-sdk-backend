import type { PageableObject } from './pageable-object';
import type { PlusGameChallengeVO } from './plus-game-challenge-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameChallengeVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusGameChallengeVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
