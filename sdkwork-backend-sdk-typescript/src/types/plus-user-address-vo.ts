import type { TagsContent } from './tags-content';

/** 用户地址VO */
export interface PlusUserAddressVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 主键ID */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 收货人姓名 */
  name?: string;
  /** 收货人手机号 */
  phone?: string;
  /** 国家代码 */
  countryCode?: string;
  /** 省份代码 */
  provinceCode?: string;
  /** 城市代码 */
  cityCode?: string;
  /** 区县代码 */
  districtCode?: string;
  /** 详细地址 */
  addressDetail?: string;
  /** 邮政编码 */
  postalCode?: string;
  /** 是否默认地址 0-否 1-是 */
  isDefault?: boolean;
  /** 地址标签（如：家、公司等） */
  tags?: TagsContent;
}
