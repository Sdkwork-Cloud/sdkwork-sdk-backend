import type { PageableObject } from './pageable-object';
import type { PlusShardingKeyVO } from './plus-sharding-key-vo';
import type { SortObject } from './sort-object';

export interface PagePlusShardingKeyVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusShardingKeyVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
