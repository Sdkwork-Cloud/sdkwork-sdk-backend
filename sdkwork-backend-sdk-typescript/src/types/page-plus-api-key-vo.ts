import type { PageableObject } from './pageable-object';
import type { PlusApiKeyVO } from './plus-api-key-vo';
import type { SortObject } from './sort-object';

export interface PagePlusApiKeyVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusApiKeyVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
