import type { PageableObject } from './pageable-object';
import type { PlusFavoriteVO } from './plus-favorite-vo';
import type { SortObject } from './sort-object';

export interface PagePlusFavoriteVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusFavoriteVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
