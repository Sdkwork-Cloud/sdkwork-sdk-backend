import type { PageableObject } from './pageable-object';
import type { PlusGameScoreRecordVO } from './plus-game-score-record-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameScoreRecordVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusGameScoreRecordVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
