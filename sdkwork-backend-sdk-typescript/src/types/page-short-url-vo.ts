import type { PageableObject } from './pageable-object';
import type { ShortUrlVO } from './short-url-vo';
import type { SortObject } from './sort-object';

export interface PageShortUrlVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: ShortUrlVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
