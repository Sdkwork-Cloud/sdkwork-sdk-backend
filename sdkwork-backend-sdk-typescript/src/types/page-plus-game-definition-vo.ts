import type { PageableObject } from './pageable-object';
import type { PlusGameDefinitionVO } from './plus-game-definition-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameDefinitionVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusGameDefinitionVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
