import type { PageableObject } from './pageable-object';
import type { PlusAgentSkillPackageVO } from './plus-agent-skill-package-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAgentSkillPackageVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusAgentSkillPackageVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
