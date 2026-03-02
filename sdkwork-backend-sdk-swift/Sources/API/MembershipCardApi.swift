import Foundation

public class MembershipCardApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing membership card
    public func update(body: PlusCardForm) async throws -> PlusApiResultPlusCardVO? {
        let response = try await client.put(ApiPaths.backendPath("/card"), body: body)
        return response as? PlusApiResultPlusCardVO
    }

    /// Create a new membership card
    public func create(body: PlusCardForm) async throws -> PlusApiResultPlusCardVO? {
        let response = try await client.post(ApiPaths.backendPath("/card"), body: body)
        return response as? PlusApiResultPlusCardVO
    }

    /// Get membership cards by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusCardVO? {
        let response = try await client.post(ApiPaths.backendPath("/card/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusCardVO
    }

    /// Get all membership cards
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusCardVO? {
        let response = try await client.post(ApiPaths.backendPath("/card/list/all"), body: body)
        return response as? PlusApiResultListPlusCardVO
    }

    /// Get a membership card by ID
    public func getById(id: String) async throws -> PlusApiResultPlusCardVO? {
        let response = try await client.get(ApiPaths.backendPath("/card/\(id)"))
        return response as? PlusApiResultPlusCardVO
    }

    /// Delete a membership card
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/card/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
