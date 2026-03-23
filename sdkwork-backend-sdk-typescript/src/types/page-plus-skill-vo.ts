import type { PageableObject } from './pageable-object';
import type { PlusSkillVO } from './plus-skill-vo';
import type { SortObject } from './sort-object';

export interface PagePlusSkillVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusSkillVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
