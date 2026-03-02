import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { InvitationCodeForm, PlusApiResultBoolean, PlusApiResultInvitationCodeVO, PlusApiResultListInvitationCodeVO, PlusApiResultPageInvitationCodeVO, QueryListForm } from '../types';


export class InvitationCodeApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing invitation code */
  async update(body: InvitationCodeForm): Promise<PlusApiResultInvitationCodeVO> {
    return this.client.put<PlusApiResultInvitationCodeVO>(backendApiPath(`/invitation/code`), body);
  }

/** Create a new invitation code */
  async create(body: InvitationCodeForm): Promise<PlusApiResultInvitationCodeVO> {
    return this.client.post<PlusApiResultInvitationCodeVO>(backendApiPath(`/invitation/code`), body);
  }

/** Get invitation codes by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPageInvitationCodeVO> {
    return this.client.post<PlusApiResultPageInvitationCodeVO>(backendApiPath(`/invitation/code/list`), body, params);
  }

/** Get all invitation codes */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListInvitationCodeVO> {
    return this.client.post<PlusApiResultListInvitationCodeVO>(backendApiPath(`/invitation/code/list/all`), body);
  }

/** Get an invitation code by ID */
  async getById(id: string | number): Promise<PlusApiResultInvitationCodeVO> {
    return this.client.get<PlusApiResultInvitationCodeVO>(backendApiPath(`/invitation/code/${id}`));
  }

/** Delete an invitation code */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/invitation/code/${id}`));
  }
}

export function createInvitationCodeApi(client: HttpClient): InvitationCodeApi {
  return new InvitationCodeApi(client);
}
