/** 系统发票申请表单 */
export interface PlusSystemInvoiceApplyForm {
  /** 发票抬头 */
  title: string;
  /** 纳税人识别号 */
  taxId?: string;
  /** 发票类型：electronic|paper */
  type: string;
  /** 开票金额 */
  amount: number;
  /** 开票内容 */
  content: string;
  /** 电子发票接收邮箱 */
  email?: string;
  /** 纸质发票邮寄地址 */
  address?: string;
}
