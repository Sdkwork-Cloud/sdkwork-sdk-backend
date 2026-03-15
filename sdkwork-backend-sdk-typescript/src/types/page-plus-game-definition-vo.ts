import type { PageableObject } from './pageable-object';
import type { PlusGameDefinitionVO } from './plus-game-definition-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameDefinitionVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusGameDefinitionVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
