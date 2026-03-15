import type { CartGroupList } from './cart-group-list';

/** Shopping cart creation form */
export interface PlusShoppingCartForm {
  /** Owner type */
  owner: 'DEFAULT' | 'USER' | 'PROJECT' | 'TENANT' | 'SYSTEM' | 'ORGANIZATION';
  /** Owner ID */
  ownerId: number;
  /** Cart name */
  name?: string;
  /** Cart description */
  description?: string;
  /** Cart groups */
  groupList?: CartGroupList;
  /** Cart status */
  status: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
}
