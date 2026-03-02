import '../http/client.dart';
import '../models.dart';

class UserAddressApi {
  final HttpClient _client;
  
  UserAddressApi(this._client);

  /// Update an existing user address
  Future<PlusApiResultPlusUserAddressVO?> update(PlusUserAddressForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/user/address'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusUserAddressVO ? response : null;
  }

  /// Create a new user address
  Future<PlusApiResultPlusUserAddressVO?> create(PlusUserAddressForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/user/address'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusUserAddressVO ? response : null;
  }

  /// Get addresses by page
  Future<PlusApiResultPagePlusUserAddressVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/user/address/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusUserAddressVO ? response : null;
  }

  /// Get all user addresses
  Future<PlusApiResultListPlusUserAddressVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/user/address/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusUserAddressVO ? response : null;
  }

  /// Get address by ID
  Future<PlusApiResultPlusUserAddressVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/user/address/${id}'));
    return response is PlusApiResultPlusUserAddressVO ? response : null;
  }

  /// Delete a user address
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/user/address/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
