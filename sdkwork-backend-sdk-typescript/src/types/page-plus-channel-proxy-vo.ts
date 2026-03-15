import type { PageableObject } from './pageable-object';
import type { PlusChannelProxyVO } from './plus-channel-proxy-vo';
import type { SortObject } from './sort-object';

export interface PagePlusChannelProxyVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusChannelProxyVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
