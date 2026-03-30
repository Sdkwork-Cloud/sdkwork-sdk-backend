/** Membership Card Value Object */
export interface PlusCardVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** Card ID */
  id?: number;
  /** 发卡机构ID */
  cardOrganizationId?: number;
  /** 卡券类型：会员卡、礼品券等 */
  cardType?: 'DEFAULT' | 'MEMBER' | 'GIFT' | 'DISCOUNT' | 'CASH' | 'NORMAL';
  /** 券的Code码类型，如二维码、条形码 */
  codeType?: 'DEFAULT' | 'TEXT' | 'BARCODE' | 'QRCODE';
  /** 卡券标题 */
  title?: string;
  /** 商户名称 */
  brandName?: string;
  /** 卡券Logo图片URL */
  logoUrl?: string;
  /** 使用须知 */
  notice?: string;
  /** 卡券详情描述 */
  description?: string;
  /** 卡券颜色 */
  color?: string;
  /** 卡券库存/发行量 */
  quantity?: number;
  /** 每人领取上限 */
  getLimit?: number;
  /** 是否可分享 */
  canShare?: boolean;
  /** 是否可转赠 */
  canGiveFriend?: boolean;
  /** 生效时间 */
  startTime?: string;
  /** 失效时间 */
  endTime?: string;
  /** 卡券状态：启用/禁用/删除 */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DELETED';
}
