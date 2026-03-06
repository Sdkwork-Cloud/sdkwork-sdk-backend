import Foundation

public class AccountExchangeConfigApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
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
}
