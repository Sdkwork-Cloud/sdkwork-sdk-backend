import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { InvitationRelationForm, PlusApiResultBoolean, PlusApiResultInvitationRelationVO, PlusApiResultListInvitationRelationVO, PlusApiResultPageInvitationRelationVO, QueryListForm } from '../types';


export class InvitationRelationApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an invitation relation */
  async update(body: InvitationRelationForm): Promise<PlusApiResultInvitationRelationVO> {
    return this.client.put<PlusApiResultInvitationRelationVO>(backendApiPath(`/invitation/relation`), body);
  }

/** Create a new invitation relation */
  async create(body: InvitationRelationForm): Promise<PlusApiResultInvitationRelationVO> {
    return this.client.post<PlusApiResultInvitationRelationVO>(backendApiPath(`/invitation/relation`), body);
  }

/** Get invitation relations by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPageInvitationRelationVO> {
    return this.client.post<PlusApiResultPageInvitationRelationVO>(backendApiPath(`/invitation/relation/list`), body, params);
  }

/** Get all invitation relations */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListInvitationRelationVO> {
    return this.client.post<PlusApiResultListInvitationRelationVO>(backendApiPath(`/invitation/relation/list/all`), body);
  }

/** Get an invitation relation by ID */
  async getById(id: string | number): Promise<PlusApiResultInvitationRelationVO> {
    return this.client.get<PlusApiResultInvitationRelationVO>(backendApiPath(`/invitation/relation/${id}`));
  }

/** Delete an invitation relation */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/invitation/relation/${id}`));
  }
}

export function createInvitationRelationApi(client: HttpClient): InvitationRelationApi {
  return new InvitationRelationApi(client);
}
