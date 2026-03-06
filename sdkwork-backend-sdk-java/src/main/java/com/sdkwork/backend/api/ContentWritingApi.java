package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class ContentWritingApi {
    private final HttpClient client;
    
    public ContentWritingApi(HttpClient client) {
        this.client = client;
    }

    /** Rename chapter */
    public FileTreeNodeVO renameChapter(String fileId, String body) throws Exception {
        return (FileTreeNodeVO) client.put(ApiPaths.backendPath("/content-writing/chapters/" + fileId + "/rename"), body);
    }

    /** Move chapter */
    public FileTreeNodeVO moveChapter(String fileId, Integer body) throws Exception {
        return (FileTreeNodeVO) client.put(ApiPaths.backendPath("/content-writing/chapters/" + fileId + "/move"), body);
    }

    /** Get chapter content */
    public String getChapterContent(String fileId) throws Exception {
        return (String) client.get(ApiPaths.backendPath("/content-writing/chapters/" + fileId + ""));
    }

    /** Update chapter */
    public FileTreeNodeVO updateChapter(String fileId, String body) throws Exception {
        return (FileTreeNodeVO) client.put(ApiPaths.backendPath("/content-writing/chapters/" + fileId + ""), body);
    }

    /** Delete chapter */
    public Void deleteChapter(String fileId) throws Exception {
        client.delete(ApiPaths.backendPath("/content-writing/chapters/" + fileId + ""));
        return null;
    }

    /** Create chapter */
    public FileTreeNodeVO createChapter(CreateChapterForm body) throws Exception {
        return (FileTreeNodeVO) client.post(ApiPaths.backendPath("/content-writing/chapters"), body);
    }

    /** Get all contents */
    public GetAllContentsResponse getAllContents() throws Exception {
        return (GetAllContentsResponse) client.get(ApiPaths.backendPath("/content-writing"));
    }

    /** Create content */
    public ContentWorkVO createContent(CreateContentForm body) throws Exception {
        return (ContentWorkVO) client.post(ApiPaths.backendPath("/content-writing"), body);
    }

    /** Get content */
    public ContentWorkVO getContent(String id) throws Exception {
        return (ContentWorkVO) client.get(ApiPaths.backendPath("/content-writing/" + id + ""));
    }

    /** Delete content */
    public Void deleteContent(String id) throws Exception {
        client.delete(ApiPaths.backendPath("/content-writing/" + id + ""));
        return null;
    }

    /** Get directory tree */
    public FileTreeNodeVO getDirectoryTree(String contentWorkId) throws Exception {
        return (FileTreeNodeVO) client.get(ApiPaths.backendPath("/content-writing/" + contentWorkId + "/tree"));
    }

    /** Get content stats */
    public ContentStatsVO getContentStats(String contentWorkId) throws Exception {
        return (ContentStatsVO) client.get(ApiPaths.backendPath("/content-writing/" + contentWorkId + "/stats"));
    }

    /** Get all scripts */
    public GetAllScriptsResponse getAllScripts() throws Exception {
        return (GetAllScriptsResponse) client.get(ApiPaths.backendPath("/content-writing/scripts"));
    }

    /** Get all prose */
    public GetAllProseResponse getAllProse() throws Exception {
        return (GetAllProseResponse) client.get(ApiPaths.backendPath("/content-writing/prose"));
    }

    /** Get all novels */
    public GetAllNovelsResponse getAllNovels() throws Exception {
        return (GetAllNovelsResponse) client.get(ApiPaths.backendPath("/content-writing/novels"));
    }

    /** Get all articles */
    public GetAllArticlesResponse getAllArticles() throws Exception {
        return (GetAllArticlesResponse) client.get(ApiPaths.backendPath("/content-writing/articles"));
    }
}
