import type { PageableObject } from './pageable-object';
import type { PlusFavoriteVO } from './plus-favorite-vo';
import type { SortObject } from './sort-object';

export interface PagePlusFavoriteVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusFavoriteVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
