import type { InvitationCodeVO } from './invitation-code-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageInvitationCodeVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: InvitationCodeVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
