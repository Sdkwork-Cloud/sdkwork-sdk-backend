import type { PageableObject } from './pageable-object';
import type { PlusAiGenerationContentVO } from './plus-ai-generation-content-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAiGenerationContentVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusAiGenerationContentVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
