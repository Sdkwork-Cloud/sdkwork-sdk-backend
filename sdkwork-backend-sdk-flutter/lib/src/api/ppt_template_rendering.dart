import '../http/client.dart';
import '../models.dart';

class PptTemplateRenderingApi {
  final HttpClient _client;
  
  PptTemplateRenderingApi(this._client);

  /// Render PPT template
  Future<PlusApiResult?> render(PlusPptTemplateRenderForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/ppt/template/render'), body: body, contentType: 'application/json');
    return response is PlusApiResult ? response : null;
  }
}
