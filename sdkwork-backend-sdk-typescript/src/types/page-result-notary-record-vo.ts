import type { NotaryRecordVO } from './notary-record-vo';

export interface PageResultNotaryRecordVO {
  list?: NotaryRecordVO[];
  total?: number;
  page?: number;
  pageSize?: number;
  size?: number;
  totalPages?: number;
}
