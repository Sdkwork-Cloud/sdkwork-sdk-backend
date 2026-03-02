import type { PageableObject } from './pageable-object';
import type { PlusAiAgentToolVO } from './plus-ai-agent-tool-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAiAgentToolVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusAiAgentToolVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
