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
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
