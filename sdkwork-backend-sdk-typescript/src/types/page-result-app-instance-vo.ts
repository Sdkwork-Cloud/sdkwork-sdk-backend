import type { AppInstanceVO } from './app-instance-vo';

export interface PageResultAppInstanceVO {
  list?: AppInstanceVO[];
  total?: number;
  page?: number;
  pageSize?: number;
  size?: number;
  totalPages?: number;
}
