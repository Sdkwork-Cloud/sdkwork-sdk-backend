import type { AssetMediaResourceList } from './asset-media-resource-list';
import type { AttributeItem } from './attribute-item';
import type { ImageMediaResourceList } from './image-media-resource-list';

/** SKU creation form */
export interface PlusSkuForm {
  /** SKU title */
  title: string;
  /** Associated product ID */
  productId: number;
  /** Unique SKU code */
  skuCode: string;
  /** List of product images */
  images?: ImageMediaResourceList;
  /** List of product resources */
  resources?: AssetMediaResourceList;
  /** SKU selling price */
  price: number;
  /** Original price (for discount display) */
  originalPrice?: number;
  /** Current stock quantity */
  stock: number;
  /** Total sales quantity */
  salesCount?: number;
  /** SKU sales status */
  status: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DISCONTINUED';
  /** Associated category ID */
  categoryId: number;
  /** Sku attribute values */
  attributes?: AttributeItem[];
}
