import '../http/client.dart';
import '../models.dart';

class ShardingApi {
  final HttpClient _client;
  
  ShardingApi(this._client);

  /// Update Sharding Key
  Future<PlusApiResultPlusShardingKeyVO?> update(PlusShardingKeyForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/sharding/key'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusShardingKeyVO ? response : null;
  }

  /// Create Sharding Key
  Future<PlusApiResultPlusShardingKeyVO?> create(PlusShardingKeyForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/sharding/key'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusShardingKeyVO ? response : null;
  }

  /// List Sharding Keys by Page
  Future<PlusApiResultPagePlusShardingKeyVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/sharding/key/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusShardingKeyVO ? response : null;
  }

  /// List All Sharding Keys
  Future<PlusApiResultListPlusShardingKeyVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/sharding/key/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusShardingKeyVO ? response : null;
  }

  /// Get Sharding Key by ID
  Future<PlusApiResultPlusShardingKeyVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/sharding/key/${id}'));
    return response is PlusApiResultPlusShardingKeyVO ? response : null;
  }

  /// Delete Sharding Key
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/sharding/key/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
