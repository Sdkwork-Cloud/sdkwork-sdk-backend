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

    /// 分页获取分享
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusShareVO? {
        let response = try await client.post(ApiPaths.backendPath("/share/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusShareVO
    }

    /// 获取所有分享
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusShareVO? {
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
}
