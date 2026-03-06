import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { ContentStatsVO, ContentWorkVO, CreateChapterForm, CreateContentForm, FileTreeNodeVO, GetAllArticlesResponse, GetAllContentsResponse, GetAllNovelsResponse, GetAllProseResponse, GetAllScriptsResponse } from '../types';


export class ContentWritingApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Rename chapter */
  async renameChapter(fileId: string | number, body: string): Promise<FileTreeNodeVO> {
    return this.client.put<FileTreeNodeVO>(backendApiPath(`/content-writing/chapters/${fileId}/rename`), body);
  }

/** Move chapter */
  async moveChapter(fileId: string | number, body: number): Promise<FileTreeNodeVO> {
    return this.client.put<FileTreeNodeVO>(backendApiPath(`/content-writing/chapters/${fileId}/move`), body);
  }

/** Get chapter content */
  async getChapterContent(fileId: string | number): Promise<string> {
    return this.client.get<string>(backendApiPath(`/content-writing/chapters/${fileId}`));
  }

/** Update chapter */
  async updateChapter(fileId: string | number, body: string): Promise<FileTreeNodeVO> {
    return this.client.put<FileTreeNodeVO>(backendApiPath(`/content-writing/chapters/${fileId}`), body);
  }

/** Delete chapter */
  async deleteChapter(fileId: string | number): Promise<void> {
    return this.client.delete<void>(backendApiPath(`/content-writing/chapters/${fileId}`));
  }

/** Create chapter */
  async createChapter(body: CreateChapterForm): Promise<FileTreeNodeVO> {
    return this.client.post<FileTreeNodeVO>(backendApiPath(`/content-writing/chapters`), body);
  }

/** Get all contents */
  async getAllContents(): Promise<GetAllContentsResponse> {
    return this.client.get<GetAllContentsResponse>(backendApiPath(`/content-writing`));
  }

/** Create content */
  async createContent(body: CreateContentForm): Promise<ContentWorkVO> {
    return this.client.post<ContentWorkVO>(backendApiPath(`/content-writing`), body);
  }

/** Get content */
  async getContent(id: string | number): Promise<ContentWorkVO> {
    return this.client.get<ContentWorkVO>(backendApiPath(`/content-writing/${id}`));
  }

/** Delete content */
  async deleteContent(id: string | number): Promise<void> {
    return this.client.delete<void>(backendApiPath(`/content-writing/${id}`));
  }

/** Get directory tree */
  async getDirectoryTree(contentWorkId: string | number): Promise<FileTreeNodeVO> {
    return this.client.get<FileTreeNodeVO>(backendApiPath(`/content-writing/${contentWorkId}/tree`));
  }

/** Get content stats */
  async getContentStats(contentWorkId: string | number): Promise<ContentStatsVO> {
    return this.client.get<ContentStatsVO>(backendApiPath(`/content-writing/${contentWorkId}/stats`));
  }

/** Get all scripts */
  async getAllScripts(): Promise<GetAllScriptsResponse> {
    return this.client.get<GetAllScriptsResponse>(backendApiPath(`/content-writing/scripts`));
  }

/** Get all prose */
  async getAllProse(): Promise<GetAllProseResponse> {
    return this.client.get<GetAllProseResponse>(backendApiPath(`/content-writing/prose`));
  }

/** Get all novels */
  async getAllNovels(): Promise<GetAllNovelsResponse> {
    return this.client.get<GetAllNovelsResponse>(backendApiPath(`/content-writing/novels`));
  }

/** Get all articles */
  async getAllArticles(): Promise<GetAllArticlesResponse> {
    return this.client.get<GetAllArticlesResponse>(backendApiPath(`/content-writing/articles`));
  }
}

export function createContentWritingApi(client: HttpClient): ContentWritingApi {
  return new ContentWritingApi(client);
}
