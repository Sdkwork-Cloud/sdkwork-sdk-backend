import type { PageableObject } from './pageable-object';
import type { PlusAiGenerationVO } from './plus-ai-generation-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAiGenerationVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusAiGenerationVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
