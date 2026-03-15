import Foundation

public class SecurityApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    public func update(body: PlusApiSecurityPolicyForm) async throws -> PlusApiResultPlusApiSecurityPolicyVO? {
        let response = try await client.put(ApiPaths.backendPath("/security/policy"), body: body)
        return response as? PlusApiResultPlusApiSecurityPolicyVO
    }

    public func create(body: PlusApiSecurityPolicyForm) async throws -> PlusApiResultPlusApiSecurityPolicyVO? {
        let response = try await client.post(ApiPaths.backendPath("/security/policy"), body: body)
        return response as? PlusApiResultPlusApiSecurityPolicyVO
    }

    /// List policies by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusApiSecurityPolicyVO? {
        let response = try await client.post(ApiPaths.backendPath("/security/policy/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusApiSecurityPolicyVO
    }

    /// List all policies
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusApiSecurityPolicyVO? {
        let response = try await client.post(ApiPaths.backendPath("/security/policy/list/all"), body: body)
        return response as? PlusApiResultListPlusApiSecurityPolicyVO
    }

    public func getById(id: String) async throws -> PlusApiResultPlusApiSecurityPolicyVO? {
        let response = try await client.get(ApiPaths.backendPath("/security/policy/\(id)"))
        return response as? PlusApiResultPlusApiSecurityPolicyVO
    }

    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/security/policy/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
