import Foundation

public class MemberRelationsApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update member relation
    public func update(body: PlusMemberRelationsForm) async throws -> PlusApiResultPlusMemberRelationsVO? {
        let response = try await client.put(ApiPaths.backendPath("/organization/member-relations"), body: body)
        return response as? PlusApiResultPlusMemberRelationsVO
    }

    /// Create member relation
    public func create(body: PlusMemberRelationsForm) async throws -> PlusApiResultPlusMemberRelationsVO? {
        let response = try await client.post(ApiPaths.backendPath("/organization/member-relations"), body: body)
        return response as? PlusApiResultPlusMemberRelationsVO
    }

    /// Get member relations by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusMemberRelationsVO? {
        let response = try await client.post(ApiPaths.backendPath("/organization/member-relations/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusMemberRelationsVO
    }

    /// Get all member relations
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusMemberRelationsVO? {
        let response = try await client.post(ApiPaths.backendPath("/organization/member-relations/list/all"), body: body)
        return response as? PlusApiResultListPlusMemberRelationsVO
    }

    /// Get member relation by ID
    public func getById(id: String) async throws -> PlusApiResultPlusMemberRelationsVO? {
        let response = try await client.get(ApiPaths.backendPath("/organization/member-relations/\(id)"))
        return response as? PlusApiResultPlusMemberRelationsVO
    }

    /// Delete member relation
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/organization/member-relations/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
