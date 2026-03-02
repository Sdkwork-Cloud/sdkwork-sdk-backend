import Foundation

public class DiskMemberApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing disk member
    public func update(body: PlusDiskMemberForm) async throws -> PlusApiResultPlusDiskMemberVO? {
        let response = try await client.put(ApiPaths.backendPath("/disk/member"), body: body)
        return response as? PlusApiResultPlusDiskMemberVO
    }

    /// Create a new disk member
    public func create(body: PlusDiskMemberForm) async throws -> PlusApiResultPlusDiskMemberVO? {
        let response = try await client.post(ApiPaths.backendPath("/disk/member"), body: body)
        return response as? PlusApiResultPlusDiskMemberVO
    }

    /// Get disk members by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusDiskMemberVO? {
        let response = try await client.post(ApiPaths.backendPath("/disk/member/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusDiskMemberVO
    }

    /// Get all disk members
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusDiskMemberVO? {
        let response = try await client.post(ApiPaths.backendPath("/disk/member/list/all"), body: body)
        return response as? PlusApiResultListPlusDiskMemberVO
    }

    /// Get a disk member by ID
    public func getById(id: String) async throws -> PlusApiResultPlusDiskMemberVO? {
        let response = try await client.get(ApiPaths.backendPath("/disk/member/\(id)"))
        return response as? PlusApiResultPlusDiskMemberVO
    }

    /// Delete a disk member
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/disk/member/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
