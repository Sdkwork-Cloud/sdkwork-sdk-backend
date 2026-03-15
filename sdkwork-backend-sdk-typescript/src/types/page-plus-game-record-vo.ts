import type { PageableObject } from './pageable-object';
import type { PlusGameRecordVO } from './plus-game-record-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameRecordVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusGameRecordVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
