import type { PageableObject } from './pageable-object';
import type { PlusCharacterVO } from './plus-character-vo';
import type { SortObject } from './sort-object';

export interface PagePlusCharacterVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusCharacterVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
