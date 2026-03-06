import type { PageableObject } from './pageable-object';
import type { PlusAiModelPriceVO } from './plus-ai-model-price-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAiModelPriceVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusAiModelPriceVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
