import Foundation

public class NetApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 更新域名
    public func update(body: PlusHostDomainForm) async throws -> PlusApiResultPlusHostDomainVO? {
        let response = try await client.put(ApiPaths.backendPath("/net/host/domain"), body: body)
        return response as? PlusApiResultPlusHostDomainVO
    }

    /// 创建域名
    public func create(body: PlusHostDomainForm) async throws -> PlusApiResultPlusHostDomainVO? {
        let response = try await client.post(ApiPaths.backendPath("/net/host/domain"), body: body)
        return response as? PlusApiResultPlusHostDomainVO
    }

    /// Update an existing DNS record
    public func updateRecord(body: PlusDnsRecordForm) async throws -> PlusApiResultPlusDnsRecordVO? {
        let response = try await client.put(ApiPaths.backendPath("/net/dns/record"), body: body)
        return response as? PlusApiResultPlusDnsRecordVO
    }

    /// Create a new DNS record
    public func createRecord(body: PlusDnsRecordForm) async throws -> PlusApiResultPlusDnsRecordVO? {
        let response = try await client.post(ApiPaths.backendPath("/net/dns/record"), body: body)
        return response as? PlusApiResultPlusDnsRecordVO
    }

    /// 分页获取域名
    public func createListByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusHostDomainVO? {
        let response = try await client.post(ApiPaths.backendPath("/net/host/domain/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusHostDomainVO
    }

    /// 获取所有域名
    public func createListAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusHostDomainVO? {
        let response = try await client.post(ApiPaths.backendPath("/net/host/domain/list/all"), body: body)
        return response as? PlusApiResultListPlusHostDomainVO
    }

    /// Get DNS records by page
    public func createListByPageRecord(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusDnsRecordVO? {
        let response = try await client.post(ApiPaths.backendPath("/net/dns/record/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusDnsRecordVO
    }

    /// Get all DNS records
    public func createListAllEntitiesRecord(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusDnsRecordVO? {
        let response = try await client.post(ApiPaths.backendPath("/net/dns/record/list/all"), body: body)
        return response as? PlusApiResultListPlusDnsRecordVO
    }

    /// 获取域名详情
    public func getById(id: String) async throws -> PlusApiResultPlusHostDomainVO? {
        let response = try await client.get(ApiPaths.backendPath("/net/host/domain/\(id)"))
        return response as? PlusApiResultPlusHostDomainVO
    }

    /// 删除域名
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/net/host/domain/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get a DNS record by ID
    public func getByIdRecord(id: String) async throws -> PlusApiResultPlusDnsRecordVO? {
        let response = try await client.get(ApiPaths.backendPath("/net/dns/record/\(id)"))
        return response as? PlusApiResultPlusDnsRecordVO
    }

    /// Delete a DNS record
    public func deleteRecord(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/net/dns/record/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
