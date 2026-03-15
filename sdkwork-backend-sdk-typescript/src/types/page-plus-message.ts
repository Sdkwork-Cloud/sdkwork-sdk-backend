import type { PageableObject } from './pageable-object';
import type { PlusMessage } from './plus-message';
import type { SortObject } from './sort-object';

export interface PagePlusMessage {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusMessage[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
