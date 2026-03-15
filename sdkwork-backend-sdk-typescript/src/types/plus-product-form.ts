import type { AssetMediaResourceList } from './asset-media-resource-list';
import type { Attributes } from './attributes';

/** Product creation form */
export interface PlusProductForm {
  /** Product title */
  title: string;
  /** Product code */
  code?: string;
  /** Product subtitle */
  subtitle?: string;
  /** Product resources */
  resources?: AssetMediaResourceList;
  /** Product price */
  price: number;
  /** Original price */
  originalPrice?: number;
  /** Stock */
  stock?: number;
  /** Sales count */
  salesCount?: number;
  /** Product status */
  status: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DISCONTINUED';
  /** On-sale time */
  onSaleAt?: string;
  /** Product description */
  description?: string;
  /** Category ID */
  categoryId: number;
  /** Base attributes */
  baseAttributes?: Attributes;
  /** Spec attributes */
  specAttributes?: Attributes;
}
