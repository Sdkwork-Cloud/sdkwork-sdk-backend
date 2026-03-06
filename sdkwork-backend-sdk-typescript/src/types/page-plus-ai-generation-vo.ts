import type { PageableObject } from './pageable-object';
import type { PlusAiGenerationVO } from './plus-ai-generation-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAiGenerationVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusAiGenerationVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
