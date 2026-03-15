import '../http/client.dart';
import '../models.dart';

class UserApi {
  final HttpClient _client;
  
  UserApi(this._client);

  /// Update an existing user
  Future<PlusApiResultPlusUserVO?> update(PlusUserForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/user'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusUserVO ? response : null;
  }

  /// Create a new user
  Future<PlusApiResultPlusUserVO?> create(PlusUserForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/user'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusUserVO ? response : null;
  }

  /// Update user OAuth account
  Future<PlusApiResultPlusUserOAuthAccountVO?> updateAccount(PlusUserOAuthAccountForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/user/oauth/account'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusUserOAuthAccountVO ? response : null;
  }

  /// Create user OAuth account
  Future<PlusApiResultPlusUserOAuthAccountVO?> createAccount(PlusUserOAuthAccountForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/user/oauth/account'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusUserOAuthAccountVO ? response : null;
  }

  /// Update an existing user coupon
  Future<PlusApiResultPlusUserCouponVO?> updateCoupon(PlusUserCouponForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/user/coupon'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusUserCouponVO ? response : null;
  }

  /// Create a new user coupon
  Future<PlusApiResultPlusUserCouponVO?> createCoupon(PlusUserCouponForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/user/coupon'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusUserCouponVO ? response : null;
  }

  /// Update user-card binding
  Future<PlusApiResultPlusUserCardVO?> updateCard(PlusUserCardForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/user/card'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusUserCardVO ? response : null;
  }

  /// Create user-card binding
  Future<PlusApiResultPlusUserCardVO?> createCard(PlusUserCardForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/user/card'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusUserCardVO ? response : null;
  }

  /// Update an existing user address
  Future<PlusApiResultPlusUserAddressVO?> updateAddress(PlusUserAddressForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/user/address'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusUserAddressVO ? response : null;
  }

  /// Create a new user address
  Future<PlusApiResultPlusUserAddressVO?> createAddress(PlusUserAddressForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/user/address'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusUserAddressVO ? response : null;
  }

  /// Get user OAuth accounts by page
  Future<PlusApiResultPagePlusUserOAuthAccountVO?> createListByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/user/oauth/account/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusUserOAuthAccountVO ? response : null;
  }

  /// Get all user OAuth accounts
  Future<PlusApiResultListPlusUserOAuthAccountVO?> createListAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/user/oauth/account/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusUserOAuthAccountVO ? response : null;
  }

  /// Get users by page
  Future<PlusApiResultPagePlusUserVO?> createListByPageUser(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/user/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusUserVO ? response : null;
  }

  /// Get all users
  Future<PlusApiResultListPlusUserVO?> createListAllEntitiesUser(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/user/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusUserVO ? response : null;
  }

  /// Get user coupons by page
  Future<PlusApiResultPagePlusUserCouponVO?> createListByPageCoupon(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/user/coupon/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusUserCouponVO ? response : null;
  }

  /// Get all user coupons
  Future<PlusApiResultListPlusUserCouponVO?> createListAllEntitiesCoupon(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/user/coupon/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusUserCouponVO ? response : null;
  }

  /// Get user-card bindings by page
  Future<PlusApiResultPagePlusUserCardVO?> createListByPageCard(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/user/card/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusUserCardVO ? response : null;
  }

  /// Get all user-card bindings
  Future<PlusApiResultListPlusUserCardVO?> createListAllEntitiesCard(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/user/card/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusUserCardVO ? response : null;
  }

  /// Get addresses by page
  Future<PlusApiResultPagePlusUserAddressVO?> createListByPageAddress(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/user/address/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusUserAddressVO ? response : null;
  }

  /// Get all user addresses
  Future<PlusApiResultListPlusUserAddressVO?> createListAllEntitiesAddress(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/user/address/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusUserAddressVO ? response : null;
  }

  /// Get a user by ID
  Future<PlusApiResultPlusUserVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/user/${id}'));
    return response is PlusApiResultPlusUserVO ? response : null;
  }

  /// Delete a user
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/user/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get current user profile
  Future<PlusApiResultPlusUserProfileVO?> getProfile() async {
    final response = await _client.get(ApiPaths.backendPath('/user/profile'));
    return response is PlusApiResultPlusUserProfileVO ? response : null;
  }

  /// Get user OAuth account by ID
  Future<PlusApiResultPlusUserOAuthAccountVO?> getByIdAccount(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/user/oauth/account/${id}'));
    return response is PlusApiResultPlusUserOAuthAccountVO ? response : null;
  }

  /// Delete user OAuth account
  Future<PlusApiResultBoolean?> deleteAccount(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/user/oauth/account/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get a user coupon by ID
  Future<PlusApiResultPlusUserCouponVO?> getByIdCoupon(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/user/coupon/${id}'));
    return response is PlusApiResultPlusUserCouponVO ? response : null;
  }

  /// Delete a user coupon
  Future<PlusApiResultBoolean?> deleteCoupon(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/user/coupon/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get user-card binding by ID
  Future<PlusApiResultPlusUserCardVO?> getByIdCard(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/user/card/${id}'));
    return response is PlusApiResultPlusUserCardVO ? response : null;
  }

  /// Delete user-card binding
  Future<PlusApiResultBoolean?> deleteCard(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/user/card/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get address by ID
  Future<PlusApiResultPlusUserAddressVO?> getByIdAddress(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/user/address/${id}'));
    return response is PlusApiResultPlusUserAddressVO ? response : null;
  }

  /// Delete a user address
  Future<PlusApiResultBoolean?> deleteAddress(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/user/address/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
