import Foundation

public class InvocationRecordApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing invocation record
    public func update(body: PlusInvokeRecordForm) async throws -> PlusApiResultPlusInvokeRecordVO? {
        let response = try await client.put(ApiPaths.backendPath("/record"), body: body)
        return response as? PlusApiResultPlusInvokeRecordVO
    }

    /// Create a new invocation record
    public func create(body: PlusInvokeRecordForm) async throws -> PlusApiResultPlusInvokeRecordVO? {
        let response = try await client.post(ApiPaths.backendPath("/record"), body: body)
        return response as? PlusApiResultPlusInvokeRecordVO
    }

    /// Get invocation records by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusInvokeRecordVO? {
        let response = try await client.post(ApiPaths.backendPath("/record/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusInvokeRecordVO
    }

    /// Get all invocation records
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusInvokeRecordVO? {
        let response = try await client.post(ApiPaths.backendPath("/record/list/all"), body: body)
        return response as? PlusApiResultListPlusInvokeRecordVO
    }

    /// Get an invocation record by ID
    public func getById(id: String) async throws -> PlusApiResultPlusInvokeRecordVO? {
        let response = try await client.get(ApiPaths.backendPath("/record/\(id)"))
        return response as? PlusApiResultPlusInvokeRecordVO
    }

    /// Delete an invocation record
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/record/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
