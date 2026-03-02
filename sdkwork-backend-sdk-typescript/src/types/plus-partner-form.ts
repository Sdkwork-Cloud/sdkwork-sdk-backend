import type { PlusTreeParentMetadata } from './plus-tree-parent-metadata';

/** Partner creation form */
export interface PlusPartnerForm {
  /** 合作伙伴名称/公司名称 */
  name: string;
  /** 合作伙伴等级 */
  level: 'DEFAULT' | 'NORMAL' | 'SENIOR' | 'STRATEGIC';
  /** 合作伙伴状态 */
  status: 'DEFAULT' | 'ACTIVE' | 'SUSPENDED' | 'FROZEN' | 'CLOSED';
  /** 联系人姓名 */
  contactName?: string;
  /** 联系电话 */
  contactPhone?: string;
  /** 联系邮箱 */
  contactEmail?: string;
  /** 公司地址 */
  companyAddress?: string;
  /** 营业执照号码 */
  businessLicense?: string;
  /** 结算账户 */
  settlementAccount?: string;
  /** 佣金比例 */
  commissionRate?: number;
  /** 累计佣金金额 */
  totalCommission?: number;
  /** 可提现佣金金额 */
  withdrawableCommission?: number;
  /** 已提现佣金金额 */
  withdrawnCommission?: number;
  /** 推广码 */
  promotionCode?: string;
  /** 上级合作伙伴ID */
  parentId?: number;
  /** 树节点父级元数据信息 */
  parentMetadata?: PlusTreeParentMetadata;
  /** Parent file UUID */
  parentUuid?: string;
  /** 合作开始时间 */
  cooperationStartTime?: string;
  /** 合作结束时间 */
  cooperationEndTime?: string;
  /** 备注 */
  remark?: string;
}
