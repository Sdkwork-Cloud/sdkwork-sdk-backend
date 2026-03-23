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
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
