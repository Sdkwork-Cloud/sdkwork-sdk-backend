import type { PageableObject } from './pageable-object';
import type { PlusAiAgentVO } from './plus-ai-agent-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAiAgentVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusAiAgentVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
