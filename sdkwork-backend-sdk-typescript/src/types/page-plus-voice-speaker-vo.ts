import type { PageableObject } from './pageable-object';
import type { PlusVoiceSpeakerVO } from './plus-voice-speaker-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVoiceSpeakerVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusVoiceSpeakerVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
