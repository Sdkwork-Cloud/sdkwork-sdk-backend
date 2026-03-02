import type { PageableObject } from './pageable-object';
import type { PlusAiModelInfoVO } from './plus-ai-model-info-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAiModelInfoVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusAiModelInfoVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
