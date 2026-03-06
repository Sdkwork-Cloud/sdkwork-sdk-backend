import type { InvitationRelationVO } from './invitation-relation-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageInvitationRelationVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: InvitationRelationVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
