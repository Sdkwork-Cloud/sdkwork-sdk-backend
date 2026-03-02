import '../http/client.dart';
import '../models.dart';

class OssBucketApi {
  final HttpClient _client;
  
  OssBucketApi(this._client);

  /// Update an existing OSS bucket
  Future<PlusApiResultPlusOssBucketVO?> update(PlusOssBucketForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/oss/bucket'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusOssBucketVO ? response : null;
  }

  /// Create a new OSS bucket
  Future<PlusApiResultPlusOssBucketVO?> create(PlusOssBucketForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/oss/bucket'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusOssBucketVO ? response : null;
  }

  /// Get OSS buckets by page
  Future<PlusApiResultPagePlusOssBucketVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/oss/bucket/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusOssBucketVO ? response : null;
  }

  /// Get all OSS buckets
  Future<PlusApiResultListPlusOssBucketVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/oss/bucket/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusOssBucketVO ? response : null;
  }

  /// Get an OSS bucket by ID
  Future<PlusApiResultPlusOssBucketVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/oss/bucket/${id}'));
    return response is PlusApiResultPlusOssBucketVO ? response : null;
  }

  /// Delete an OSS bucket
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/oss/bucket/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
