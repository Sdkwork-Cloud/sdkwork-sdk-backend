import type { PageableObject } from './pageable-object';
import type { PlusOssBucketVO } from './plus-oss-bucket-vo';
import type { SortObject } from './sort-object';

export interface PagePlusOssBucketVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusOssBucketVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
