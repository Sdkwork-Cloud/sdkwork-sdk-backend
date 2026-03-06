import type { PageableObject } from './pageable-object';
import type { PlusMessage } from './plus-message';
import type { SortObject } from './sort-object';

export interface PagePlusMessage {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusMessage[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
