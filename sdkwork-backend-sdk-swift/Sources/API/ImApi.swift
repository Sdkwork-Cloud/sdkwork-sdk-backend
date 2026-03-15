import Foundation

public class ImApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing chat group
    public func update(body: PlusImGroupForm) async throws -> PlusApiResultPlusImGroupVO? {
        let response = try await client.put(ApiPaths.backendPath("/im/group"), body: body)
        return response as? PlusApiResultPlusImGroupVO
    }

    /// Create a new chat group
    public func create(body: PlusImGroupForm) async throws -> PlusApiResultPlusImGroupVO? {
        let response = try await client.post(ApiPaths.backendPath("/im/group"), body: body)
        return response as? PlusApiResultPlusImGroupVO
    }

    /// Mark conversation messages as read
    public func markRead(body: PlusImMessageMarkReadForm) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.backendPath("/im/message/mark_read"), body: body)
        return response as? PlusApiResultBoolean
    }

    /// Get messages by page
    public func createListByPage(body: PlusImMessageQueryForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusMessage? {
        let response = try await client.post(ApiPaths.backendPath("/im/message/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusMessage
    }

    /// Get chat groups by page
    public func createListByPageGroup(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusImGroupVO? {
        let response = try await client.post(ApiPaths.backendPath("/im/group/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusImGroupVO
    }

    /// Get all chat groups
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusImGroupVO? {
        let response = try await client.post(ApiPaths.backendPath("/im/group/list/all"), body: body)
        return response as? PlusApiResultListPlusImGroupVO
    }

    /// Get a chat group by ID
    public func getById(id: String) async throws -> PlusApiResultPlusImGroupVO? {
        let response = try await client.get(ApiPaths.backendPath("/im/group/\(id)"))
        return response as? PlusApiResultPlusImGroupVO
    }

    /// Delete a chat group
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/im/group/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
