import '../http/client.dart';
import '../models.dart';

class InvoiceApi {
  final HttpClient _client;
  
  InvoiceApi(this._client);

  /// Apply invoice
  Future<PlusApiResultPlusSystemInvoiceVO?> apply(PlusSystemInvoiceApplyForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/system/invoice/apply'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusSystemInvoiceVO ? response : null;
  }

  /// Query invoice page
  Future<PlusApiResultPagePlusSystemInvoiceVO?> listByPage(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.backendPath('/system/invoice/page'), params: params);
    return response is PlusApiResultPagePlusSystemInvoiceVO ? response : null;
  }
}
