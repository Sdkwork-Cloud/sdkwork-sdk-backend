import '../http/client.dart';
import '../models.dart';

class RefundApi {
  final HttpClient _client;
  
  RefundApi(this._client);

  /// Update an existing refund record
  Future<PlusApiResultPlusRefundVO?> update(PlusRefundForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/trade/refund'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusRefundVO ? response : null;
  }

  /// Create a new refund record
  Future<PlusApiResultPlusRefundVO?> create(PlusRefundForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/refund'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusRefundVO ? response : null;
  }

  /// Get refund records by page
  Future<PlusApiResultPagePlusRefundVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/refund/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusRefundVO ? response : null;
  }

  /// Get all refund records
  Future<PlusApiResultListPlusRefundVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/refund/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusRefundVO ? response : null;
  }

  /// Get a refund record by ID
  Future<PlusApiResultPlusRefundVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/trade/refund/${id}'));
    return response is PlusApiResultPlusRefundVO ? response : null;
  }

  /// Delete a refund record
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/trade/refund/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
