import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { GenerateAudioForm, PlusApiResultGenerateAudioVO } from '../types';


export class AudioGenerationApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Create audio generation task */
  async create(body: GenerateAudioForm): Promise<PlusApiResultGenerateAudioVO> {
    return this.client.post<PlusApiResultGenerateAudioVO>(backendApiPath(`/generation/audio/create`), body);
  }

/** Get audio generation result */
  async getResult(taskId: string | number): Promise<PlusApiResultGenerateAudioVO> {
    return this.client.get<PlusApiResultGenerateAudioVO>(backendApiPath(`/generation/audio/result/${taskId}`));
  }
}

export function createAudioGenerationApi(client: HttpClient): AudioGenerationApi {
  return new AudioGenerationApi(client);
}
