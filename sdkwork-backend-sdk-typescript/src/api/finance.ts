import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { FinanceConfigRecord, FinanceExceptionResolveRequest, FinanceExpenseAuditRequest, FinanceExpenseCreateRequest, FinanceIdRequest, FinanceSettlementBatchRequest, FinanceWithdrawalAuditRequest, PlusApiResultBoolean, PlusApiResultFinanceConfigRecord, PlusApiResultFinanceExpenseRecord, PlusApiResultFinanceLedgerStatsResponse, PlusApiResultFinanceOverviewResponse, PlusApiResultFinancePageResultFinanceExceptionRecord, PlusApiResultFinancePageResultFinanceExpenseRecord, PlusApiResultFinancePageResultFinanceLedgerFlow, PlusApiResultFinancePageResultFinancePayoutRecord, PlusApiResultFinancePageResultFinanceReconciliationBill, PlusApiResultFinancePageResultFinanceSettlementRecord, PlusApiResultFinancePageResultFinanceWithdrawalRecord, PlusApiResultFinanceRiskProfileResponse, PlusApiResultFinanceSettlementBatchResponse } from '../types';


export class FinanceApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Create settlement batch */
  async createSettlementBatch(body: FinanceSettlementBatchRequest): Promise<PlusApiResultFinanceSettlementBatchResponse> {
    return this.client.post<PlusApiResultFinanceSettlementBatchResponse>(backendApiPath(`/finance/admin/settlements/batch`), body);
  }

/** Expenses */
  async getExpenses(params?: QueryParams): Promise<PlusApiResultFinancePageResultFinanceExpenseRecord> {
    return this.client.get<PlusApiResultFinancePageResultFinanceExpenseRecord>(backendApiPath(`/finance/admin/expenses`), params);
  }

/** Create expense */
  async createExpense(body: FinanceExpenseCreateRequest): Promise<PlusApiResultFinanceExpenseRecord> {
    return this.client.post<PlusApiResultFinanceExpenseRecord>(backendApiPath(`/finance/admin/expenses`), body);
  }

/** Finance config */
  async getConfig(): Promise<PlusApiResultFinanceConfigRecord> {
    return this.client.get<PlusApiResultFinanceConfigRecord>(backendApiPath(`/finance/admin/config`));
  }

/** Save finance config */
  async saveConfig(body: FinanceConfigRecord): Promise<PlusApiResultFinanceConfigRecord> {
    return this.client.post<PlusApiResultFinanceConfigRecord>(backendApiPath(`/finance/admin/config`), body);
  }

/** Audit withdrawal */
  async auditWithdrawal(body: FinanceWithdrawalAuditRequest): Promise<PlusApiResultBoolean> {
    return this.client.patch<PlusApiResultBoolean>(backendApiPath(`/finance/admin/withdrawals/audit`), body);
  }

/** Confirm settlement */
  async confirmSettlement(body: FinanceIdRequest): Promise<PlusApiResultBoolean> {
    return this.client.patch<PlusApiResultBoolean>(backendApiPath(`/finance/admin/settlements/confirm`), body);
  }

/** Retry payout */
  async retryPayout(body: FinanceIdRequest): Promise<PlusApiResultBoolean> {
    return this.client.patch<PlusApiResultBoolean>(backendApiPath(`/finance/admin/payouts/retry`), body);
  }

/** Audit expense */
  async auditExpense(body: FinanceExpenseAuditRequest): Promise<PlusApiResultBoolean> {
    return this.client.patch<PlusApiResultBoolean>(backendApiPath(`/finance/admin/expenses/audit`), body);
  }

/** Resolve exception */
  async resolveException(body: FinanceExceptionResolveRequest): Promise<PlusApiResultBoolean> {
    return this.client.patch<PlusApiResultBoolean>(backendApiPath(`/finance/admin/exceptions/resolve`), body);
  }

/** Withdrawals */
  async getWithdrawals(params?: QueryParams): Promise<PlusApiResultFinancePageResultFinanceWithdrawalRecord> {
    return this.client.get<PlusApiResultFinancePageResultFinanceWithdrawalRecord>(backendApiPath(`/finance/admin/withdrawals`), params);
  }

/** Withdrawal risk profile */
  async getRiskProfile(params?: QueryParams): Promise<PlusApiResultFinanceRiskProfileResponse> {
    return this.client.get<PlusApiResultFinanceRiskProfileResponse>(backendApiPath(`/finance/admin/withdrawals/risk-profile`), params);
  }

/** Settlements */
  async getSettlements(params?: QueryParams): Promise<PlusApiResultFinancePageResultFinanceSettlementRecord> {
    return this.client.get<PlusApiResultFinancePageResultFinanceSettlementRecord>(backendApiPath(`/finance/admin/settlements`), params);
  }

/** Reconciliations */
  async getReconciliations(params?: QueryParams): Promise<PlusApiResultFinancePageResultFinanceReconciliationBill> {
    return this.client.get<PlusApiResultFinancePageResultFinanceReconciliationBill>(backendApiPath(`/finance/admin/reconciliations`), params);
  }

/** Payouts */
  async getPayouts(params?: QueryParams): Promise<PlusApiResultFinancePageResultFinancePayoutRecord> {
    return this.client.get<PlusApiResultFinancePageResultFinancePayoutRecord>(backendApiPath(`/finance/admin/payouts`), params);
  }

/** Finance overview */
  async getOverview(): Promise<PlusApiResultFinanceOverviewResponse> {
    return this.client.get<PlusApiResultFinanceOverviewResponse>(backendApiPath(`/finance/admin/overview`));
  }

/** Ledger page */
  async getLedger(params?: QueryParams): Promise<PlusApiResultFinancePageResultFinanceLedgerFlow> {
    return this.client.get<PlusApiResultFinancePageResultFinanceLedgerFlow>(backendApiPath(`/finance/admin/ledger`), params);
  }

/** Ledger stats */
  async getLedgerStats(): Promise<PlusApiResultFinanceLedgerStatsResponse> {
    return this.client.get<PlusApiResultFinanceLedgerStatsResponse>(backendApiPath(`/finance/admin/ledger/stats`));
  }

/** Exceptions */
  async getExceptions(params?: QueryParams): Promise<PlusApiResultFinancePageResultFinanceExceptionRecord> {
    return this.client.get<PlusApiResultFinancePageResultFinanceExceptionRecord>(backendApiPath(`/finance/admin/exceptions`), params);
  }
}

export function createFinanceApi(client: HttpClient): FinanceApi {
  return new FinanceApi(client);
}
