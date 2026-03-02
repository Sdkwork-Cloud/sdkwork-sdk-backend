import Foundation

public class ShareVisitRecordApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update visit record
    public func update(body: PlusShareVisitRecordForm) async throws -> PlusApiResultPlusShareVisitRecordVO? {
        let response = try await client.put(ApiPaths.backendPath("/share/visit_record"), body: body)
        return response as? PlusApiResultPlusShareVisitRecordVO
    }

    /// Create visit record
    public func create(body: PlusShareVisitRecordForm) async throws -> PlusApiResultPlusShareVisitRecordVO? {
        let response = try await client.post(ApiPaths.backendPath("/share/visit_record"), body: body)
        return response as? PlusApiResultPlusShareVisitRecordVO
    }

    /// Get visit records by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusShareVisitRecordVO? {
        let response = try await client.post(ApiPaths.backendPath("/share/visit_record/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusShareVisitRecordVO
    }

    /// Get all visit records
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusShareVisitRecordVO? {
        let response = try await client.post(ApiPaths.backendPath("/share/visit_record/list/all"), body: body)
        return response as? PlusApiResultListPlusShareVisitRecordVO
    }

    /// Get visit record by ID
    public func getById(id: String) async throws -> PlusApiResultPlusShareVisitRecordVO? {
        let response = try await client.get(ApiPaths.backendPath("/share/visit_record/\(id)"))
        return response as? PlusApiResultPlusShareVisitRecordVO
    }

    /// Delete visit record
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/share/visit_record/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
