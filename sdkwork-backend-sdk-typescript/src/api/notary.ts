import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { NotaryListRequest, NotaryMatterRequest, PlusApiResultBoolean, PlusApiResultNotaryMatterVO, PlusApiResultPageResultNotaryMatterVO, PlusApiResultPageResultNotaryPartyVO, PlusApiResultPageResultNotaryRecordVO } from '../types';


export class NotaryApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update notary matter */
  async updateMatter(body: NotaryMatterRequest): Promise<PlusApiResultNotaryMatterVO> {
    return this.client.put<PlusApiResultNotaryMatterVO>(backendApiPath(`/notary/matter`), body);
  }

/** Create notary matter */
  async createMatter(body: NotaryMatterRequest): Promise<PlusApiResultNotaryMatterVO> {
    return this.client.post<PlusApiResultNotaryMatterVO>(backendApiPath(`/notary/matter`), body);
  }

/** Notary record page */
  async listRecords(body?: NotaryListRequest): Promise<PlusApiResultPageResultNotaryRecordVO> {
    return this.client.post<PlusApiResultPageResultNotaryRecordVO>(backendApiPath(`/notary/record/list`), body);
  }

/** Notary party page */
  async listParties(body?: NotaryListRequest): Promise<PlusApiResultPageResultNotaryPartyVO> {
    return this.client.post<PlusApiResultPageResultNotaryPartyVO>(backendApiPath(`/notary/party/list`), body);
  }

/** Notary matter page */
  async listMatters(body?: NotaryListRequest): Promise<PlusApiResultPageResultNotaryMatterVO> {
    return this.client.post<PlusApiResultPageResultNotaryMatterVO>(backendApiPath(`/notary/matter/list`), body);
  }

/** Delete notary matter */
  async deleteMatter(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/notary/matter/${id}`));
  }
}

export function createNotaryApi(client: HttpClient): NotaryApi {
  return new NotaryApi(client);
}
