import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { GenerateMusicForm, PlusApiResultGenerateMusicVO } from '../types';


export class AiMusicGenerationApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Create music generation task */
  async create(body: GenerateMusicForm): Promise<PlusApiResultGenerateMusicVO> {
    return this.client.post<PlusApiResultGenerateMusicVO>(backendApiPath(`/generation/music/create`), body);
  }

/** Get music generation result */
  async getResult(taskId: string | number): Promise<PlusApiResultGenerateMusicVO> {
    return this.client.get<PlusApiResultGenerateMusicVO>(backendApiPath(`/generation/music/result/${taskId}`));
  }
}

export function createAiMusicGenerationApi(client: HttpClient): AiMusicGenerationApi {
  return new AiMusicGenerationApi(client);
}
