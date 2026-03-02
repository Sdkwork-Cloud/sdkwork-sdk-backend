import type { AssetMediaResourceList } from './asset-media-resource-list';
import type { Attributes } from './attributes';

/** Product creation form */
export interface PlusProductForm {
  /** 产品名称 */
  title: string;
  /** 产品编码/SKU */
  code?: string;
  /** 产品副标题/简短描述 */
  subtitle?: string;
  /** List of product resources */
  resources?: AssetMediaResourceList;
  /** 产品价格 */
  price: number;
  /** 产品原价(用于显示折扣) */
  originalPrice?: number;
  /** 产品库存数量 */
  stock: number;
  /** 产品销售数量 */
  salesCount?: number;
  /** 产品状态(1:在售,2:下架,3:已停产) */
  status: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DISCONTINUED';
  /** 产品上架时间 */
  onSaleAt?: string;
  /** 产品描述(支持HTML格式) */
  description?: string;
  /** 所属分类ID */
  categoryId: number;
  /** 产品属性值 */
  baseAttributes?: Attributes;
  /** 规格属性值 */
  specAttributes?: Attributes;
}
