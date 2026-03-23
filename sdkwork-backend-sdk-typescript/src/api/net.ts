import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusDnsRecordVO, PlusApiResultListPlusHostDomainVO, PlusApiResultPagePlusDnsRecordVO, PlusApiResultPagePlusHostDomainVO, PlusApiResultPlusDnsRecordVO, PlusApiResultPlusHostDomainVO, PlusDnsRecordForm, PlusHostDomainForm, QueryListForm } from '../types';


export class NetApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** æ´æ°åå */
  async update(body: PlusHostDomainForm): Promise<PlusApiResultPlusHostDomainVO> {
    return this.client.put<PlusApiResultPlusHostDomainVO>(backendApiPath(`/net/host/domain`), body);
  }

/** åå»ºåå */
  async create(body: PlusHostDomainForm): Promise<PlusApiResultPlusHostDomainVO> {
    return this.client.post<PlusApiResultPlusHostDomainVO>(backendApiPath(`/net/host/domain`), body);
  }

/** Update an existing DNS record */
  async updateRecord(body: PlusDnsRecordForm): Promise<PlusApiResultPlusDnsRecordVO> {
    return this.client.put<PlusApiResultPlusDnsRecordVO>(backendApiPath(`/net/dns/record`), body);
  }

/** Create a new DNS record */
  async createRecord(body: PlusDnsRecordForm): Promise<PlusApiResultPlusDnsRecordVO> {
    return this.client.post<PlusApiResultPlusDnsRecordVO>(backendApiPath(`/net/dns/record`), body);
  }

/** åé¡µè·ååå */
  async createListByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusHostDomainVO> {
    return this.client.post<PlusApiResultPagePlusHostDomainVO>(backendApiPath(`/net/host/domain/list`), body, params);
  }

/** è·åææåå */
  async createListAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusHostDomainVO> {
    return this.client.post<PlusApiResultListPlusHostDomainVO>(backendApiPath(`/net/host/domain/list/all`), body);
  }

/** Get DNS records by page */
  async createListByPageRecord(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusDnsRecordVO> {
    return this.client.post<PlusApiResultPagePlusDnsRecordVO>(backendApiPath(`/net/dns/record/list`), body, params);
  }

/** Get all DNS records */
  async createListAllEntitiesRecord(body?: QueryListForm): Promise<PlusApiResultListPlusDnsRecordVO> {
    return this.client.post<PlusApiResultListPlusDnsRecordVO>(backendApiPath(`/net/dns/record/list/all`), body);
  }

/** è·åååè¯¦æ */
  async getById(id: string | number): Promise<PlusApiResultPlusHostDomainVO> {
    return this.client.get<PlusApiResultPlusHostDomainVO>(backendApiPath(`/net/host/domain/${id}`));
  }

/** å é¤åå */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/net/host/domain/${id}`));
  }

/** Get a DNS record by ID */
  async getByIdRecord(id: string | number): Promise<PlusApiResultPlusDnsRecordVO> {
    return this.client.get<PlusApiResultPlusDnsRecordVO>(backendApiPath(`/net/dns/record/${id}`));
  }

/** Delete a DNS record */
  async deleteRecord(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/net/dns/record/${id}`));
  }
}

export function createNetApi(client: HttpClient): NetApi {
  return new NetApi(client);
}
