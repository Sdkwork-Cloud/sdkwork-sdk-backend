import '../http/client.dart';
import '../models.dart';

class NetApi {
  final HttpClient _client;
  
  NetApi(this._client);

  /// 更新域名
  Future<PlusApiResultPlusHostDomainVO?> update(PlusHostDomainForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/net/host/domain'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusHostDomainVO ? response : null;
  }

  /// 创建域名
  Future<PlusApiResultPlusHostDomainVO?> create(PlusHostDomainForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/net/host/domain'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusHostDomainVO ? response : null;
  }

  /// Update an existing DNS record
  Future<PlusApiResultPlusDnsRecordVO?> updateRecord(PlusDnsRecordForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/net/dns/record'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusDnsRecordVO ? response : null;
  }

  /// Create a new DNS record
  Future<PlusApiResultPlusDnsRecordVO?> createRecord(PlusDnsRecordForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/net/dns/record'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusDnsRecordVO ? response : null;
  }

  /// 分页获取域名
  Future<PlusApiResultPagePlusHostDomainVO?> createListByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/net/host/domain/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusHostDomainVO ? response : null;
  }

  /// 获取所有域名
  Future<PlusApiResultListPlusHostDomainVO?> createListAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/net/host/domain/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusHostDomainVO ? response : null;
  }

  /// Get DNS records by page
  Future<PlusApiResultPagePlusDnsRecordVO?> createListByPageRecord(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/net/dns/record/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusDnsRecordVO ? response : null;
  }

  /// Get all DNS records
  Future<PlusApiResultListPlusDnsRecordVO?> createListAllEntitiesRecord(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/net/dns/record/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusDnsRecordVO ? response : null;
  }

  /// 获取域名详情
  Future<PlusApiResultPlusHostDomainVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/net/host/domain/${id}'));
    return response is PlusApiResultPlusHostDomainVO ? response : null;
  }

  /// 删除域名
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/net/host/domain/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get a DNS record by ID
  Future<PlusApiResultPlusDnsRecordVO?> getByIdRecord(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/net/dns/record/${id}'));
    return response is PlusApiResultPlusDnsRecordVO ? response : null;
  }

  /// Delete a DNS record
  Future<PlusApiResultBoolean?> deleteRecord(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/net/dns/record/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
