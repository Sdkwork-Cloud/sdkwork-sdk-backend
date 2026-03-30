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
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
