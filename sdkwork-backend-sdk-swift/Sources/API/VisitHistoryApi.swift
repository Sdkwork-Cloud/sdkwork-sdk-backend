import Foundation

public class VisitHistoryApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update Visit History
    public func update(body: PlusVisitHistoryForm) async throws -> PlusApiResultPlusVisitHistoryVO? {
        let response = try await client.put(ApiPaths.backendPath("/visit_history"), body: body)
        return response as? PlusApiResultPlusVisitHistoryVO
    }

    /// Create Visit History
    public func create(body: PlusVisitHistoryForm) async throws -> PlusApiResultPlusVisitHistoryVO? {
        let response = try await client.post(ApiPaths.backendPath("/visit_history"), body: body)
        return response as? PlusApiResultPlusVisitHistoryVO
    }

    /// List Visit Histories by Page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusVisitHistoryVO? {
        let response = try await client.post(ApiPaths.backendPath("/visit_history/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusVisitHistoryVO
    }

    /// List All Visit Histories
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusVisitHistoryVO? {
        let response = try await client.post(ApiPaths.backendPath("/visit_history/list/all"), body: body)
        return response as? PlusApiResultListPlusVisitHistoryVO
    }

    /// Get Visit History by ID
    public func getById(id: String) async throws -> PlusApiResultPlusVisitHistoryVO? {
        let response = try await client.get(ApiPaths.backendPath("/visit_history/\(id)"))
        return response as? PlusApiResultPlusVisitHistoryVO
    }

    /// Delete Visit History
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/visit_history/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
