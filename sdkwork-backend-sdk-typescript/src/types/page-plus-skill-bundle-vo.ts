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
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
