import Foundation

public class MemberLevelApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing member level
    public func update(body: PlusMemberLevelForm) async throws -> PlusApiResultPlusMemberLevelVO? {
        let response = try await client.put(ApiPaths.backendPath("/member/level"), body: body)
        return response as? PlusApiResultPlusMemberLevelVO
    }

    /// Create a new member level
    public func create(body: PlusMemberLevelForm) async throws -> PlusApiResultPlusMemberLevelVO? {
        let response = try await client.post(ApiPaths.backendPath("/member/level"), body: body)
        return response as? PlusApiResultPlusMemberLevelVO
    }

    /// Get member levels by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusMemberLevelVO? {
        let response = try await client.post(ApiPaths.backendPath("/member/level/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusMemberLevelVO
    }

    /// Get all member levels
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusMemberLevelVO? {
        let response = try await client.post(ApiPaths.backendPath("/member/level/list/all"), body: body)
        return response as? PlusApiResultListPlusMemberLevelVO
    }

    /// Get a member level by ID
    public func getById(id: String) async throws -> PlusApiResultPlusMemberLevelVO? {
        let response = try await client.get(ApiPaths.backendPath("/member/level/\(id)"))
        return response as? PlusApiResultPlusMemberLevelVO
    }

    /// Delete a member level
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/member/level/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
