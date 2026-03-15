import Foundation

public class ModelApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update existing AI model information
    public func update(body: PlusAiModelInfoForm) async throws -> PlusApiResultPlusAiModelInfoVO? {
        let response = try await client.put(ApiPaths.backendPath("/model"), body: body)
        return response as? PlusApiResultPlusAiModelInfoVO
    }

    /// Create a new AI model information
    public func create(body: PlusAiModelInfoForm) async throws -> PlusApiResultPlusAiModelInfoVO? {
        let response = try await client.post(ApiPaths.backendPath("/model"), body: body)
        return response as? PlusApiResultPlusAiModelInfoVO
    }

    /// Update an existing AI model price
    public func updatePrice(body: PlusAiModelPriceForm) async throws -> PlusApiResultPlusAiModelPriceVO? {
        let response = try await client.put(ApiPaths.backendPath("/model/price"), body: body)
        return response as? PlusApiResultPlusAiModelPriceVO
    }

    /// Create a new AI model price
    public func createPrice(body: PlusAiModelPriceForm) async throws -> PlusApiResultPlusAiModelPriceVO? {
        let response = try await client.post(ApiPaths.backendPath("/model/price"), body: body)
        return response as? PlusApiResultPlusAiModelPriceVO
    }

    /// Get AI model prices by page
    public func createListByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAiModelPriceVO? {
        let response = try await client.post(ApiPaths.backendPath("/model/price/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusAiModelPriceVO
    }

    /// Get all AI model prices
    public func createListAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusAiModelPriceVO? {
        let response = try await client.post(ApiPaths.backendPath("/model/price/list/all"), body: body)
        return response as? PlusApiResultListPlusAiModelPriceVO
    }

    /// Get AI model information by page
    public func createListByPageModel(body: PlusAiModelInfoQueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAiModelInfoVO? {
        let response = try await client.post(ApiPaths.backendPath("/model/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusAiModelInfoVO
    }

    /// Get all AI model information
    public func createListAllEntitiesModel(body: PlusAiModelInfoQueryListForm? = nil) async throws -> PlusApiResultListPlusAiModelInfoVO? {
        let response = try await client.post(ApiPaths.backendPath("/model/list/all"), body: body)
        return response as? PlusApiResultListPlusAiModelInfoVO
    }

    /// Get AI model information by ID
    public func getById(id: String) async throws -> PlusApiResultPlusAiModelInfoVO? {
        let response = try await client.get(ApiPaths.backendPath("/model/\(id)"))
        return response as? PlusApiResultPlusAiModelInfoVO
    }

    /// Delete AI model information
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/model/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get an AI model price by ID
    public func getByIdPrice(id: String) async throws -> PlusApiResultPlusAiModelPriceVO? {
        let response = try await client.get(ApiPaths.backendPath("/model/price/\(id)"))
        return response as? PlusApiResultPlusAiModelPriceVO
    }

    /// Delete an AI model price
    public func deletePrice(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/model/price/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
