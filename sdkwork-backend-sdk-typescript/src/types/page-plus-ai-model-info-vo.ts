import type { PageableObject } from './pageable-object';
import type { PlusAiModelInfoVO } from './plus-ai-model-info-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAiModelInfoVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusAiModelInfoVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
