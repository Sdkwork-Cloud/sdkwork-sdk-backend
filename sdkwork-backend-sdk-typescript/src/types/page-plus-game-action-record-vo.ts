import type { PageableObject } from './pageable-object';
import type { PlusGameActionRecordVO } from './plus-game-action-record-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameActionRecordVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusGameActionRecordVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
