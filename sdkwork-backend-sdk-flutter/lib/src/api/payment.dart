import '../http/client.dart';
import '../models.dart';

class PaymentApi {
  final HttpClient _client;
  
  PaymentApi(this._client);

  /// Update an existing payment record
  Future<PlusApiResultPlusPaymentVO?> update(PlusPaymentForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/trade/payment'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusPaymentVO ? response : null;
  }

  /// Create a new payment record
  Future<PlusApiResultPlusPaymentVO?> create(PlusPaymentForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/payment'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusPaymentVO ? response : null;
  }

  /// Check payment status
  Future<PlusApiResultBoolean?> checkPaymentStatus(PlusPaymentStatusQueryForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/payment/status'), body: body, contentType: 'application/json');
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Refund payment
  Future<PlusApiResultBoolean?> refund(PlusRefundForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/payment/refund'), body: body, contentType: 'application/json');
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get payment records by page
  Future<PlusApiResultPagePlusPaymentVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/payment/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusPaymentVO ? response : null;
  }

  /// Get all payment records
  Future<PlusApiResultListPlusPaymentVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/payment/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusPaymentVO ? response : null;
  }

  /// Cancel payment
  Future<PlusApiResultBoolean?> cancel(PlusPaymentCancelForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/payment/cancel'), body: body, contentType: 'application/json');
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get a payment record by ID
  Future<PlusApiResultPlusPaymentVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/trade/payment/${id}'));
    return response is PlusApiResultPlusPaymentVO ? response : null;
  }

  /// Delete a payment record
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/trade/payment/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
