package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ContentWritingApi(private val client: HttpClient) {

    /** Rename chapter */
    suspend fun renameChapter(fileId: String, body: String): FileTreeNodeVO? {
        return client.put(ApiPaths.backendPath("/content-writing/chapters/$fileId/rename"), body) as? FileTreeNodeVO
    }

    /** Move chapter */
    suspend fun moveChapter(fileId: String, body: Int): FileTreeNodeVO? {
        return client.put(ApiPaths.backendPath("/content-writing/chapters/$fileId/move"), body) as? FileTreeNodeVO
    }

    /** Get chapter content */
    suspend fun getChapterContent(fileId: String): String? {
        return client.get(ApiPaths.backendPath("/content-writing/chapters/$fileId")) as? String
    }

    /** Update chapter */
    suspend fun updateChapter(fileId: String, body: String): FileTreeNodeVO? {
        return client.put(ApiPaths.backendPath("/content-writing/chapters/$fileId"), body) as? FileTreeNodeVO
    }

    /** Delete chapter */
    suspend fun deleteChapter(fileId: String): Unit {
        client.delete(ApiPaths.backendPath("/content-writing/chapters/$fileId"))
    }

    /** Create chapter */
    suspend fun createChapter(body: CreateChapterForm): FileTreeNodeVO? {
        return client.post(ApiPaths.backendPath("/content-writing/chapters"), body) as? FileTreeNodeVO
    }

    /** Get all contents */
    suspend fun getAllContents(): GetAllContentsResponse? {
        return client.get(ApiPaths.backendPath("/content-writing")) as? GetAllContentsResponse
    }

    /** Create content */
    suspend fun createContent(body: CreateContentForm): ContentWorkVO? {
        return client.post(ApiPaths.backendPath("/content-writing"), body) as? ContentWorkVO
    }

    /** Get content */
    suspend fun getContent(id: String): ContentWorkVO? {
        return client.get(ApiPaths.backendPath("/content-writing/$id")) as? ContentWorkVO
    }

    /** Delete content */
    suspend fun deleteContent(id: String): Unit {
        client.delete(ApiPaths.backendPath("/content-writing/$id"))
    }

    /** Get directory tree */
    suspend fun getDirectoryTree(contentWorkId: String): FileTreeNodeVO? {
        return client.get(ApiPaths.backendPath("/content-writing/$contentWorkId/tree")) as? FileTreeNodeVO
    }

    /** Get content stats */
    suspend fun getContentStats(contentWorkId: String): ContentStatsVO? {
        return client.get(ApiPaths.backendPath("/content-writing/$contentWorkId/stats")) as? ContentStatsVO
    }

    /** Get all scripts */
    suspend fun getAllScripts(): GetAllScriptsResponse? {
        return client.get(ApiPaths.backendPath("/content-writing/scripts")) as? GetAllScriptsResponse
    }

    /** Get all prose */
    suspend fun getAllProse(): GetAllProseResponse? {
        return client.get(ApiPaths.backendPath("/content-writing/prose")) as? GetAllProseResponse
    }

    /** Get all novels */
    suspend fun getAllNovels(): GetAllNovelsResponse? {
        return client.get(ApiPaths.backendPath("/content-writing/novels")) as? GetAllNovelsResponse
    }

    /** Get all articles */
    suspend fun getAllArticles(): GetAllArticlesResponse? {
        return client.get(ApiPaths.backendPath("/content-writing/articles")) as? GetAllArticlesResponse
    }
}
