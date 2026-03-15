import type { PageableObject } from './pageable-object';
import type { PlusKnowledgeBaseVO } from './plus-knowledge-base-vo';
import type { SortObject } from './sort-object';

export interface PagePlusKnowledgeBaseVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusKnowledgeBaseVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
