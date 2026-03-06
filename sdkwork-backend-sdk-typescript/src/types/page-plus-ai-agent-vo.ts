import type { PageableObject } from './pageable-object';
import type { PlusAiAgentVO } from './plus-ai-agent-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAiAgentVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusAiAgentVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
