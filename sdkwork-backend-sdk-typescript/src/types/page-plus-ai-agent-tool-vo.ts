import type { PageableObject } from './pageable-object';
import type { PlusAiAgentToolVO } from './plus-ai-agent-tool-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAiAgentToolVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusAiAgentToolVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
