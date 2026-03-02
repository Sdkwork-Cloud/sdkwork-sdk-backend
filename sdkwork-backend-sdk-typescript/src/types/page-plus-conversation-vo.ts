import type { PageableObject } from './pageable-object';
import type { PlusConversationVO } from './plus-conversation-vo';
import type { SortObject } from './sort-object';

export interface PagePlusConversationVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusConversationVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
