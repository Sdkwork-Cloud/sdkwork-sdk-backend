import '../http/client.dart';
import '../models.dart';

class VerificationApi {
  final HttpClient _client;
  
  VerificationApi(this._client);

  /// Verify phone
  Future<PlusApiResultVerificationVO?> verifyPhone(PhoneVerificationForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/verification/verify_phone'), body: body, contentType: 'application/json');
    return response is PlusApiResultVerificationVO ? response : null;
  }

  /// Verify email
  Future<PlusApiResultVerificationVO?> verifyEmail(EmailVerificationForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/verification/verify_email'), body: body, contentType: 'application/json');
    return response is PlusApiResultVerificationVO ? response : null;
  }

  /// Send verification code
  Future<PlusApiResultBoolean?> sendVerificationCode(SendVerificationCodeForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/verification/send_code'), body: body, contentType: 'application/json');
    return response is PlusApiResultBoolean ? response : null;
  }
}
