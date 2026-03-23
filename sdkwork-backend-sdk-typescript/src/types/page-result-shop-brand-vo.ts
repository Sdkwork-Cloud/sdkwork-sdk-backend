import type { ShopBrandVO } from './shop-brand-vo';

export interface PageResultShopBrandVO {
  list?: ShopBrandVO[];
  total?: number;
  page?: number;
  pageSize?: number;
  size?: number;
  totalPages?: number;
}
