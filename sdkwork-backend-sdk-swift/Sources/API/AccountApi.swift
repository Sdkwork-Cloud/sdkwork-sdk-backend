import Foundation

public class AccountApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing account
    public func update(body: PlusAccountForm) async throws -> PlusApiResultPlusAccountVO? {
        let response = try await client.put(ApiPaths.backendPath("/account"), body: body)
        return response as? PlusApiResultPlusAccountVO
    }

    /// Create a new account
    public func create(body: PlusAccountForm) async throws -> PlusApiResultPlusAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/account"), body: body)
        return response as? PlusApiResultPlusAccountVO
    }

    /// Update an existing account history record
    public func updateHistory(body: PlusAccountHistoryForm) async throws -> PlusApiResultPlusAccountHistoryVO? {
        let response = try await client.put(ApiPaths.backendPath("/account/history"), body: body)
        return response as? PlusApiResultPlusAccountHistoryVO
    }

    /// Create a new account history record
    public func createHistory(body: PlusAccountHistoryForm) async throws -> PlusApiResultPlusAccountHistoryVO? {
        let response = try await client.post(ApiPaths.backendPath("/account/history"), body: body)
        return response as? PlusApiResultPlusAccountHistoryVO
    }

    /// Get points-to-cash rate
    public func getPointsToCashRate() async throws -> PlusApiResultAccountExchangeRateVO? {
        let response = try await client.get(ApiPaths.backendPath("/account/exchange-config/points-cash-rate"))
        return response as? PlusApiResultAccountExchangeRateVO
    }

    /// Update points-to-cash rate
    public func updatePointsToCashRate(body: AccountExchangeRateUpdateForm) async throws -> PlusApiResultAccountExchangeRateVO? {
        let response = try await client.put(ApiPaths.backendPath("/account/exchange-config/points-cash-rate"), body: body)
        return response as? PlusApiResultAccountExchangeRateVO
    }

    /// Get accounts by page
    public func createListByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/account/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusAccountVO
    }

    /// Get all accounts
    public func createListAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/account/list/all"), body: body)
        return response as? PlusApiResultListPlusAccountVO
    }

    /// Get account history records by page
    public func createListByPageHistory(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAccountHistoryVO? {
        let response = try await client.post(ApiPaths.backendPath("/account/history/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusAccountHistoryVO
    }

    /// Get all account history records
    public func createListAllEntitiesHistory(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusAccountHistoryVO? {
        let response = try await client.post(ApiPaths.backendPath("/account/history/list/all"), body: body)
        return response as? PlusApiResultListPlusAccountHistoryVO
    }

    /// Get points account
    public func getPoints(body: PlusGetAccountForm) async throws -> PlusApiResultPlusAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/account/get_points"), body: body)
        return response as? PlusApiResultPlusAccountVO
    }

    /// Get cash account
    public func getCash(body: PlusGetAccountForm) async throws -> PlusApiResultPlusAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/account/get_cash"), body: body)
        return response as? PlusApiResultPlusAccountVO
    }

    /// Get an account by ID
    public func getById(id: String) async throws -> PlusApiResultPlusAccountVO? {
        let response = try await client.get(ApiPaths.backendPath("/account/\(id)"))
        return response as? PlusApiResultPlusAccountVO
    }

    /// Delete an account
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/account/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get an account history record by ID
    public func getByIdHistory(id: String) async throws -> PlusApiResultPlusAccountHistoryVO? {
        let response = try await client.get(ApiPaths.backendPath("/account/history/\(id)"))
        return response as? PlusApiResultPlusAccountHistoryVO
    }

    /// Delete an account history record
    public func deleteHistory(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/account/history/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
