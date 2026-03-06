import type { PageableObject } from './pageable-object';
import type { PlusSchemaVO } from './plus-schema-vo';
import type { SortObject } from './sort-object';

export interface PagePlusSchemaVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusSchemaVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
