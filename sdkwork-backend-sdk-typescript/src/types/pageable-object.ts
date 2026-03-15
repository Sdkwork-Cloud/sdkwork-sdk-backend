import type { SortObject } from './sort-object';

export interface PageableObject {
  offset?: number;
  paged?: boolean;
  sort?: SortObject;
  pageSize?: number;
  pageNumber?: number;
  unpaged?: boolean;
}
