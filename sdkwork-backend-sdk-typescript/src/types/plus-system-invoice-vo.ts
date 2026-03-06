/** 系统发票VO */
export interface PlusSystemInvoiceVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 主键ID */
  id?: number;
  /** 业务UUID */
  uuid?: string;
  /** 发票抬头 */
  title?: string;
  /** 纳税人识别号 */
  taxId?: string;
  /** 发票类型：electronic|paper */
  type?: string;
  /** 金额 */
  amount?: number;
  /** 状态：pending|issued|rejected */
  status?: string;
  /** 开票内容 */
  content?: string;
  /** 电子发票邮箱 */
  email?: string;
  /** 邮寄地址 */
  address?: string;
  /** 创建时间 */
  createTime?: string;
}
