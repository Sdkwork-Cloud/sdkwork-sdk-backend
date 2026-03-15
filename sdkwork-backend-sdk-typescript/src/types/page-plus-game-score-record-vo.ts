import type { PageableObject } from './pageable-object';
import type { PlusGameScoreRecordVO } from './plus-game-score-record-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameScoreRecordVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusGameScoreRecordVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
