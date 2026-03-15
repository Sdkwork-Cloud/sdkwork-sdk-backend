import type { PageableObject } from './pageable-object';
import type { ShortUrlVO } from './short-url-vo';
import type { SortObject } from './sort-object';

export interface PageShortUrlVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: ShortUrlVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
