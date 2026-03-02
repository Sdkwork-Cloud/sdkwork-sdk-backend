import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusDnsRecordVO, PlusApiResultPagePlusDnsRecordVO, PlusApiResultPlusDnsRecordVO, PlusDnsRecordForm, QueryListForm } from '../types';


export class DnsRecordApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing DNS record */
  async update(body: PlusDnsRecordForm): Promise<PlusApiResultPlusDnsRecordVO> {
    return this.client.put<PlusApiResultPlusDnsRecordVO>(backendApiPath(`/net/dns/record`), body);
  }

/** Create a new DNS record */
  async create(body: PlusDnsRecordForm): Promise<PlusApiResultPlusDnsRecordVO> {
    return this.client.post<PlusApiResultPlusDnsRecordVO>(backendApiPath(`/net/dns/record`), body);
  }

/** Get DNS records by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusDnsRecordVO> {
    return this.client.post<PlusApiResultPagePlusDnsRecordVO>(backendApiPath(`/net/dns/record/list`), body, params);
  }

/** Get all DNS records */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusDnsRecordVO> {
    return this.client.post<PlusApiResultListPlusDnsRecordVO>(backendApiPath(`/net/dns/record/list/all`), body);
  }

/** Get a DNS record by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusDnsRecordVO> {
    return this.client.get<PlusApiResultPlusDnsRecordVO>(backendApiPath(`/net/dns/record/${id}`));
  }

/** Delete a DNS record */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/net/dns/record/${id}`));
  }
}

export function createDnsRecordApi(client: HttpClient): DnsRecordApi {
  return new DnsRecordApi(client);
}
