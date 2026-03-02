import Foundation

public class VerificationApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Verify phone
    public func verifyPhone(body: PhoneVerificationForm) async throws -> PlusApiResultVerificationVO? {
        let response = try await client.post(ApiPaths.backendPath("/auth/verification/verify_phone"), body: body)
        return response as? PlusApiResultVerificationVO
    }

    /// Verify email
    public func verifyEmail(body: EmailVerificationForm) async throws -> PlusApiResultVerificationVO? {
        let response = try await client.post(ApiPaths.backendPath("/auth/verification/verify_email"), body: body)
        return response as? PlusApiResultVerificationVO
    }

    /// Send verification code
    public func sendVerificationCode(body: SendVerificationCodeForm) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.backendPath("/auth/verification/send_code"), body: body)
        return response as? PlusApiResultBoolean
    }
}
