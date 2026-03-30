import type { PageableObject } from './pageable-object';
import type { PlusAgentSkillVO } from './plus-agent-skill-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAgentSkillVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusAgentSkillVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
