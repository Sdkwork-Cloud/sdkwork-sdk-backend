import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { GenerateAudioEffectForm, GenerateAudioForm, GenerateCharacterForm, GenerateImageForm, GenerateMusicForm, GenerateVideoForm, GenerateVoiceSpeakerForm, PlusAiGenerationContentForm, PlusAiGenerationForm, PlusApiResultBoolean, PlusApiResultGenerateAudioEffectVO, PlusApiResultGenerateAudioVO, PlusApiResultGenerateCharacterVO, PlusApiResultGenerateImageVO, PlusApiResultGenerateMusicVO, PlusApiResultGenerateVideoVO, PlusApiResultGenerateVoiceSpeakerVO, PlusApiResultListPlusAiGenerationContentVO, PlusApiResultListPlusAiGenerationVO, PlusApiResultPagePlusAiGenerationContentVO, PlusApiResultPagePlusAiGenerationVO, PlusApiResultPlusAiGenerationContentVO, PlusApiResultPlusAiGenerationVO, QueryListForm } from '../types';


export class GenerationApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing AI generation record */
  async update(body: PlusAiGenerationForm): Promise<PlusApiResultPlusAiGenerationVO> {
    return this.client.put<PlusApiResultPlusAiGenerationVO>(backendApiPath(`/generation`), body);
  }

/** Create a new AI generation record */
  async create(body: PlusAiGenerationForm): Promise<PlusApiResultPlusAiGenerationVO> {
    return this.client.post<PlusApiResultPlusAiGenerationVO>(backendApiPath(`/generation`), body);
  }

/** Update AI generated content */
  async updateContent(body: PlusAiGenerationContentForm): Promise<PlusApiResultPlusAiGenerationContentVO> {
    return this.client.put<PlusApiResultPlusAiGenerationContentVO>(backendApiPath(`/generation/content`), body);
  }

/** Create new AI generated content */
  async createContent(body: PlusAiGenerationContentForm): Promise<PlusApiResultPlusAiGenerationContentVO> {
    return this.client.post<PlusApiResultPlusAiGenerationContentVO>(backendApiPath(`/generation/content`), body);
  }

/** Create voice speaker generation task */
  async createVoiceSpeaker(body: GenerateVoiceSpeakerForm): Promise<PlusApiResultGenerateVoiceSpeakerVO> {
    return this.client.post<PlusApiResultGenerateVoiceSpeakerVO>(backendApiPath(`/generation/voice-speaker/create`), body);
  }

/** Create video generation task */
  async createVideo(body: GenerateVideoForm): Promise<PlusApiResultGenerateVideoVO> {
    return this.client.post<PlusApiResultGenerateVideoVO>(backendApiPath(`/generation/video/create`), body);
  }

/** Create music generation task */
  async createMusic(body: GenerateMusicForm): Promise<PlusApiResultGenerateMusicVO> {
    return this.client.post<PlusApiResultGenerateMusicVO>(backendApiPath(`/generation/music/create`), body);
  }

/** Get AI generation records by page */
  async createListByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAiGenerationVO> {
    return this.client.post<PlusApiResultPagePlusAiGenerationVO>(backendApiPath(`/generation/list`), body, params);
  }

/** Get all AI generation records */
  async createListAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusAiGenerationVO> {
    return this.client.post<PlusApiResultListPlusAiGenerationVO>(backendApiPath(`/generation/list/all`), body);
  }

/** Create image generation task */
  async createImage(body: GenerateImageForm): Promise<PlusApiResultGenerateImageVO> {
    return this.client.post<PlusApiResultGenerateImageVO>(backendApiPath(`/generation/image/create`), body);
  }

/** Get AI generated content by page */
  async createListByPageContent(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAiGenerationContentVO> {
    return this.client.post<PlusApiResultPagePlusAiGenerationContentVO>(backendApiPath(`/generation/content/list`), body, params);
  }

/** Get all AI generated content */
  async createListAllEntitiesContent(body?: QueryListForm): Promise<PlusApiResultListPlusAiGenerationContentVO> {
    return this.client.post<PlusApiResultListPlusAiGenerationContentVO>(backendApiPath(`/generation/content/list/all`), body);
  }

/** Create character generation task */
  async createCharacter(body: GenerateCharacterForm): Promise<PlusApiResultGenerateCharacterVO> {
    return this.client.post<PlusApiResultGenerateCharacterVO>(backendApiPath(`/generation/character/create`), body);
  }

/** Create audio generation task */
  async createAudio(body: GenerateAudioForm): Promise<PlusApiResultGenerateAudioVO> {
    return this.client.post<PlusApiResultGenerateAudioVO>(backendApiPath(`/generation/audio/create`), body);
  }

/** Create audio effect generation task */
  async createAudioEffect(body: GenerateAudioEffectForm): Promise<PlusApiResultGenerateAudioEffectVO> {
    return this.client.post<PlusApiResultGenerateAudioEffectVO>(backendApiPath(`/generation/audio-effect/create`), body);
  }

/** Get an AI generation record by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusAiGenerationVO> {
    return this.client.get<PlusApiResultPlusAiGenerationVO>(backendApiPath(`/generation/${id}`));
  }

/** Delete an AI generation record */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/generation/${id}`));
  }

/** Get voice speaker generation result */
  async getResultByTaskId(taskId: string | number): Promise<PlusApiResultGenerateVoiceSpeakerVO> {
    return this.client.get<PlusApiResultGenerateVoiceSpeakerVO>(backendApiPath(`/generation/voice-speaker/result/${taskId}`));
  }

/** Get video generation result */
  async getResult(taskId: string | number): Promise<PlusApiResultGenerateVideoVO> {
    return this.client.get<PlusApiResultGenerateVideoVO>(backendApiPath(`/generation/video/result/${taskId}`));
  }

/** Get music generation result */
  async getResultMusic(taskId: string | number): Promise<PlusApiResultGenerateMusicVO> {
    return this.client.get<PlusApiResultGenerateMusicVO>(backendApiPath(`/generation/music/result/${taskId}`));
  }

/** Get image generation result */
  async getResultImage(taskId: string | number): Promise<PlusApiResultGenerateImageVO> {
    return this.client.get<PlusApiResultGenerateImageVO>(backendApiPath(`/generation/image/result/${taskId}`));
  }

/** Get AI generated content by ID */
  async getByIdContent(id: string | number): Promise<PlusApiResultPlusAiGenerationContentVO> {
    return this.client.get<PlusApiResultPlusAiGenerationContentVO>(backendApiPath(`/generation/content/${id}`));
  }

/** Delete AI generated content */
  async deleteContent(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/generation/content/${id}`));
  }

/** Get character generation result */
  async getResultCharacter(taskId: string | number): Promise<PlusApiResultGenerateCharacterVO> {
    return this.client.get<PlusApiResultGenerateCharacterVO>(backendApiPath(`/generation/character/result/${taskId}`));
  }

/** Get audio generation result */
  async getResultAudio(taskId: string | number): Promise<PlusApiResultGenerateAudioVO> {
    return this.client.get<PlusApiResultGenerateAudioVO>(backendApiPath(`/generation/audio/result/${taskId}`));
  }

/** Get audio effect generation result */
  async getResultAudioEffect(taskId: string | number): Promise<PlusApiResultGenerateAudioEffectVO> {
    return this.client.get<PlusApiResultGenerateAudioEffectVO>(backendApiPath(`/generation/audio-effect/result/${taskId}`));
  }
}

export function createGenerationApi(client: HttpClient): GenerationApi {
  return new GenerationApi(client);
}
