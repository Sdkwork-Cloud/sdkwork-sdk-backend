import type { PageableObject } from './pageable-object';
import type { PlusAiToolVO } from './plus-ai-tool-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAiToolVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusAiToolVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
