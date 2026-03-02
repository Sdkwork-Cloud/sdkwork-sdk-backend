import type { PageableObject } from './pageable-object';
import type { PlusMessage } from './plus-message';
import type { SortObject } from './sort-object';

export interface PagePlusMessage {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusMessage[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
