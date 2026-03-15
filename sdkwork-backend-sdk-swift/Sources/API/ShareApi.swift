import Foundation

public class ShareApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 更新分享
    public func update(body: PlusShareForm) async throws -> PlusApiResultPlusShareVO? {
        let response = try await client.put(ApiPaths.backendPath("/share"), body: body)
        return response as? PlusApiResultPlusShareVO
    }

    /// 创建分享
    public func create(body: PlusShareForm) async throws -> PlusApiResultPlusShareVO? {
        let response = try await client.post(ApiPaths.backendPath("/share"), body: body)
        return response as? PlusApiResultPlusShareVO
    }

    /// Update visit record
    public func updateVisitRecord(body: PlusShareVisitRecordForm) async throws -> PlusApiResultPlusShareVisitRecordVO? {
        let response = try await client.put(ApiPaths.backendPath("/share/visit_record"), body: body)
        return response as? PlusApiResultPlusShareVisitRecordVO
    }

    /// Create visit record
    public func createVisitRecord(body: PlusShareVisitRecordForm) async throws -> PlusApiResultPlusShareVisitRecordVO? {
        let response = try await client.post(ApiPaths.backendPath("/share/visit_record"), body: body)
        return response as? PlusApiResultPlusShareVisitRecordVO
    }

    /// Get visit records by page
    public func createListByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusShareVisitRecordVO? {
        let response = try await client.post(ApiPaths.backendPath("/share/visit_record/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusShareVisitRecordVO
    }

    /// Get all visit records
    public func createListAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusShareVisitRecordVO? {
        let response = try await client.post(ApiPaths.backendPath("/share/visit_record/list/all"), body: body)
        return response as? PlusApiResultListPlusShareVisitRecordVO
    }

    /// 分页获取分享
    public func createListByPageShare(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusShareVO? {
        let response = try await client.post(ApiPaths.backendPath("/share/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusShareVO
    }

    /// 获取所有分享
    public func createListAllEntitiesShare(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusShareVO? {
        let response = try await client.post(ApiPaths.backendPath("/share/list/all"), body: body)
        return response as? PlusApiResultListPlusShareVO
    }

    /// 获取分享详情
    public func getById(id: String) async throws -> PlusApiResultPlusShareVO? {
        let response = try await client.get(ApiPaths.backendPath("/share/\(id)"))
        return response as? PlusApiResultPlusShareVO
    }

    /// 删除分享
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/share/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get visit record by ID
    public func getByIdVisitRecord(id: String) async throws -> PlusApiResultPlusShareVisitRecordVO? {
        let response = try await client.get(ApiPaths.backendPath("/share/visit_record/\(id)"))
        return response as? PlusApiResultPlusShareVisitRecordVO
    }

    /// Delete visit record
    public func deleteVisitRecord(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/share/visit_record/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
