import type { PageableObject } from './pageable-object';
import type { PlusConversationVO } from './plus-conversation-vo';
import type { SortObject } from './sort-object';

export interface PagePlusConversationVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusConversationVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
