import type { AssetMediaResourceList } from './asset-media-resource-list';
import type { Attributes } from './attributes';
import type { TagsContent } from './tags-content';

/** Product Value Object - Represents a product in the system with basic information, pricing, inventory, and relationships */
export interface PlusProductVO {
  /** Creation timestamp */
  createdAt?: string;
  /** Last update timestamp */
  updatedAt?: string;
  /** Primary key ID */
  id?: number;
  /** Universally unique identifier UUID */
  uuid?: string;
  /** User ID (foreign key关联plus_user.id) */
  userId?: number;
  /** Product name */
  title?: string;
  /** Product code/SKU */
  code?: string;
  /** Product subtitle/brief description */
  subtitle?: string;
  /** List of product resources, images，videos etc. */
  resources?: AssetMediaResourceList;
  /** Product tags */
  tags?: TagsContent;
  /** Product price */
  price?: number;
  /** Product original price (for showing discounts) */
  originalPrice?: number;
  /** Product stock quantity */
  stock?: number;
  /** Product sales count */
  salesCount?: number;
  /** Product status (1:在售,2:下架,3:已停产) */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DISCONTINUED';
  /** Product on sale at time */
  onSaleAt?: string;
  /** Product description (HTML format supported) */
  description?: string;
  /** 所属分类ID */
  categoryId?: number;
  /** 产品属性值 */
  baseAttributes?: Attributes;
  /** 规格属性值 */
  specAttributes?: Attributes;
}
