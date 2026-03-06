import type { PageableObject } from './pageable-object';
import type { PlusFavoriteVO } from './plus-favorite-vo';
import type { SortObject } from './sort-object';

export interface PagePlusFavoriteVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusFavoriteVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
