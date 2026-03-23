import type { ContentVoteVO } from './content-vote-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageContentVoteVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: ContentVoteVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
