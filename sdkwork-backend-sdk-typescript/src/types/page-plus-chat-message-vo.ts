import type { PageableObject } from './pageable-object';
import type { PlusChatMessageVO } from './plus-chat-message-vo';
import type { SortObject } from './sort-object';

export interface PagePlusChatMessageVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusChatMessageVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
