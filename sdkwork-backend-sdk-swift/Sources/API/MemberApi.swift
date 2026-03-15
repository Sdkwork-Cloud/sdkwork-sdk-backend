import Foundation

public class MemberApi {
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

    /// Update an existing member card
    public func updateCard(body: PlusMemberCardForm) async throws -> PlusApiResultPlusMemberCardVO? {
        let response = try await client.put(ApiPaths.backendPath("/member/card"), body: body)
        return response as? PlusApiResultPlusMemberCardVO
    }

    /// Create a new member card
    public func createCard(body: PlusMemberCardForm) async throws -> PlusApiResultPlusMemberCardVO? {
        let response = try await client.post(ApiPaths.backendPath("/member/card"), body: body)
        return response as? PlusApiResultPlusMemberCardVO
    }

    /// Get member levels by page
    public func createListByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusMemberLevelVO? {
        let response = try await client.post(ApiPaths.backendPath("/member/level/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusMemberLevelVO
    }

    /// Get all member levels
    public func createListAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusMemberLevelVO? {
        let response = try await client.post(ApiPaths.backendPath("/member/level/list/all"), body: body)
        return response as? PlusApiResultListPlusMemberLevelVO
    }

    /// Get member cards by page
    public func createListByPageCard(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusMemberCardVO? {
        let response = try await client.post(ApiPaths.backendPath("/member/card/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusMemberCardVO
    }

    /// Get all member cards
    public func createListAllEntitiesCard(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusMemberCardVO? {
        let response = try await client.post(ApiPaths.backendPath("/member/card/list/all"), body: body)
        return response as? PlusApiResultListPlusMemberCardVO
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

    /// Get a member card by ID
    public func getByIdCard(id: String) async throws -> PlusApiResultPlusMemberCardVO? {
        let response = try await client.get(ApiPaths.backendPath("/member/card/\(id)"))
        return response as? PlusApiResultPlusMemberCardVO
    }

    /// Delete a member card
    public func deleteCard(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/member/card/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
