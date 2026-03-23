import type { ShopCsVO } from './shop-cs-vo';

export interface PageResultShopCsVO {
  list?: ShopCsVO[];
  total?: number;
  page?: number;
  pageSize?: number;
  size?: number;
  totalPages?: number;
}
