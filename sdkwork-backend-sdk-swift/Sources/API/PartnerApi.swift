import Foundation

public class PartnerApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update a partner
    public func update(body: PlusPartnerForm) async throws -> PlusApiResultPlusPartnerVO? {
        let response = try await client.put(ApiPaths.backendPath("/partner"), body: body)
        return response as? PlusApiResultPlusPartnerVO
    }

    /// Create a new partner
    public func create(body: PlusPartnerForm) async throws -> PlusApiResultPlusPartnerVO? {
        let response = try await client.post(ApiPaths.backendPath("/partner"), body: body)
        return response as? PlusApiResultPlusPartnerVO
    }

    /// Get partners by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusPartnerVO? {
        let response = try await client.post(ApiPaths.backendPath("/partner/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusPartnerVO
    }

    /// Get all partners
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusPartnerVO? {
        let response = try await client.post(ApiPaths.backendPath("/partner/list/all"), body: body)
        return response as? PlusApiResultListPlusPartnerVO
    }

    /// Get a partner by ID
    public func getById(id: String) async throws -> PlusApiResultPlusPartnerVO? {
        let response = try await client.get(ApiPaths.backendPath("/partner/\(id)"))
        return response as? PlusApiResultPlusPartnerVO
    }

    /// Delete a partner
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/partner/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
