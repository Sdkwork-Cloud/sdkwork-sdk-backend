import type { PageableObject } from './pageable-object';
import type { PlusSchemaVO } from './plus-schema-vo';
import type { SortObject } from './sort-object';

export interface PagePlusSchemaVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusSchemaVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
