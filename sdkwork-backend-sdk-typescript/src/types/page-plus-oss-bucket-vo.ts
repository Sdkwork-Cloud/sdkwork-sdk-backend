import type { PageableObject } from './pageable-object';
import type { PlusOssBucketVO } from './plus-oss-bucket-vo';
import type { SortObject } from './sort-object';

export interface PagePlusOssBucketVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusOssBucketVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
