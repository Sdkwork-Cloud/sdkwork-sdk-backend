import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { GenerateAudioEffectForm, PlusApiResultGenerateAudioEffectVO } from '../types';


export class AiAudioEffectGenerationApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Create audio effect generation task */
  async create(body: GenerateAudioEffectForm): Promise<PlusApiResultGenerateAudioEffectVO> {
    return this.client.post<PlusApiResultGenerateAudioEffectVO>(backendApiPath(`/generation/audio-effect/create`), body);
  }

/** Get audio effect generation result */
  async getResult(taskId: string | number): Promise<PlusApiResultGenerateAudioEffectVO> {
    return this.client.get<PlusApiResultGenerateAudioEffectVO>(backendApiPath(`/generation/audio-effect/result/${taskId}`));
  }
}

export function createAiAudioEffectGenerationApi(client: HttpClient): AiAudioEffectGenerationApi {
  return new AiAudioEffectGenerationApi(client);
}
