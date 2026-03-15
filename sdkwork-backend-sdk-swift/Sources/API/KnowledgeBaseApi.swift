import Foundation

public class KnowledgeBaseApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing knowledge base
    public func update(body: PlusKnowledgeBaseForm) async throws -> PlusApiResultPlusKnowledgeBaseVO? {
        let response = try await client.put(ApiPaths.backendPath("/knowledge_base"), body: body)
        return response as? PlusApiResultPlusKnowledgeBaseVO
    }

    /// Create a new knowledge base
    public func create(body: PlusKnowledgeBaseForm) async throws -> PlusApiResultPlusKnowledgeBaseVO? {
        let response = try await client.post(ApiPaths.backendPath("/knowledge_base"), body: body)
        return response as? PlusApiResultPlusKnowledgeBaseVO
    }

    /// Get knowledge bases by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusKnowledgeBaseVO? {
        let response = try await client.post(ApiPaths.backendPath("/knowledge_base/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusKnowledgeBaseVO
    }

    /// Get all knowledge bases
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusKnowledgeBaseVO? {
        let response = try await client.post(ApiPaths.backendPath("/knowledge_base/list/all"), body: body)
        return response as? PlusApiResultListPlusKnowledgeBaseVO
    }

    /// Get a knowledge base detail by ID
    public func getDetail(params: [String: Any]? = nil) async throws -> PlusApiResultPlusKnowledgeBaseVO? {
        let response = try await client.post(ApiPaths.backendPath("/knowledge_base/get_detail"), body: nil, params: params)
        return response as? PlusApiResultPlusKnowledgeBaseVO
    }

    /// List files
    public func listFiles(params: [String: Any]? = nil) async throws -> PlusApiResultFileListVO? {
        let response = try await client.get(ApiPaths.backendPath("/knowledge_base/files"), params: params)
        return response as? PlusApiResultFileListVO
    }

    /// Upload file
    public func uploadFile(body: UploadFilePostRequest? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultFileItemVO? {
        let response = try await client.post(ApiPaths.backendPath("/knowledge_base/files"), body: body, params: params, headers: nil, contentType: "multipart/form-data")
        return response as? PlusApiResultFileItemVO
    }

    public func stop(params: [String: Any]? = nil, headers: [String: String]? = nil) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.backendPath("/knowledge_base/chat/stop"), body: nil, params: params, headers: headers)
        return response as? PlusApiResultBoolean
    }

    /// Create a chat completion with Knowledge base
    public func createCompletions(body: ChatCompletionCreateForm, params: [String: Any]? = nil, headers: [String: String]? = nil) async throws -> ChatCompletionChunk? {
        let response = try await client.post(ApiPaths.backendPath("/knowledge_base/chat/completions"), body: body, params: params, headers: headers)
        return response as? ChatCompletionChunk
    }

    /// Get a knowledge base by ID
    public func getById(id: String) async throws -> PlusApiResultPlusKnowledgeBaseVO? {
        let response = try await client.get(ApiPaths.backendPath("/knowledge_base/\(id)"))
        return response as? PlusApiResultPlusKnowledgeBaseVO
    }

    /// Delete a knowledge base
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/knowledge_base/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get file
    public func getFile(fileId: String) async throws -> PlusApiResultFileItemVO? {
        let response = try await client.get(ApiPaths.backendPath("/knowledge_base/files/\(fileId)"))
        return response as? PlusApiResultFileItemVO
    }

    /// Delete file
    public func deleteFile(fileId: String) async throws -> PlusApiResultFileItemVO? {
        let response = try await client.delete(ApiPaths.backendPath("/knowledge_base/files/\(fileId)"))
        return response as? PlusApiResultFileItemVO
    }

    /// Get file content
    public func getFileContent(fileId: String) async throws -> String? {
        let response = try await client.get(ApiPaths.backendPath("/knowledge_base/files/\(fileId)/content"))
        return response as? String
    }
}
