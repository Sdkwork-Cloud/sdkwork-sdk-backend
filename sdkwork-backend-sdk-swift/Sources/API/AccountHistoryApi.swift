import Foundation

public class AccountHistoryApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing account history record
    public func update(body: PlusAccountHistoryForm) async throws -> PlusApiResultPlusAccountHistoryVO? {
        let response = try await client.put(ApiPaths.backendPath("/account/history"), body: body)
        return response as? PlusApiResultPlusAccountHistoryVO
    }

    /// Create a new account history record
    public func create(body: PlusAccountHistoryForm) async throws -> PlusApiResultPlusAccountHistoryVO? {
        let response = try await client.post(ApiPaths.backendPath("/account/history"), body: body)
        return response as? PlusApiResultPlusAccountHistoryVO
    }

    /// Get account history records by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAccountHistoryVO? {
        let response = try await client.post(ApiPaths.backendPath("/account/history/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusAccountHistoryVO
    }

    /// Get all account history records
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusAccountHistoryVO? {
        let response = try await client.post(ApiPaths.backendPath("/account/history/list/all"), body: body)
        return response as? PlusApiResultListPlusAccountHistoryVO
    }

    /// Get an account history record by ID
    public func getById(id: String) async throws -> PlusApiResultPlusAccountHistoryVO? {
        let response = try await client.get(ApiPaths.backendPath("/account/history/\(id)"))
        return response as? PlusApiResultPlusAccountHistoryVO
    }

    /// Delete an account history record
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/account/history/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
