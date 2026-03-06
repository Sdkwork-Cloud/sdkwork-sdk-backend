import Foundation

public class NotesApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update a note
    public func update(body: PlusNotesForm) async throws -> PlusApiResultPlusNotesVO? {
        let response = try await client.put(ApiPaths.backendPath("/notes"), body: body)
        return response as? PlusApiResultPlusNotesVO
    }

    /// Create a note
    public func create(body: PlusNotesForm) async throws -> PlusApiResultPlusNotesVO? {
        let response = try await client.post(ApiPaths.backendPath("/notes"), body: body)
        return response as? PlusApiResultPlusNotesVO
    }

    /// Publish notes directly
    public func publishNotesToMedia(body: PlusNotesMediaDraftForm) async throws -> PlusApiResultPlusMediaPublishResultDTO? {
        let response = try await client.post(ApiPaths.backendPath("/notes/media/publish"), body: body)
        return response as? PlusApiResultPlusMediaPublishResultDTO
    }

    /// Create media draft
    public func createMediaDraft(body: PlusNotesMediaDraftForm) async throws -> PlusApiResultPlusMediaPublishResultDTO? {
        let response = try await client.post(ApiPaths.backendPath("/notes/media/drafts"), body: body)
        return response as? PlusApiResultPlusMediaPublishResultDTO
    }

    /// Publish media draft
    public func publishMediaDraft(body: PlusNotesMediaPublishDraftForm) async throws -> PlusApiResultPlusMediaPublishResultDTO? {
        let response = try await client.post(ApiPaths.backendPath("/notes/media/drafts/publish"), body: body)
        return response as? PlusApiResultPlusMediaPublishResultDTO
    }

    /// Preview media draft
    public func previewMediaDraft(body: PlusNotesMediaPreviewForm) async throws -> PlusApiResultPlusMediaPublishResultDTO? {
        let response = try await client.post(ApiPaths.backendPath("/notes/media/drafts/preview"), body: body)
        return response as? PlusApiResultPlusMediaPublishResultDTO
    }

    /// Get note by UUID
    public func getByUuid(uuid: String) async throws -> PlusApiResultPlusNotesVO? {
        let response = try await client.get(ApiPaths.backendPath("/notes/\(uuid)"))
        return response as? PlusApiResultPlusNotesVO
    }

    /// Search notes
    public func search(params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusNotesVO? {
        let response = try await client.get(ApiPaths.backendPath("/notes/search"), params: params)
        return response as? PlusApiResultPagePlusNotesVO
    }

    /// Get paginated notes by user
    public func pageByUser(userId: String, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusNotesVO? {
        let response = try await client.get(ApiPaths.backendPath("/notes/page_by_user/\(userId)"), params: params)
        return response as? PlusApiResultPagePlusNotesVO
    }

    /// Get paginated notes by tag
    public func pageByTag(params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusNotesVO? {
        let response = try await client.get(ApiPaths.backendPath("/notes/page_by_tag"), params: params)
        return response as? PlusApiResultPagePlusNotesVO
    }

    /// Get paginated notes by category
    public func pageByCategory(categoryId: String, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusNotesVO? {
        let response = try await client.get(ApiPaths.backendPath("/notes/page_by_category/\(categoryId)"), params: params)
        return response as? PlusApiResultPagePlusNotesVO
    }

    /// Get paginated notes
    public func listByPage(params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusNotesVO? {
        let response = try await client.get(ApiPaths.backendPath("/notes/page"), params: params)
        return response as? PlusApiResultPagePlusNotesVO
    }

    /// List media publish records
    public func listMediaPublishRecords(noteId: String, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusMediaPublishRecordDTO? {
        let response = try await client.get(ApiPaths.backendPath("/notes/media/records/\(noteId)"), params: params)
        return response as? PlusApiResultPagePlusMediaPublishRecordDTO
    }

    /// List notes by user
    public func listByUserId(userId: String) async throws -> PlusApiResultListPlusNotesVO? {
        let response = try await client.get(ApiPaths.backendPath("/notes/list_by_user/\(userId)"))
        return response as? PlusApiResultListPlusNotesVO
    }

    /// List notes by tag
    public func listByTag(params: [String: Any]? = nil) async throws -> PlusApiResultListPlusNotesVO? {
        let response = try await client.get(ApiPaths.backendPath("/notes/list_by_tag"), params: params)
        return response as? PlusApiResultListPlusNotesVO
    }

    /// List notes by category
    public func listByCategoryId(categoryId: String) async throws -> PlusApiResultListPlusNotesVO? {
        let response = try await client.get(ApiPaths.backendPath("/notes/list_by_category/\(categoryId)"))
        return response as? PlusApiResultListPlusNotesVO
    }

    /// Get note by ID
    public func getById(id: String) async throws -> PlusApiResultPlusNotesVO? {
        let response = try await client.get(ApiPaths.backendPath("/notes/id/\(id)"))
        return response as? PlusApiResultPlusNotesVO
    }

    /// List all notes
    public func listAll() async throws -> PlusApiResultListPlusNotesVO? {
        let response = try await client.get(ApiPaths.backendPath("/notes/all"))
        return response as? PlusApiResultListPlusNotesVO
    }

    /// Delete a note
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/notes/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
