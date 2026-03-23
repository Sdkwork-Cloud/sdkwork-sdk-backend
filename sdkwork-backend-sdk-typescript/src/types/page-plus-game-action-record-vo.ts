import type { PageableObject } from './pageable-object';
import type { PlusGameActionRecordVO } from './plus-game-action-record-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameActionRecordVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusGameActionRecordVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
