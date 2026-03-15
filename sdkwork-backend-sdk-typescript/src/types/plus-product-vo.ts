import type { AssetMediaResourceList } from './asset-media-resource-list';
import type { Attributes } from './attributes';
import type { TagsContent } from './tags-content';

/** Product view object */
export interface PlusProductVO {
  /** Created time */
  createdAt?: string;
  /** Updated time */
  updatedAt?: string;
  /** Primary key ID */
  id?: number;
  /** UUID */
  uuid?: string;
  /** User ID */
  userId?: number;
  /** Product title */
  title?: string;
  /** Product code */
  code?: string;
  /** Product subtitle */
  subtitle?: string;
  /** Product resources */
  resources?: AssetMediaResourceList;
  /** Product tags */
  tags?: TagsContent;
  /** Product price */
  price?: number;
  /** Original price */
  originalPrice?: number;
  /** Stock */
  stock?: number;
  /** Sales count */
  salesCount?: number;
  /** Product status */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DISCONTINUED';
  /** On sale time */
  onSaleAt?: string;
  /** Description */
  description?: string;
  /** Category ID */
  categoryId?: number;
  /** Base attributes */
  baseAttributes?: Attributes;
  /** Specification attributes */
  specAttributes?: Attributes;
}
