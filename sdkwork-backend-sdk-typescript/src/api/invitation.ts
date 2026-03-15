import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { InvitationCodeForm, InvitationRelationForm, PlusApiResultBoolean, PlusApiResultInvitationCodeVO, PlusApiResultInvitationRelationVO, PlusApiResultListInvitationCodeVO, PlusApiResultListInvitationRelationVO, PlusApiResultPageInvitationCodeVO, PlusApiResultPageInvitationRelationVO, QueryListForm } from '../types';


export class InvitationApi {
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

/** Update an existing invitation code */
  async updateCode(body: InvitationCodeForm): Promise<PlusApiResultInvitationCodeVO> {
    return this.client.put<PlusApiResultInvitationCodeVO>(backendApiPath(`/invitation/code`), body);
  }

/** Create a new invitation code */
  async createCode(body: InvitationCodeForm): Promise<PlusApiResultInvitationCodeVO> {
    return this.client.post<PlusApiResultInvitationCodeVO>(backendApiPath(`/invitation/code`), body);
  }

/** Get invitation relations by page */
  async createListByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPageInvitationRelationVO> {
    return this.client.post<PlusApiResultPageInvitationRelationVO>(backendApiPath(`/invitation/relation/list`), body, params);
  }

/** Get all invitation relations */
  async createListAllEntities(body?: QueryListForm): Promise<PlusApiResultListInvitationRelationVO> {
    return this.client.post<PlusApiResultListInvitationRelationVO>(backendApiPath(`/invitation/relation/list/all`), body);
  }

/** Get invitation codes by page */
  async createListByPageCode(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPageInvitationCodeVO> {
    return this.client.post<PlusApiResultPageInvitationCodeVO>(backendApiPath(`/invitation/code/list`), body, params);
  }

/** Get all invitation codes */
  async createListAllEntitiesCode(body?: QueryListForm): Promise<PlusApiResultListInvitationCodeVO> {
    return this.client.post<PlusApiResultListInvitationCodeVO>(backendApiPath(`/invitation/code/list/all`), body);
  }

/** Get an invitation relation by ID */
  async getById(id: string | number): Promise<PlusApiResultInvitationRelationVO> {
    return this.client.get<PlusApiResultInvitationRelationVO>(backendApiPath(`/invitation/relation/${id}`));
  }

/** Delete an invitation relation */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/invitation/relation/${id}`));
  }

/** Get an invitation code by ID */
  async getByIdCode(id: string | number): Promise<PlusApiResultInvitationCodeVO> {
    return this.client.get<PlusApiResultInvitationCodeVO>(backendApiPath(`/invitation/code/${id}`));
  }

/** Delete an invitation code */
  async deleteCode(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/invitation/code/${id}`));
  }
}

export function createInvitationApi(client: HttpClient): InvitationApi {
  return new InvitationApi(client);
}
