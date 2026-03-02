import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResult, PlusPptTemplateRenderForm } from '../types';


export class PptTemplateRenderingApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Render PPT template */
  async render(body: PlusPptTemplateRenderForm): Promise<PlusApiResult> {
    return this.client.post<PlusApiResult>(backendApiPath(`/ppt/template/render`), body);
  }
}

export function createPptTemplateRenderingApi(client: HttpClient): PptTemplateRenderingApi {
  return new PptTemplateRenderingApi(client);
}
