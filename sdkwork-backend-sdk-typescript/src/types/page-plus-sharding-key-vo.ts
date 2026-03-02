import type { PageableObject } from './pageable-object';
import type { PlusShardingKeyVO } from './plus-sharding-key-vo';
import type { SortObject } from './sort-object';

export interface PagePlusShardingKeyVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusShardingKeyVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
