import Foundation

public class NotificationApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing notification
    public func update(body: PlusNotificationForm) async throws -> PlusApiResultPlusNotificationVO? {
        let response = try await client.put(ApiPaths.backendPath("/notification"), body: body)
        return response as? PlusApiResultPlusNotificationVO
    }

    /// Create a new notification
    public func create(body: PlusNotificationForm) async throws -> PlusApiResultPlusNotificationVO? {
        let response = try await client.post(ApiPaths.backendPath("/notification"), body: body)
        return response as? PlusApiResultPlusNotificationVO
    }

    /// Get notifications by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusNotificationVO? {
        let response = try await client.post(ApiPaths.backendPath("/notification/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusNotificationVO
    }

    /// Get all notifications
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusNotificationVO? {
        let response = try await client.post(ApiPaths.backendPath("/notification/list/all"), body: body)
        return response as? PlusApiResultListPlusNotificationVO
    }

    /// Get a notification by ID
    public func getById(id: String) async throws -> PlusApiResultPlusNotificationVO? {
        let response = try await client.get(ApiPaths.backendPath("/notification/\(id)"))
        return response as? PlusApiResultPlusNotificationVO
    }

    /// Delete a notification
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/notification/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
