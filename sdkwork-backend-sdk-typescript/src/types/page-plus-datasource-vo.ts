import type { PageableObject } from './pageable-object';
import type { PlusDatasourceVO } from './plus-datasource-vo';
import type { SortObject } from './sort-object';

export interface PagePlusDatasourceVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusDatasourceVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
