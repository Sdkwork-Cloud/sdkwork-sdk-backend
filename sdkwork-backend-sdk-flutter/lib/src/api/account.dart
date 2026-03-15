import '../http/client.dart';
import '../models.dart';

class AccountApi {
  final HttpClient _client;
  
  AccountApi(this._client);

  /// Update an existing account
  Future<PlusApiResultPlusAccountVO?> update(PlusAccountForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/account'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAccountVO ? response : null;
  }

  /// Create a new account
  Future<PlusApiResultPlusAccountVO?> create(PlusAccountForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/account'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAccountVO ? response : null;
  }

  /// Update an existing account history record
  Future<PlusApiResultPlusAccountHistoryVO?> updateHistory(PlusAccountHistoryForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/account/history'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAccountHistoryVO ? response : null;
  }

  /// Create a new account history record
  Future<PlusApiResultPlusAccountHistoryVO?> createHistory(PlusAccountHistoryForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/account/history'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAccountHistoryVO ? response : null;
  }

  /// Get points-to-cash rate
  Future<PlusApiResultAccountExchangeRateVO?> getPointsToCashRate() async {
    final response = await _client.get(ApiPaths.backendPath('/account/exchange-config/points-cash-rate'));
    return response is PlusApiResultAccountExchangeRateVO ? response : null;
  }

  /// Update points-to-cash rate
  Future<PlusApiResultAccountExchangeRateVO?> updatePointsToCashRate(AccountExchangeRateUpdateForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/account/exchange-config/points-cash-rate'), body: body, contentType: 'application/json');
    return response is PlusApiResultAccountExchangeRateVO ? response : null;
  }

  /// Get accounts by page
  Future<PlusApiResultPagePlusAccountVO?> createListByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/account/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusAccountVO ? response : null;
  }

  /// Get all accounts
  Future<PlusApiResultListPlusAccountVO?> createListAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/account/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusAccountVO ? response : null;
  }

  /// Get account history records by page
  Future<PlusApiResultPagePlusAccountHistoryVO?> createListByPageHistory(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/account/history/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusAccountHistoryVO ? response : null;
  }

  /// Get all account history records
  Future<PlusApiResultListPlusAccountHistoryVO?> createListAllEntitiesHistory(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/account/history/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusAccountHistoryVO ? response : null;
  }

  /// Get points account
  Future<PlusApiResultPlusAccountVO?> getPoints(PlusGetAccountForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/account/get_points'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAccountVO ? response : null;
  }

  /// Get cash account
  Future<PlusApiResultPlusAccountVO?> getCash(PlusGetAccountForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/account/get_cash'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAccountVO ? response : null;
  }

  /// Get an account by ID
  Future<PlusApiResultPlusAccountVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/account/${id}'));
    return response is PlusApiResultPlusAccountVO ? response : null;
  }

  /// Delete an account
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/account/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get an account history record by ID
  Future<PlusApiResultPlusAccountHistoryVO?> getByIdHistory(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/account/history/${id}'));
    return response is PlusApiResultPlusAccountHistoryVO ? response : null;
  }

  /// Delete an account history record
  Future<PlusApiResultBoolean?> deleteHistory(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/account/history/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
