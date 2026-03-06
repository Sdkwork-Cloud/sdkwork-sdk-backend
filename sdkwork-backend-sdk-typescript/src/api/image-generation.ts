import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { GenerateImageForm, PlusApiResultGenerateImageVO } from '../types';


export class ImageGenerationApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Create image generation task */
  async create(body: GenerateImageForm): Promise<PlusApiResultGenerateImageVO> {
    return this.client.post<PlusApiResultGenerateImageVO>(backendApiPath(`/generation/image/create`), body);
  }

/** Get image generation result */
  async getResult(taskId: string | number): Promise<PlusApiResultGenerateImageVO> {
    return this.client.get<PlusApiResultGenerateImageVO>(backendApiPath(`/generation/image/result/${taskId}`));
  }
}

export function createImageGenerationApi(client: HttpClient): ImageGenerationApi {
  return new ImageGenerationApi(client);
}
