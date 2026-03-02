import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusNotesVO, PlusApiResultPagePlusNotesVO, PlusApiResultPlusNotesVO, PlusNotesForm } from '../types';


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
