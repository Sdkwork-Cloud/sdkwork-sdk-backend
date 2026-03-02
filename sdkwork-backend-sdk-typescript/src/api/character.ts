import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusCharacterVO, PlusApiResultPagePlusCharacterVO, PlusApiResultPlusCharacterVO, PlusCharacterForm, QueryListForm } from '../types';


export class CharacterApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update character */
  async update(body: PlusCharacterForm): Promise<PlusApiResultPlusCharacterVO> {
    return this.client.put<PlusApiResultPlusCharacterVO>(backendApiPath(`/character`), body);
  }

/** Create character */
  async create(body: PlusCharacterForm): Promise<PlusApiResultPlusCharacterVO> {
    return this.client.post<PlusApiResultPlusCharacterVO>(backendApiPath(`/character`), body);
  }

/** Get characters by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusCharacterVO> {
    return this.client.post<PlusApiResultPagePlusCharacterVO>(backendApiPath(`/character/list`), body, params);
  }

/** Get all characters */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusCharacterVO> {
    return this.client.post<PlusApiResultListPlusCharacterVO>(backendApiPath(`/character/list/all`), body);
  }

/** Get character by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusCharacterVO> {
    return this.client.get<PlusApiResultPlusCharacterVO>(backendApiPath(`/character/${id}`));
  }

/** Delete character */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/character/${id}`));
  }
}

export function createCharacterApi(client: HttpClient): CharacterApi {
  return new CharacterApi(client);
}
