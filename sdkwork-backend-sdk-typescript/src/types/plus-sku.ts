export interface PlusSku {
  tenantId?: number;
  organizationId?: number;
  dataScope?: 'DEFAULT' | 'PRIVATE' | 'SHARED' | 'PUBLIC';
  id?: number;
  uuid?: string;
  createdAt?: string;
  updatedAt?: string;
  v?: number;
  productId?: number;
  skuCode?: string;
  name?: string;
  title?: string;
  price?: number;
  originalPrice?: number;
  stock?: number;
  sales?: number;
  status?: number;
  image?: string;
  specs?: string;
}
