export interface PlusCard {
  tenantId?: number;
  organizationId?: number;
  dataScope?: 'DEFAULT' | 'PRIVATE' | 'SHARED' | 'PUBLIC';
  id?: number;
  uuid?: string;
  createdAt?: string;
  updatedAt?: string;
  v?: number;
  cardOrganizationId?: number;
  cardType?: 'DEFAULT' | 'MEMBER' | 'GIFT' | 'DISCOUNT' | 'CASH' | 'NORMAL';
  codeType?: 'DEFAULT' | 'TEXT' | 'BARCODE' | 'QRCODE';
  title?: string;
  brandName?: string;
  logoUrl?: string;
  notice?: string;
  description?: string;
  color?: string;
  quantity?: number;
  getLimit?: number;
  canShare?: boolean;
  canGiveFriend?: boolean;
  startTime?: string;
  endTime?: string;
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DELETED';
}
