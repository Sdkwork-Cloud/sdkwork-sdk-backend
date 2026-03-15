import type { PageableObject } from './pageable-object';
import type { PlusAiModelPriceVO } from './plus-ai-model-price-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAiModelPriceVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusAiModelPriceVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
