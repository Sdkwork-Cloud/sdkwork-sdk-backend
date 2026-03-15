import Foundation

public class SystemApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Apply invoice
    public func apply(body: PlusSystemInvoiceApplyForm) async throws -> PlusApiResultPlusSystemInvoiceVO? {
        let response = try await client.post(ApiPaths.backendPath("/system/invoice/apply"), body: body)
        return response as? PlusApiResultPlusSystemInvoiceVO
    }

    /// Query invoice page
    public func listByPage(params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusSystemInvoiceVO? {
        let response = try await client.get(ApiPaths.backendPath("/system/invoice/page"), params: params)
        return response as? PlusApiResultPagePlusSystemInvoiceVO
    }
}
