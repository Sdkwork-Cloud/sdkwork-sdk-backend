import type { PageableObject } from './pageable-object';
import type { PlusVideoVO } from './plus-video-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVideoVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusVideoVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
