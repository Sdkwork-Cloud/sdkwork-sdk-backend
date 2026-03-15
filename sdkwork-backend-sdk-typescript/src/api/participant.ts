import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusParticipantVO, PlusApiResultPagePlusParticipantVO, PlusApiResultPlusParticipantVO, PlusParticipantForm, QueryListForm } from '../types';


export class ParticipantApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing chat participant */
  async update(body: PlusParticipantForm): Promise<PlusApiResultPlusParticipantVO> {
    return this.client.put<PlusApiResultPlusParticipantVO>(backendApiPath(`/participant`), body);
  }

/** Create a new chat participant */
  async create(body: PlusParticipantForm): Promise<PlusApiResultPlusParticipantVO> {
    return this.client.post<PlusApiResultPlusParticipantVO>(backendApiPath(`/participant`), body);
  }

/** Get chat participants by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusParticipantVO> {
    return this.client.post<PlusApiResultPagePlusParticipantVO>(backendApiPath(`/participant/list`), body, params);
  }

/** Get all chat participants */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusParticipantVO> {
    return this.client.post<PlusApiResultListPlusParticipantVO>(backendApiPath(`/participant/list/all`), body);
  }

/** Get a chat participant by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusParticipantVO> {
    return this.client.get<PlusApiResultPlusParticipantVO>(backendApiPath(`/participant/${id}`));
  }

/** Delete a chat participant */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/participant/${id}`));
  }
}

export function createParticipantApi(client: HttpClient): ParticipantApi {
  return new ParticipantApi(client);
}
