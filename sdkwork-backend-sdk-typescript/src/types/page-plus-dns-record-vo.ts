import type { PageableObject } from './pageable-object';
import type { PlusDnsRecordVO } from './plus-dns-record-vo';
import type { SortObject } from './sort-object';

export interface PagePlusDnsRecordVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusDnsRecordVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
