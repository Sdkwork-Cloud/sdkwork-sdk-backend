import type { PageableObject } from './pageable-object';
import type { PlusAiModelInfoVO } from './plus-ai-model-info-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAiModelInfoVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusAiModelInfoVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
