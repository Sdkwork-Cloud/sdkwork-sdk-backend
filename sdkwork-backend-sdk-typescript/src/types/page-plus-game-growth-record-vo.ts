import type { PageableObject } from './pageable-object';
import type { PlusGameGrowthRecordVO } from './plus-game-growth-record-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameGrowthRecordVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusGameGrowthRecordVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
