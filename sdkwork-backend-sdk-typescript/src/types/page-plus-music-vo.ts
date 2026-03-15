import type { PageableObject } from './pageable-object';
import type { PlusMusicVO } from './plus-music-vo';
import type { SortObject } from './sort-object';

export interface PagePlusMusicVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusMusicVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
