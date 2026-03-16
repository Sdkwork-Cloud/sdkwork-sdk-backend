import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';

export class FinanceApi {
  private client: HttpClient;

  constructor(client: HttpClient) {
    this.client = client;
  }

  async getOverview(): Promise<unknown> {
    return this.client.get<unknown>(backendApiPath(`/finance/admin/overview`));
  }

  async getLedgerStats(): Promise<unknown> {
    return this.client.get<unknown>(backendApiPath(`/finance/admin/ledger/stats`));
  }

  async getLedger(params?: Record<string, string | number | boolean | undefined>): Promise<unknown> {
    return this.client.get<unknown>(backendApiPath(`/finance/admin/ledger`), params);
  }

  async getWithdrawals(params?: Record<string, string | number | boolean | undefined>): Promise<unknown> {
    return this.client.get<unknown>(backendApiPath(`/finance/admin/withdrawals`), params);
  }

  async auditWithdrawal(body: Record<string, unknown>): Promise<unknown> {
    return this.client.patch<unknown>(backendApiPath(`/finance/admin/withdrawals/audit`), body);
  }

  async getRiskProfile(params: Record<string, string | number | boolean | undefined>): Promise<unknown> {
    return this.client.get<unknown>(backendApiPath(`/finance/admin/withdrawals/risk-profile`), params);
  }

  async getSettlements(params?: Record<string, string | number | boolean | undefined>): Promise<unknown> {
    return this.client.get<unknown>(backendApiPath(`/finance/admin/settlements`), params);
  }

  async confirmSettlement(body: Record<string, unknown>): Promise<unknown> {
    return this.client.patch<unknown>(backendApiPath(`/finance/admin/settlements/confirm`), body);
  }

  async createSettlementBatch(body: Record<string, unknown>): Promise<unknown> {
    return this.client.post<unknown>(backendApiPath(`/finance/admin/settlements/batch`), body);
  }

  async getExpenses(params?: Record<string, string | number | boolean | undefined>): Promise<unknown> {
    return this.client.get<unknown>(backendApiPath(`/finance/admin/expenses`), params);
  }

  async createExpense(body: Record<string, unknown>): Promise<unknown> {
    return this.client.post<unknown>(backendApiPath(`/finance/admin/expenses`), body);
  }

  async auditExpense(body: Record<string, unknown>): Promise<unknown> {
    return this.client.patch<unknown>(backendApiPath(`/finance/admin/expenses/audit`), body);
  }

  async getReconciliations(params?: Record<string, string | number | boolean | undefined>): Promise<unknown> {
    return this.client.get<unknown>(backendApiPath(`/finance/admin/reconciliations`), params);
  }

  async getPayouts(params?: Record<string, string | number | boolean | undefined>): Promise<unknown> {
    return this.client.get<unknown>(backendApiPath(`/finance/admin/payouts`), params);
  }

  async retryPayout(body: Record<string, unknown>): Promise<unknown> {
    return this.client.patch<unknown>(backendApiPath(`/finance/admin/payouts/retry`), body);
  }

  async getExceptions(params?: Record<string, string | number | boolean | undefined>): Promise<unknown> {
    return this.client.get<unknown>(backendApiPath(`/finance/admin/exceptions`), params);
  }

  async resolveException(body: Record<string, unknown>): Promise<unknown> {
    return this.client.patch<unknown>(backendApiPath(`/finance/admin/exceptions/resolve`), body);
  }

  async getConfig(): Promise<unknown> {
    return this.client.get<unknown>(backendApiPath(`/finance/admin/config`));
  }

  async saveConfig(body: Record<string, unknown>): Promise<unknown> {
    return this.client.post<unknown>(backendApiPath(`/finance/admin/config`), body);
  }
}

export function createFinanceApi(client: HttpClient): FinanceApi {
  return new FinanceApi(client);
}
