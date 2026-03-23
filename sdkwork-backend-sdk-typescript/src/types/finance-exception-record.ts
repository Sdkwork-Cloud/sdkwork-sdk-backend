export interface FinanceExceptionRecord {
  id?: string;
  exceptionNo?: string;
  relatedFlowNo?: string;
  type?: string;
  amount?: number;
  description?: string;
  status?: string;
  createTime?: string;
  resolveTime?: string;
  resolver?: string;
  solution?: string;
}
