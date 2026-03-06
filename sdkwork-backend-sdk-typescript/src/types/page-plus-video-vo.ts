import type { PageableObject } from './pageable-object';
import type { PlusVideoVO } from './plus-video-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVideoVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusVideoVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
