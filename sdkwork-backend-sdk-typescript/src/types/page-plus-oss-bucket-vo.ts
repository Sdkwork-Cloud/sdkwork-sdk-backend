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
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
