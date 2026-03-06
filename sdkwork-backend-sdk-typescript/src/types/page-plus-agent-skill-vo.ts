import type { PageableObject } from './pageable-object';
import type { PlusAgentSkillVO } from './plus-agent-skill-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAgentSkillVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusAgentSkillVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
