import '../http/client.dart';
import '../models.dart';

class DnsRecordApi {
  final HttpClient _client;
  
  DnsRecordApi(this._client);

  /// Update an existing DNS record
  Future<PlusApiResultPlusDnsRecordVO?> update(PlusDnsRecordForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/net/dns/record'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusDnsRecordVO ? response : null;
  }

  /// Create a new DNS record
  Future<PlusApiResultPlusDnsRecordVO?> create(PlusDnsRecordForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/net/dns/record'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusDnsRecordVO ? response : null;
  }

  /// Get DNS records by page
  Future<PlusApiResultPagePlusDnsRecordVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/net/dns/record/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusDnsRecordVO ? response : null;
  }

  /// Get all DNS records
  Future<PlusApiResultListPlusDnsRecordVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/net/dns/record/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusDnsRecordVO ? response : null;
  }

  /// Get a DNS record by ID
  Future<PlusApiResultPlusDnsRecordVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/net/dns/record/${id}'));
    return response is PlusApiResultPlusDnsRecordVO ? response : null;
  }

  /// Delete a DNS record
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/net/dns/record/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
