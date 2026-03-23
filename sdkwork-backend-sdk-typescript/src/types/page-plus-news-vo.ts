import type { PageableObject } from './pageable-object';
import type { PlusNewsVO } from './plus-news-vo';
import type { SortObject } from './sort-object';

export interface PagePlusNewsVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusNewsVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
