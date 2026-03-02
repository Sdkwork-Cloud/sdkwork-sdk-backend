import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { GenerateCharacterForm, PlusApiResultGenerateCharacterVO } from '../types';


export class AiCharacterGenerationApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Create character generation task */
  async create(body: GenerateCharacterForm): Promise<PlusApiResultGenerateCharacterVO> {
    return this.client.post<PlusApiResultGenerateCharacterVO>(backendApiPath(`/generation/character/create`), body);
  }

/** Get character generation result */
  async getResult(taskId: string | number): Promise<PlusApiResultGenerateCharacterVO> {
    return this.client.get<PlusApiResultGenerateCharacterVO>(backendApiPath(`/generation/character/result/${taskId}`));
  }
}

export function createAiCharacterGenerationApi(client: HttpClient): AiCharacterGenerationApi {
  return new AiCharacterGenerationApi(client);
}
