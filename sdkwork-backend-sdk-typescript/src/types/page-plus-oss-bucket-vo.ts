import type { PageableObject } from './pageable-object';
import type { PlusOssBucketVO } from './plus-oss-bucket-vo';
import type { SortObject } from './sort-object';

export interface PagePlusOssBucketVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusOssBucketVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
