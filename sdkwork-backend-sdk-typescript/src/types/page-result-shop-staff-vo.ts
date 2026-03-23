import type { ShopStaffVO } from './shop-staff-vo';

export interface PageResultShopStaffVO {
  list?: ShopStaffVO[];
  total?: number;
  page?: number;
  pageSize?: number;
  size?: number;
  totalPages?: number;
}
