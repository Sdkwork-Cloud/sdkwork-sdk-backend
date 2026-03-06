import Foundation

public class ModelPriceApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing AI model price
    public func update(body: PlusAiModelPriceForm) async throws -> PlusApiResultPlusAiModelPriceVO? {
        let response = try await client.put(ApiPaths.backendPath("/model/price"), body: body)
        return response as? PlusApiResultPlusAiModelPriceVO
    }

    /// Create a new AI model price
    public func create(body: PlusAiModelPriceForm) async throws -> PlusApiResultPlusAiModelPriceVO? {
        let response = try await client.post(ApiPaths.backendPath("/model/price"), body: body)
        return response as? PlusApiResultPlusAiModelPriceVO
    }

    /// Get AI model prices by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAiModelPriceVO? {
        let response = try await client.post(ApiPaths.backendPath("/model/price/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusAiModelPriceVO
    }

    /// Get all AI model prices
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusAiModelPriceVO? {
        let response = try await client.post(ApiPaths.backendPath("/model/price/list/all"), body: body)
        return response as? PlusApiResultListPlusAiModelPriceVO
    }

    /// Get an AI model price by ID
    public func getById(id: String) async throws -> PlusApiResultPlusAiModelPriceVO? {
        let response = try await client.get(ApiPaths.backendPath("/model/price/\(id)"))
        return response as? PlusApiResultPlusAiModelPriceVO
    }

    /// Delete an AI model price
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/model/price/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
