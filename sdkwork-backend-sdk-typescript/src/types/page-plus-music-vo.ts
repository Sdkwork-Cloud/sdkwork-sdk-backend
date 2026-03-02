import type { PageableObject } from './pageable-object';
import type { PlusMusicVO } from './plus-music-vo';
import type { SortObject } from './sort-object';

export interface PagePlusMusicVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusMusicVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
