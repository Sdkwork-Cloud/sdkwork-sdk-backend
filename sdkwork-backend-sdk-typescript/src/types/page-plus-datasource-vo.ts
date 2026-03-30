import type { PageableObject } from './pageable-object';
import type { PlusDatasourceVO } from './plus-datasource-vo';
import type { SortObject } from './sort-object';

export interface PagePlusDatasourceVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusDatasourceVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
