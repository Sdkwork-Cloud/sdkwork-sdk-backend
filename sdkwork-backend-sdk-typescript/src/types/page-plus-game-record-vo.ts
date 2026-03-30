import type { PageableObject } from './pageable-object';
import type { PlusGameRecordVO } from './plus-game-record-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameRecordVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusGameRecordVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
