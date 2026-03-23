import type { PageableObject } from './pageable-object';
import type { PlusChannelProxyVO } from './plus-channel-proxy-vo';
import type { SortObject } from './sort-object';

export interface PagePlusChannelProxyVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusChannelProxyVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
