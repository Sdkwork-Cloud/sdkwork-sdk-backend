import type { PageableObject } from './pageable-object';
import type { PlusCharacterVO } from './plus-character-vo';
import type { SortObject } from './sort-object';

export interface PagePlusCharacterVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusCharacterVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
