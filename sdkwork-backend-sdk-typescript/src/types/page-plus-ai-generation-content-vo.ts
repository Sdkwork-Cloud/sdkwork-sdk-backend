import type { PageableObject } from './pageable-object';
import type { PlusAiGenerationContentVO } from './plus-ai-generation-content-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAiGenerationContentVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusAiGenerationContentVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
