import type { PageableObject } from './pageable-object';
import type { PlusShardingKeyVO } from './plus-sharding-key-vo';
import type { SortObject } from './sort-object';

export interface PagePlusShardingKeyVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusShardingKeyVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
