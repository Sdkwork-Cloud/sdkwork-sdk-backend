import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusImageVO, PlusApiResultPagePlusImageVO, PlusApiResultPlusImageVO, PlusImageForm, QueryListForm } from '../types';


export class ImageApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing image */
  async update(body: PlusImageForm): Promise<PlusApiResultPlusImageVO> {
    return this.client.put<PlusApiResultPlusImageVO>(backendApiPath(`/image`), body);
  }

/** Create a new image */
  async create(body: PlusImageForm): Promise<PlusApiResultPlusImageVO> {
    return this.client.post<PlusApiResultPlusImageVO>(backendApiPath(`/image`), body);
  }

/** Get images by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusImageVO> {
    return this.client.post<PlusApiResultPagePlusImageVO>(backendApiPath(`/image/list`), body, params);
  }

/** Get all images */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusImageVO> {
    return this.client.post<PlusApiResultListPlusImageVO>(backendApiPath(`/image/list/all`), body);
  }

/** Get an image by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusImageVO> {
    return this.client.get<PlusApiResultPlusImageVO>(backendApiPath(`/image/${id}`));
  }

/** Delete an image */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/image/${id}`));
  }
}

export function createImageApi(client: HttpClient): ImageApi {
  return new ImageApi(client);
}
