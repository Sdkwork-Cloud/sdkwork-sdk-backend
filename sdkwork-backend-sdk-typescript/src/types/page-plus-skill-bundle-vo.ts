import type { PageableObject } from './pageable-object';
import type { PlusSkillBundleVO } from './plus-skill-bundle-vo';
import type { SortObject } from './sort-object';

export interface PagePlusSkillBundleVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusSkillBundleVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
