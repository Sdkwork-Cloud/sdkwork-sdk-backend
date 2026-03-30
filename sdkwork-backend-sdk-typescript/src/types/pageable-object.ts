import type { SortObject } from './sort-object';

export interface PageableObject {
  offset?: number;
  sort?: SortObject;
  paged?: boolean;
  pageSize?: number;
  pageNumber?: number;
  unpaged?: boolean;
}
