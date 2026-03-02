import Foundation

public class AiCategoryApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing category
    public func update(body: PlusCategoryForm) async throws -> PlusApiResultPlusCategoryVO? {
        let response = try await client.put(ApiPaths.backendPath("/category"), body: body)
        return response as? PlusApiResultPlusCategoryVO
    }

    /// Create a new category
    public func create(body: PlusCategoryForm) async throws -> PlusApiResultPlusCategoryVO? {
        let response = try await client.post(ApiPaths.backendPath("/category"), body: body)
        return response as? PlusApiResultPlusCategoryVO
    }

    /// Get categories by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusCategoryVO? {
        let response = try await client.post(ApiPaths.backendPath("/category/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusCategoryVO
    }

    /// Get all categories
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusCategoryVO? {
        let response = try await client.post(ApiPaths.backendPath("/category/list/all"), body: body)
        return response as? PlusApiResultListPlusCategoryVO
    }

    /// Get Tree
    public func getTree(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultSetPlusTreeNodePlusCategoryVO? {
        let response = try await client.post(ApiPaths.backendPath("/category/get_tree"), body: body, params: params)
        return response as? PlusApiResultSetPlusTreeNodePlusCategoryVO
    }

    /// Get a category by ID
    public func getById(id: String) async throws -> PlusApiResultPlusCategoryVO? {
        let response = try await client.get(ApiPaths.backendPath("/category/\(id)"))
        return response as? PlusApiResultPlusCategoryVO
    }

    /// Delete a category
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/category/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
