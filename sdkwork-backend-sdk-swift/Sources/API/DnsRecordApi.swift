import Foundation

public class DnsRecordApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing DNS record
    public func update(body: PlusDnsRecordForm) async throws -> PlusApiResultPlusDnsRecordVO? {
        let response = try await client.put(ApiPaths.backendPath("/net/dns/record"), body: body)
        return response as? PlusApiResultPlusDnsRecordVO
    }

    /// Create a new DNS record
    public func create(body: PlusDnsRecordForm) async throws -> PlusApiResultPlusDnsRecordVO? {
        let response = try await client.post(ApiPaths.backendPath("/net/dns/record"), body: body)
        return response as? PlusApiResultPlusDnsRecordVO
    }

    /// Get DNS records by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusDnsRecordVO? {
        let response = try await client.post(ApiPaths.backendPath("/net/dns/record/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusDnsRecordVO
    }

    /// Get all DNS records
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusDnsRecordVO? {
        let response = try await client.post(ApiPaths.backendPath("/net/dns/record/list/all"), body: body)
        return response as? PlusApiResultListPlusDnsRecordVO
    }

    /// Get a DNS record by ID
    public func getById(id: String) async throws -> PlusApiResultPlusDnsRecordVO? {
        let response = try await client.get(ApiPaths.backendPath("/net/dns/record/\(id)"))
        return response as? PlusApiResultPlusDnsRecordVO
    }

    /// Delete a DNS record
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/net/dns/record/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
