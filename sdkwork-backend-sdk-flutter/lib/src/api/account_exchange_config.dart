import '../http/client.dart';
import '../models.dart';

class AccountExchangeConfigApi {
  final HttpClient _client;
  
  AccountExchangeConfigApi(this._client);

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
}
