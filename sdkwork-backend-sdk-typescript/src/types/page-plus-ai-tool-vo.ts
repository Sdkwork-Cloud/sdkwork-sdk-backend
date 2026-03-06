import type { PageableObject } from './pageable-object';
import type { PlusAiToolVO } from './plus-ai-tool-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAiToolVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusAiToolVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
