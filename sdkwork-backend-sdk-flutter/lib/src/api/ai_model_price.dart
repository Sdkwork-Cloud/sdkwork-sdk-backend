import '../http/client.dart';
import '../models.dart';

class AiModelPriceApi {
  final HttpClient _client;
  
  AiModelPriceApi(this._client);

  /// Update an existing AI model price
  Future<PlusApiResultPlusAiModelPriceVO?> update(PlusAiModelPriceForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/model/price'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAiModelPriceVO ? response : null;
  }

  /// Create a new AI model price
  Future<PlusApiResultPlusAiModelPriceVO?> create(PlusAiModelPriceForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/model/price'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAiModelPriceVO ? response : null;
  }

  /// Get AI model prices by page
  Future<PlusApiResultPagePlusAiModelPriceVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/model/price/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusAiModelPriceVO ? response : null;
  }

  /// Get all AI model prices
  Future<PlusApiResultListPlusAiModelPriceVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/model/price/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusAiModelPriceVO ? response : null;
  }

  /// Get an AI model price by ID
  Future<PlusApiResultPlusAiModelPriceVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/model/price/${id}'));
    return response is PlusApiResultPlusAiModelPriceVO ? response : null;
  }

  /// Delete an AI model price
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/model/price/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
