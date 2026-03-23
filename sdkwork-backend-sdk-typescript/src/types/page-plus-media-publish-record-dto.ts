import type { PageableObject } from './pageable-object';
import type { PlusMediaPublishRecordDTO } from './plus-media-publish-record-dto';
import type { SortObject } from './sort-object';

export interface PagePlusMediaPublishRecordDTO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusMediaPublishRecordDTO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
