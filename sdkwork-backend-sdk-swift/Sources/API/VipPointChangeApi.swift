import Foundation

public class VipPointChangeApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing VIP point change record
    public func update(body: PlusVipPointChangeForm) async throws -> PlusApiResultPlusVipPointChangeVO? {
        let response = try await client.put(ApiPaths.backendPath("/vip/point/change"), body: body)
        return response as? PlusApiResultPlusVipPointChangeVO
    }

    /// Create a new VIP point change record
    public func create(body: PlusVipPointChangeForm) async throws -> PlusApiResultPlusVipPointChangeVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/point/change"), body: body)
        return response as? PlusApiResultPlusVipPointChangeVO
    }

    /// Get VIP point change records by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusVipPointChangeVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/point/change/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusVipPointChangeVO
    }

    /// Get all VIP point change records
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusVipPointChangeVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/point/change/list/all"), body: body)
        return response as? PlusApiResultListPlusVipPointChangeVO
    }

    /// Get a VIP point change record by ID
    public func getById(id: String) async throws -> PlusApiResultPlusVipPointChangeVO? {
        let response = try await client.get(ApiPaths.backendPath("/vip/point/change/\(id)"))
        return response as? PlusApiResultPlusVipPointChangeVO
    }

    /// Delete a VIP point change record
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/vip/point/change/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
