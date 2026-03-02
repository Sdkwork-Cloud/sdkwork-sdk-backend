import type { PageableObject } from './pageable-object';
import type { PlusChatMessageVO } from './plus-chat-message-vo';
import type { SortObject } from './sort-object';

export interface PagePlusChatMessageVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusChatMessageVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
