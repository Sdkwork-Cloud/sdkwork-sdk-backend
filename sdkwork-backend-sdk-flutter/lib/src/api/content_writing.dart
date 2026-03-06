import '../http/client.dart';
import '../models.dart';

class ContentWritingApi {
  final HttpClient _client;
  
  ContentWritingApi(this._client);

  /// Rename chapter
  Future<FileTreeNodeVO?> renameChapter(String fileId, String body) async {
    final response = await _client.put(ApiPaths.backendPath('/content-writing/chapters/${fileId}/rename'), body: body, contentType: 'application/json');
    return response is FileTreeNodeVO ? response : null;
  }

  /// Move chapter
  Future<FileTreeNodeVO?> moveChapter(String fileId, int body) async {
    final response = await _client.put(ApiPaths.backendPath('/content-writing/chapters/${fileId}/move'), body: body, contentType: 'application/json');
    return response is FileTreeNodeVO ? response : null;
  }

  /// Get chapter content
  Future<String?> getChapterContent(String fileId) async {
    final response = await _client.get(ApiPaths.backendPath('/content-writing/chapters/${fileId}'));
    return response is String ? response : null;
  }

  /// Update chapter
  Future<FileTreeNodeVO?> updateChapter(String fileId, String body) async {
    final response = await _client.put(ApiPaths.backendPath('/content-writing/chapters/${fileId}'), body: body, contentType: 'application/json');
    return response is FileTreeNodeVO ? response : null;
  }

  /// Delete chapter
  Future<void> deleteChapter(String fileId) async {
    await _client.delete(ApiPaths.backendPath('/content-writing/chapters/${fileId}'));
  }

  /// Create chapter
  Future<FileTreeNodeVO?> createChapter(CreateChapterForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/content-writing/chapters'), body: body, contentType: 'application/json');
    return response is FileTreeNodeVO ? response : null;
  }

  /// Get all contents
  Future<GetAllContentsResponse?> getAllContents() async {
    final response = await _client.get(ApiPaths.backendPath('/content-writing'));
    return response is GetAllContentsResponse ? response : null;
  }

  /// Create content
  Future<ContentWorkVO?> createContent(CreateContentForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/content-writing'), body: body, contentType: 'application/json');
    return response is ContentWorkVO ? response : null;
  }

  /// Get content
  Future<ContentWorkVO?> getContent(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/content-writing/${id}'));
    return response is ContentWorkVO ? response : null;
  }

  /// Delete content
  Future<void> deleteContent(String id) async {
    await _client.delete(ApiPaths.backendPath('/content-writing/${id}'));
  }

  /// Get directory tree
  Future<FileTreeNodeVO?> getDirectoryTree(String contentWorkId) async {
    final response = await _client.get(ApiPaths.backendPath('/content-writing/${contentWorkId}/tree'));
    return response is FileTreeNodeVO ? response : null;
  }

  /// Get content stats
  Future<ContentStatsVO?> getContentStats(String contentWorkId) async {
    final response = await _client.get(ApiPaths.backendPath('/content-writing/${contentWorkId}/stats'));
    return response is ContentStatsVO ? response : null;
  }

  /// Get all scripts
  Future<GetAllScriptsResponse?> getAllScripts() async {
    final response = await _client.get(ApiPaths.backendPath('/content-writing/scripts'));
    return response is GetAllScriptsResponse ? response : null;
  }

  /// Get all prose
  Future<GetAllProseResponse?> getAllProse() async {
    final response = await _client.get(ApiPaths.backendPath('/content-writing/prose'));
    return response is GetAllProseResponse ? response : null;
  }

  /// Get all novels
  Future<GetAllNovelsResponse?> getAllNovels() async {
    final response = await _client.get(ApiPaths.backendPath('/content-writing/novels'));
    return response is GetAllNovelsResponse ? response : null;
  }

  /// Get all articles
  Future<GetAllArticlesResponse?> getAllArticles() async {
    final response = await _client.get(ApiPaths.backendPath('/content-writing/articles'));
    return response is GetAllArticlesResponse ? response : null;
  }
}
