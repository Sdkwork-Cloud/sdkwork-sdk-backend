import type { PageableObject } from './pageable-object';
import type { PlusKnowledgeBaseVO } from './plus-knowledge-base-vo';
import type { SortObject } from './sort-object';

export interface PagePlusKnowledgeBaseVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusKnowledgeBaseVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
