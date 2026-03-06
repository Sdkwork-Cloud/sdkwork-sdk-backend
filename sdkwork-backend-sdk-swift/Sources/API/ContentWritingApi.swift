import Foundation

public class ContentWritingApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Rename chapter
    public func renameChapter(fileId: String, body: String) async throws -> FileTreeNodeVO? {
        let response = try await client.put(ApiPaths.backendPath("/content-writing/chapters/\(fileId)/rename"), body: body)
        return response as? FileTreeNodeVO
    }

    /// Move chapter
    public func moveChapter(fileId: String, body: Int) async throws -> FileTreeNodeVO? {
        let response = try await client.put(ApiPaths.backendPath("/content-writing/chapters/\(fileId)/move"), body: body)
        return response as? FileTreeNodeVO
    }

    /// Get chapter content
    public func getChapterContent(fileId: String) async throws -> String? {
        let response = try await client.get(ApiPaths.backendPath("/content-writing/chapters/\(fileId)"))
        return response as? String
    }

    /// Update chapter
    public func updateChapter(fileId: String, body: String) async throws -> FileTreeNodeVO? {
        let response = try await client.put(ApiPaths.backendPath("/content-writing/chapters/\(fileId)"), body: body)
        return response as? FileTreeNodeVO
    }

    /// Delete chapter
    public func deleteChapter(fileId: String) async throws -> Void {
        _ = try await client.delete(ApiPaths.backendPath("/content-writing/chapters/\(fileId)"))
    }

    /// Create chapter
    public func createChapter(body: CreateChapterForm) async throws -> FileTreeNodeVO? {
        let response = try await client.post(ApiPaths.backendPath("/content-writing/chapters"), body: body)
        return response as? FileTreeNodeVO
    }

    /// Get all contents
    public func getAllContents() async throws -> GetAllContentsResponse? {
        let response = try await client.get(ApiPaths.backendPath("/content-writing"))
        return response as? GetAllContentsResponse
    }

    /// Create content
    public func createContent(body: CreateContentForm) async throws -> ContentWorkVO? {
        let response = try await client.post(ApiPaths.backendPath("/content-writing"), body: body)
        return response as? ContentWorkVO
    }

    /// Get content
    public func getContent(id: String) async throws -> ContentWorkVO? {
        let response = try await client.get(ApiPaths.backendPath("/content-writing/\(id)"))
        return response as? ContentWorkVO
    }

    /// Delete content
    public func deleteContent(id: String) async throws -> Void {
        _ = try await client.delete(ApiPaths.backendPath("/content-writing/\(id)"))
    }

    /// Get directory tree
    public func getDirectoryTree(contentWorkId: String) async throws -> FileTreeNodeVO? {
        let response = try await client.get(ApiPaths.backendPath("/content-writing/\(contentWorkId)/tree"))
        return response as? FileTreeNodeVO
    }

    /// Get content stats
    public func getContentStats(contentWorkId: String) async throws -> ContentStatsVO? {
        let response = try await client.get(ApiPaths.backendPath("/content-writing/\(contentWorkId)/stats"))
        return response as? ContentStatsVO
    }

    /// Get all scripts
    public func getAllScripts() async throws -> GetAllScriptsResponse? {
        let response = try await client.get(ApiPaths.backendPath("/content-writing/scripts"))
        return response as? GetAllScriptsResponse
    }

    /// Get all prose
    public func getAllProse() async throws -> GetAllProseResponse? {
        let response = try await client.get(ApiPaths.backendPath("/content-writing/prose"))
        return response as? GetAllProseResponse
    }

    /// Get all novels
    public func getAllNovels() async throws -> GetAllNovelsResponse? {
        let response = try await client.get(ApiPaths.backendPath("/content-writing/novels"))
        return response as? GetAllNovelsResponse
    }

    /// Get all articles
    public func getAllArticles() async throws -> GetAllArticlesResponse? {
        let response = try await client.get(ApiPaths.backendPath("/content-writing/articles"))
        return response as? GetAllArticlesResponse
    }
}
