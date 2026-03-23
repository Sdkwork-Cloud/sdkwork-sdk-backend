import type { NotaryPartyVO } from './notary-party-vo';

export interface PageResultNotaryPartyVO {
  list?: NotaryPartyVO[];
  total?: number;
  page?: number;
  pageSize?: number;
  size?: number;
  totalPages?: number;
}
