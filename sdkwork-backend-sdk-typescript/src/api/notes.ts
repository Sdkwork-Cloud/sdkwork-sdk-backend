import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusNotesVO, PlusApiResultPagePlusMediaPublishRecordDTO, PlusApiResultPagePlusNotesVO, PlusApiResultPlusMediaPublishResultDTO, PlusApiResultPlusNotesVO, PlusNotesForm, PlusNotesMediaDraftForm, PlusNotesMediaPreviewForm, PlusNotesMediaPublishDraftForm } from '../types';


export class NotesApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update a note */
  async update(body: PlusNotesForm): Promise<PlusApiResultPlusNotesVO> {
    return this.client.put<PlusApiResultPlusNotesVO>(backendApiPath(`/notes`), body);
  }

/** Create a note */
  async create(body: PlusNotesForm): Promise<PlusApiResultPlusNotesVO> {
    return this.client.post<PlusApiResultPlusNotesVO>(backendApiPath(`/notes`), body);
  }

/** Publish notes directly */
  async publishNotesToMedia(body: PlusNotesMediaDraftForm): Promise<PlusApiResultPlusMediaPublishResultDTO> {
    return this.client.post<PlusApiResultPlusMediaPublishResultDTO>(backendApiPath(`/notes/media/publish`), body);
  }

/** Create media draft */
  async createMediaDraft(body: PlusNotesMediaDraftForm): Promise<PlusApiResultPlusMediaPublishResultDTO> {
    return this.client.post<PlusApiResultPlusMediaPublishResultDTO>(backendApiPath(`/notes/media/drafts`), body);
  }

/** Publish media draft */
  async publishMediaDraft(body: PlusNotesMediaPublishDraftForm): Promise<PlusApiResultPlusMediaPublishResultDTO> {
    return this.client.post<PlusApiResultPlusMediaPublishResultDTO>(backendApiPath(`/notes/media/drafts/publish`), body);
  }

/** Preview media draft */
  async previewMediaDraft(body: PlusNotesMediaPreviewForm): Promise<PlusApiResultPlusMediaPublishResultDTO> {
    return this.client.post<PlusApiResultPlusMediaPublishResultDTO>(backendApiPath(`/notes/media/drafts/preview`), body);
  }

/** Get note by UUID */
  async getByUuid(uuid: string | number): Promise<PlusApiResultPlusNotesVO> {
    return this.client.get<PlusApiResultPlusNotesVO>(backendApiPath(`/notes/${uuid}`));
  }

/** Search notes */
  async search(params?: QueryParams): Promise<PlusApiResultPagePlusNotesVO> {
    return this.client.get<PlusApiResultPagePlusNotesVO>(backendApiPath(`/notes/search`), params);
  }

/** Get paginated notes by user */
  async pageByUser(userId: string | number, params?: QueryParams): Promise<PlusApiResultPagePlusNotesVO> {
    return this.client.get<PlusApiResultPagePlusNotesVO>(backendApiPath(`/notes/page_by_user/${userId}`), params);
  }

/** Get paginated notes by tag */
  async pageByTag(params?: QueryParams): Promise<PlusApiResultPagePlusNotesVO> {
    return this.client.get<PlusApiResultPagePlusNotesVO>(backendApiPath(`/notes/page_by_tag`), params);
  }

/** Get paginated notes by category */
  async pageByCategory(categoryId: string | number, params?: QueryParams): Promise<PlusApiResultPagePlusNotesVO> {
    return this.client.get<PlusApiResultPagePlusNotesVO>(backendApiPath(`/notes/page_by_category/${categoryId}`), params);
  }

/** Get paginated notes */
  async listByPage(params?: QueryParams): Promise<PlusApiResultPagePlusNotesVO> {
    return this.client.get<PlusApiResultPagePlusNotesVO>(backendApiPath(`/notes/page`), params);
  }

/** List media publish records */
  async listMediaPublishRecords(noteId: string | number, params?: QueryParams): Promise<PlusApiResultPagePlusMediaPublishRecordDTO> {
    return this.client.get<PlusApiResultPagePlusMediaPublishRecordDTO>(backendApiPath(`/notes/media/records/${noteId}`), params);
  }

/** List notes by user */
  async listByUserId(userId: string | number): Promise<PlusApiResultListPlusNotesVO> {
    return this.client.get<PlusApiResultListPlusNotesVO>(backendApiPath(`/notes/list_by_user/${userId}`));
  }

/** List notes by tag */
  async listByTag(params?: QueryParams): Promise<PlusApiResultListPlusNotesVO> {
    return this.client.get<PlusApiResultListPlusNotesVO>(backendApiPath(`/notes/list_by_tag`), params);
  }

/** List notes by category */
  async listByCategoryId(categoryId: string | number): Promise<PlusApiResultListPlusNotesVO> {
    return this.client.get<PlusApiResultListPlusNotesVO>(backendApiPath(`/notes/list_by_category/${categoryId}`));
  }

/** Get note by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusNotesVO> {
    return this.client.get<PlusApiResultPlusNotesVO>(backendApiPath(`/notes/id/${id}`));
  }

/** List all notes */
  async listAll(): Promise<PlusApiResultListPlusNotesVO> {
    return this.client.get<PlusApiResultListPlusNotesVO>(backendApiPath(`/notes/all`));
  }

/** Delete a note */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/notes/${id}`));
  }
}

export function createNotesApi(client: HttpClient): NotesApi {
  return new NotesApi(client);
}
