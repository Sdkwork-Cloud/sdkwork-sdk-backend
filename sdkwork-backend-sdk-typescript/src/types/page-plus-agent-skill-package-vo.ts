import type { PageableObject } from './pageable-object';
import type { PlusAgentSkillPackageVO } from './plus-agent-skill-package-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAgentSkillPackageVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusAgentSkillPackageVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
