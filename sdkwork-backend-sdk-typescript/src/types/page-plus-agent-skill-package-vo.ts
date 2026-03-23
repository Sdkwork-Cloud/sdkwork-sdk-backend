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
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
