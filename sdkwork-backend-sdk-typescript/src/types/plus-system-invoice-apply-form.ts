/** System invoice application form */
export interface PlusSystemInvoiceApplyForm {
  /** Invoice title */
  title: string;
  /** Taxpayer identification number */
  taxId?: string;
  /** Invoice type */
  type: string;
  /** Invoice amount */
  amount: number;
  /** Invoice content */
  content: string;
  /** Recipient email for electronic invoices */
  email?: string;
  /** Recipient address for paper invoices */
  address?: string;
}
