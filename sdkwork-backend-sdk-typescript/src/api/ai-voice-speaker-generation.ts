import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { GenerateVoiceSpeakerForm, PlusApiResultGenerateVoiceSpeakerVO } from '../types';


export class AiVoiceSpeakerGenerationApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Create voice speaker generation task */
  async create(body: GenerateVoiceSpeakerForm): Promise<PlusApiResultGenerateVoiceSpeakerVO> {
    return this.client.post<PlusApiResultGenerateVoiceSpeakerVO>(backendApiPath(`/generation/voice-speaker/create`), body);
  }

/** Get voice speaker generation result */
  async getResultByTaskId(taskId: string | number): Promise<PlusApiResultGenerateVoiceSpeakerVO> {
    return this.client.get<PlusApiResultGenerateVoiceSpeakerVO>(backendApiPath(`/generation/voice-speaker/result/${taskId}`));
  }
}

export function createAiVoiceSpeakerGenerationApi(client: HttpClient): AiVoiceSpeakerGenerationApi {
  return new AiVoiceSpeakerGenerationApi(client);
}
