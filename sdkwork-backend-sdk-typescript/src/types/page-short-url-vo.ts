import type { PageableObject } from './pageable-object';
import type { ShortUrlVO } from './short-url-vo';
import type { SortObject } from './sort-object';

export interface PageShortUrlVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: ShortUrlVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
