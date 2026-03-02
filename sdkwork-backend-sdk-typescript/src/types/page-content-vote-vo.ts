import type { ContentVoteVO } from './content-vote-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageContentVoteVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: ContentVoteVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
