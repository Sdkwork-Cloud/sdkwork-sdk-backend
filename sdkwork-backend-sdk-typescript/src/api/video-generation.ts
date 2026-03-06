import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { GenerateVideoForm, PlusApiResultGenerateVideoVO } from '../types';


export class VideoGenerationApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Create video generation task */
  async create(body: GenerateVideoForm): Promise<PlusApiResultGenerateVideoVO> {
    return this.client.post<PlusApiResultGenerateVideoVO>(backendApiPath(`/generation/video/create`), body);
  }

/** Get video generation result */
  async getResult(taskId: string | number): Promise<PlusApiResultGenerateVideoVO> {
    return this.client.get<PlusApiResultGenerateVideoVO>(backendApiPath(`/generation/video/result/${taskId}`));
  }
}

export function createVideoGenerationApi(client: HttpClient): VideoGenerationApi {
  return new VideoGenerationApi(client);
}
