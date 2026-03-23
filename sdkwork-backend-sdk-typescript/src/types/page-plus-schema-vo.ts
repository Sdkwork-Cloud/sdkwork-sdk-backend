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
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
