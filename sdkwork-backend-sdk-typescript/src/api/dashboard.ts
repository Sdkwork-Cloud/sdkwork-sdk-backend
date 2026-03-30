import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultDashboardOverviewResponse } from '../types';


export class DashboardApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Dashboard overview */
  async getOverview(): Promise<PlusApiResultDashboardOverviewResponse> {
    return this.client.get<PlusApiResultDashboardOverviewResponse>(backendApiPath(`/dashboard/admin/overview`));
  }
}

export function createDashboardApi(client: HttpClient): DashboardApi {
  return new DashboardApi(client);
}
