import type { SortObject } from './sort-object';

export interface PageableObject {
  offset?: number;
  unpaged?: boolean;
  pageNumber?: number;
  pageSize?: number;
  sort?: SortObject;
  paged?: boolean;
}
