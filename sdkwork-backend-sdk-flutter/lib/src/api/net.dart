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

  /// 分页获取域名
  Future<PlusApiResultPagePlusHostDomainVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/net/host/domain/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusHostDomainVO ? response : null;
  }

  /// 获取所有域名
  Future<PlusApiResultListPlusHostDomainVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/net/host/domain/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusHostDomainVO ? response : null;
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
}
