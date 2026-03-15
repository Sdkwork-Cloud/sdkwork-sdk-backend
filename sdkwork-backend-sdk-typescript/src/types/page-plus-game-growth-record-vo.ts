import type { PageableObject } from './pageable-object';
import type { PlusGameGrowthRecordVO } from './plus-game-growth-record-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameGrowthRecordVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusGameGrowthRecordVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
