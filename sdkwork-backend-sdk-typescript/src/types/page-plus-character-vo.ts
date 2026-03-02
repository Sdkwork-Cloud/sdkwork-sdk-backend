import type { PageableObject } from './pageable-object';
import type { PlusCharacterVO } from './plus-character-vo';
import type { SortObject } from './sort-object';

export interface PagePlusCharacterVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusCharacterVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
