import type { PageableObject } from './pageable-object';
import type { PlusMessage } from './plus-message';
import type { SortObject } from './sort-object';

export interface PagePlusMessage {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusMessage[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
