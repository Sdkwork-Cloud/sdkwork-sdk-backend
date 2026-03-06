import type { PageableObject } from './pageable-object';
import type { PlusNewsVO } from './plus-news-vo';
import type { SortObject } from './sort-object';

export interface PagePlusNewsVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusNewsVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
