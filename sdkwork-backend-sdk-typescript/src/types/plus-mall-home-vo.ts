import type { PlusCategoryVO } from './plus-category-vo';
import type { PlusProductVO } from './plus-product-vo';

/** Mall Home Value Object - Represents the home page data of the mall including various product lists */
export interface PlusMallHomeVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** List of grid categories for home page display */
  gridCategories?: PlusCategoryVO[];
  /** List of all products */
  products?: PlusProductVO[];
  /** List of banner products */
  banners?: PlusProductVO[];
  /** List of hot products */
  hotProducts?: PlusProductVO[];
  /** List of new products */
  newProducts?: PlusProductVO[];
  /** List of recommended products */
  recommendProducts?: PlusProductVO[];
  /** List of hot sales products */
  hotSalesProducts?: PlusProductVO[];
}
