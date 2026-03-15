import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusVoiceSpeakerVO, PlusApiResultPagePlusVoiceSpeakerVO, PlusApiResultPlusVoiceSpeakerVO, PlusVoiceSpeakerForm, PlusVoiceSpeakerQueryForm } from '../types';


export class VoiceApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing voice speaker */
  async update(body: PlusVoiceSpeakerForm): Promise<PlusApiResultPlusVoiceSpeakerVO> {
    return this.client.put<PlusApiResultPlusVoiceSpeakerVO>(backendApiPath(`/voice/speaker`), body);
  }

/** Create a new voice speaker */
  async create(body: PlusVoiceSpeakerForm): Promise<PlusApiResultPlusVoiceSpeakerVO> {
    return this.client.post<PlusApiResultPlusVoiceSpeakerVO>(backendApiPath(`/voice/speaker`), body);
  }

/** Get voice speakers by page */
  async listPublic(body?: PlusVoiceSpeakerQueryForm, params?: QueryParams): Promise<PlusApiResultPagePlusVoiceSpeakerVO> {
    return this.client.post<PlusApiResultPagePlusVoiceSpeakerVO>(backendApiPath(`/voice/speaker/list_public`), body, params);
  }

/** Get voice speakers by page */
  async listByPage(body?: PlusVoiceSpeakerQueryForm, params?: QueryParams): Promise<PlusApiResultPagePlusVoiceSpeakerVO> {
    return this.client.post<PlusApiResultPagePlusVoiceSpeakerVO>(backendApiPath(`/voice/speaker/list`), body, params);
  }

/** Get all voice speakers */
  async listAllEntities(body?: PlusVoiceSpeakerQueryForm): Promise<PlusApiResultListPlusVoiceSpeakerVO> {
    return this.client.post<PlusApiResultListPlusVoiceSpeakerVO>(backendApiPath(`/voice/speaker/list/all`), body);
  }

/** Get a voice speaker by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusVoiceSpeakerVO> {
    return this.client.get<PlusApiResultPlusVoiceSpeakerVO>(backendApiPath(`/voice/speaker/${id}`));
  }

/** Delete a voice speaker */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/voice/speaker/${id}`));
  }
}

export function createVoiceApi(client: HttpClient): VoiceApi {
  return new VoiceApi(client);
}
