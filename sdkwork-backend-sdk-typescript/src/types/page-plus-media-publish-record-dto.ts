import type { PageableObject } from './pageable-object';
import type { PlusMediaPublishRecordDTO } from './plus-media-publish-record-dto';
import type { SortObject } from './sort-object';

export interface PagePlusMediaPublishRecordDTO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusMediaPublishRecordDTO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
