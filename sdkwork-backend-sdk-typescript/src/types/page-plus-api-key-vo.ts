import type { PageableObject } from './pageable-object';
import type { PlusApiKeyVO } from './plus-api-key-vo';
import type { SortObject } from './sort-object';

export interface PagePlusApiKeyVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusApiKeyVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
