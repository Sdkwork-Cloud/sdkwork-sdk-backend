import type { NotaryMatterVO } from './notary-matter-vo';

export interface PageResultNotaryMatterVO {
  list?: NotaryMatterVO[];
  total?: number;
  page?: number;
  pageSize?: number;
  size?: number;
  totalPages?: number;
}
