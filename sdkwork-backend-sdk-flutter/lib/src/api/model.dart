import '../http/client.dart';
import '../models.dart';

class ModelApi {
  final HttpClient _client;
  
  ModelApi(this._client);

  /// Update existing AI model information
  Future<PlusApiResultPlusAiModelInfoVO?> update(PlusAiModelInfoForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/model'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAiModelInfoVO ? response : null;
  }

  /// Create a new AI model information
  Future<PlusApiResultPlusAiModelInfoVO?> create(PlusAiModelInfoForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/model'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAiModelInfoVO ? response : null;
  }

  /// Update an existing AI model price
  Future<PlusApiResultPlusAiModelPriceVO?> updatePrice(PlusAiModelPriceForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/model/price'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAiModelPriceVO ? response : null;
  }

  /// Create a new AI model price
  Future<PlusApiResultPlusAiModelPriceVO?> createPrice(PlusAiModelPriceForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/model/price'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAiModelPriceVO ? response : null;
  }

  /// Get AI model prices by page
  Future<PlusApiResultPagePlusAiModelPriceVO?> createListByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/model/price/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusAiModelPriceVO ? response : null;
  }

  /// Get all AI model prices
  Future<PlusApiResultListPlusAiModelPriceVO?> createListAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/model/price/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusAiModelPriceVO ? response : null;
  }

  /// Get AI model information by page
  Future<PlusApiResultPagePlusAiModelInfoVO?> createListByPageModel(PlusAiModelInfoQueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/model/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusAiModelInfoVO ? response : null;
  }

  /// Get all AI model information
  Future<PlusApiResultListPlusAiModelInfoVO?> createListAllEntitiesModel(PlusAiModelInfoQueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/model/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusAiModelInfoVO ? response : null;
  }

  /// Get AI model information by ID
  Future<PlusApiResultPlusAiModelInfoVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/model/${id}'));
    return response is PlusApiResultPlusAiModelInfoVO ? response : null;
  }

  /// Delete AI model information
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/model/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get an AI model price by ID
  Future<PlusApiResultPlusAiModelPriceVO?> getByIdPrice(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/model/price/${id}'));
    return response is PlusApiResultPlusAiModelPriceVO ? response : null;
  }

  /// Delete an AI model price
  Future<PlusApiResultBoolean?> deletePrice(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/model/price/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
