import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusPositionVO, PlusApiResultPagePlusPositionVO, PlusApiResultPlusPositionVO, PlusPositionForm, QueryListForm } from '../types';


export class PositionApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing position */
  async update(body: PlusPositionForm): Promise<PlusApiResultPlusPositionVO> {
    return this.client.put<PlusApiResultPlusPositionVO>(backendApiPath(`/organization/position`), body);
  }

/** Create a new position */
  async create(body: PlusPositionForm): Promise<PlusApiResultPlusPositionVO> {
    return this.client.post<PlusApiResultPlusPositionVO>(backendApiPath(`/organization/position`), body);
  }

/** Get positions by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusPositionVO> {
    return this.client.post<PlusApiResultPagePlusPositionVO>(backendApiPath(`/organization/position/list`), body, params);
  }

/** Get all positions */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusPositionVO> {
    return this.client.post<PlusApiResultListPlusPositionVO>(backendApiPath(`/organization/position/list/all`), body);
  }

/** Get a position by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusPositionVO> {
    return this.client.get<PlusApiResultPlusPositionVO>(backendApiPath(`/organization/position/${id}`));
  }

/** Delete a position */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/organization/position/${id}`));
  }
}

export function createPositionApi(client: HttpClient): PositionApi {
  return new PositionApi(client);
}
