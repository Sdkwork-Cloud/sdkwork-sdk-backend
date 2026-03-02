import type { SortObject } from './sort-object';

export interface PageableObject {
  offset?: number;
  sort?: SortObject;
  paged?: boolean;
  pageNumber?: number;
  pageSize?: number;
  unpaged?: boolean;
}
