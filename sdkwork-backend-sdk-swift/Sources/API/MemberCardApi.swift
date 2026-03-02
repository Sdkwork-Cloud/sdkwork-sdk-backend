import Foundation

public class MemberCardApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing member card
    public func update(body: PlusMemberCardForm) async throws -> PlusApiResultPlusMemberCardVO? {
        let response = try await client.put(ApiPaths.backendPath("/member/card"), body: body)
        return response as? PlusApiResultPlusMemberCardVO
    }

    /// Create a new member card
    public func create(body: PlusMemberCardForm) async throws -> PlusApiResultPlusMemberCardVO? {
        let response = try await client.post(ApiPaths.backendPath("/member/card"), body: body)
        return response as? PlusApiResultPlusMemberCardVO
    }

    /// Get member cards by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusMemberCardVO? {
        let response = try await client.post(ApiPaths.backendPath("/member/card/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusMemberCardVO
    }

    /// Get all member cards
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusMemberCardVO? {
        let response = try await client.post(ApiPaths.backendPath("/member/card/list/all"), body: body)
        return response as? PlusApiResultListPlusMemberCardVO
    }

    /// Get a member card by ID
    public func getById(id: String) async throws -> PlusApiResultPlusMemberCardVO? {
        let response = try await client.get(ApiPaths.backendPath("/member/card/\(id)"))
        return response as? PlusApiResultPlusMemberCardVO
    }

    /// Delete a member card
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/member/card/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
