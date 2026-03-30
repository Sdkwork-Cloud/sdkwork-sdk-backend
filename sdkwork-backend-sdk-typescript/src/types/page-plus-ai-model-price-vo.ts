import type { PageableObject } from './pageable-object';
import type { PlusAiModelPriceVO } from './plus-ai-model-price-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAiModelPriceVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusAiModelPriceVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
