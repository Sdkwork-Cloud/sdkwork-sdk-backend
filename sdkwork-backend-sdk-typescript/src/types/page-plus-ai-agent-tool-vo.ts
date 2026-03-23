import type { PageableObject } from './pageable-object';
import type { PlusAiAgentToolVO } from './plus-ai-agent-tool-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAiAgentToolVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusAiAgentToolVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
