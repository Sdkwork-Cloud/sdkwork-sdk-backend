import type { PageableObject } from './pageable-object';
import type { PlusDnsRecordVO } from './plus-dns-record-vo';
import type { SortObject } from './sort-object';

export interface PagePlusDnsRecordVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusDnsRecordVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
