import type { PageableObject } from './pageable-object';
import type { PlusAiGenerationContentVO } from './plus-ai-generation-content-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAiGenerationContentVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusAiGenerationContentVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
