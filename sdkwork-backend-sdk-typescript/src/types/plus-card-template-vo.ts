/** 会员卡模板Value Object */
export interface PlusCardTemplateVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 模板名称 */
  name?: string;
  /** 模板编码 */
  templateCode?: string;
  /** 卡片类型(枚举) */
  cardType?: 'DEFAULT' | 'MEMBER' | 'GIFT' | 'DISCOUNT' | 'CASH' | 'NORMAL';
  /** 编码类型(枚举) */
  codeType?: 'DEFAULT' | 'TEXT' | 'BARCODE' | 'QRCODE';
  /** 标题 */
  title?: string;
  /** 描述 */
  description?: string;
  /** 品牌名称 */
  brandName?: string;
  /** Logo URL */
  logoUrl?: string;
  /** 公告 */
  notice?: string;
  /** 颜色 */
  color?: string;
  /** 数量 */
  quantity?: number;
  /** 获取限制 */
  getLimit?: number;
  /** 是否可分享 */
  canShare?: boolean;
  /** 是否可赠友 */
  canGiveFriend?: boolean;
  /** 最低余额 */
  minimumBalance?: number;
  /** 初始余额 */
  initialBalance?: number;
  /** 折扣率 */
  discountRate?: number;
  /** 有效期类型 */
  validityType?: 'DEFAULT' | 'FIXED' | 'DAYS_AFTER_RECEIVE' | 'DAYS_AFTER_ACTIVATION';
  /** 开始时间 */
  startTime?: string;
  /** 结束时间 */
  endTime?: string;
  /** 有效天数 */
  validityDays?: number;
  /** 是否删除 */
  isDeleted?: boolean;
}
