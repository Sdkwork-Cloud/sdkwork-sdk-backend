import Foundation

struct PlusWorkspaceForm: Codable {
    let name: String?
    let code: String?
    let title: String?
    let description: String?
    let icon: String?
    let color: String?
    let type: String?
    let status: String?
    let ownerId: Int?
    let leaderId: Int?
    let startTime: String?
    let endTime: String?
    let maxMembers: Int?
    let currentMembers: Int?
    let maxStorage: Int?
    let usedStorage: Int?
    let settings: [String: Any]?
    let isDeleted: Bool?
    let isPublic: Bool?
    let isTemplate: Bool?
}

struct PlusApiResultPlusWorkspaceVO: Codable {
    let data: PlusWorkspaceVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusWorkspaceVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let name: String?
    let code: String?
    let title: String?
    let description: String?
    let icon: String?
    let color: String?
    let type: String?
    let status: String?
    let ownerId: Int?
    let leaderId: Int?
    let startTime: String?
    let endTime: String?
    let maxMembers: Int?
    let currentMembers: Int?
    let maxStorage: Int?
    let usedStorage: Int?
    let settings: [String: Any]?
    let isDeleted: Bool?
    let isPublic: Bool?
    let isTemplate: Bool?
}

struct ContentVoteForm: Codable {
    let contentType: String?
    let rating: String?
    let contentId: Int?
    let metadata: ContentVoteMetadata?
}

struct ContentVoteMetadata: Codable {
    let rating: String?
}

struct ContentVoteVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let v: Int?
    let userId: Int?
    let contentType: String?
    let rating: String?
    let contentId: Int?
    let metadata: ContentVoteMetadata?
}

struct PlusApiResultContentVoteVO: Codable {
    let data: ContentVoteVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusVoiceSpeakerForm: Codable {
    let name: String?
    let channelSpeakerId: String?
    let code: String?
    let channel: String?
    let gender: String?
    let ageType: String?
    let type: String?
    let models: [String]?
    let tags: TagsContent?
    let status: String?
    let description: String?
}

struct TagsContent: Codable {
    let tags: [String]?
    let children: [TagsContent]?
}

struct PlusApiResultPlusVoiceSpeakerVO: Codable {
    let data: PlusVoiceSpeakerVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusVoiceSpeakerVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let voice: String?
    let channelSpeakerId: String?
    let code: String?
    let channel: String?
    let gender: String?
    let ageType: String?
    let type: String?
    let models: [String]?
    let tags: TagsContent?
    let status: String?
    let description: String?
}

struct PlusVisitHistoryForm: Codable {
    let contentType: String?
    let contentId: Int?
    let visitCount: Int?
    let lastVisitedAt: String?
    let duration: Int?
    let source: String?
}

struct PlusApiResultPlusVisitHistoryVO: Codable {
    let data: PlusVisitHistoryVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusVisitHistoryVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let userId: Int?
    let contentType: String?
    let contentId: Int?
    let visitCount: Int?
    let lastVisitedAt: String?
    let duration: Int?
    let source: String?
}

struct PlusVipUserForm: Codable {
    let userId: Int?
    let vipLevelId: Int?
    let status: String?
    let pointBalance: Int?
    let totalRechargedPoints: Int?
    let validFrom: String?
    let validTo: String?
    let lastActiveTime: String?
    let remark: String?
}

struct PlusApiResultPlusVipUserVO: Codable {
    let data: PlusVipUserVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusVipBenefitVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let description: String?
    let benefitKey: String?
    let type: String?
}

struct PlusVipLevelVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let levelValue: Int?
    let requiredPoints: Int?
    let description: String?
    let benefitIds: [Int]?
    let benefits: [PlusVipBenefitVO]?
}

struct PlusVipUserVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let userId: Int?
    let vipLevelId: Int?
    let status: String?
    let pointBalance: Int?
    let totalRechargedPoints: Int?
    let validFrom: String?
    let validTo: String?
    let lastActiveTime: String?
    let remark: String?
    let vipLevel: PlusVipLevelVO?
}

struct PlusVipRechargeForm: Codable {
    let userId: Int?
    let vipLevelId: Int?
    let amount: Double?
    let pointAmount: Int?
    let rechargeType: String?
    let rechargeTime: String?
    let transactionNo: String?
    let status: Int?
    let remark: String?
}

struct PlusApiResultPlusVipRechargeVO: Codable {
    let data: PlusVipRechargeVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusVipRechargeVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let userId: Int?
    let vipLevelId: Int?
    let amount: Double?
    let pointAmount: Int?
    let rechargeType: String?
    let rechargeTime: String?
    let transactionNo: String?
    let status: Int?
    let remark: String?
}

struct PlusVipRechargePackForm: Codable {
    let name: String?
    let description: String?
    let price: Double?
    let pointAmount: Int?
    let vipDurationDays: Int?
    let status: Int?
    let sortWeight: Int?
    let validFrom: String?
    let validTo: String?
    let remark: String?
}

struct PlusApiResultPlusVipRechargePackVO: Codable {
    let data: PlusVipRechargePackVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusVipRechargePackVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let description: String?
    let price: Double?
    let pointAmount: Int?
    let vipDurationDays: Int?
    let status: Int?
    let sortWeight: Int?
    let validFrom: String?
    let validTo: String?
    let remark: String?
}

struct PlusVipPointChangeForm: Codable {
    let userId: Int?
    let changeType: String?
    let changeAmount: Int?
    let beforeBalance: Int?
    let afterBalance: Int?
    let sourceId: Int?
    let sourceType: String?
    let remark: String?
}

struct PlusApiResultPlusVipPointChangeVO: Codable {
    let data: PlusVipPointChangeVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusVipPointChangeVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let userId: Int?
    let changeType: String?
    let changeAmount: Int?
    let beforeBalance: Int?
    let afterBalance: Int?
    let sourceId: Int?
    let sourceType: String?
    let remark: String?
}

struct PlusVipPackGroupForm: Codable {
    let appId: Int?
    let name: String?
    let description: String?
    let sortWeight: Int?
    let status: String?
    let remark: String?
}

struct PlusApiResultPlusVipPackGroupVO: Codable {
    let data: PlusVipPackGroupVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusVipPackGroupVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let appId: Int?
    let name: String?
    let description: String?
    let sortWeight: Int?
    let status: String?
    let remark: String?
    let packs: [PlusVipPackVO]?
}

struct PlusVipPackVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let name: String?
    let description: String?
    let groupId: Int?
    let vipLevelId: Int?
    let price: Double?
    let pointAmount: Int?
    let vipDurationDays: Int?
    let status: String?
    let sortWeight: Int?
    let validFrom: String?
    let validTo: String?
    let remark: String?
    let vipLevel: PlusVipLevelVO?
}

struct PlusVipPackForm: Codable {
    let name: String?
    let description: String?
    let groupId: Int?
    let vipLevelId: Int?
    let price: Double?
    let pointAmount: Int?
    let vipDurationDays: Int?
    let status: String?
    let sortWeight: Int?
    let validFrom: String?
    let validTo: String?
    let remark: String?
}

struct PlusApiResultPlusVipPackVO: Codable {
    let data: PlusVipPackVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusVipLevelForm: Codable {
    let name: String?
    let levelValue: Int?
    let requiredPoints: Int?
    let description: String?
}

struct PlusApiResultPlusVipLevelVO: Codable {
    let data: PlusVipLevelVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusVipLevelBenefitForm: Codable {
    let vipLevelId: Int?
    let benefitId: Int?
    let dailyLimit: Int?
    let monthlyLimit: Int?
    let totalLimit: Int?
    let status: String?
    let metadata: VipLevelBenefitMetadata?
    let remark: String?
}

struct VipLevelBenefitMetadata: Codable {
    let maxUsageCount: Int?
    let maxDailyUsage: Int?
    let maxMonthlyUsage: Int?
    let isUnlimited: Bool?
    let validPeriod: String?
    let extendInfo: String?
}

struct PlusApiResultPlusVipLevelBenefitVO: Codable {
    let data: PlusVipLevelBenefitVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusVipLevelBenefitVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let vipLevelId: Int?
    let benefitId: Int?
    let dailyLimit: Int?
    let monthlyLimit: Int?
    let totalLimit: Int?
    let status: String?
    let metadata: VipLevelBenefitMetadata?
    let remark: String?
}

struct PlusVipBenefitForm: Codable {
    let name: String?
    let description: String?
    let benefitKey: String?
    let type: String?
}

struct PlusApiResultPlusVipBenefitVO: Codable {
    let data: PlusVipBenefitVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusVipBenefitUsageForm: Codable {
    let userId: Int?
    let benefitType: String?
    let usageTime: String?
    let usageCount: Int?
    let status: Int?
    let sourceId: Int?
    let sourceType: String?
    let remark: String?
}

struct PlusApiResultPlusVipBenefitUsageVO: Codable {
    let data: PlusVipBenefitUsageVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusVipBenefitUsageVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let userId: Int?
    let benefitType: String?
    let usageTime: String?
    let usageCount: Int?
    let status: Int?
    let sourceId: Int?
    let sourceType: String?
    let remark: String?
}

struct PlusVideoForm: Codable {
    let title: String?
    let description: String?
    let contentUrl: String?
    let aspectRatio: String?
    let duration: Int?
    let resolution: String?
    let width: Int?
    let height: Int?
    let fileSize: Int?
    let format: String?
    let thumbnailUrl: String?
    let status: String?
}

struct AuthorInfo: Codable {
    let id: Int?
    let faceImage: ImageMediaResource?
    let name: String?
    let email: String?
    let bio: String?
    let website: String?
}

struct ImageMediaResource: Codable {
    let id: Int?
    let uuid: String?
    let url: String?
    let bytes: String?
    let localFile: Any?
    let base64: String?
    let type: String?
    let mimeType: String?
    let size: Int?
    let name: String?
    let extension: String?
    let tags: TagsContent?
    let metadata: [String: Any]?
    let prompt: String?
    let width: Int?
    let height: Int?
    let splitImages: ImageMediaResource?
    let aspectRatio: String?
}

struct PlusApiResultPlusVideoVO: Codable {
    let data: PlusVideoVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusVideoVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let version: Int?
    let title: String?
    let description: String?
    let resource: VideoMediaResource?
    let author: AuthorInfo?
    let contentUrl: String?
    let aspectRatio: String?
    let duration: Int?
    let resolution: String?
    let width: Int?
    let height: Int?
    let fileSize: Int?
    let format: String?
    let thumbnailUrl: String?
    let status: String?
}

struct VideoMediaResource: Codable {
    let id: Int?
    let uuid: String?
    let url: String?
    let bytes: String?
    let localFile: Any?
    let base64: String?
    let type: String?
    let mimeType: String?
    let size: Int?
    let name: String?
    let extension: String?
    let tags: TagsContent?
    let metadata: [String: Any]?
    let prompt: String?
    let duration: Int?
    let width: Int?
    let height: Int?
}

struct PlusUserForm: Codable {
    let username: String?
    let password: String?
    let salt: String?
    let email: String?
    let phone: String?
    let status: String?
    let roleIds: [Int]?
}

struct FacebookInfo: Codable {
    let userId: String?
    let username: String?
    let name: String?
    let avatarUrl: String?
    let email: String?
    let gender: String?
    let country: String?
    let city: String?
}

struct InstagramInfo: Codable {
    let userId: String?
    let username: String?
    let fullName: String?
    let profilePictureUrl: String?
    let bio: String?
    let website: String?
    let isBusinessAccount: Bool?
}

struct LinkedInInfo: Codable {
    let userId: String?
    let username: String?
    let fullName: String?
    let profilePictureUrl: String?
    let headline: String?
    let position: String?
    let company: String?
    let industry: String?
    let education: String?
    let location: String?
}

struct PlusApiResultPlusUserVO: Codable {
    let data: PlusUserVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusUserVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let faceImage: ImageMediaResource?
    let faceVideo: ImageMediaResource?
    let username: String?
    let nickname: String?
    let email: String?
    let phone: String?
    let gender: String?
    let status: String?
    let roleIds: [Int]?
    let roleNames: [String]?
    let socialInfoList: SocialInfoList?
}

struct SocialInfoList: Codable {
    let wechat: WechatInfo?
    let facebook: FacebookInfo?
    let twitter: TwitterInfo?
    let instagram: InstagramInfo?
    let linkedin: LinkedInInfo?
    let telegram: TelegramInfo?
    let whatsapp: WhatsAppInfo?
    let tiktok: TikTokInfo?
}

struct TelegramInfo: Codable {
    let userId: Int?
    let username: String?
    let fullName: String?
    let phoneNumber: String?
    let languageCode: String?
}

struct TikTokInfo: Codable {
    let userId: String?
    let username: String?
    let displayName: String?
    let avatarUrl: String?
    let bio: String?
    let isVerified: Bool?
    let followerCount: Int?
    let followingCount: Int?
    let likeCount: Int?
}

struct TwitterInfo: Codable {
    let userId: String?
    let username: String?
    let displayName: String?
    let avatarUrl: String?
    let bio: String?
    let location: String?
    let website: String?
}

struct WechatInfo: Codable {
    let openId: String?
    let unionId: String?
    let nickname: String?
    let avatarUrl: String?
    let gender: Int?
    let country: String?
    let province: String?
    let city: String?
}

struct WhatsAppInfo: Codable {
    let userId: String?
    let phoneNumber: String?
    let displayName: String?
    let profilePictureUrl: String?
}

struct PlusUserOAuthAccountForm: Codable {
    let userId: Int?
    let oauthProvider: String?
    let openId: String?
    let unionId: String?
    let appId: String?
    let channelAccountId: Int?
    let accessTokenExpiresAt: String?
}

struct PlusApiResultPlusUserOAuthAccountVO: Codable {
    let data: PlusUserOAuthAccountVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusUserOAuthAccountVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let userId: Int?
    let oauthProvider: String?
    let openId: String?
    let unionId: String?
    let appId: String?
    let channelAccountId: Int?
    let accessTokenExpiresAt: String?
}

struct PlusUserCouponForm: Codable {
    let userId: Int?
    let couponId: Int?
    let couponCode: String?
    let acquireAt: String?
    let acquireRequestNo: String?
    let acquireType: String?
    let pointCost: Int?
    let pointsRefunded: Bool?
    let pointsRefundAt: String?
    let useAt: String?
    let status: String?
}

struct PlusApiResultPlusUserCouponVO: Codable {
    let data: PlusUserCouponVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusUserCouponVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let userId: Int?
    let couponId: Int?
    let couponCode: String?
    let acquireTime: String?
    let acquireRequestNo: String?
    let acquireType: String?
    let pointCost: Int?
    let pointsRefunded: Bool?
    let pointsRefundAt: String?
    let useTime: String?
    let status: String?
}

struct PlusUserCardForm: Codable {
    let userId: Int?
    let cardId: Int?
    let cardCode: String?
    let acquireTime: String?
    let activateTime: String?
    let cancelTime: String?
    let points: Int?
    let balance: Int?
}

struct PlusApiResultPlusUserCardVO: Codable {
    let data: PlusUserCardVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusUserCardVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let userId: Int?
    let cardId: Int?
    let cardCode: String?
    let acquireTime: String?
    let activateTime: String?
    let cancelTime: String?
    let points: Int?
    let balance: Int?
}

struct PlusUserAddressForm: Codable {
    let name: String?
    let phone: String?
    let countryCode: String?
    let provinceCode: String?
    let cityCode: String?
    let districtCode: String?
    let addressDetail: String?
    let postalCode: String?
    let isDefault: Bool?
    let tags: TagsContent?
}

struct PlusApiResultPlusUserAddressVO: Codable {
    let data: PlusUserAddressVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusUserAddressVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let name: String?
    let phone: String?
    let countryCode: String?
    let provinceCode: String?
    let cityCode: String?
    let districtCode: String?
    let addressDetail: String?
    let postalCode: String?
    let isDefault: Bool?
    let tags: TagsContent?
}

struct UsageRecordForm: Codable {
    let userId: Int?
    let requestId: String?
    let modelName: String?
    let channel: String?
    let usageType: String?
    let billingType: String?
    let promptTokens: Int?
    let completionTokens: Int?
    let cachedTokens: Int?
    let totalTokens: Int?
    let callCount: Int?
    let processingTime: Int?
    let imageCount: Int?
    let imageSize: String?
    let videoDuration: Int?
    let audioDuration: Int?
    let cost: Double?
    let currencyCode: String?
    let status: String?
    let requestTime: String?
    let responseTime: String?
    let promptId: Int?
    let toolId: Int?
}

struct PlusApiResultUsageRecordVO: Codable {
    let data: UsageRecordVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct UsageRecordVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let userId: Int?
    let requestId: String?
    let modelName: String?
    let channel: String?
    let usageType: String?
    let billingType: String?
    let promptTokens: Int?
    let completionTokens: Int?
    let cachedTokens: Int?
    let totalTokens: Int?
    let callCount: Int?
    let processingTime: Int?
    let imageCount: Int?
    let imageSize: String?
    let videoDuration: Int?
    let audioDuration: Int?
    let cost: Double?
    let currencyCode: String?
    let status: String?
    let requestTime: String?
    let responseTime: String?
    let promptId: Int?
    let toolId: Int?
}

struct CartGroup: Codable {
    let uuid: String?
    let name: String?
    let items: [CartItem]?
    let totalQuantity: Int?
    let totalPrice: Double?
}

struct CartGroupList: Codable {
    let groups: [CartGroup]?
    let totalQuantity: Int?
    let totalPrice: Double?
    let selectedQuantity: Int?
    let selectedPrice: Double?
    let allItems: [CartItem]?
}

struct CartItem: Codable {
    let id: Int?
    let sku: PlusSku?
    let quantity: Int?
    let unitPrice: Double?
    let totalPrice: Double?
    let selected: Bool?
}

struct PlusShoppingCartForm: Codable {
    let owner: String?
    let ownerId: Int?
    let name: String?
    let description: String?
    let groupList: CartGroupList?
    let status: String?
}

struct PlusSku: Codable {
    let tenantId: Int?
    let organizationId: Int?
    let dataScope: String?
    let id: Int?
    let uuid: String?
    let createdAt: String?
    let updatedAt: String?
    let v: Int?
    let productId: Int?
    let skuCode: String?
    let name: String?
    let title: String?
    let price: Double?
    let originalPrice: Double?
    let stock: Int?
    let sales: Int?
    let status: Int?
    let image: String?
    let specs: String?
}

struct PlusApiResultPlusShoppingCartVO: Codable {
    let data: PlusShoppingCartVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusShoppingCartVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let owner: String?
    let ownerId: Int?
    let name: String?
    let description: String?
    let groupList: CartGroupList?
    let status: String?
}

struct PlusShoppingCartItemForm: Codable {
    let cartId: Int?
    let cartGroupUuid: String?
    let productId: Int?
    let skuId: Int?
    let quantity: Int?
    let price: Double?
    let selected: Bool?
}

struct PlusApiResultPlusShoppingCartItemVO: Codable {
    let data: PlusShoppingCartItemVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusShoppingCartItemVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let cartId: Int?
    let cartGroupUuid: String?
    let productId: Int?
    let skuId: Int?
    let quantity: Int?
    let price: Double?
    let selected: Bool?
}

struct PlusRefundForm: Codable {
    let orderId: Int?
    let paymentId: Int?
    let outRefundNo: String?
    let outTradeNo: String?
    let refundId: String?
    let amount: Double?
    let type: String?
    let status: String?
    let applyTime: String?
    let completeTime: String?
    let remark: String?
    let contentType: String?
    let contentId: Int?
}

struct PlusApiResultPlusRefundVO: Codable {
    let data: PlusRefundVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusRefundVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let orderId: Int?
    let paymentId: Int?
    let outRefundNo: String?
    let outTradeNo: String?
    let refundId: String?
    let amount: Double?
    let type: String?
    let status: String?
    let applyTime: String?
    let completeTime: String?
    let remark: String?
    let contentType: String?
    let contentId: Int?
}

struct PlusPaymentForm: Codable {
    let purpose: String?
    let orderId: Int?
    let transactionId: String?
    let outTradeNo: String?
    let channel: String?
    let provider: String?
    let status: String?
    let amount: Double?
    let successTime: String?
    let remark: String?
    let contentType: String?
    let contentId: Int?
    let productType: String?
}

struct PlusApiResultPlusPaymentVO: Codable {
    let data: PlusPaymentVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusPaymentVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let purpose: String?
    let orderId: Int?
    let transactionId: String?
    let outTradeNo: String?
    let channel: String?
    let status: String?
    let amount: Double?
    let successTime: String?
    let remark: String?
    let contentType: String?
    let contentId: Int?
    let productType: String?
    let provider: String?
}

struct PlusOrderForm: Codable {
    let orderType: String?
    let userId: Int?
    let subject: String?
    let orderSn: String?
    let transactionId: String?
    let outTradeNo: String?
    let totalAmount: Double?
    let paidAmount: Double?
    let paidPointsAmount: Int?
    let status: String?
    let payTime: String?
    let expireTime: String?
    let contentType: String?
    let contentId: Int?
    let taskCode: String?
    let dispatchMode: String?
    let dispatchStatus: String?
    let workerUserId: Int?
    let dispatcherUserId: Int?
    let acceptedTime: String?
    let serviceStartTime: String?
    let dispatchExpireTime: String?
    let taskPayload: [String: Any]?
}

struct AlipayObject: Codable {
    let payUrl: String?
    let sign: String?
    let outTradeNo: String?
    let tradeNo: String?
    let appId: String?
    let method: String?
    let qrCode: String?
}

struct ApplePayObject: Codable {
    let paymentData: String?
    let merchantId: String?
    let transactionId: String?
    let displayName: String?
    let network: String?
    let type: String?
    let amount: String?
    let currencyCode: String?
}

struct ClientPayObjects: Codable {
    let wechat: WechatPayObject?
    let alipay: AlipayObject?
    let applePay: ApplePayObject?
    let paypal: PaypalObject?
    let stripe: StripeObject?
    let unionPay: UnionPayObject?
}

struct PaypalObject: Codable {
    let token: String?
    let payerId: String?
    let paymentUrl: String?
    let invoice: String?
    let amount: String?
    let currency: String?
    let paymentStatus: String?
    let transactionId: String?
    let returnUrl: String?
    let cancelUrl: String?
}

struct PlusApiResultPlusOrderVO: Codable {
    let data: PlusOrderVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusOrderVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let orderType: String?
    let userId: Int?
    let subject: String?
    let orderSn: String?
    let transactionId: String?
    let outTradeNo: String?
    let totalAmount: Double?
    let paidAmount: Double?
    let paidPointsAmount: Int?
    let status: String?
    let payTime: String?
    let expireTime: String?
    let contentType: String?
    let contentId: Int?
    let taskCode: String?
    let dispatchMode: String?
    let dispatchStatus: String?
    let workerUserId: Int?
    let dispatcherUserId: Int?
    let acceptedTime: String?
    let serviceStartTime: String?
    let dispatchExpireTime: String?
    let taskPayload: [String: Any]?
    let payObjects: ClientPayObjects?
}

struct StripeObject: Codable {
    let sessionId: String?
    let paymentUrl: String?
    let clientSecret: String?
    let paymentIntentId: String?
    let publishableKey: String?
    let returnUrl: String?
    let amount: String?
    let currency: String?
}

struct UnionPayObject: Codable {
    let payUrl: String?
    let tn: String?
    let merOrderId: String?
    let merId: String?
    let mode: String?
    let schemeStr: String?
    let signature: String?
}

struct WechatPayObject: Codable {
    let prepayId: String?
    let mwebUrl: String?
    let codeUrl: String?
    let timeStamp: String?
    let nonceStr: String?
    let signType: String?
    let paySign: String?
    let outTradeNo: String?
    let tradeType: String?
}

struct OrderWorkerDispatchMetadata: Codable {
    let enabledTaskCodes: [String]?
    let taskConcurrentOverrides: [String: Int]?
}

struct PlusOrderWorkerDispatchProfileForm: Codable {
    let userId: Int?
    let ratingLevel: String?
    let enabled: Bool?
    let globalMaxInProgress: Int?
    let metadata: OrderWorkerDispatchMetadata?
}

struct PlusApiResultPlusOrderWorkerDispatchProfileVO: Codable {
    let data: PlusOrderWorkerDispatchProfileVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusOrderWorkerDispatchProfileVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let userId: Int?
    let ratingLevel: String?
    let enabled: Bool?
    let globalMaxInProgress: Int?
    let metadata: OrderWorkerDispatchMetadata?
}

struct PlusOrderItemForm: Codable {
    let orderId: Int?
    let productType: String?
    let productId: Int?
    let skuId: Int?
    let quantity: Int?
    let unitPrice: Double?
    let totalAmount: Double?
    let expireTime: String?
    let contentType: String?
    let contentId: Int?
}

struct PlusApiResultPlusOrderItemVO: Codable {
    let data: PlusOrderItemVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusOrderItemVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let orderId: Int?
    let productType: String?
    let productId: Int?
    let skuId: Int?
    let quantity: Int?
    let unitPrice: Double?
    let totalAmount: Double?
    let expireTime: String?
    let contentType: String?
    let contentId: Int?
}

struct OrderDispatchRuleMetadata: Codable {
    let ratingConcurrentLimits: [String: Int]?
    let allowedRatingLevels: [String]?
}

struct PlusOrderDispatchRuleForm: Codable {
    let taskCode: String?
    let taskName: String?
    let enabled: Bool?
    let allowGrab: Bool?
    let allowAssign: Bool?
    let defaultTaskConcurrentLimit: Int?
    let metadata: OrderDispatchRuleMetadata?
}

struct PlusApiResultPlusOrderDispatchRuleVO: Codable {
    let data: PlusOrderDispatchRuleVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusOrderDispatchRuleVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let taskCode: String?
    let taskName: String?
    let enabled: Bool?
    let allowGrab: Bool?
    let allowAssign: Bool?
    let defaultTaskConcurrentLimit: Int?
    let metadata: OrderDispatchRuleMetadata?
}

struct HttpApiDefinition: Codable {
    let apiName: String?
    let description: String?
    let baseUrl: String?
    let path: String?
    let method: String?
    let headers: [String: String]?
    let parameters: [String: Any]?
    let requestFormat: String?
    let responseFormat: String?
    let authenticated: Bool?
    let timeoutMillis: Int?
    let requestBodyFormat: String?
    let requestBody: [String: Any]?
    let authType: String?
    let authParams: [String: Any]?
}

struct PlusAiToolForm: Codable {
    let name: String?
    let description: String?
    let type: String?
    let status: String?
    let enabled: Bool?
    let httpApiDefinition: HttpApiDefinition?
    let toolDefinition: PlusToolDefinition?
}

struct PlusToolDefinition: Codable {
    let id: Int?
    let uuid: String?
    let type: String?
    let name: String?
    let description: String?
    let inputSchema: String?
    let buildIn: Bool?
    let httpDefinition: HttpApiDefinition?
}

struct PlusAiToolVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let description: String?
    let type: String?
    let status: String?
    let enabled: Bool?
    let httpApiDefinition: HttpApiDefinition?
    let toolDefinition: PlusToolDefinition?
}

struct PlusApiResultPlusAiToolVO: Codable {
    let data: PlusAiToolVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct InstallAppList: Codable {
    let appIdList: [Int]?
}

struct PlusTenantForm: Codable {
    let name: String?
    let code: String?
    let status: String?
    let description: String?
    let adminUserId: Int?
    let expireTime: String?
    let installAppList: InstallAppList?
}

struct PlusApiResultPlusTenantVO: Codable {
    let data: PlusTenantVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusTenantVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let code: String?
    let status: String?
    let description: String?
    let adminUserId: Int?
    let expireTime: String?
    let installAppList: InstallAppList?
}

struct PlusTableForm: Codable {
    let name: String?
    let description: String?
    let type: String?
    let columnCount: Int?
    let rowCount: Int?
    let lastSyncTime: String?
    let primaryKeys: String?
    let engine: String?
    let createSql: String?
    let comment: String?
    let schemaId: Int?
}

struct PlusApiResultPlusTableVO: Codable {
    let data: PlusTableVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusColumnVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let description: String?
    let dataType: String?
    let columnType: String?
    let ordinalPosition: Int?
    let isNullable: Bool?
    let isPrimaryKey: Bool?
    let isAutoIncrement: Bool?
    let defaultValue: String?
    let comment: String?
    let characterSet: String?
    let collationRule: String?
    let tableId: Int?
}

struct PlusTableVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let description: String?
    let type: String?
    let columnCount: Int?
    let rowCount: Int?
    let lastSyncTime: String?
    let primaryKeys: String?
    let engine: String?
    let createSql: String?
    let comment: String?
    let schemaId: Int?
    let schemaName: String?
    let columns: [PlusColumnVO]?
}

struct AssetMediaResource: Codable {
    let id: Int?
    let uuid: String?
    let url: String?
    let bytes: String?
    let localFile: Any?
    let base64: String?
    let type: String?
    let mimeType: String?
    let size: Int?
    let name: String?
    let extension: String?
    let tags: TagsContent?
    let metadata: [String: Any]?
    let prompt: String?
    let image: ImageMediaResource?
    let video: VideoMediaResource?
    let audio: AudioMediaResource?
    let music: MusicMediaResource?
    let character: CharacterMediaResource?
    let file: FileMediaResource?
    let extraProps: [String: Any]?
}

struct AssetMediaResourceList: Codable {
    let images: [ImageMediaResource]?
    let videos: [VideoMediaResource]?
    let audios: [AudioMediaResource]?
    let files: [FileMediaResource]?
    let musics: [MusicMediaResource]?
    let resources: [AssetMediaResource]?
}

struct AttributeItem: Codable {
    let id: Int?
    let name: String?
    let values: [String]?
}

struct AudioMediaResource: Codable {
    let id: Int?
    let uuid: String?
    let url: String?
    let bytes: String?
    let localFile: Any?
    let base64: String?
    let type: String?
    let mimeType: String?
    let size: Int?
    let name: String?
    let extension: String?
    let tags: TagsContent?
    let metadata: [String: Any]?
    let prompt: String?
    let format: String?
    let bitRate: Int?
    let sampleRate: Int?
    let channels: Int?
    let duration: Int?
}

struct CharacterMediaResource: Codable {
    let id: Int?
    let uuid: String?
    let url: String?
    let bytes: String?
    let localFile: Any?
    let base64: String?
    let type: String?
    let mimeType: String?
    let size: Int?
    let name: String?
    let extension: String?
    let tags: TagsContent?
    let metadata: [String: Any]?
    let prompt: String?
    let characterType: String?
    let gender: String?
    let ageGroup: String?
    let avatarUrl: String?
    let avatarVideoUrl: String?
    let speakerId: Int?
    let appearanceParams: [String: Any]?
    let animationParams: [String: Any]?
}

struct FileMediaResource: Codable {
    let id: Int?
    let uuid: String?
    let url: String?
    let bytes: String?
    let localFile: Any?
    let base64: String?
    let type: String?
    let size: Int?
    let name: String?
    let extension: String?
    let tags: TagsContent?
    let metadata: [String: Any]?
    let prompt: String?
    let width: Int?
    let height: Int?
    let duration: Int?
    let mimeType: String?
}

struct ImageMediaResourceList: Codable {
    let images: [ImageMediaResource]?
}

struct MusicMediaResource: Codable {
    let id: Int?
    let uuid: String?
    let url: String?
    let bytes: String?
    let localFile: Any?
    let base64: String?
    let type: String?
    let mimeType: String?
    let size: Int?
    let name: String?
    let extension: String?
    let tags: TagsContent?
    let metadata: [String: Any]?
    let prompt: String?
    let format: String?
    let duration: Int?
}

struct PlusSkuForm: Codable {
    let title: String?
    let productId: Int?
    let skuCode: String?
    let images: ImageMediaResourceList?
    let resources: AssetMediaResourceList?
    let price: Double?
    let originalPrice: Double?
    let stock: Int?
    let salesCount: Int?
    let status: String?
    let categoryId: Int?
    let attributes: [AttributeItem]?
}

struct PlusApiResultPlusSkuVO: Codable {
    let data: PlusSkuVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusSkuVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let productId: Int?
    let skuCode: String?
    let name: String?
    let title: String?
    let price: Double?
    let originalPrice: Double?
    let stock: Int?
    let sales: Int?
    let status: Int?
    let image: String?
    let specs: String?
}

struct PlusAgentSkillForm: Codable {
    let userId: Int?
    let skillKey: String?
    let name: String?
    let summary: String?
    let description: String?
    let icon: String?
    let coverImage: String?
    let categoryId: Int?
    let packageId: Int?
    let provider: String?
    let version: String?
    let runtime: String?
    let entrypoint: String?
    let manifestUrl: String?
    let repositoryUrl: String?
    let homepageUrl: String?
    let documentationUrl: String?
    let licenseName: String?
    let sourceType: String?
    let visibility: String?
    let enabled: Bool?
    let price: Double?
    let currency: String?
    let tags: [String]?
    let capabilities: [String]?
    let configSchema: [String: Any]?
    let defaultConfig: [String: Any]?
}

struct PlusAgentSkillVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let tenantId: Int?
    let organizationId: Int?
    let userId: Int?
    let skillKey: String?
    let name: String?
    let summary: String?
    let description: String?
    let icon: String?
    let coverImage: String?
    let categoryId: Int?
    let categoryName: String?
    let packageId: Int?
    let packageName: String?
    let provider: String?
    let version: String?
    let runtime: String?
    let entrypoint: String?
    let manifestUrl: String?
    let repositoryUrl: String?
    let homepageUrl: String?
    let documentationUrl: String?
    let licenseName: String?
    let sourceType: String?
    let marketStatus: String?
    let visibility: String?
    let reviewStatus: String?
    let reviewComment: String?
    let reviewedBy: Int?
    let reviewedAt: String?
    let builtin: Bool?
    let enabled: Bool?
    let featured: Bool?
    let recommendWeight: Int?
    let price: Double?
    let currency: String?
    let installCount: Int?
    let ratingAvg: Double?
    let ratingCount: Int?
    let tags: [String]?
    let capabilities: [String]?
    let configSchema: [String: Any]?
    let defaultConfig: [String: Any]?
    let latestPublishedAt: String?
}

struct PlusApiResultPlusAgentSkillVO: Codable {
    let data: PlusAgentSkillVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusAgentSkillPackageForm: Codable {
    let userId: Int?
    let packageKey: String?
    let name: String?
    let summary: String?
    let description: String?
    let icon: String?
    let coverImage: String?
    let categoryId: Int?
    let enabled: Bool?
    let featured: Bool?
    let sortWeight: Int?
    let tags: [String]?
}

struct PlusAgentSkillPackageVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let tenantId: Int?
    let organizationId: Int?
    let userId: Int?
    let packageKey: String?
    let name: String?
    let summary: String?
    let description: String?
    let icon: String?
    let coverImage: String?
    let categoryId: Int?
    let categoryName: String?
    let tags: [String]?
    let enabled: Bool?
    let featured: Bool?
    let sortWeight: Int?
    let skillCount: Int?
    let latestPublishedAt: String?
}

struct PlusApiResultPlusAgentSkillPackageVO: Codable {
    let data: PlusAgentSkillPackageVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ShortUrlForm: Codable {
    let originalUrl: String?
    let shortCode: String?
    let expiresAt: String?
    let status: String?
    let createdBy: Int?
    let description: String?
}

struct PlusApiResultShortUrlVO: Codable {
    let data: ShortUrlVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ShortUrlVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let originalUrl: String?
    let shortCode: String?
    let expiresAt: String?
    let clickCount: Int?
    let status: String?
    let createdBy: Int?
    let description: String?
}

struct GeoPoint: Codable {
    let longitude: Double?
    let latitude: Double?
    let valid: Bool?
}

struct PlusShopForm: Codable {
    let name: String?
    let description: String?
    let logo: ImageMediaResource?
    let cover: ImageMediaResource?
    let contactPhone: String?
    let contactEmail: String?
    let location: GeoPoint?
    let address: String?
    let licenseNumber: String?
    let tags: [String]?
    let status: String?
    let businessHours: String?
}

struct PlusApiResultPlusShopVO: Codable {
    let data: PlusShopVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusShopVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let userId: Int?
    let name: String?
    let description: String?
    let logo: ImageMediaResource?
    let cover: ImageMediaResource?
    let contactPhone: String?
    let contactEmail: String?
    let location: GeoPoint?
    let address: String?
    let licenseNumber: String?
    let tags: [String]?
    let status: String?
    let businessHours: String?
}

struct PlusShareForm: Codable {
    let title: String?
    let description: String?
    let type: String?
    let contents: ShareContents?
    let contentType: String?
    let status: String?
    let shareUrl: String?
    let contentIds: [String]?
    let password: String?
    let expireAt: String?
    let clickCount: Int?
    let tags: TagsContent?
    let shareCode: String?
}

struct ShareContents: Codable {
    let items: [ShareItem]?
}

struct ShareItem: Codable {

}

struct PlusApiResultPlusShareVO: Codable {
    let data: PlusShareVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusShareVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let title: String?
    let description: String?
    let type: String?
    let contents: ShareContents?
    let contentType: String?
    let status: String?
    let shareUrl: String?
    let contentIds: [String]?
    let password: String?
    let expireAt: String?
    let clickCount: Int?
    let tags: TagsContent?
    let shareCode: String?
}

struct PlusShareVisitRecordForm: Codable {
    let shareId: Int?
    let ipAddress: String?
    let userAgent: String?
    let accessedAt: String?
    let success: Bool?
}

struct PlusApiResultPlusShareVisitRecordVO: Codable {
    let data: PlusShareVisitRecordVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusShareVisitRecordVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let shareId: Int?
    let ipAddress: String?
    let userAgent: String?
    let accessedAt: String?
    let success: Bool?
}

struct PlusShardingKeyForm: Codable {
    let shardingKey: String?
    let tenantId: Int?
    let owner: String?
    let ownerId: Int?
    let status: String?
    let description: String?
}

struct PlusApiResultPlusShardingKeyVO: Codable {
    let data: PlusShardingKeyVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusShardingKeyVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let shardingKey: String?
    let tenantId: Int?
    let owner: String?
    let ownerId: Int?
    let status: String?
    let description: String?
}

struct PlusApiSecurityPolicyForm: Codable {
    let policyCode: String?
    let apiType: String?
    let pathPattern: String?
    let httpMethod: String?
    let matchMode: String?
    let authMode: String?
    let allowAnonymous: Bool?
    let requiredRoles: String?
    let requiredPermissions: String?
    let priority: Int?
    let enabled: Bool?
    let description: String?
}

struct PlusApiResultPlusApiSecurityPolicyVO: Codable {
    let data: PlusApiSecurityPolicyVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiSecurityPolicyVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let policyCode: String?
    let apiType: String?
    let pathPattern: String?
    let httpMethod: String?
    let matchMode: String?
    let authMode: String?
    let allowAnonymous: Bool?
    let requiredRoles: String?
    let requiredPermissions: String?
    let priority: Int?
    let enabled: Bool?
    let description: String?
}

struct PlusSchemaForm: Codable {
    let name: String?
    let description: String?
    let status: Int?
    let tableCount: Int?
    let lastSyncTime: String?
    let isDefault: Bool?
    let datasourceId: Int?
}

struct PlusApiResultPlusSchemaVO: Codable {
    let data: PlusSchemaVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusSchemaVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let description: String?
    let status: Int?
    let tableCount: Int?
    let lastSyncTime: String?
    let isDefault: Bool?
    let datasourceId: Int?
    let tableIds: [Int]?
}

struct PlusRoleForm: Codable {
    let code: String?
    let name: String?
    let description: String?
    let status: String?
}

struct PlusApiResultPlusRoleVO: Codable {
    let data: PlusRoleVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusRoleVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let code: String?
    let name: String?
    let description: String?
    let status: String?
}

struct PlusRolePermissionForm: Codable {
    let roleId: Int?
    let roleUuid: String?
    let permissionId: Int?
    let permissionUuid: String?
    let enabled: Bool?
    let description: String?
    let operatorId: Int?
}

struct PlusApiResultPlusRolePermissionVO: Codable {
    let data: PlusRolePermissionVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusRolePermissionVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let roleId: Int?
    let roleUuid: String?
    let permissionId: Int?
    let permissionUuid: String?
    let enabled: Bool?
    let description: String?
    let operatorId: Int?
    let status: String?
}

struct PlusInvokeRecordForm: Codable {
    let type: String?
    let apiEndpoint: String?
    let functionName: String?
    let requestParams: [String: Any]?
    let headers: [String: Any]?
    let status: String?
    let duration: Int?
    let errorMsg: String?
    let userId: Int?
    let clientIp: String?
    let clientLocation: String?
    let userAgent: String?
    let browserInfo: String?
    let clientId: String?
}

struct PlusApiResultPlusInvokeRecordVO: Codable {
    let data: PlusInvokeRecordVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusInvokeRecordVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let type: String?
    let apiEndpoint: String?
    let functionName: String?
    let requestParams: [String: Any]?
    let headers: [String: Any]?
    let status: String?
    let duration: Int?
    let errorMsg: String?
    let userId: Int?
    let clientIp: String?
    let clientLocation: String?
    let userAgent: String?
    let browserInfo: String?
    let clientId: String?
}

struct PlusUserRoleForm: Codable {
    let userId: Int?
    let roleId: Int?
}

struct PlusApiResultPlusUserRoleVO: Codable {
    let data: PlusUserRoleVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusUserRoleVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let userId: Int?
    let roleId: Int?
}

struct PlusAiPromptForm: Codable {
    let title: String?
    let content: String?
    let description: String?
    let categoryId: Int?
    let enabled: Bool?
    let sort: Int?
    let parameters: [String: Any]?
    let creator: String?
    let model: String?
    let tags: TagsContent?
    let usageCount: Int?
    let avgResponseTime: Int?
}

struct PlusAiPromptVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let title: String?
    let content: String?
    let description: String?
    let categoryId: Int?
    let enabled: Bool?
    let sort: Int?
    let parameters: [String: Any]?
    let creator: String?
    let model: String?
    let tags: TagsContent?
    let usageCount: Int?
    let avgResponseTime: Int?
}

struct PlusApiResultPlusAiPromptVO: Codable {
    let data: PlusAiPromptVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusProjectForm: Codable {
    let name: String?
    let code: String?
    let description: String?
    let status: String?
    let leaderId: Int?
    let startTime: String?
    let endTime: String?
    let budgetAmount: Int?
    let isDeleted: Bool?
}

struct PlusApiResultPlusProjectVO: Codable {
    let data: PlusProjectVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusProjectVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let name: String?
    let code: String?
    let description: String?
    let status: String?
    let leaderId: Int?
    let startTime: String?
    let endTime: String?
    let budgetAmount: Int?
    let isDeleted: Bool?
}

struct Attributes: Codable {
    let items: [AttributeItem]?
}

struct PlusProductForm: Codable {
    let title: String?
    let code: String?
    let subtitle: String?
    let resources: AssetMediaResourceList?
    let price: Double?
    let originalPrice: Double?
    let stock: Int?
    let salesCount: Int?
    let status: String?
    let onSaleAt: String?
    let description: String?
    let categoryId: Int?
    let baseAttributes: Attributes?
    let specAttributes: Attributes?
}

struct PlusApiResultPlusProductVO: Codable {
    let data: PlusProductVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusProductVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let userId: Int?
    let title: String?
    let code: String?
    let subtitle: String?
    let resources: AssetMediaResourceList?
    let tags: TagsContent?
    let price: Double?
    let originalPrice: Double?
    let stock: Int?
    let salesCount: Int?
    let status: String?
    let onSaleAt: String?
    let description: String?
    let categoryId: Int?
    let baseAttributes: Attributes?
    let specAttributes: Attributes?
}

struct GetUserInfoResponse: Codable {
    let userId: String?
    let openId: String?
    let unionId: String?
    let username: String?
    let email: String?
    let emailVerified: Bool?
    let fullName: String?
    let avatarUrl: String?
    let gender: String?
    let nickname: String?
    let sex: Int?
    let city: String?
    let province: String?
    let country: String?
    let privileges: [String]?
    let bio: String?
    let blog: String?
    let location: String?
    let company: String?
    let firstName: String?
    let lastName: String?
    let locale: String?
    let mobile: String?
    let jobTitle: String?
    let officeLocation: String?
}

struct GrantedAuthority: Codable {
    let authority: String?
}

struct PPTAnimation: Codable {
    let id: String?
    let elId: String?
    let effect: String?
    let type: PPTAnimationType?
    let duration: Int?
    let trigger: PPTAnimationTrigger?
}

struct PPTAnimationTrigger: Codable {

}

struct PPTAnimationType: Codable {

}

struct PPTBaseElement: Codable {
    let id: String?
    let left: Int?
    let top: Int?
    let lock: Bool?
    let groupId: String?
    let width: Int?
    let height: Int?
    let rotate: Int?
    let link: PPTElementLink?
    let name: String?
}

struct PPTElementLink: Codable {
    let type: PPTElementLinkType?
    let target: String?
}

struct PPTElementLinkType: Codable {

}

struct PPTGradient: Codable {
    let type: PPTGradientType?
    let colors: [PPTGradientColor]?
    let rotate: Int?
}

struct PPTGradientColor: Codable {
    let pos: Int?
    let color: String?
}

struct PPTGradientType: Codable {

}

struct PPTNote: Codable {
    let id: String?
    let content: String?
    let time: Int?
    let user: String?
    let elId: String?
    let replies: [PPTNoteReply]?
}

struct PPTNoteReply: Codable {
    let id: String?
    let content: String?
    let time: Int?
    let user: String?
}

struct PPTSectionTag: Codable {
    let id: String?
    let title: String?
}

struct PPTSlideBackground: Codable {
    let type: PPTSlideBackgroundType?
    let color: String?
    let image: PPTSlideBackgroundImage?
    let pptgradient: PPTGradient?
}

struct PPTSlideBackgroundImage: Codable {
    let src: String?
    let size: String?
}

struct PPTSlideBackgroundType: Codable {

}

struct PPTSlideType: Codable {

}

struct PPTTurningMode: Codable {

}

struct PlusPermission: Codable {
    let tenantId: Int?
    let organizationId: Int?
    let dataScope: String?
    let id: Int?
    let uuid: String?
    let createdAt: String?
    let updatedAt: String?
    let v: Int?
    let name: String?
    let code: String?
    let description: String?
    let status: String?
    let sortOrder: Int?
    let resourceUrl: String?
    let httpMethod: String?
}

struct PlusPptPayload: Codable {

}

struct PlusPptSlide: Codable {
    let id: String?
    let elements: [PPTBaseElement]?
    let notes: [PPTNote]?
    let remark: String?
    let background: PPTSlideBackground?
    let animations: [PPTAnimation]?
    let turningMode: PPTTurningMode?
    let sectionTag: PPTSectionTag?
    let type: PPTSlideType?
    let payload: PlusPptPayload?
}

struct PlusPptTemplate: Codable {
    let tenantId: Int?
    let organizationId: Int?
    let dataScope: String?
    let id: Int?
    let uuid: String?
    let createdAt: String?
    let updatedAt: String?
    let v: Int?
    let title: String?
    let description: String?
    let coverImages: ImageMediaResourceList?
    let type: String?
    let status: String?
    let authorId: Int?
    let authorName: String?
    let author: PlusUser?
    let tags: PlusPptTemplateTags?
    let meta: PlusPptTemplateMeta?
    let slides: [PlusPptTemplateSlide]?
}

struct PlusPptTemplateForm: Codable {
    let title: String?
    let description: String?
    let coverImages: ImageMediaResourceList?
    let type: String?
    let status: String?
    let authorId: Int?
    let authorName: String?
    let tags: PlusPptTemplateTags?
    let meta: PlusPptTemplateMeta?
    let slides: [PlusPptTemplateSlide]?
}

struct PlusPptTemplateMeta: Codable {
    let payloadUrl: String?
    let previewUrls: [String]?
}

struct PlusPptTemplateSlide: Codable {
    let tenantId: Int?
    let organizationId: Int?
    let dataScope: String?
    let id: Int?
    let uuid: String?
    let createdAt: String?
    let updatedAt: String?
    let v: Int?
    let templateId: Int?
    let pptTemplate: PlusPptTemplate?
    let type: PPTSlideType?
    let title: String?
    let description: String?
    let sortOrder: Int?
    let layoutType: String?
    let slideConfig: PlusPptSlide?
    let payload: PlusPptPayload?
    let pptturningMode: PPTTurningMode?
}

struct PlusPptTemplateTags: Codable {
    let scene: [String]?
    let design: [String]?
    let theme: [String]?
    let style: [String]?
}

struct PlusRole: Codable {
    let tenantId: Int?
    let organizationId: Int?
    let dataScope: String?
    let id: Int?
    let uuid: String?
    let createdAt: String?
    let updatedAt: String?
    let v: Int?
    let code: String?
    let name: String?
    let description: String?
    let status: String?
    let permissions: [PlusPermission]?
    let permissionCodes: [String]?
}

struct PlusUser: Codable {
    let tenantId: Int?
    let organizationId: Int?
    let dataScope: String?
    let id: Int?
    let uuid: String?
    let createdAt: String?
    let updatedAt: String?
    let v: Int?
    let username: String?
    let nickname: String?
    let password: String?
    let platform: String?
    let type: String?
    let gender: String?
    let faceImage: ImageMediaResource?
    let faceVideo: VideoMediaResource?
    let salt: String?
    let scene: String?
    let email: String?
    let phone: String?
    let countryCode: String?
    let provinceCode: String?
    let cityCode: String?
    let districtCode: String?
    let address: String?
    let bio: String?
    let birthDate: String?
    let oauthUserInfo: GetUserInfoResponse?
    let status: String?
    let roles: [PlusRole]?
    let metadata: UserMetadata?
    let socialInfoList: SocialInfoList?
    let roleCodes: [String]?
    let authorities: [GrantedAuthority]?
}

struct UserMetadata: Codable {
    let spMchId: Int?
    let partnerId: Int?
    let agentId: Int?
    let shopId: Int?
    let fromUserId: Int?
}

struct PlusApiResultPlusPptTemplateVO: Codable {
    let data: PlusPptTemplateVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusPptTemplateSlideVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let templateId: Int?
    let sectionTitle: String?
    let sectionContent: String?
    let pageNumber: Int?
    let layoutType: String?
    let backgroundImage: String?
    let sortOrder: Int?
    let isRequired: Bool?
}

struct PlusPptTemplateVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let title: String?
    let description: String?
    let coverImages: ImageMediaResourceList?
    let type: String?
    let status: String?
    let authorId: Int?
    let authorName: String?
    let tags: PlusPptTemplateTags?
    let meta: PlusPptTemplateMeta?
    let slides: [PlusPptTemplateSlideVO]?
}

struct PlusPptTemplateSlideForm: Codable {
    let templateId: Int?
    let pageNumber: Int?
    let layoutType: String?
    let sortOrder: Int?
    let isRequired: Bool?
    let createdAt: String?
    let updatedAt: String?
}

struct PlusApiResultPlusPptTemplateSlideVO: Codable {
    let data: PlusPptTemplateSlideVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusPermissionForm: Codable {
    let name: String?
    let code: String?
    let description: String?
    let status: String?
    let sortOrder: Int?
    let resourceUrl: String?
    let httpMethod: String?
}

struct PlusApiResultPlusPermissionVO: Codable {
    let data: PlusPermissionVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusPermissionVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let name: String?
    let code: String?
    let description: String?
    let status: String?
    let sortOrder: Int?
    let resourceUrl: String?
    let httpMethod: String?
}

struct PlusPartnerForm: Codable {
    let name: String?
    let level: String?
    let status: String?
    let contactName: String?
    let contactPhone: String?
    let contactEmail: String?
    let companyAddress: String?
    let businessLicense: String?
    let settlementAccount: String?
    let commissionRate: Double?
    let totalCommission: Double?
    let withdrawableCommission: Double?
    let withdrawnCommission: Double?
    let promotionCode: String?
    let parentId: Int?
    let parentMetadata: PlusTreeParentMetadata?
    let parentUuid: String?
    let cooperationStartTime: String?
    let cooperationEndTime: String?
    let remark: String?
}

struct PlusTreeParentMetadata: Codable {
    let parentIds: [Int]?
}

struct PlusApiResultPlusPartnerVO: Codable {
    let data: PlusPartnerVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusPartnerVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let name: String?
    let level: String?
    let status: String?
    let contactName: String?
    let contactPhone: String?
    let contactEmail: String?
    let companyAddress: String?
    let businessLicense: String?
    let settlementAccount: String?
    let commissionRate: Double?
    let totalCommission: Double?
    let withdrawableCommission: Double?
    let withdrawnCommission: Double?
    let promotionCode: String?
    let parentId: Int?
    let parentMetadata: PlusTreeParentMetadata?
    let parentUuid: String?
    let cooperationStartTime: String?
    let cooperationEndTime: String?
    let remark: String?
}

struct PlusParticipantForm: Codable {
    let type: String?
    let name: String?
    let face: ImageMediaResource?
    let userId: Int?
    let agentId: Int?
    let role: String?
    let contextType: String?
    let contextId: Int?
    let conversationId: Int?
    let groupType: String?
    let conversationType: String?
    let isCreator: Bool?
    let isOnline: Bool?
    let lastActiveTime: String?
    let isTemporary: Bool?
}

struct PlusApiResultPlusParticipantVO: Codable {
    let data: PlusParticipantVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusParticipantVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let type: String?
    let name: String?
    let face: ImageMediaResource?
    let userId: Int?
    let agentId: Int?
    let role: String?
    let contextType: String?
    let contextId: Int?
    let conversationId: Int?
    let groupType: String?
    let conversationType: String?
    let isCreator: Bool?
    let isOnline: Bool?
    let lastActiveTime: String?
    let isTemporary: Bool?
}

struct PlusOssBucketForm: Codable {
    let name: String?
    let region: String?
    let channel: String?
    let channelConfigId: Int?
    let description: String?
    let status: String?
    let creationDate: String?
    let arn: String?
    let endpoint: String?
    let storageClass: String?
    let versioningEnabled: Bool?
    let encryptionEnabled: Bool?
    let encryptionType: String?
    let acl: String?
}

struct PlusApiResultPlusOssBucketVO: Codable {
    let data: PlusOssBucketVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusOssBucketVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let v: Int?
    let userId: Int?
    let name: String?
    let region: String?
    let channel: String?
    let channelConfigId: Int?
    let description: String?
    let status: String?
    let creationDate: String?
    let arn: String?
    let endpoint: String?
    let storageClass: String?
    let versioningEnabled: Bool?
    let encryptionEnabled: Bool?
    let encryptionType: String?
    let acl: String?
}

struct PlusOrganizationForm: Codable {
    let name: String?
    let code: String?
    let status: String?
    let description: String?
    let parentId: Int?
    let installAppList: InstallAppList?
}

struct PlusApiResultPlusOrganizationVO: Codable {
    let data: PlusOrganizationVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusOrganizationVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let code: String?
    let status: String?
    let description: String?
    let parentId: Int?
    let installAppList: InstallAppList?
}

struct PlusPositionForm: Codable {
    let parentId: Int?
    let name: String?
    let description: String?
    let owner: String?
    let ownerId: Int?
    let code: String?
    let level: Int?
    let sortOrder: Int?
    let isActive: Bool?
}

struct PlusApiResultPlusPositionVO: Codable {
    let data: PlusPositionVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusPositionVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let parentId: Int?
    let name: String?
    let description: String?
    let owner: String?
    let ownerId: Int?
    let code: String?
    let level: Int?
    let sortOrder: Int?
    let isActive: Bool?
    let organizationName: String?
    let memberIds: [Int]?
}

struct PlusMemberRelationsForm: Codable {
    let memberId: Int?
    let owner: String?
    let ownerId: Int?
    let type: String?
    let targetId: Int?
    let isPrimary: Bool?
    let isActive: Bool?
    let effectiveAt: String?
    let expiredAt: String?
    let sortOrder: Int?
    let remark: String?
    let createdAt: String?
    let updatedAt: String?
}

struct PlusApiResultPlusMemberRelationsVO: Codable {
    let data: PlusMemberRelationsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusMemberRelationsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let memberId: Int?
    let owner: String?
    let ownerId: Int?
    let type: String?
    let parentId: Int?
    let targetId: Int?
    let isPrimary: Bool?
    let isActive: Bool?
    let effectiveAt: String?
    let expiredAt: String?
    let sortOrder: Int?
    let remark: String?
}

struct PlusOrganizationMemberForm: Codable {
    let userId: Int?
    let owner: String?
    let ownerId: Int?
    let isActive: Bool?
    let joinedAt: String?
    let leftAt: String?
    let remark: String?
}

struct PlusApiResultPlusOrganizationMemberVO: Codable {
    let data: PlusOrganizationMemberVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusOrganizationMemberVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let userId: Int?
    let owner: String?
    let ownerId: Int?
    let isActive: Bool?
    let joinedAt: String?
    let leftAt: String?
    let remark: String?
    let departmentIds: [Int]?
    let positionIds: [Int]?
    let roleIds: [Int]?
    let primaryDepartmentId: Int?
    let primaryPositionId: Int?
    let valid: Bool?
}

struct PlusApiResultBoolean: Codable {
    let data: Bool?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct Participant: Codable {
    let id: Int?
    let uuid: String?
    let openId: String?
    let unionId: String?
    let name: String?
    let face: ImageMediaResource?
    let deviceId: Int?
    let deviceUuid: String?
    let device: Bool?
}

struct PlusNotificationForm: Codable {
    let role: String?
    let senderId: Int?
    let sender: Participant?
    let receiverId: Int?
    let receiver: Participant?
    let groupId: Int?
    let title: String?
    let content: String?
    let type: String?
    let channelType: String?
    let templateId: String?
    let templateParams: [String: Any]?
    let redirectUrl: String?
    let miniProgramPath: String?
    let status: String?
    let sentAt: String?
    let readAt: String?
    let extraData: [String: Any]?
    let retryCount: Int?
    let maxRetryCount: Int?
    let errorMessage: String?
}

struct PlusApiResultPlusNotificationVO: Codable {
    let data: PlusNotificationVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusNotificationVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let role: String?
    let senderId: Int?
    let sender: Participant?
    let receiverId: Int?
    let receiver: Participant?
    let groupId: Int?
    let title: String?
    let content: String?
    let type: String?
    let channelType: String?
    let templateId: String?
    let templateParams: [String: Any]?
    let redirectUrl: String?
    let miniProgramPath: String?
    let status: String?
    let sentAt: String?
    let readAt: String?
    let extraData: [String: Any]?
    let retryCount: Int?
    let maxRetryCount: Int?
    let errorMessage: String?
}

struct PlusNotesForm: Codable {
    let id: Int?
    let title: String?
    let content: String?
    let userId: Int?
    let categoryId: Int?
    let tags: String?
    let accessScope: String?
    let password: String?
    let coverImage: ImageMediaResource?
    let status: String?
    let remark: String?
    let diskId: Int?
    let parentId: Int?
    let type: String?
    let tagsAsTagsContent: TagsContent?
}

struct PlusApiResultPlusNotesVO: Codable {
    let data: PlusNotesVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusNotesVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let title: String?
    let content: String?
    let userId: Int?
    let userName: String?
    let categoryId: Int?
    let categoryName: String?
    let tags: String?
    let accessScope: String?
    let password: String?
    let coverImage: ImageMediaResource?
    let status: String?
    let remark: String?
    let diskId: Int?
    let parentId: Int?
    let type: String?
    let path: String?
    let relativePath: String?
}

struct PlusNewsForm: Codable {
    let title: String?
    let url: String?
    let source: String?
    let summary: String?
    let publishTime: String?
    let tags: TagsContent?
    let categoryId: Int?
    let userId: Int?
}

struct PlusApiResultPlusNewsVO: Codable {
    let data: PlusNewsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusNewsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let userId: Int?
    let title: String?
    let url: String?
    let source: String?
    let summary: String?
    let publishTime: String?
    let tags: TagsContent?
}

struct DnsServer: Codable {
    let address: String?
    let port: Int?
    let type: String?
    let priority: Int?
    let enabled: Bool?
}

struct DnsServers: Codable {
    let servers: [DnsServer]?
    let empty: Bool?
}

struct PlusHostDomainForm: Codable {
    let domainName: String?
    let tld: String?
    let registrar: String?
    let ownerId: Int?
    let registeredAt: String?
    let expiredAt: String?
    let status: String?
    let dnsServers: DnsServers?
    let resolutionStatus: String?
    let autoRenew: Bool?
    let remark: String?
}

struct DnsRecordValue: Codable {
    let values: [String]?
    let empty: Bool?
    let firstValue: String?
}

struct PlusApiResultPlusHostDomainVO: Codable {
    let data: PlusHostDomainVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusDnsRecordVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let domainId: Int?
    let recordName: String?
    let fileName: String?
    let fileContent: String?
    let recordType: String?
    let recordValue: DnsRecordValue?
    let ttl: Int?
    let priority: Int?
    let enabled: Bool?
    let recordValues: [String]?
    let firstRecordValue: String?
}

struct PlusHostDomainVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let domainName: String?
    let tld: String?
    let registrar: String?
    let ownerId: Int?
    let registeredAt: String?
    let expiredAt: String?
    let status: String?
    let dnsServers: DnsServers?
    let resolutionStatus: String?
    let autoRenew: Bool?
    let remark: String?
    let dnsRecords: [PlusDnsRecordVO]?
}

struct PlusDnsRecordForm: Codable {
    let domainId: Int?
    let recordName: String?
    let fileName: String?
    let fileContent: String?
    let recordType: String?
    let recordValue: DnsRecordValue?
    let ttl: Int?
    let priority: Int?
    let enabled: Bool?
}

struct PlusApiResultPlusDnsRecordVO: Codable {
    let data: PlusDnsRecordVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusMusicForm: Codable {
    let title: String?
    let description: String?
    let contentUrl: String?
    let format: String?
    let duration: Int?
    let fileSize: Int?
    let thumbnailUrl: String?
    let artist: String?
    let genre: String?
    let bitrate: Int?
    let status: String?
}

struct PlusApiResultPlusMusicVO: Codable {
    let data: PlusMusicVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusMusicVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let version: Int?
    let title: String?
    let coverImages: ImageMediaResourceList?
    let description: String?
    let resource: MusicMediaResource?
    let author: AuthorInfo?
    let contentUrl: String?
    let resourceList: AssetMediaResourceList?
    let format: String?
    let duration: Int?
    let fileSize: Int?
    let thumbnailUrl: String?
    let artist: String?
    let genre: String?
    let bitrate: Int?
    let status: String?
}

struct AspectRatio: Codable {
    let ratio: String?
    let width: Double?
    let height: Double?
}

struct ModelFunctionInfo: Codable {
    let functions: [ModelFunctionItem]?
}

struct ModelFunctionItem: Codable {
    let type: String?
    let supported: Bool?
}

struct ModelLimitInfo: Codable {
    let unit: String?
    let items: [ModelLimitItem]?
}

struct ModelLimitItem: Codable {
    let type: String?
    let value: Double?
}

struct ModelMetadata: Codable {
    let durations: [Int]?
    let resolutions: [String]?
    let ratios: [AspectRatio]?
    let isMultimodal: Bool?
    let isReasoning: Bool?
    let isToolCall: Bool?
}

struct ModelPrice: Codable {
    let unit: String?
    let items: [ModelPriceItem]?
    let currency: String?
}

struct ModelPriceItem: Codable {
    let type: String?
    let price: Double?
}

struct PlusAiModelInfoForm: Codable {
    let objectId: String?
    let model: String?
    let modelId: String?
    let modelKey: String?
    let vendorModel: String?
    let name: String?
    let description: String?
    let channel: String?
    let vendor: String?
    let modelVersion: String?
    let family: String?
    let openSource: Bool?
    let apiEndpoint: String?
    let modelType: String?
    let pricingType: String?
    let lifecycleStage: String?
    let releaseDate: String?
    let deprecatedAt: String?
    let contextTokens: Int?
    let maxInputTokens: Int?
    let maxOutputTokens: Int?
    let supportReasoning: Bool?
    let supportMultimodal: Bool?
    let supportFunctionCall: Bool?
    let supportStructuredOutput: Bool?
    let supportRealtime: Bool?
    let supportFineTuning: Bool?
    let popularityScore: Int?
    let ownedBy: String?
    let scenes: SceneContent?
    let tokenLimit: ModelLimitInfo?
    let functionInfo: ModelFunctionInfo?
    let priceInfo: ModelPrice?
    let metadata: ModelMetadata?
    let productSupportInfo: [String: Any]?
    let supportedVoices: String?
    let defaultTemperature: Double?
    let defaultTopP: Double?
    let defaultFrequencyPenalty: Double?
    let defaultPresencePenalty: Double?
    let status: String?
    let usageCount: Int?
    let totalTokens: Int?
    let avgResponseTime: Int?
    let tags: TagsContent?
    let configParams: String?
}

struct SceneContent: Codable {
    let scenes: [String]?
    let children: [SceneContent]?
}

struct PlusAiModelInfoVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let objectId: String?
    let model: String?
    let modelId: String?
    let modelKey: String?
    let vendorModel: String?
    let name: String?
    let description: String?
    let channel: String?
    let vendor: String?
    let modelVersion: String?
    let family: String?
    let apiEndpoint: String?
    let modelType: String?
    let pricingType: String?
    let lifecycleStage: String?
    let releaseDate: String?
    let deprecatedAt: String?
    let contextTokens: Int?
    let maxInputTokens: Int?
    let maxOutputTokens: Int?
    let supportReasoning: Bool?
    let supportMultimodal: Bool?
    let supportFunctionCall: Bool?
    let supportStructuredOutput: Bool?
    let supportRealtime: Bool?
    let supportFineTuning: Bool?
    let popularityScore: Int?
    let ownedBy: String?
    let scenes: SceneContent?
    let tokenLimit: ModelLimitInfo?
    let functionInfo: ModelFunctionInfo?
    let priceInfo: ModelPrice?
    let metadata: ModelMetadata?
    let productSupportInfo: [String: Any]?
    let supportedVoices: String?
    let defaultTemperature: Double?
    let defaultTopP: Double?
    let defaultFrequencyPenalty: Double?
    let defaultPresencePenalty: Double?
    let status: String?
    let usageCount: Int?
    let totalTokens: Int?
    let avgResponseTime: Int?
    let tags: TagsContent?
    let configParams: String?
}

struct PlusApiResultPlusAiModelInfoVO: Codable {
    let data: PlusAiModelInfoVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusAiModelPriceForm: Codable {
    let objectId: String?
    let model: String?
    let modelId: Int?
    let channel: String?
    let modelKey: String?
    let productCode: String?
    let featureCode: String?
    let billingType: String?
    let priceItemType: String?
    let tierName: String?
    let rulePriority: Int?
    let unit: String?
    let unitSize: Double?
    let price: Double?
    let inputPrice: Double?
    let batchInputPrice: Double?
    let cachedInputPrice: Double?
    let batchCachedInputPrice: Double?
    let outputPrice: Double?
    let batchOutputPrice: Double?
    let currency: String?
    let minUsage: Double?
    let maxUsage: Double?
    let effectiveFrom: String?
    let effectiveTo: String?
    let defaultRule: Bool?
    let status: String?
    let metadata: [String: Any]?
}

struct PlusAiModelPriceVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let objectId: String?
    let model: String?
    let modelId: Int?
    let channel: String?
    let modelKey: String?
    let productCode: String?
    let featureCode: String?
    let billingType: String?
    let priceItemType: String?
    let tierName: String?
    let rulePriority: Int?
    let unit: String?
    let unitSize: Double?
    let price: Double?
    let inputPrice: Double?
    let batchInputPrice: Double?
    let cachedInputPrice: Double?
    let batchCachedInputPrice: Double?
    let outputPrice: Double?
    let batchOutputPrice: Double?
    let currency: String?
    let minUsage: Double?
    let maxUsage: Double?
    let effectiveFrom: String?
    let effectiveTo: String?
    let defaultRule: Bool?
    let status: String?
    let metadata: [String: Any]?
}

struct PlusApiResultPlusAiModelPriceVO: Codable {
    let data: PlusAiModelPriceVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AccountConfigMetadata: Codable {

}

struct AecConfig: Codable {
    let echoMode: Int?
    let delayEstimation: Int?
    let noiseSuppression: Int?
    let echoTailMs: Int?
    let sampleRate: Int?
}

struct AgentDefinition: Codable {
    let id: Int?
    let uuid: String?
    let name: String?
    let instructions: String?
    let description: String?
    let type: String?
    let bizType: String?
    let agents: TeamAgentMembers?
    let toolConfig: AgentToolConfig?
    let baseConfig: PlusAiAgentConfig?
    let knowledgeConfig: AgentKnowledgeConfig?
    let memoryConfig: AgentMemoryConfig?
    let speechConfig: SpeechConfig?
    let chatOptions: ChatOptions?
}

struct AgentExecutionContext: Codable {
    let id: String?
    let bizType: String?
    let uuid: String?
    let maxFlowSteps: Int?
    let flowSteps: Int?
    let threads: Int?
    let createAt: String?
    let maxDuration: Int?
    let listeners: [ChatMessageListener]?
    let state: String?
    let chatContext: ChatContext?
    let shardingContext: ShardingContext?
    let flow: Flow?
    let root: AgentExecutionContext?
    let parent: AgentExecutionContext?
    let pre: PlusAgent?
    let current: PlusAgent?
    let responseHandler: ChatResponseHandler?
    let project: PlusProjectObject?
    let disk: PlusDiskObject?
    let diskRootFile: PlusFileObject?
    let completed: Bool?
    let running: Bool?
    let expired: Bool?
    let waiting: Bool?
    let failed: Bool?
    let paused: Bool?
    let end: Bool?
    let init: Bool?
    let agentSCOPES: [String: AgentScope]?
    let overSteps: Bool?
}

struct AgentKnowledgeConfig: Codable {
    let list: [AgentKnowledgeItem]?
}

struct AgentKnowledgeItem: Codable {
    let id: Int?
}

struct AgentMemoryConfig: Codable {
    let profile: MemoryProfile?
}

struct AgentMetadata: Codable {

}

struct AgentScope: Codable {

}

struct AgentToolConfig: Codable {
    let tools: [UseTool]?
}

struct Approximate: Codable {
    let city: String?
    let country: String?
    let region: String?
    let timezone: String?
}

struct AudioParameters: Codable {
    let voice: String?
    let format: String?
}

struct AudioTranscriptionOptions: Codable {
    let model: String?
}

struct BucketObject: Codable {
    let name: String?
    let region: String?
    let creationDate: String?
    let arn: String?
}

struct ChatCompletion: Codable {
    let id: String?
    let object: String?
    let created: Int?
    let model: String?
    let choices: [ChatCompletionChoice]?
    let usage: CompletionUsage?
    let metadata: ChatCompletionMetadata?
    let content: String?
    let agent: PlusAgent?
    let systemFingerprint: String?
}

struct ChatCompletionAudio: Codable {

}

struct ChatCompletionChoice: Codable {
    let index: Int?
    let message: ChatCompletionMessage?
    let logprobs: LogProbInfo?
    let finishReason: String?
}

struct ChatCompletionChunk: Codable {
    let id: String?
    let object: String?
    let created: Int?
    let model: String?
    let choices: [ChatCompletionChunkChoice]?
    let usage: CompletionUsage?
    let metadata: ChatCompletionMetadata?
    let content: String?
    let agent: PlusAgent?
    let reasoningContent: String?
    let systemFingerprint: String?
}

struct ChatCompletionChunkChoice: Codable {
    let index: Int?
    let delta: ChatCompletionChunkDelta?
    let logprobs: LogProbInfo?
    let finishReason: String?
}

struct ChatCompletionChunkDelta: Codable {
    let role: String?
    let content: String?
    let audio: ChatCompletionAudio?
    let reasoningContent: String?
    let toolCalls: [ChatCompletionMessageToolCall]?
}

struct ChatCompletionMessage: Codable {
    let role: String?
    let content: String?
    let audio: ChatCompletionAudio?
    let toolCalls: [ChatCompletionMessageToolCall]?
}

struct ChatCompletionMessageToolCall: Codable {
    let id: String?
    let type: String?
    let function: FunctionCall?
}

struct ChatCompletionMetadata: Codable {
    let actions: [String]?
    let agent: [String: Any]?
    let parentMessageId: Int?
    let parentMessageUuid: String?
}

struct ChatContext: Codable {
    let indent: String?
    let responseHandler: ChatResponseHandler?
    let shardingContext: ShardingContext?
    let conversationId: String?
    let conversationUuid: String?
    let userId: Int?
    let knowledgeBaseId: Int?
    let agentId: Int?
    let flowId: Int?
    let datasourceId: Int?
    let parentMessageId: Int?
    let saveAudio: Bool?
    let modalities: [String]?
    let chatOptions: PlusChatOptions?
    let responseChannels: [String]?
}

struct ChatMessageListener: Codable {

}

struct ChatOptions: Codable {
    let model: String?
    let temperature: Double?
    let topP: Double?
    let topK: Int?
    let frequencyPenalty: Double?
    let presencePenalty: Double?
    let maxTokens: Int?
    let stopSequences: [String]?
}

struct ChatResponseHandler: Codable {

}

struct ChatState: Codable {
    let content: String?
    let reasoningContent: String?
    let thinking: Bool?
}

struct CompletionTokensDetails: Codable {
    let reasoningTokens: Int?
    let audioTokens: Int?
    let acceptedPredictionTokens: Int?
    let rejectedPredictionTokens: Int?
}

struct CompletionUsage: Codable {
    let promptTokens: Int?
    let completionTokens: Int?
    let totalTokens: Int?
    let promptCacheHitTokens: Int?
    let promptCacheMissTokens: Int?
    let promptTokensDetails: PromptTokensDetails?
    let completionTokensDetails: CompletionTokensDetails?
}

struct EdgeObject: Codable {
    let id: String?
    let name: String?
    let description: String?
    let sourceNodeId: String?
    let targetNodeId: String?
    let type: String?
    let condition: Any?
}

struct Flow: Codable {
    let id: String?
    let name: String?
    let description: String?
    let status: String?
    let nodes: [Node]?
    let edges: [EdgeObject]?
    let subFlows: [Flow]?
    let parentId: Int?
    let startTime: String?
    let endTime: String?
    let parentFlow: Flow?
    let lastNode: Node?
    let allAgents: [PlusAgent]?
}

struct Function: Codable {
    let description: String?
    let name: String?
    let parameters: [String: Any]?
    let strict: Bool?
}

struct FunctionCall: Codable {
    let name: String?
    let arguments: [String: Any]?
}

struct FunctionTool: Codable {
    let type: String?
    let function: Function?
}

struct GroupInfo: Codable {
    let id: String?
    let object: String?
    let created: Int?
    let model: String?
    let systemFingerprint: String?
    let metadata: ChatCompletionMetadata?
    let agent: PlusAgent?
}

struct IPlusChatMemory: Codable {
    let id: String?
}

struct JsonSchema: Codable {
    let name: String?
    let schema: [String: Any]?
    let strict: Bool?
}

struct LlmAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let apiKey: String?
    let baseUrl: String?
    let accessKey: String?
    let secretKey: String?
    let defaultModel: String?
    let bucket: BucketObject?
    let maxTokens: Int?
    let toolCall: Bool?
    let multimodal: Bool?
    let options: PlusChatOptions?
}

struct LogProbInfo: Codable {
    let tokens: [String]?
    let tokenLogprobs: [Double]?
    let textOffset: [Int]?
}

struct Media: Codable {
    let id: String?
    let mimeType: MimeType?
    let data: Any?
    let name: String?
    let dataAsByteArray: String?
}

struct MemoryProfile: Codable {
    let items: [ProfileItem]?
    let customs: [String: [ProfileItem]]?
    let description: String?
}

struct Message: Codable {
    let messageType: String?
    let text: String?
    let metadata: [String: Any]?
}

struct MessageBody: Codable {
    let id: String?
    let completion: ChatCompletion?
    let payload: MsgPayload?
    let chunk: ChatCompletionChunk?
    let audioFrame: AudioMediaResource?
    let groupInfos: [String: GroupInfo]?
    let groups: [String: [ChatCompletionChunk]]?
    let thinkStart: Int?
    let thinkEnd: Int?
    let state: ChatState?
}

struct MimeType: Codable {
    let type: String?
    let subtype: String?
    let parameters: [String: String]?
    let charset: String?
    let concrete: Bool?
    let subtypeSuffix: String?
    let wildcardType: Bool?
    let wildcardSubtype: Bool?
}

struct MsgAudioContent: Codable {
    let content: String?
    let resource: AudioMediaResource?
}

struct MsgFileContent: Codable {
    let content: String?
    let resource: FileMediaResource?
}

struct MsgImageContent: Codable {
    let content: String?
    let resource: ImageMediaResource?
}

struct MsgLocationContent: Codable {
    let content: String?
    let location: GeoPoint?
    let address: String?
    let name: String?
    let radius: Double?
}

struct MsgMusicContent: Codable {
    let content: String?
    let resource: MusicMediaResource?
    let title: String?
    let artist: String?
    let album: String?
    let duration: Int?
}

struct MsgPayload: Codable {
    let audio: MsgAudioContent?
    let file: MsgFileContent?
    let image: MsgImageContent?
    let location: MsgLocationContent?
    let music: MsgMusicContent?
    let text: MsgTextContent?
    let video: MsgVideoContent?
}

struct MsgTextContent: Codable {
    let content: String?
}

struct MsgVideoContent: Codable {
    let content: String?
    let resource: VideoMediaResource?
}

struct Node: Codable {
    let id: String?
    let name: String?
    let description: String?
    let type: String?
    let properties: [String: Any]?
    let startTime: String?
    let endTime: String?
    let agents: [PlusAgent]?
}

struct PlusAgent: Codable {
    let name: String?
    let id: Int?
    let definition: AgentDefinition?
    let description: String?
    let metadata: AgentMetadata?
    let uuid: String?
    let systemPrompt: Prompt?
    let accountConfig: LlmAccountConfig?
    let tools: [PromptToolDescription]?
    let executionContext: AgentExecutionContext?
    let chatContext: ChatContext?
    let chatOptions: ChatOptions?
    let instructions: [String]?
    let faceURL: String?
    let prompts: [String: Prompt]?
    let toolCallbackProvider: ToolCallbackProvider?
    let promptPath: String?
    let promptContextOptimizer: PromptContextOptimizer?
    let nextActions: [String]?
    let chatMemory: IPlusChatMemory?
}

struct PlusAiAgentConfig: Codable {
    let welcome: String?
    let questions: [String]?
    let saveFiles: Bool?
    let enableMemory: Bool?
    let maxHistoryMessages: Int?
    let useKnowledgeBase: Bool?
    let properties: [String: Any]?
}

struct PlusChatMessageContentForm: Codable {
    let role: String?
    let type: String?
    let status: String?
    let conversationId: Int?
    let conversationUuid: String?
    let agentId: Int?
    let agentType: String?
    let agentBizType: String?
    let content: MessageBody?
    let metadata: [String: Any]?
}

struct PlusChatOptions: Codable {
    let streamUsage: Bool?
    let model: String?
    let frequencyPenalty: Double?
    let logitBias: [String: Int]?
    let logprobs: Bool?
    let topLogprobs: Int?
    let maxTokens: Int?
    let maxCompletionTokens: Int?
    let n: Int?
    let modalities: [String]?
    let audio: AudioParameters?
    let presencePenalty: Double?
    let responseFormat: ResponseFormat?
    let streamOptions: StreamOptions?
    let stream: Bool?
    let seed: Int?
    let stop: [String]?
    let temperature: Double?
    let topP: Double?
    let tools: [FunctionTool]?
    let toolChoice: Any?
    let user: String?
    let parallelToolCalls: Bool?
    let store: Bool?
    let metadata: [String: String]?
    let reasoningEffort: String?
    let verbosity: String?
    let webSearchOptions: WebSearchOptions?
}

struct PlusDiskObject: Codable {
    let id: Int?
    let uuid: String?
    let owner: String?
    let ownerId: Int?
    let name: String?
    let type: String?
    let description: String?
    let diskSize: Int?
    let usedSize: Int?
}

struct PlusFileObject: Codable {
    let id: Int?
    let uuid: String?
    let diskId: Int?
    let name: String?
    let size: Int?
    let path: String?
    let relativePath: String?
    let type: String?
    let extension: String?
    let lastModifiedTime: String?
    let createdAt: String?
    let versionId: String?
    let description: String?
    let projectUuid: String?
    let projectId: Int?
    let owner: String?
    let ownerId: Int?
    let author: String?
    let prompt: String?
    let content: String?
    let tags: TagsContent?
    let readonly: Bool?
    let permission: [String]?
    let referenceFileId: Int?
    let children: [PlusFileObject]?
}

struct PlusProjectObject: Codable {
    let name: String?
    let id: String?
    let type: String?
    let owner: String?
    let lastModifiedTime: String?
    let version: String?
    let tags: TagsContent?
    let description: String?
    let author: String?
    let diskId: Int?
    let title: String?
    let uuid: String?
    let ownerId: Int?
    let createdAt: String?
    let files: [PlusFileObject]?
    let screenType: String?
}

struct ProfileItem: Codable {
    let name: String?
    let label: String?
    let values: [String]?
    let custom: Bool?
    let updateCount: Int?
    let samples: [String]?
    let description: String?
}

struct Prompt: Codable {
    let contents: String?
    let options: ChatOptions?
    let instructions: [Message]?
    let lastUserOrToolResponseMessage: Message?
    let userMessages: [UserMessage]?
    let userMessage: UserMessage?
    let systemMessages: [SystemMessage]?
    let systemMessage: SystemMessage?
}

struct PromptContextOptimizer: Codable {

}

struct PromptTokensDetails: Codable {
    let cachedTokens: Int?
    let audioTokens: Int?
}

struct PromptToolDescription: Codable {
    let id: String?
    let name: String?
    let description: String?
}

struct ResponseFormat: Codable {
    let type: String?
    let jsonSchema: JsonSchema?
}

struct ShardingContext: Codable {
    let platform: String?
    let owner: String?
    let shardingKey: String?
    let tenantId: Int?
    let organizationId: Int?
    let userId: Int?
}

struct SpeechConfig: Codable {
    let speakerConfig: SpeechSpeakerConfig?
    let transcriptionConfig: SpeechTranscriptionConfig?
    let vadConfig: VadConfig?
    let aecConfig: AecConfig?
}

struct SpeechSpeakerConfig: Codable {
    let speaker: VoiceSpeakerInfo?
    let speakerId: Int?
    let volume: Double?
    let pitch: Double?
    let language: String?
    let speed: Double?
    let format: String?
}

struct SpeechTranscriptionConfig: Codable {
    let channel: String?
    let product: String?
    let options: AudioTranscriptionOptions?
}

struct StreamOptions: Codable {
    let includeUsage: Bool?
    let chunkIncludeUsage: Bool?
}

struct SystemMessage: Codable {
    let messageType: String?
    let metadata: [String: Any]?
    let text: String?
}

struct TeamAgentMembers: Codable {
    let id: Int?
    let uuid: String?
    let type: String?
    let bizType: String?
    let description: String?
    let agents: [Any]?
}

struct ToolCallback: Codable {
    let toolDefinition: ToolDefinition?
    let toolMetadata: ToolMetadata?
}

struct ToolCallbackProvider: Codable {
    let toolCallbacks: [ToolCallback]?
}

struct ToolDefinition: Codable {

}

struct ToolMetadata: Codable {

}

struct UseTool: Codable {
    let id: Int?
    let name: String?
    let description: String?
    let enable: Bool?
}

struct UserLocation: Codable {
    let type: String?
    let approximate: Approximate?
}

struct UserMessage: Codable {
    let messageType: String?
    let metadata: [String: Any]?
    let media: [Media]?
    let text: String?
}

struct VadConfig: Codable {
    let speechThreshold: Double?
    let minSpeechDurationMs: Int?
    let minSilenceDurationMs: Int?
    let maxSilenceDurationMs: Int?
    let silenceTimeout: Int?
    let speechTimeout: Int?
    let windowSize: Int?
    let stepSize: Int?
}

struct VoiceMotion: Codable {

}

struct VoiceSpeakerInfo: Codable {
    let channel: String?
    let provider: String?
    let product: String?
    let id: String?
    let models: [String]?
    let speakerId: String?
    let displayName: String?
    let tags: TagsContent?
    let motion: VoiceMotion?
    let style: VoiceStyle?
    let description: String?
}

struct VoiceStyle: Codable {

}

struct WebSearchOptions: Codable {
    let searchContextSize: String?
    let userLocation: UserLocation?
}

struct PlusApiResultPlusChatMessageContentVO: Codable {
    let data: PlusChatMessageContentVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusChatMessageContentVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let version: Int?
    let role: String?
    let type: String?
    let status: String?
    let conversationId: Int?
    let conversationUuid: String?
    let agentId: Int?
    let agentType: String?
    let agentBizType: String?
    let content: MessageBody?
    let metadata: [String: Any]?
}

struct PlusMemberLevelForm: Codable {
    let cardId: Int?
    let levelName: String?
    let requiredPoints: Int?
    let description: String?
    let status: String?
}

struct PlusApiResultPlusMemberLevelVO: Codable {
    let data: PlusMemberLevelVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusMemberLevelVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let cardId: Int?
    let levelName: String?
    let requiredPoints: Int?
    let description: String?
    let status: String?
}

struct PlusCard: Codable {
    let tenantId: Int?
    let organizationId: Int?
    let dataScope: String?
    let id: Int?
    let uuid: String?
    let createdAt: String?
    let updatedAt: String?
    let v: Int?
    let cardOrganizationId: Int?
    let cardType: String?
    let codeType: String?
    let title: String?
    let brandName: String?
    let logoUrl: String?
    let notice: String?
    let description: String?
    let color: String?
    let quantity: Int?
    let getLimit: Int?
    let canShare: Bool?
    let canGiveFriend: Bool?
    let startTime: String?
    let endTime: String?
    let status: String?
}

struct PlusMemberCardForm: Codable {
    let card: PlusCard?
    let supplyBonus: Bool?
    let supplyBalance: Bool?
    let bonusName: String?
    let balanceName: String?
    let prerogative: String?
    let autoActivate: Bool?
    let wxActivate: Bool?
    let costMoneyUnit: Int?
    let increaseBonus: Int?
    let initIncreaseBonus: Int?
    let maxIncreaseBonus: Int?
    let costBonusUnit: Int?
    let reduceMoney: Int?
    let leastMoneyToUseBonus: Int?
    let maxReduceBonus: Int?
}

struct PlusApiResultPlusMemberCardVO: Codable {
    let data: PlusMemberCardVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusMemberCardVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let cardId: Int?
    let supplyBonus: Bool?
    let supplyBalance: Bool?
    let bonusName: String?
    let balanceName: String?
    let prerogative: String?
    let autoActivate: Bool?
    let wxActivate: Bool?
    let costMoneyUnit: Int?
    let increaseBonus: Int?
    let initIncreaseBonus: Int?
    let maxIncreaseBonus: Int?
    let costBonusUnit: Int?
    let reduceMoney: Int?
    let leastMoneyToUseBonus: Int?
    let maxReduceBonus: Int?
}

struct PlusKnowledgeBaseForm: Codable {
    let name: String?
    let diskId: Int?
    let channel: String?
    let channelId: String?
    let projectId: Int?
    let description: String?
}

struct PlusApiResultPlusKnowledgeBaseVO: Codable {
    let data: PlusKnowledgeBaseVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusKnowledgeBaseVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let description: String?
}

struct InvitationRelationForm: Codable {
    let inviterUserId: Int?
    let inviteeUserId: Int?
    let inviteCode: String?
    let usedTime: String?
    let relationLevel: Int?
    let rewardStatus: String?
    let rewardAmount: Double?
    let rewardType: String?
}

struct InvitationRelationVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let inviterUserId: Int?
    let inviteeUserId: Int?
    let inviteCode: String?
    let usedTime: String?
    let relationLevel: Int?
    let rewardStatus: String?
    let rewardAmount: Double?
    let rewardType: String?
}

struct PlusApiResultInvitationRelationVO: Codable {
    let data: InvitationRelationVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct InvitationCodeForm: Codable {
    let code: String?
    let creatorUserId: Int?
    let status: String?
    let expireTime: String?
    let usageLimit: Int?
    let usedCount: Int?
}

struct InvitationCodeVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let code: String?
    let creatorUserId: Int?
    let status: String?
    let expireTime: String?
    let usageLimit: Int?
    let usedCount: Int?
}

struct PlusApiResultInvitationCodeVO: Codable {
    let data: InvitationCodeVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusImageForm: Codable {
    let title: String?
    let description: String?
    let url: String?
    let aspectRatio: String?
    let width: Int?
    let height: Int?
    let fileSize: Int?
    let format: String?
    let status: String?
}

struct PlusApiResultPlusImageVO: Codable {
    let data: PlusImageVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusImageVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let title: String?
    let description: String?
    let resource: ImageMediaResource?
    let author: AuthorInfo?
    let url: String?
    let aspectRatio: String?
    let width: Int?
    let height: Int?
    let fileSize: Int?
    let format: String?
    let status: String?
}

struct PlusImGroupForm: Codable {
    let name: String?
    let description: String?
    let avatar: ImageMediaResource?
    let announcement: String?
    let memberCount: Int?
    let maxMembers: Int?
    let creatorId: Int?
    let type: String?
    let status: String?
    let allowMemberInvite: Bool?
    let requireApproval: Bool?
}

struct PlusApiResultPlusImGroupVO: Codable {
    let data: PlusImGroupVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusImGroupVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let name: String?
    let description: String?
    let avatar: ImageMediaResource?
    let announcement: String?
    let memberCount: Int?
    let maxMembers: Int?
    let creatorId: Int?
    let type: String?
    let status: String?
    let allowMemberInvite: Bool?
    let requireApproval: Bool?
}

struct PlusAiGenerationForm: Codable {
    let userId: Int?
    let requestId: String?
    let model: String?
    let channel: String?
    let type: String?
    let cost: Double?
    let status: String?
}

struct AudioEffectGenerationInput: Codable {
    let title: String?
    let prompt: String?
    let negativePrompt: String?
    let referenceAssets: [AssetMediaResource]?
    let storyboard: VideoStoryboard?
    let parameters: [String: Any]?
    let n: Int?
    let seed: Int?
    let format: String?
    let description: String?
    let category: String?
    let duration: Int?
    let sampleRate: Int?
    let bitRate: Int?
    let channels: Int?
    let loop: Bool?
    let fadeIn: Double?
    let fadeOut: Double?
    let referenceAssetCount: Int?
}

struct AudioGenerationInput: Codable {
    let title: String?
    let prompt: String?
    let negativePrompt: String?
    let referenceAssets: [AssetMediaResource]?
    let storyboard: VideoStoryboard?
    let parameters: [String: Any]?
    let n: Int?
    let seed: Int?
    let format: String?
    let text: String?
    let voice: String?
    let voiceSpeakerId: Int?
    let language: String?
    let speed: Double?
    let pitch: Double?
    let volume: Int?
    let sampleRate: Int?
    let bitRate: Int?
    let channels: Int?
    let emotion: String?
    let referenceAssetCount: Int?
}

struct BaseGenerationInput: Codable {
    let title: String?
    let prompt: String?
    let negativePrompt: String?
    let referenceAssets: [AssetMediaResource]?
    let storyboard: VideoStoryboard?
    let parameters: [String: Any]?
    let n: Int?
    let seed: Int?
    let format: String?
    let referenceAssetCount: Int?
}

struct CharacterGenerationInput: Codable {
    let title: String?
    let prompt: String?
    let negativePrompt: String?
    let referenceAssets: [AssetMediaResource]?
    let storyboard: VideoStoryboard?
    let parameters: [String: Any]?
    let n: Int?
    let seed: Int?
    let format: String?
    let name: String?
    let description: String?
    let appearance: String?
    let personality: String?
    let background: String?
    let type: String?
    let style: String?
    let pose: String?
    let expression: String?
    let gender: String?
    let age: String?
    let clothing: String?
    let width: Int?
    let height: Int?
    let hd: Bool?
    let multiView: Bool?
    let referenceAssetCount: Int?
}

struct GenerationInput: Codable {
    let type: String?
    let image: ImageGenerationInput?
    let video: VideoGenerationInput?
    let audio: AudioGenerationInput?
    let music: MusicGenerationInput?
    let character: CharacterGenerationInput?
    let voiceSpeaker: VoiceSpeakerGenerationInput?
    let audioEffect: AudioEffectGenerationInput?
    let input: BaseGenerationInput?
    let prompt: String?
}

struct GenerationOutput: Codable {
    let resources: [AssetMediaResource]?
    let primaryUrl: String?
    let urls: [String]?
    let durationMs: Int?
    let tokenUsage: Int?
    let cost: Double?
    let modelVersion: String?
    let seed: Int?
    let metadata: [String: Any]?
    let createdAt: String?
    let resourceCount: Int?
    let primaryResource: AssetMediaResource?
}

struct ImageGenerationInput: Codable {
    let title: String?
    let prompt: String?
    let negativePrompt: String?
    let referenceAssets: [AssetMediaResource]?
    let storyboard: VideoStoryboard?
    let parameters: [String: Any]?
    let n: Int?
    let seed: Int?
    let format: String?
    let width: Int?
    let height: Int?
    let size: String?
    let quality: String?
    let style: String?
    let cfgScale: Double?
    let steps: Int?
    let sampler: String?
    let strength: Double?
    let safetyChecker: Bool?
    let aspectRatio: String?
    let referenceAssetCount: Int?
}

struct MusicGenerationInput: Codable {
    let title: String?
    let prompt: String?
    let negativePrompt: String?
    let referenceAssets: [AssetMediaResource]?
    let storyboard: VideoStoryboard?
    let parameters: [String: Any]?
    let n: Int?
    let seed: Int?
    let format: String?
    let lyrics: String?
    let duration: Int?
    let genre: String?
    let style: String?
    let tempo: Int?
    let key: String?
    let timeSignature: String?
    let mood: String?
    let instruments: String?
    let instrumental: Bool?
    let hd: Bool?
    let referenceAssetCount: Int?
}

struct PlusAiGenerationVO: Codable {
    let id: Int?
    let uuid: String?
    let userId: Int?
    let title: String?
    let requestId: String?
    let type: String?
    let model: String?
    let channel: String?
    let inputParams: GenerationInput?
    let outputResult: GenerationOutput?
    let status: String?
    let progress: Int?
    let channelTaskId: String?
    let channelTaskStatus: String?
    let cost: Double?
    let errorCode: String?
    let errorMessage: String?
    let retryCount: Int?
    let maxRetry: Int?
    let startedAt: String?
    let completedAt: String?
    let conversationId: Int?
    let messageId: Int?
    let parentId: Int?
    let batchId: String?
    let createdAt: String?
    let updatedAt: String?
}

struct PlusApiResultPlusAiGenerationVO: Codable {
    let data: PlusAiGenerationVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VideoGenerationInput: Codable {
    let title: String?
    let prompt: String?
    let negativePrompt: String?
    let referenceAssets: [AssetMediaResource]?
    let storyboard: VideoStoryboard?
    let parameters: [String: Any]?
    let n: Int?
    let seed: Int?
    let format: String?
    let width: Int?
    let height: Int?
    let duration: Int?
    let fps: Int?
    let style: String?
    let aspectRatio: String?
    let motionStrength: Int?
    let cameraMotion: String?
    let loop: Bool?
    let hd: Bool?
    let subtitle: Bool?
    let textToVideo: Bool?
    let referenceAssetCount: Int?
}

struct VideoShotItem: Codable {
    let id: String?
    let uuid: String?
    let shotPrompt: String?
    let dialogue: String?
    let duration: Double?
    let startFrame: ImageMediaResource?
    let endFrame: ImageMediaResource?
    let image: ImageMediaResource?
    let resourceList: AssetMediaResourceList?
    let emotion: String?
    let videoDescription: String?
    let video: VideoMediaResource?
}

struct VideoStoryboard: Codable {
    let shots: [VideoShotItem]?
    let finalVideo: VideoMediaResource?
    let finalAudio: AudioMediaResource?
    let title: String?
    let description: String?
    let style: String?
    let aspectRatio: String?
    let prompt: String?
    let duration: Double?
    let speaker: VoiceSpeakerInfo?
}

struct VoiceSpeakerGenerationInput: Codable {
    let title: String?
    let prompt: String?
    let negativePrompt: String?
    let referenceAssets: [AssetMediaResource]?
    let storyboard: VideoStoryboard?
    let parameters: [String: Any]?
    let n: Int?
    let seed: Int?
    let format: String?
    let text: String?
    let speakerName: String?
    let speakerId: String?
    let language: String?
    let speed: Double?
    let pitch: Double?
    let volume: Int?
    let emotion: String?
    let saveSpeaker: Bool?
    let voiceClone: Bool?
    let usingExistingSpeaker: Bool?
    let referenceAssetCount: Int?
}

struct PlusAiGenerationContentForm: Codable {
    let title: String?
    let description: String?
    let contentType: String?
    let contentId: Int?
    let metadata: [String: Any]?
    let contentFormat: String?
}

struct GenerationInputParams: Codable {
    let image: ImageGenerationInput?
    let video: VideoGenerationInput?
    let audio: AudioGenerationInput?
    let music: MusicGenerationInput?
    let voice: VoiceSpeakerGenerationInput?
    let character: CharacterGenerationInput?
    let audioEffect: AudioEffectGenerationInput?
}

struct PlusAiGenerationContentVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let version: Int?
    let title: String?
    let description: String?
    let contentType: String?
    let contentId: Int?
    let metadata: [String: Any]?
    let inputParams: GenerationInputParams?
    let output: GenerationOutput?
    let contentFormat: String?
    let contentUrl: String?
    let fileSize: Int?
}

struct PlusApiResultPlusAiGenerationContentVO: Codable {
    let data: PlusAiGenerationContentVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameDefinitionForm: Codable {
    let code: String?
    let gameType: String?
    let category: String?
    let name: String?
    let alias: String?
    let gameModeCode: String?
    let description: String?
    let ruleSummary: String?
    let minPlayers: Int?
    let maxPlayers: Int?
    let seatCount: Int?
    let teamCount: Int?
    let defaultRoundCount: Int?
    let turnBased: Bool?
    let ranked: Bool?
    let supportsSpectator: Bool?
    let supportsTrusteeship: Bool?
    let supportsRobot: Bool?
    let supportsReplay: Bool?
    let supportsFriendRoom: Bool?
    let supportsTournament: Bool?
    let supportsClub: Bool?
    let supportsPractice: Bool?
    let difficultyLevel: Int?
    let tutorialUrl: String?
    let rankingType: String?
    let defaultRuleConfig: [String: Any]?
    let metadata: [String: Any]?
    let supportedLeaderboardPeriods: [String]?
    let enabled: Bool?
}

struct PlusApiResultPlusGameDefinitionVO: Codable {
    let data: PlusGameDefinitionVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameDefinitionVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let definitionId: Int?
    let code: String?
    let gameType: String?
    let category: String?
    let name: String?
    let alias: String?
    let gameModeCode: String?
    let description: String?
    let ruleSummary: String?
    let minPlayers: Int?
    let maxPlayers: Int?
    let seatCount: Int?
    let teamCount: Int?
    let defaultRoundCount: Int?
    let turnBased: Bool?
    let ranked: Bool?
    let supportsSpectator: Bool?
    let supportsTrusteeship: Bool?
    let supportsRobot: Bool?
    let supportsReplay: Bool?
    let supportsFriendRoom: Bool?
    let supportsTournament: Bool?
    let supportsClub: Bool?
    let supportsPractice: Bool?
    let difficultyLevel: Int?
    let tutorialUrl: String?
    let rankingType: String?
    let defaultRuleConfig: [String: Any]?
    let metadata: [String: Any]?
    let supportedLeaderboardPeriods: [String]?
    let enabled: Bool?
}

struct PlusFileForm: Codable {
    let parentId: Int?
    let name: String?
    let path: String?
    let objectKey: String?
    let size: Int?
    let contentType: String?
    let storageClass: String?
    let versionId: String?
    let resource: FileMediaResource?
    let uploadTime: String?
    let lastAccessTime: String?
    let description: String?
    let tags: TagsContent?
    let fileType: String?
    let fileCategory: String?
    let status: String?
    let etag: String?
}

struct AssetReference: Codable {
    let fileId: Int?
    let fileUuid: String?
    let filePath: String?
    let assetType: String?
    let mimeType: String?
    let url: String?
}

struct ContentSegment: Codable {
    let id: String?
    let order: Int?
    let type: String?
    let text: String?
    let startMs: Int?
    let endMs: Int?
    let metadata: [String: Any]?
}

struct FileContentObject: Codable {
    let schemaVersion: String?
    let source: String?
    let text: String?
    let contents: [String: String]?
    let metadata: [String: Any]?
    let generation: GenerationContext?
    let segments: [ContentSegment]?
    let references: [AssetReference]?
}

struct FilePermission: Codable {
    let permissions: [String]?
    let readOnly: Bool?
    let permissionSet: [String]?
}

struct GenerationContext: Codable {
    let generationId: Int?
    let generationType: String?
    let generationStatus: String?
    let channel: String?
    let requestId: String?
    let channelTaskId: String?
    let routingStrategy: String?
    let routingProduct: String?
    let routingProvider: String?
}

struct PlusApiResultPlusFileVO: Codable {
    let data: PlusFileVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusFileVO: Codable {
    let parentUuid: String?
    let parentMetadata: PlusTreeParentMetadata?
    let id: Int?
    let parentId: Int?
    let name: String?
    let path: String?
    let fullPath: String?
    let objectKey: String?
    let size: Int?
    let contentType: String?
    let extension: String?
    let storageClass: String?
    let versionId: String?
    let resource: FileMediaResource?
    let url: String?
    let uploadTime: String?
    let lastAccessTime: String?
    let description: String?
    let tags: TagsContent?
    let fileType: String?
    let fileCategory: String?
    let permission: FilePermission?
    let isPublic: Bool?
    let pinnedAt: String?
    let status: String?
    let content: FileContentObject?
    let etag: String?
}

struct PlusFilePartForm: Codable {
    let fileId: Int?
    let chunkIndex: Int?
    let chunkSize: Int?
    let totalSize: Int?
    let checksum: String?
    let status: Int?
    let storagePath: String?
}

struct PlusApiResultPlusFilePartVO: Codable {
    let data: PlusFilePartVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusFilePartVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let fileId: Int?
    let chunkIndex: Int?
    let chunkSize: Int?
    let totalSize: Int?
    let checksum: String?
    let status: Int?
    let storagePath: String?
}

struct PlusFileContentForm: Codable {
    let fileId: Int?
    let fileUuid: String?
    let prompt: String?
    let encoding: String?
    let content: FileContentObject?
}

struct PlusApiResultPlusFileContentVO: Codable {
    let data: PlusFileContentVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusFileContentVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let fileId: Int?
    let fileUuid: String?
    let prompt: String?
    let encoding: String?
    let content: FileContentObject?
}

struct PlusFeedsForm: Codable {
    let title: String?
    let summary: String?
    let categoryId: Int?
    let contentType: String?
    let contentId: Int?
    let coverImages: ImageMediaResourceList?
    let source: String?
    let publishTime: String?
    let tags: TagsContent?
    let status: String?
}

struct PlusApiResultPlusFeedsVO: Codable {
    let data: PlusFeedsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusFeedsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let userId: Int?
    let title: String?
    let summary: String?
    let contentType: String?
    let contentId: Int?
    let coverImages: ImageMediaResourceList?
    let resourceList: AssetMediaResourceList?
    let author: AuthorInfo?
    let source: String?
    let publishTime: String?
    let tags: TagsContent?
    let status: String?
    let viewCount: Int?
    let likeCount: Int?
    let commentCount: Int?
}

struct PlusFeedbackForm: Codable {
    let userId: Int?
}

struct PlusApiResultPlusFeedbackVO: Codable {
    let data: PlusFeedbackVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusFeedbackVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let version: Int?
    let userId: Int?
}

struct PlusFavoriteForm: Codable {
    let contentType: String?
    let contentId: Int?
    let remark: String?
    let sortWeight: Int?
    let title: String?
    let image: ImageMediaResource?
    let isPrivate: Bool?
    let status: String?
}

struct PlusApiResultPlusFavoriteVO: Codable {
    let data: PlusFavoriteVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusFavoriteVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let contentType: String?
    let contentId: Int?
    let folderId: Int?
    let remark: String?
    let tags: String?
    let sortWeight: Int?
    let title: String?
    let image: ImageMediaResource?
    let isPrivate: Bool?
    let status: String?
    let viewCount: Int?
    let lastViewedAt: String?
}

struct PlusDiskForm: Codable {
    let name: String?
    let type: String?
    let owner: String?
    let ownerId: Int?
    let diskSize: Int?
    let usedSize: Int?
    let description: String?
}

struct PlusApiResultPlusDiskVO: Codable {
    let data: PlusDiskVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusDiskVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let name: String?
    let owner: String?
    let ownerId: Int?
    let diskSize: Int?
    let usedSize: Int?
    let description: String?
    let remainingSize: Int?
    let usageRate: Double?
}

struct DiskPermission: Codable {
    let permissions: [String]?
    let permissionSet: [String]?
}

struct PlusDiskMemberForm: Codable {
    let diskId: Int?
    let userId: Int?
    let permission: DiskPermission?
    let remark: String?
    let isOwner: Bool?
}

struct PlusApiResultPlusDiskMemberVO: Codable {
    let data: PlusDiskMemberVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusDiskMemberVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let v: Int?
    let diskId: Int?
    let userId: Int?
    let permission: DiskPermission?
    let remark: String?
    let isOwner: Bool?
}

struct DetailContent: Codable {
    let text: String?
    let contents: [String: String]?
}

struct PlusDetailForm: Codable {
    let contentType: String?
    let contentId: Int?
    let content: DetailContent?
}

struct PlusApiResultPlusDetailVO: Codable {
    let data: PlusDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusDetailVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let contentType: String?
    let contentId: Int?
    let content: DetailContent?
    let productId: Int?
    let skuId: Int?
}

struct PlusDepartmentForm: Codable {
    let name: String?
    let description: String?
    let owner: String?
    let ownerId: Int?
    let code: String?
    let sortOrder: Int?
    let isActive: Bool?
    let parentId: Int?
}

struct PlusApiResultPlusDepartmentVO: Codable {
    let data: PlusDepartmentVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusDepartmentVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let parentId: Int?
    let name: String?
    let description: String?
    let owner: String?
    let ownerId: Int?
    let code: String?
    let sortOrder: Int?
    let isActive: Bool?
    let organizationId: Int?
    let memberIds: [Int]?
}

struct DatasourceConfig: Codable {
    let type: String?
    let host: String?
    let port: Int?
    let database: String?
    let username: String?
    let password: String?
    let params: String?
    let poolConfig: PoolConfig?
    let driverClassName: String?
    let jdbcUrl: String?
}

struct PlusDatasourceForm: Codable {
    let projectId: Int?
    let name: String?
    let channel: String?
    let channelId: String?
    let type: Int?
    let status: Int?
    let description: String?
    let connectionConfig: DatasourceConfig?
    let url: String?
    let owner: String?
    let lastConnectedAt: String?
    let connectionTimeout: Int?
    let tags: TagsContent?
    let dbVersion: String?
    let securityLevel: Int?
    let accessCount: Int?
    let icon: String?
    let color: String?
}

struct PoolConfig: Codable {
    let minIdle: Int?
    let maxPoolSize: Int?
    let connectionTimeout: Int?
    let idleTimeout: Int?
    let maxLifetime: Int?
    let autoCommit: Bool?
    let connectionTestQuery: String?
    let poolName: String?
}

struct PlusApiResultPlusDatasourceVO: Codable {
    let data: PlusDatasourceVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusDatasourceVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let type: Int?
    let status: Int?
    let description: String?
    let connectionConfig: Any?
    let url: String?
    let owner: String?
    let lastConnectedAt: String?
    let connectionTimeout: Int?
    let tags: TagsContent?
    let dbVersion: String?
    let securityLevel: Int?
    let accessCount: Int?
    let icon: String?
    let color: String?
    let schemaIds: [Int]?
}

struct PlusCouponForm: Codable {
    let name: String?
    let redeemCode: String?
    let pointCost: Int?
    let type: String?
    let description: String?
    let amount: Int?
    let discount: Double?
    let minConsume: Int?
    let startTime: String?
    let endTime: String?
    let total: Int?
    let getLimit: Int?
    let status: String?
    let scopeType: String?
    let scopeValue: String?
}

struct PlusApiResultPlusCouponVO: Codable {
    let data: PlusCouponVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusCouponVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let name: String?
    let redeemCode: String?
    let pointCost: Int?
    let type: String?
    let description: String?
    let amount: Int?
    let discount: Double?
    let minConsume: Int?
    let startTime: String?
    let endTime: String?
    let total: Int?
    let getLimit: Int?
    let status: String?
    let scopeType: String?
    let scopeValue: String?
}

struct PlusCouponTemplateForm: Codable {
    let name: String?
    let templateCode: String?
    let type: String?
    let description: String?
    let amount: Int?
    let discount: Double?
    let minConsume: Int?
    let startTime: String?
    let endTime: String?
    let total: Int?
    let getLimit: Int?
    let status: String?
    let validityType: String?
    let validityDays: Int?
    let canShare: Bool?
    let scopeType: String?
    let scopeValue: String?
}

struct PlusApiResultPlusCouponTemplateVO: Codable {
    let data: PlusCouponTemplateVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusCouponTemplateVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let templateCode: String?
    let type: String?
    let description: String?
    let amount: Int?
    let discount: Double?
    let minConsume: Int?
    let startTime: String?
    let endTime: String?
    let total: Int?
    let getLimit: Int?
    let status: String?
    let validityType: String?
    let validityDays: Int?
    let canShare: Bool?
    let scopeType: String?
    let scopeValue: String?
}

struct PlusConversationForm: Codable {
    let uuid: String?
    let title: String?
    let description: String?
    let userId: Int?
    let status: String?
    let agentId: Int?
    let summary: String?
    let lastMessageId: Int?
    let messageCount: Int?
    let tags: TagsContent?
    let systemContext: String?
    let userContext: String?
    let lastInteractionTime: String?
    let modelId: Int?
    let model: String?
    let knowledgeBaseId: Int?
    let dataSourceId: Int?
    let chatOptions: PlusChatOptions?
    let pinned: Bool?
    let sortOrder: Int?
}

struct PlusApiResultPlusConversationVO: Codable {
    let data: PlusConversationVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusConversationVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let title: String?
    let type: String?
    let description: String?
    let userId: Int?
    let status: String?
    let agentId: Int?
    let agentType: String?
    let agentBizType: String?
    let scene: String?
    let summary: String?
    let lastMessageId: Int?
    let messageCount: Int?
    let unreadCount: Int?
    let tags: TagsContent?
    let systemContext: String?
    let userContext: String?
    let lastInteractionTime: String?
    let modelId: Int?
    let model: String?
    let knowledgeBaseId: Int?
    let dataSourceId: Int?
    let chatOptions: PlusChatOptions?
    let pinned: Bool?
    let sortOrder: Int?
}

struct FileTreeNodeVO: Codable {
    let id: Int?
    let uuid: String?
    let name: String?
    let type: String?
    let isDirectory: Bool?
    let path: String?
    let relativePath: String?
    let size: Int?
    let content: String?
    let parentId: Int?
    let children: [FileTreeNodeVO]?
    let createdAt: String?
    let updatedAt: String?
    let extension: String?
    let description: String?
    let readOnly: Bool?
}

struct PlusCommentsForm: Codable {
    let content: String?
    let contentType: String?
    let contentId: Int?
    let status: String?
    let likes: Int?
    let replyCount: Int?
    let isTop: Bool?
    let ipAddress: String?
    let deviceInfo: String?
    let parentId: Int?
    let parentUuid: String?
    let userId: Int?
    let parentMetadata: PlusTreeParentMetadata?
}

struct PlusApiResultPlusCommentsVO: Codable {
    let data: PlusCommentsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusCommentsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let parentId: Int?
    let parentUuid: String?
    let userId: Int?
    let content: String?
    let contentType: String?
    let contentId: Int?
    let status: String?
    let likes: Int?
    let replyCount: Int?
    let isTop: Bool?
    let ipAddress: String?
    let deviceInfo: String?
    let author: AuthorInfo?
}

struct PlusColumnForm: Codable {
    let name: String?
    let description: String?
    let dataType: String?
    let columnType: String?
    let ordinalPosition: Int?
    let isNullable: Bool?
    let isPrimaryKey: Bool?
    let isAutoIncrement: Bool?
    let defaultValue: String?
    let comment: String?
    let characterSet: String?
    let collationRule: String?
    let tableId: Int?
}

struct PlusApiResultPlusColumnVO: Codable {
    let data: PlusColumnVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusCollectionForm: Codable {
    let name: String?
    let description: String?
    let type: String?
    let contentId: Int?
}

struct PlusApiResultPlusCollectionVO: Codable {
    let data: PlusCollectionVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusCollectionVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let name: String?
    let description: String?
    let type: String?
    let contentId: Int?
    let coverImage: String?
    let isPublic: Bool?
    let isPinned: Bool?
    let sort: Int?
    let itemCount: Int?
    let viewCount: Int?
    let favoriteCount: Int?
    let lastUpdatedAt: String?
    let parentId: Int?
    let childrenIds: [Int]?
}

struct PlusCollectionItemForm: Codable {
    let collectionId: Int?
    let collectionUuid: String?
    let type: String?
    let contentType: String?
    let contentId: Int?
    let contentUuid: String?
    let title: String?
    let description: String?
    let position: Int?
    let isPinned: Bool?
    let tags: String?
    let extraData: String?
}

struct PlusApiResultPlusCollectionItemVO: Codable {
    let data: PlusCollectionItemVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusCollectionItemVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let collectionId: Int?
    let collectionUuid: String?
    let type: String?
    let contentType: String?
    let contentId: Int?
    let contentUuid: String?
    let title: String?
    let description: String?
    let position: Int?
    let isPinned: Bool?
    let tags: String?
    let extraData: String?
}

struct PlusChatMessageForm: Codable {
    let content: MessageBody?
    let role: String?
    let type: String?
    let status: String?
    let conversationId: Int?
    let userId: Int?
    let parentMessageId: Int?
    let metadata: [String: Any]?
    let tokenCount: Int?
    let processingTime: Int?
    let isError: Bool?
    let errorCode: String?
    let errorMessage: String?
    let modelId: Int?
    let model: String?
    let temperature: Double?
    let usedRag: Bool?
    let chatOptions: PlusChatOptions?
}

struct FeedbackMetadata: Codable {
    let rating: String?
}

struct PlusApiResultPlusChatMessageVO: Codable {
    let data: PlusChatMessageVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusChatMessageVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let body: MessageBody?
    let role: String?
    let type: String?
    let status: String?
    let conversationId: Int?
    let conversationUuid: String?
    let userId: Int?
    let senderId: Int?
    let sender: Participant?
    let receiver: Participant?
    let receiverId: Int?
    let groupId: Int?
    let parentMessageId: Int?
    let children: [PlusChatMessageVO]?
    let metadata: [String: Any]?
    let tokenCount: Int?
    let sendAt: String?
    let receiveAt: String?
    let readAt: String?
    let processingTime: Int?
    let isError: Bool?
    let errorCode: String?
    let errorMessage: String?
    let modelId: Int?
    let model: String?
    let temperature: Double?
    let usedRag: Bool?
    let chatOptions: PlusChatOptions?
    let channelId: String?
    let agentId: Int?
    let knowledgeBaseId: Int?
    let datasourceId: Int?
    let agentType: String?
    let agentBizType: String?
    let channelMsgId: String?
    let channelClientMsgId: String?
    let channelMsgSeq: Int?
    let conversationType: String?
    let feedbackMetadata: FeedbackMetadata?
}

struct PlusCharacterForm: Codable {
    let name: String?
    let type: String?
    let avatar: ImageMediaResource?
    let threeViewImage: ImageMediaResource?
    let gridShotsImage: ImageMediaResource?
    let avatarVideo: VideoMediaResource?
    let agentId: Int?
    let description: String?
    let status: String?
    let personality: String?
    let background: String?
    let interactionSettings: String?
    let version: String?
    let userId: Int?
}

struct PlusApiResultPlusCharacterVO: Codable {
    let data: PlusCharacterVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusCharacterVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let name: String?
    let type: String?
    let avatar: ImageMediaResource?
    let threeViewImage: ImageMediaResource?
    let gridShotsImage: ImageMediaResource?
    let avatarVideo: VideoMediaResource?
    let agentId: Int?
    let description: String?
    let status: String?
    let personality: String?
    let background: String?
    let interactionSettings: String?
    let version: String?
    let userId: Int?
}

struct PlusChannelForm: Codable {
    let name: String?
    let channel: String?
    let types: [String]?
    let supportResources: [String]?
    let status: String?
    let description: String?
}

struct PlusApiResultPlusChannelVO: Codable {
    let data: PlusChannelVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusChannelVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let userId: Int?
    let name: String?
    let channel: String?
    let types: [String]?
    let supportResources: [String]?
    let status: String?
    let description: String?
}

struct PlusChannelResourceForm: Codable {
    let resource: String?
    let channel: String?
    let channelAccountId: Int?
}

struct PlusApiResultPlusChannelResourceVO: Codable {
    let data: PlusChannelResourceVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusChannelResourceVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let resource: String?
    let channel: String?
    let channelAccountId: Int?
}

struct PlusChannelProxyForm: Codable {
    let name: String?
    let channel: String?
    let proxy: String?
    let defaultModel: String?
    let status: String?
    let description: String?
}

struct PlusApiResultPlusChannelProxyVO: Codable {
    let data: PlusChannelProxyVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusChannelProxyVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let userId: Int?
    let name: String?
    let channel: String?
    let proxy: String?
    let defaultModel: String?
    let status: String?
    let description: String?
}

struct AgentAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let apiKey: String?
    let baseUrl: String?
    let accessKey: String?
    let secretKey: String?
    let defaultModel: String?
    let version: String?
    let agentType: String?
}

struct ApiKeyAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let apiKey: String?
    let baseUrl: String?
}

struct AppStoreAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let apiKey: String?
    let baseUrl: String?
    let accessKey: String?
    let secretKey: String?
    let defaultModel: String?
    let storeType: String?
    let developerId: String?
}

struct AudioAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let apiKey: String?
    let baseUrl: String?
    let appId: String?
    let accessKey: String?
    let secretKey: String?
    let defaultModel: String?
    let defaultVoice: String?
}

struct ChannelConfigInfo: Codable {
    let uuid: String?
    let accounts: [ModelConfig]?
}

struct ChannelResourceInfo: Codable {
    let items: [ChannelResourceItem]?
}

struct ChannelResourceItem: Codable {
    let type: String?
    let functions: [String]?
}

struct CloudAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let baseUrl: String?
    let appId: String?
    let accessKey: String?
    let secretKey: String?
    let signName: String?
    let senderId: String?
}

struct DatasourceAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let apiKey: String?
    let baseUrl: String?
    let accessKey: String?
    let secretKey: String?
    let defaultModel: String?
}

struct EmbeddingAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let apiKey: String?
    let baseUrl: String?
    let defaultModel: String?
    let dimension: Int?
    let options: PlusChatOptions?
}

struct FilesAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let apiKey: String?
    let baseUrl: String?
    let accessKey: String?
    let secretKey: String?
    let defaultModel: String?
    let bucketName: String?
}

struct ImAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let baseUrl: String?
    let appId: String?
    let accessKey: String?
    let secretKey: String?
    let signName: String?
    let senderId: String?
}

struct ImageAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let apiKey: String?
    let baseUrl: String?
    let accessKey: String?
    let secretKey: String?
    let defaultModel: String?
}

struct IotAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let transports: [IotTransportConfig]?
    let firmwareDownloadUrl: String?
    let otaUpgradeUrl: String?
    let deviceRegistryUrl: String?
    let certificatePath: String?
    let privateKeyPath: String?
    let caCertificatePath: String?
    let reportingInterval: Int?
    let maxRetryAttempts: Int?
    let retryInterval: Int?
}

struct IotTransportConfig: Codable {
    let type: String?
    let url: String?
    let connectionTimeout: Int?
    let keepAliveInterval: Int?
    let qos: Int?
    let clientId: String?
    let authToken: String?
    let username: String?
    let password: String?
    let sslEnabled: Bool?
    let cleanSession: Bool?
    let willTopic: String?
    let willMessage: String?
    let willQos: Int?
    let willRetain: Bool?
    let publishTopics: [String]?
    let subscribeTopics: [String]?
}

struct KnowledgeAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let apiKey: String?
    let baseUrl: String?
    let accessKey: String?
    let secretKey: String?
    let defaultModel: String?
}

struct MemoryAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let apiKey: String?
    let baseUrl: String?
    let accessKey: String?
    let secretKey: String?
    let defaultModel: String?
}

struct MiniProgramAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let appId: String?
    let secret: String?
    let baseUrl: String?
    let accessKey: String?
    let secretKey: String?
    let defaultModel: String?
}

struct ModelConfig: Codable {
    let id: Int?
    let uuid: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let agent: AgentAccountConfig?
    let appStore: AppStoreAccountConfig?
    let apikey: ApiKeyAccountConfig?
    let audio: AudioAccountConfig?
    let cloud: CloudAccountConfig?
    let datasource: DatasourceAccountConfig?
    let embedding: EmbeddingAccountConfig?
    let files: FilesAccountConfig?
    let im: ImAccountConfig?
    let image: ImageAccountConfig?
    let iot: IotAccountConfig?
    let knowledge: KnowledgeAccountConfig?
    let llm: LlmAccountConfig?
    let memory: MemoryAccountConfig?
    let moderation: ModerationAccountConfig?
    let music: MusicAccountConfig?
    let miniProgram: MiniProgramAccountConfig?
    let news: NewsAccountConfig?
    let ocr: OcrAccountConfig?
    let official: OfficialAccountConfig?
    let oss: OssAccountConfig?
    let pay: PayAccountConfig?
    let rtc: RtcAccountConfig?
    let search: SearchAccountConfig?
    let sms: SmsAccountConfig?
    let tool: ToolAccountConfig?
    let vector: VectorAccountConfig?
    let video: VideoAccountConfig?
    let voice: AudioAccountConfig?
    let resources: ChannelResourceInfo?
    let properties: [String: Any]?
    let oauth: OAuthAccountConfig?
}

struct ModerationAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let apiKey: String?
    let baseUrl: String?
    let accessKey: String?
    let secretKey: String?
    let defaultModel: String?
    let moderationType: String?
    let severityLevel: String?
}

struct MusicAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let apiKey: String?
    let baseUrl: String?
    let accessKey: String?
    let secretKey: String?
    let defaultModel: String?
}

struct NewsAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let apiKey: String?
    let baseUrl: String?
    let accessKey: String?
    let secretKey: String?
    let defaultModel: String?
    let newsSource: String?
    let language: String?
}

struct OAuthAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let authProvider: String?
    let appId: String?
    let appSecret: String?
    let token: String?
    let redirectUri: String?
    let scope: String?
    let isServiceAccount: Bool?
    let teamId: String?
    let keyId: String?
    let privateKey: String?
    let publicKey: String?
    let encodingAESKey: String?
}

struct OcrAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let apiKey: String?
    let baseUrl: String?
    let accessKey: String?
    let secretKey: String?
    let defaultModel: String?
    let ocrEngine: String?
    let language: String?
}

struct OfficialAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let authProvider: String?
    let appId: String?
    let appSecret: String?
    let token: String?
    let redirectUri: String?
    let scope: String?
    let isServiceAccount: Bool?
    let teamId: String?
    let keyId: String?
    let privateKey: String?
    let publicKey: String?
    let secret: String?
    let aesKey: String?
    let qrCodeUrl: String?
    let originalId: String?
    let notifyUrl: String?
    let securityModeEnabled: Bool?
    let accessToken: String?
    let accessTokenExpiresIn: Int?
    let accessTokenFetchTime: Int?
    let jsSdkEnabled: Bool?
    let jsApiDomain: String?
    let encodingAESKey: String?
}

struct OssAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let baseUrl: String?
    let appId: String?
    let accessKey: String?
    let secretKey: String?
    let signName: String?
    let senderId: String?
}

struct PayAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let merchantId: String?
    let appId: String?
    let privateKey: String?
    let publicKey: String?
    let secretKey: String?
    let notifyUrl: String?
    let returnUrl: String?
    let gatewayUrl: String?
    let payType: String?
}

struct PlusChannelAccountForm: Codable {
    let name: String?
    let channel: String?
    let configs: ChannelConfigInfo?
    let status: String?
    let description: String?
}

struct RtcAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let baseUrl: String?
    let appId: String?
    let accessKey: String?
    let secretKey: String?
    let signName: String?
    let senderId: String?
}

struct SearchAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let apiKey: String?
    let baseUrl: String?
    let accessKey: String?
    let secretKey: String?
    let defaultModel: String?
}

struct SmsAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let baseUrl: String?
    let appId: String?
    let accessKey: String?
    let secretKey: String?
    let signName: String?
    let senderId: String?
}

struct ToolAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let apiKey: String?
    let baseUrl: String?
    let accessKey: String?
    let secretKey: String?
    let defaultModel: String?
    let toolType: String?
    let version: String?
}

struct VectorAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let dimension: Int?
    let indexType: String?
    let indexName: String?
    let embeddingConfigId: Int?
    let databaseName: String?
    let collectionName: String?
    let embeddingConfig: EmbeddingAccountConfig?
}

struct VideoAccountConfig: Codable {
    let id: Int?
    let uuid: String?
    let region: String?
    let weight: Int?
    let channel: String?
    let product: String?
    let functions: [String]?
    let metadata: AccountConfigMetadata?
    let properties: [String: Any]?
    let apiKey: String?
    let baseUrl: String?
    let accessKey: String?
    let secretKey: String?
    let defaultModel: String?
}

struct PlusApiResultPlusChannelAccountVO: Codable {
    let data: PlusChannelAccountVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusChannelAccountVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let userId: Int?
    let name: String?
    let channel: String?
    let configs: ChannelConfigInfo?
    let status: String?
    let description: String?
}

struct PlusCategoryForm: Codable {
    let name: String?
    let description: String?
    let type: String?
    let icon: String?
    let sortWeight: Int?
    let parentId: Int?
    let path: [String]?
    let visible: Int?
    let status: String?
}

struct PlusApiResultPlusCategoryVO: Codable {
    let data: PlusCategoryVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusCategoryVO: Codable {
    let parentUuid: String?
    let parentMetadata: PlusTreeParentMetadata?
    let id: Int?
    let uuid: String?
    let createdAt: String?
    let updatedAt: String?
    let name: String?
    let description: String?
    let type: String?
    let icon: String?
    let sortWeight: Int?
    let parentId: Int?
    let path: [String]?
    let visible: Int?
    let status: String?
    let children: [PlusCategoryVO]?
    let tags: TagsContent?
    let attributeIds: [Int]?
}

struct PlusCardForm: Codable {
    let cardOrganizationId: Int?
    let cardType: String?
    let codeType: String?
    let title: String?
    let brandName: String?
    let logoUrl: String?
    let notice: String?
    let description: String?
    let color: String?
    let quantity: Int?
    let getLimit: Int?
    let canShare: Bool?
    let canGiveFriend: Bool?
    let startTime: String?
    let endTime: String?
    let status: String?
}

struct PlusApiResultPlusCardVO: Codable {
    let data: PlusCardVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusCardVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let cardOrganizationId: Int?
    let cardType: String?
    let codeType: String?
    let title: String?
    let brandName: String?
    let logoUrl: String?
    let notice: String?
    let description: String?
    let color: String?
    let quantity: Int?
    let getLimit: Int?
    let canShare: Bool?
    let canGiveFriend: Bool?
    let startTime: String?
    let endTime: String?
    let status: String?
}

struct PlusCardTemplateForm: Codable {
    let name: String?
    let templateCode: String?
    let cardType: String?
    let codeType: String?
    let title: String?
    let description: String?
    let brandName: String?
    let logoUrl: String?
    let notice: String?
    let color: String?
    let quantity: Int?
    let getLimit: Int?
    let canShare: Bool?
    let canGiveFriend: Bool?
    let minimumBalance: Double?
    let initialBalance: Double?
    let discountRate: Double?
    let validityType: String?
    let startTime: String?
    let endTime: String?
    let validityDays: Int?
    let isDeleted: Bool?
}

struct PlusApiResultPlusCardTemplateVO: Codable {
    let data: PlusCardTemplateVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusCardTemplateVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let name: String?
    let templateCode: String?
    let cardType: String?
    let codeType: String?
    let title: String?
    let description: String?
    let brandName: String?
    let logoUrl: String?
    let notice: String?
    let color: String?
    let quantity: Int?
    let getLimit: Int?
    let canShare: Bool?
    let canGiveFriend: Bool?
    let minimumBalance: Double?
    let initialBalance: Double?
    let discountRate: Double?
    let validityType: String?
    let startTime: String?
    let endTime: String?
    let validityDays: Int?
    let isDeleted: Bool?
}

struct PlusAttributeForm: Codable {
    let name: String?
    let code: String?
    let description: String?
    let type: String?
    let contentType: String?
    let contentId: Int?
    let categoryId: Int?
    let attributeValue: String?
    let sortWeight: Int?
    let required: Int?
    let status: String?
}

struct PlusApiResultPlusAttributeVO: Codable {
    let data: PlusAttributeVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusAttributeVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let version: Int?
    let name: String?
    let code: String?
    let description: String?
    let type: String?
    let contentType: String?
    let contentId: Int?
    let categoryId: Int?
    let attributeValue: String?
    let sortWeight: Int?
    let required: Int?
    let status: String?
}

struct PlusArticleForm: Codable {
    let title: String?
    let subtitle: String?
    let content: String?
    let categoryId: Int?
    let wordCount: Int?
    let readingTime: Int?
    let coverImages: ImageMediaResourceList?
    let author: AuthorInfo?
    let source: String?
    let status: String?
    let keywords: [String]?
    let summary: String?
}

struct PlusApiResultPlusArticleVO: Codable {
    let data: PlusArticleVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusArticleVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let title: String?
    let subtitle: String?
    let content: String?
    let wordCount: Int?
    let readingTime: Int?
    let coverImages: ImageMediaResourceList?
    let author: AuthorInfo?
    let source: String?
    let status: String?
    let keywords: [String]?
    let summary: String?
}

struct AppConfig: Codable {
    let officialAccount: OfficialAccountConfig?
    let publish: AppPublishConfig?
}

struct AppInstallConfig: Codable {
    let packages: [AppInstallPackage]?
    let defaultPackageId: String?
    let installCommand: String?
    let launchCommand: String?
    let uninstallCommand: String?
    let metadata: [String: Any]?
}

struct AppInstallPackage: Codable {
    let id: String?
    let name: String?
    let sourceType: String?
    let packageFormat: String?
    let platform: String?
    let url: String?
    let repositoryUrl: String?
    let branch: String?
    let tag: String?
    let commitId: String?
    let checksumAlgorithm: String?
    let checksum: String?
    let architecture: String?
    let sizeBytes: Int?
    let enabled: Bool?
}

struct AppInstallSkill: Codable {
    let id: Int?
    let name: String?
}

struct AppPlatforms: Codable {
    let platforms: [String]?
}

struct AppPublishConfig: Codable {
    let stores: [AppStoreListingConfig]?
}

struct AppStoreListingConfig: Codable {
    let platform: String?
    let storeAppId: String?
    let packageName: String?
    let bundleId: String?
    let releaseTrack: String?
    let privacyPolicyUrl: String?
    let termsOfServiceUrl: String?
    let supportUrl: String?
    let supportEmail: String?
    let marketingUrl: String?
    let category: String?
    let subcategory: String?
    let contentRating: String?
    let languages: [String]?
    let countries: [String]?
    let screenshotUrls: [String]?
}

struct PlusAppForm: Codable {
    let name: String?
    let icon: ImageMediaResource?
    let resourceList: AssetMediaResourceList?
    let projectId: Int?
    let description: String?
    let version: String?
    let iconUrl: String?
    let accessUrl: String?
    let config: AppConfig?
    let status: String?
    let appType: String?
    let platforms: AppPlatforms?
    let installPlatforms: AppPlatforms?
    let installSkill: AppInstallSkill?
    let installConfig: AppInstallConfig?
    let packageName: String?
    let bundleId: String?
    let storeUrl: String?
    let downloadUrl: String?
}

struct PlusApiResultPlusAppVO: Codable {
    let data: PlusAppVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusAppVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let icon: ImageMediaResource?
    let resourceList: AssetMediaResourceList?
    let projectId: Int?
    let description: String?
    let version: String?
    let iconUrl: String?
    let accessUrl: String?
    let config: AppConfig?
    let status: String?
    let appType: String?
    let platforms: AppPlatforms?
    let installPlatforms: AppPlatforms?
    let installSkill: AppInstallSkill?
    let installConfig: AppInstallConfig?
    let packageName: String?
    let bundleId: String?
    let storeUrl: String?
    let downloadUrl: String?
}

struct PlusApiKeyForm: Codable {
    let name: String?
    let keyValue: String?
    let type: String?
    let status: String?
    let expireTime: String?
    let description: String?
}

struct PlusApiKeyVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let name: String?
    let keyValue: String?
    let maskedKeyValue: String?
    let type: String?
    let status: String?
    let expireTime: String?
    let description: String?
    let lastUsedTime: String?
}

struct PlusApiResultPlusApiKeyVO: Codable {
    let data: PlusApiKeyVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiKeySelfUpdateForm: Codable {
    let name: String?
    let expireTime: String?
    let clearExpireTime: Bool?
    let description: String?
}

struct AiAgentSystemPrompt: Codable {
    let title: String?
    let content: String?
}

struct PlusAiAgentForm: Codable {
    let name: String?
    let faceImage: ImageMediaResource?
    let faceVideo: VideoMediaResource?
    let owner: String?
    let ownerId: Int?
    let channel: String?
    let channelId: String?
    let icon: String?
    let description: String?
    let tags: TagsContent?
    let type: String?
    let bizType: String?
    let status: String?
    let baseConfig: PlusAiAgentConfig?
    let knowledgeConfig: AgentKnowledgeConfig?
    let memoryConfig: AgentMemoryConfig?
    let speechConfig: SpeechConfig?
    let toolConfig: AgentToolConfig?
    let members: TeamAgentMembers?
    let cateId: Int?
    let knowledgeBaseId: Int?
    let chatOptions: PlusChatOptions?
    let prompt: AiAgentSystemPrompt?
}

struct PlusAiAgentVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let faceImage: ImageMediaResource?
    let faceVideo: VideoMediaResource?
    let owner: String?
    let ownerId: Int?
    let channel: String?
    let channelId: String?
    let icon: String?
    let description: String?
    let tags: TagsContent?
    let type: String?
    let bizType: String?
    let status: String?
    let baseConfig: PlusAiAgentConfig?
    let knowledgeConfig: AgentKnowledgeConfig?
    let memoryConfig: AgentMemoryConfig?
    let speechConfig: SpeechConfig?
    let toolConfig: AgentToolConfig?
    let members: TeamAgentMembers?
    let knowledgeBaseId: Int?
    let promptId: Int?
    let categoryId: Int?
    let chatOptions: PlusChatOptions?
    let config: PlusAiAgentConfig?
    let usageCount: Int?
}

struct PlusApiResultPlusAiAgentVO: Codable {
    let data: PlusAiAgentVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusAiAgentToolForm: Codable {
    let agentId: Int?
    let toolId: Int?
    let sortOrder: Int?
    let enabled: Bool?
}

struct PlusAiAgentToolVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let agentId: Int?
    let toolId: Int?
    let sortOrder: Int?
    let enabled: Bool?
    let agentName: String?
    let toolName: String?
}

struct PlusApiResultPlusAiAgentToolVO: Codable {
    let data: PlusAiAgentToolVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusAccountForm: Codable {
    let accountType: String?
    let userId: Int?
    let availableBalance: Double?
    let frozenBalance: Double?
    let availablePoints: Int?
    let frozenPoints: Int?
    let status: String?
}

struct PlusAccountHistoryVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let assetType: String?
    let accountId: Int?
    let transactionId: String?
    let transactionType: String?
    let amount: Double?
    let balanceBefore: Double?
    let balanceAfter: Double?
    let relatedAccountId: Int?
    let pointsChange: Int?
    let pointsBefore: Int?
    let pointsAfter: Int?
    let sourceType: String?
    let sourceId: String?
    let expiredAt: String?
    let status: String?
    let remarks: String?
}

struct PlusAccountVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let userId: Int?
    let availableBalance: Double?
    let frozenBalance: Double?
    let availablePoints: Int?
    let frozenPoints: Int?
    let status: String?
    let historyList: [PlusAccountHistoryVO]?
}

struct PlusApiResultPlusAccountVO: Codable {
    let data: PlusAccountVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusAccountHistoryForm: Codable {
    let accountType: String?
    let assetType: String?
    let accountId: Int?
    let transactionId: String?
    let transactionType: String?
    let status: String?
    let amount: Double?
    let balanceBefore: Double?
    let balanceAfter: Double?
    let relatedAccountId: Int?
    let pointsChange: Int?
    let pointsBefore: Int?
    let pointsAfter: Int?
    let sourceType: String?
    let sourceId: String?
    let expiredAt: String?
    let remarks: String?
}

struct PlusApiResultPlusAccountHistoryVO: Codable {
    let data: PlusAccountHistoryVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AccountExchangeRateUpdateForm: Codable {
    let pointsToCashRate: Double?
    let remarks: String?
}

struct AccountExchangeRateVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let configKey: String?
    let pointsToCashRate: Double?
    let remarks: String?
}

struct PlusApiResultAccountExchangeRateVO: Codable {
    let data: AccountExchangeRateVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct QueryListForm: Codable {
    let id: Int?
    let createdAtFrom: String?
    let createdAtTo: String?
}

struct Pageable: Codable {
    let page: Int?
    let size: Int?
    let sort: [String]?
}

struct PagePlusWorkspaceVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusWorkspaceVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PageableObject: Codable {
    let offset: Int?
    let paged: Bool?
    let sort: SortObject?
    let pageSize: Int?
    let pageNumber: Int?
    let unpaged: Bool?
}

struct PlusApiResultPagePlusWorkspaceVO: Codable {
    let data: PagePlusWorkspaceVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct SortObject: Codable {
    let empty: Bool?
    let sorted: Bool?
    let unsorted: Bool?
}

struct PlusApiResultListPlusWorkspaceVO: Codable {
    let data: [PlusWorkspaceVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PageContentVoteVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [ContentVoteVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPageContentVoteVO: Codable {
    let data: PageContentVoteVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListContentVoteVO: Codable {
    let data: [ContentVoteVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusVoiceSpeakerQueryForm: Codable {
    let id: Int?
    let createdAtFrom: String?
    let createdAtTo: String?
    let userId: Int?
    let keyword: String?
    let status: String?
    let dataScope: String?
}

struct PagePlusVoiceSpeakerVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusVoiceSpeakerVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusVoiceSpeakerVO: Codable {
    let data: PagePlusVoiceSpeakerVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusVoiceSpeakerVO: Codable {
    let data: [PlusVoiceSpeakerVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusVisitHistoryVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusVisitHistoryVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusVisitHistoryVO: Codable {
    let data: PagePlusVisitHistoryVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusVisitHistoryVO: Codable {
    let data: [PlusVisitHistoryVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusVipUserVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusVipUserVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusVipUserVO: Codable {
    let data: PagePlusVipUserVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusVipUserVO: Codable {
    let data: [PlusVipUserVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusVipRechargePackVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusVipRechargePackVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusVipRechargePackVO: Codable {
    let data: PagePlusVipRechargePackVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusVipRechargePackVO: Codable {
    let data: [PlusVipRechargePackVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusVipRechargeVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusVipRechargeVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusVipRechargeVO: Codable {
    let data: PagePlusVipRechargeVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusVipRechargeVO: Codable {
    let data: [PlusVipRechargeVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusVipPointChangeVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusVipPointChangeVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusVipPointChangeVO: Codable {
    let data: PagePlusVipPointChangeVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusVipPointChangeVO: Codable {
    let data: [PlusVipPointChangeVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusVipPackGroupQueryForm: Codable {
    let id: Int?
    let createdAtFrom: String?
    let createdAtTo: String?
    let appId: Int?
    let appIdIn: [Int]?
}

struct PagePlusVipPackGroupVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusVipPackGroupVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusVipPackGroupVO: Codable {
    let data: PagePlusVipPackGroupVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusVipPackGroupVO: Codable {
    let data: [PlusVipPackGroupVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusVipPackVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusVipPackVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusVipPackVO: Codable {
    let data: PagePlusVipPackVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusVipPackVO: Codable {
    let data: [PlusVipPackVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusVipLevelVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusVipLevelVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusVipLevelVO: Codable {
    let data: PagePlusVipLevelVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusVipLevelVO: Codable {
    let data: [PlusVipLevelVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusVipLevelBenefitVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusVipLevelBenefitVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusVipLevelBenefitVO: Codable {
    let data: PagePlusVipLevelBenefitVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusVipLevelBenefitVO: Codable {
    let data: [PlusVipLevelBenefitVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusVipBenefitUsageVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusVipBenefitUsageVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusVipBenefitUsageVO: Codable {
    let data: PagePlusVipBenefitUsageVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusVipBenefitUsageVO: Codable {
    let data: [PlusVipBenefitUsageVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusVipBenefitVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusVipBenefitVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusVipBenefitVO: Codable {
    let data: PagePlusVipBenefitVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusVipBenefitVO: Codable {
    let data: [PlusVipBenefitVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusVideoVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusVideoVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusVideoVO: Codable {
    let data: PagePlusVideoVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusVideoVO: Codable {
    let data: [PlusVideoVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusUserOAuthAccountVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusUserOAuthAccountVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusUserOAuthAccountVO: Codable {
    let data: PagePlusUserOAuthAccountVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusUserOAuthAccountVO: Codable {
    let data: [PlusUserOAuthAccountVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusUserVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusUserVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusUserVO: Codable {
    let data: PagePlusUserVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusUserVO: Codable {
    let data: [PlusUserVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusUserCouponVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusUserCouponVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusUserCouponVO: Codable {
    let data: PagePlusUserCouponVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusUserCouponVO: Codable {
    let data: [PlusUserCouponVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusUserCardVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusUserCardVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusUserCardVO: Codable {
    let data: PagePlusUserCardVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusUserCardVO: Codable {
    let data: [PlusUserCardVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusUserAddressVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusUserAddressVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusUserAddressVO: Codable {
    let data: PagePlusUserAddressVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusUserAddressVO: Codable {
    let data: [PlusUserAddressVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PageUsageRecordVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [UsageRecordVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPageUsageRecordVO: Codable {
    let data: PageUsageRecordVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListUsageRecordVO: Codable {
    let data: [UsageRecordVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusShoppingCartVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusShoppingCartVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusShoppingCartVO: Codable {
    let data: PagePlusShoppingCartVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusShoppingCartVO: Codable {
    let data: [PlusShoppingCartVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusShoppingCartItemVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusShoppingCartItemVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusShoppingCartItemVO: Codable {
    let data: PagePlusShoppingCartItemVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusShoppingCartItemVO: Codable {
    let data: [PlusShoppingCartItemVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusRefundVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusRefundVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusRefundVO: Codable {
    let data: PagePlusRefundVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusRefundVO: Codable {
    let data: [PlusRefundVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusPaymentStatusQueryForm: Codable {
    let outTradeNo: String?
    let provider: String?
    let amount: Double?
}

struct PagePlusPaymentVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusPaymentVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusPaymentVO: Codable {
    let data: PagePlusPaymentVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusPaymentVO: Codable {
    let data: [PlusPaymentVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusPaymentCancelForm: Codable {
    let paymentId: Int?
    let outTradeNo: String?
    let amount: Double?
    let reason: String?
}

struct OrderShipVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let success: Bool?
    let message: String?
    let operationTime: String?
    let orderId: Int?
    let shippingCompany: String?
    let trackingNumber: String?
    let shipTime: String?
    let estimatedArrivalTime: String?
}

struct PlusApiResultOrderShipVO: Codable {
    let data: OrderShipVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct OrderDispatchActionForm: Codable {
    let remark: String?
}

struct PlusApiResultServiceOrderVO: Codable {
    let data: ServiceOrderVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ServiceOrderVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let orderId: Int?
    let orderSn: String?
    let taskCode: String?
    let dispatchMode: String?
    let dispatchStatus: String?
    let workerUserId: Int?
    let dispatchExpireTime: String?
    let success: Bool?
    let message: String?
}

struct OrderDispatchAssignForm: Codable {
    let workerUserId: Int?
    let remark: String?
}

struct OrderConfirmVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let success: Bool?
    let message: String?
    let operationTime: String?
    let orderId: Int?
    let confirmTime: String?
    let estimatedShipTime: String?
}

struct PlusApiResultOrderConfirmVO: Codable {
    let data: OrderConfirmVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct OrderCompleteVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let success: Bool?
    let message: String?
    let operationTime: String?
    let orderId: Int?
    let completeTime: String?
    let reviewed: Bool?
    let pointsEarned: Int?
}

struct PlusApiResultOrderCompleteVO: Codable {
    let data: OrderCompleteVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct OrderCloseVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let success: Bool?
    let message: String?
    let operationTime: String?
    let orderId: Int?
    let closeReason: String?
    let closeTime: String?
    let reopenable: Bool?
}

struct PlusApiResultOrderCloseVO: Codable {
    let data: OrderCloseVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct OrderCancelVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let success: Bool?
    let message: String?
    let operationTime: String?
    let orderId: Int?
    let cancelReason: String?
    let refundable: Bool?
    let refundAmount: String?
    let cancelTime: String?
}

struct PlusApiResultOrderCancelVO: Codable {
    let data: OrderCancelVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusOrderWorkerDispatchProfileVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusOrderWorkerDispatchProfileVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusOrderWorkerDispatchProfileVO: Codable {
    let data: PagePlusOrderWorkerDispatchProfileVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusOrderWorkerDispatchProfileVO: Codable {
    let data: [PlusOrderWorkerDispatchProfileVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CreateVirtualOrderForm: Codable {
    let items: [OrderContentItem]?
    let expireTime: String?
}

struct OrderContentItem: Codable {
    let id: Int?
    let productId: Int?
    let skuId: Int?
    let name: String?
    let type: String?
    let quantity: Int?
    let unitPrice: Double?
    let totalPrice: Double?
}

struct PlusApiResultVirtualOrderVO: Codable {
    let data: VirtualOrderVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VirtualOrderVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let orderId: Int?
    let orderSn: String?
    let success: Bool?
    let message: String?
}

struct CreateVipOrderForm: Codable {
    let items: [OrderContentItem]?
    let expireTime: String?
}

struct PlusApiResultVipOrderVO: Codable {
    let data: VipOrderVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VipOrderVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let orderId: Int?
    let orderSn: String?
    let success: Bool?
    let message: String?
}

struct CreateServiceOrderForm: Codable {
    let publisherUserId: Int?
    let subject: String?
    let taskCode: String?
    let dispatchMode: String?
    let totalAmount: Double?
    let dispatchExpireTime: String?
    let expireTime: String?
    let taskPayload: [String: Any]?
    let remark: String?
}

struct CreatePointsOrderForm: Codable {
    let items: [OrderContentItem]?
    let pointsAmount: Int?
    let expireTime: String?
}

struct PlusApiResultPointsOrderVO: Codable {
    let data: PointsOrderVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PointsOrderVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let orderId: Int?
    let orderSn: String?
    let success: Bool?
    let message: String?
}

struct PagePlusOrderVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusOrderVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusOrderVO: Codable {
    let data: PagePlusOrderVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusOrderVO: Codable {
    let data: [PlusOrderVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusOrderItemVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusOrderItemVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusOrderItemVO: Codable {
    let data: PagePlusOrderItemVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusOrderItemVO: Codable {
    let data: [PlusOrderItemVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CreateImGroupOrderForm: Codable {
    let items: [OrderContentItem]?
    let expireTime: String?
}

struct ImGroupOrderVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let orderId: Int?
    let orderSn: String?
    let success: Bool?
    let message: String?
}

struct PlusApiResultImGroupOrderVO: Codable {
    let data: ImGroupOrderVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CreateGoodsOrderForm: Codable {
    let items: [CartItem]?
    let expireTime: String?
}

struct GoodsOrderVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let orderId: Int?
    let orderSn: String?
    let success: Bool?
    let message: String?
}

struct PlusApiResultGoodsOrderVO: Codable {
    let data: GoodsOrderVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusOrderDispatchRuleVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusOrderDispatchRuleVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusOrderDispatchRuleVO: Codable {
    let data: PagePlusOrderDispatchRuleVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusOrderDispatchRuleVO: Codable {
    let data: [PlusOrderDispatchRuleVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CreateBookingOrderForm: Codable {
    let items: [OrderContentItem]?
    let expireTime: String?
}

struct BookingOrderVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let orderId: Int?
    let orderSn: String?
    let success: Bool?
    let message: String?
}

struct PlusApiResultBookingOrderVO: Codable {
    let data: BookingOrderVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusAiToolVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusAiToolVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusAiToolVO: Codable {
    let data: PagePlusAiToolVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusAiToolVO: Codable {
    let data: [PlusAiToolVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusTenantAuditLogVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusTenantAuditLogVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusTenantAuditLogVO: Codable {
    let data: PagePlusTenantAuditLogVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusTenantAuditLogVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let tenantId: Int?
    let action: String?
    let module: String?
    let operator: String?
    let description: String?
    let result: String?
    let createTime: String?
    let ip: String?
}

struct PagePlusTenantVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusTenantVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusTenantVO: Codable {
    let data: PagePlusTenantVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusTenantVO: Codable {
    let data: [PlusTenantVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct GetAccessTokenForm: Codable {
    let id: Int?
    let platforms: [String]?
}

struct PlusApiResultListTokenResult: Codable {
    let data: [TokenResult]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct TokenResult: Codable {
    let token: String?
    let expiresInMs: String?
    let createdAt: String?
    let expired: Bool?
}

struct PagePlusTableVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusTableVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusTableVO: Codable {
    let data: PagePlusTableVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusTableVO: Codable {
    let data: [PlusTableVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusSystemInvoiceApplyForm: Codable {
    let title: String?
    let taxId: String?
    let type: String?
    let amount: Double?
    let content: String?
    let email: String?
    let address: String?
}

struct PlusApiResultPlusSystemInvoiceVO: Codable {
    let data: PlusSystemInvoiceVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusSystemInvoiceVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let title: String?
    let taxId: String?
    let type: String?
    let amount: Double?
    let status: String?
    let content: String?
    let email: String?
    let address: String?
    let createTime: String?
}

struct PagePlusSkuVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusSkuVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusSkuVO: Codable {
    let data: PagePlusSkuVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusSkuVO: Codable {
    let data: [PlusSkuVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusAgentSkillReviewForm: Codable {
    let comment: String?
}

struct PlusAgentSkillFeatureForm: Codable {
    let featured: Bool?
    let recommendWeight: Int?
}

struct PlusAgentSkillQueryListForm: Codable {
    let id: Int?
    let createdAtFrom: String?
    let createdAtTo: String?
    let keyword: String?
    let userId: Int?
    let categoryId: Int?
    let packageId: Int?
    let marketStatus: String?
    let visibility: String?
    let sourceType: String?
    let reviewStatus: String?
    let builtin: Bool?
    let enabled: Bool?
    let featured: Bool?
}

struct PagePlusAgentSkillVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusAgentSkillVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusAgentSkillVO: Codable {
    let data: PagePlusAgentSkillVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusAgentSkillBatchReviewForm: Codable {
    let skillIds: [Int]?
    let comment: String?
}

struct PlusApiResultListPlusAgentSkillVO: Codable {
    let data: [PlusAgentSkillVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusAgentSkillPackageQueryListForm: Codable {
    let id: Int?
    let createdAtFrom: String?
    let createdAtTo: String?
    let keyword: String?
    let userId: Int?
    let categoryId: Int?
    let enabled: Bool?
    let featured: Bool?
}

struct PagePlusAgentSkillPackageVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusAgentSkillPackageVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusAgentSkillPackageVO: Codable {
    let data: PagePlusAgentSkillPackageVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusAgentSkillPackageVO: Codable {
    let data: [PlusAgentSkillPackageVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PageShortUrlVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [ShortUrlVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPageShortUrlVO: Codable {
    let data: PageShortUrlVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListShortUrlVO: Codable {
    let data: [ShortUrlVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusShopVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusShopVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusShopVO: Codable {
    let data: PagePlusShopVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusShopVO: Codable {
    let data: [PlusShopVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusShareVisitRecordVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusShareVisitRecordVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusShareVisitRecordVO: Codable {
    let data: PagePlusShareVisitRecordVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusShareVisitRecordVO: Codable {
    let data: [PlusShareVisitRecordVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusShareVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusShareVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusShareVO: Codable {
    let data: PagePlusShareVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusShareVO: Codable {
    let data: [PlusShareVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusShardingKeyVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusShardingKeyVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusShardingKeyVO: Codable {
    let data: PagePlusShardingKeyVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusShardingKeyVO: Codable {
    let data: [PlusShardingKeyVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusApiSecurityPolicyVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusApiSecurityPolicyVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusApiSecurityPolicyVO: Codable {
    let data: PagePlusApiSecurityPolicyVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusApiSecurityPolicyVO: Codable {
    let data: [PlusApiSecurityPolicyVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResult: Codable {
    let data: Any?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ChatCompletionCreateForm: Codable {
    let model: String?
    let messages: [ChatCompletionMessage]?
    let temperature: Double?
    let n: Int?
    let stream: Bool?
    let stop: [String]?
    let user: String?
    let tool: String?
    let topP: Double?
    let maxTokens: Int?
    let presencePenalty: Double?
    let frequencyPenalty: Double?
    let logitBias: [String: Int]?
    let responseFormat: Bool?
    let systemFingerprint: String?
    let chatContext: ChatContext?
}

struct PagePlusSchemaVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusSchemaVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusSchemaVO: Codable {
    let data: PagePlusSchemaVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusSchemaVO: Codable {
    let data: [PlusSchemaVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusRolePermissionVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusRolePermissionVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusRolePermissionVO: Codable {
    let data: PagePlusRolePermissionVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusRolePermissionVO: Codable {
    let data: [PlusRolePermissionVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusRoleVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusRoleVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusRoleVO: Codable {
    let data: PagePlusRoleVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusRoleVO: Codable {
    let data: [PlusRoleVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusInvokeRecordVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusInvokeRecordVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusInvokeRecordVO: Codable {
    let data: PagePlusInvokeRecordVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusInvokeRecordVO: Codable {
    let data: [PlusInvokeRecordVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusUserRoleVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusUserRoleVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusUserRoleVO: Codable {
    let data: PagePlusUserRoleVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusUserRoleVO: Codable {
    let data: [PlusUserRoleVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusAiPromptVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusAiPromptVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusAiPromptVO: Codable {
    let data: PagePlusAiPromptVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusAiPromptVO: Codable {
    let data: [PlusAiPromptVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusProjectVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusProjectVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusProjectVO: Codable {
    let data: PagePlusProjectVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusProjectVO: Codable {
    let data: [PlusProjectVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultPlusMallHomeVO: Codable {
    let data: PlusMallHomeVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusMallHomeVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let gridCategories: [PlusCategoryVO]?
    let products: [PlusProductVO]?
    let banners: [PlusProductVO]?
    let hotProducts: [PlusProductVO]?
    let newProducts: [PlusProductVO]?
    let recommendProducts: [PlusProductVO]?
    let hotSalesProducts: [PlusProductVO]?
}

struct PagePlusProductVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusProductVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusProductVO: Codable {
    let data: PagePlusProductVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusProductVO: Codable {
    let data: [PlusProductVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusPptTemplateSlideVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusPptTemplateSlideVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusPptTemplateSlideVO: Codable {
    let data: PagePlusPptTemplateSlideVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusPptTemplateSlideVO: Codable {
    let data: [PlusPptTemplateSlideVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusPptTemplateRenderForm: Codable {
    let id: Int?
    let uuid: String?
    let prompt: String?
}

struct PlusApiResultPlusPptProject: Codable {
    let data: PlusPptProject?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusPptContext: Codable {
    let templateUrl: String?
}

struct PlusPptProject: Codable {
    let id: String?
    let uuid: String?
    let type: String?
    let screenType: String?
    let name: String?
    let title: String?
    let owner: String?
    let ownerId: Int?
    let diskId: Int?
    let files: [PlusFileObject]?
    let author: String?
    let createdAt: String?
    let lastModifiedTime: String?
    let version: String?
    let prompt: String?
    let description: String?
    let tags: TagsContent?
    let width: Double?
    let height: Double?
    let slides: [PlusPptSlide]?
    let theme: PlusPptTheme?
    let context: PlusPptContext?
    let subtitle: String?
    let includePageNumbers: Bool?
    let includeFooter: Bool?
    let footerText: String?
    let exportFormat: String?
}

struct PlusPptTheme: Codable {
    let themeColors: [String]?
    let subColors: [String]?
    let exportThemeColors: [String]?
    let fontColor: String?
    let fontName: String?
    let backgroundColor: String?
    let shadow: PlusPptThemeShadow?
    let outline: PlusPptThemeOutline?
}

struct PlusPptThemeOutline: Codable {
    let width: Int?
    let color: String?
    let style: String?
}

struct PlusPptThemeShadow: Codable {
    let h: Int?
    let v: Int?
    let blur: Int?
    let color: String?
}

struct PagePlusPptTemplateVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusPptTemplateVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusPptTemplateVO: Codable {
    let data: PagePlusPptTemplateVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusPptTemplateVO: Codable {
    let data: [PlusPptTemplateVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusPermissionVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusPermissionVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusPermissionVO: Codable {
    let data: PagePlusPermissionVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusPermissionVO: Codable {
    let data: [PlusPermissionVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusPartnerVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusPartnerVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusPartnerVO: Codable {
    let data: PagePlusPartnerVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusPartnerVO: Codable {
    let data: [PlusPartnerVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusParticipantVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusParticipantVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusParticipantVO: Codable {
    let data: PagePlusParticipantVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusParticipantVO: Codable {
    let data: [PlusParticipantVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct FileItemVO: Codable {
    let id: String?
    let object: String?
    let bytes: Int?
    let createdAt: Int?
    let filename: String?
    let purpose: String?
    let expiresAt: Int?
    let status: String?
    let statusDetails: String?
    let deleted: Bool?
}

struct PlusApiResultFileItemVO: Codable {
    let data: FileItemVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGetTempSessionForm: Codable {
    let provider: String?
    let name: String?
    let scene: String?
    let bucket: BucketObject?
    let method: String?
    let expirationSeconds: Int?
}

struct PlusApiResultPlusTempSessionVO: Codable {
    let data: PlusTempSessionVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusTempSessionVO: Codable {
    let fileId: Int?
    let tmpAccessKeyId: String?
    let tmpAccessKeySecret: String?
    let sessionToken: String?
    let expirationSeconds: Int?
    let uploadUrl: String?
    let objectKey: String?
    let bucket: BucketObject?
    let createTime: String?
}

struct PlusGetPresignedUrlForm: Codable {
    let provider: String?
    let name: String?
    let scene: String?
    let bucket: BucketObject?
    let method: String?
    let expirationSeconds: Int?
}

struct GetUrlResult: Codable {
    let url: String?
    let previewUrl: String?
    let objectKey: String?
}

struct PlusApiResultGetUrlResult: Codable {
    let data: GetUrlResult?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusUploadForm: Codable {
    let provider: String?
    let name: String?
    let scene: String?
    let bucket: BucketObject?
    let expirationSeconds: Int?
}

struct PagePlusOssBucketVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusOssBucketVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusOssBucketVO: Codable {
    let data: PagePlusOssBucketVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusOssBucketVO: Codable {
    let data: [PlusOssBucketVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusPositionVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusPositionVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusPositionVO: Codable {
    let data: PagePlusPositionVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusPositionVO: Codable {
    let data: [PlusPositionVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusMemberRelationsVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusMemberRelationsVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusMemberRelationsVO: Codable {
    let data: PagePlusMemberRelationsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusMemberRelationsVO: Codable {
    let data: [PlusMemberRelationsVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusOrganizationVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusOrganizationVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusOrganizationVO: Codable {
    let data: PagePlusOrganizationVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusOrganizationVO: Codable {
    let data: [PlusOrganizationVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusOrganizationMemberVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusOrganizationMemberVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusOrganizationMemberVO: Codable {
    let data: PagePlusOrganizationMemberVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusOrganizationMemberVO: Codable {
    let data: [PlusOrganizationMemberVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusNotificationVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusNotificationVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusNotificationVO: Codable {
    let data: PagePlusNotificationVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusNotificationVO: Codable {
    let data: [PlusNotificationVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusNotesMediaDraftForm: Codable {
    let userId: Int?
    let platform: String?
    let product: String?
    let articles: [PlusNotesPublishArticleForm]?
}

struct PlusNotesPublishArticleForm: Codable {
    let noteId: Int?
    let noteUuid: String?
    let title: String?
    let content: String?
    let digest: String?
    let author: String?
    let thumbMediaId: String?
    let contentSourceUrl: String?
    let showCoverPic: Int?
    let needOpenComment: Int?
    let onlyFansCanComment: Int?
}

struct PlusApiResultPlusMediaPublishResultDTO: Codable {
    let data: PlusMediaPublishResultDTO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusMediaPublishItemResultDTO: Codable {
    let recordId: Int?
    let noteId: Int?
    let noteUuid: String?
    let title: String?
    let articleIndex: Int?
    let success: Bool?
    let errcode: Int?
    let errmsg: String?
    let draftMediaId: String?
    let publishId: String?
    let articleId: String?
}

struct PlusMediaPublishResultDTO: Codable {
    let batchId: String?
    let platform: String?
    let action: String?
    let success: Bool?
    let errcode: Int?
    let errmsg: String?
    let draftMediaId: String?
    let publishId: String?
    let articleId: String?
    let previewData: Any?
    let items: [PlusMediaPublishItemResultDTO]?
}

struct PlusNotesMediaPublishStatusForm: Codable {
    let userId: Int?
    let platform: String?
    let product: String?
    let publishId: String?
}

struct PlusNotesMediaPublishedArticleForm: Codable {
    let userId: Int?
    let platform: String?
    let product: String?
    let articleId: String?
}

struct PlusNotesMediaPublishDraftForm: Codable {
    let userId: Int?
    let platform: String?
    let product: String?
    let draftMediaId: String?
}

struct PlusNotesMediaPreviewForm: Codable {
    let userId: Int?
    let platform: String?
    let product: String?
    let draftMediaId: String?
}

struct PagePlusNewsVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusNewsVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusNewsVO: Codable {
    let data: PagePlusNewsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusNewsVO: Codable {
    let data: [PlusNewsVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusHostDomainVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusHostDomainVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusHostDomainVO: Codable {
    let data: PagePlusHostDomainVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusHostDomainVO: Codable {
    let data: [PlusHostDomainVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusDnsRecordVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusDnsRecordVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusDnsRecordVO: Codable {
    let data: PagePlusDnsRecordVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusDnsRecordVO: Codable {
    let data: [PlusDnsRecordVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusMusicVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusMusicVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusMusicVO: Codable {
    let data: PagePlusMusicVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusMusicVO: Codable {
    let data: [PlusMusicVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusAiModelPriceVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusAiModelPriceVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusAiModelPriceVO: Codable {
    let data: PagePlusAiModelPriceVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusAiModelPriceVO: Codable {
    let data: [PlusAiModelPriceVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusAiModelInfoQueryListForm: Codable {
    let id: Int?
    let createdAtFrom: String?
    let createdAtTo: String?
    let keyword: String?
    let channel: String?
    let modelType: String?
    let status: String?
    let family: String?
    let vendor: String?
    let openSource: Bool?
    let pricingType: String?
    let lifecycleStage: String?
    let minContextTokens: Int?
    let supportReasoning: Bool?
    let supportMultimodal: Bool?
    let supportFunctionCall: Bool?
    let supportRealtime: Bool?
    let supportFineTuning: Bool?
}

struct PagePlusAiModelInfoVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusAiModelInfoVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusAiModelInfoVO: Codable {
    let data: PagePlusAiModelInfoVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusAiModelInfoVO: Codable {
    let data: [PlusAiModelInfoVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusChatMessageContentVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusChatMessageContentVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusChatMessageContentVO: Codable {
    let data: PagePlusChatMessageContentVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusChatMessageContentVO: Codable {
    let data: [PlusChatMessageContentVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusMemberLevelVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusMemberLevelVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusMemberLevelVO: Codable {
    let data: PagePlusMemberLevelVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusMemberLevelVO: Codable {
    let data: [PlusMemberLevelVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusMemberCardVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusMemberCardVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusMemberCardVO: Codable {
    let data: PagePlusMemberCardVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusMemberCardVO: Codable {
    let data: [PlusMemberCardVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusKnowledgeBaseVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusKnowledgeBaseVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusKnowledgeBaseVO: Codable {
    let data: PagePlusKnowledgeBaseVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusKnowledgeBaseVO: Codable {
    let data: [PlusKnowledgeBaseVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PageInvitationRelationVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [InvitationRelationVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPageInvitationRelationVO: Codable {
    let data: PageInvitationRelationVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListInvitationRelationVO: Codable {
    let data: [InvitationRelationVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PageInvitationCodeVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [InvitationCodeVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPageInvitationCodeVO: Codable {
    let data: PageInvitationCodeVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListInvitationCodeVO: Codable {
    let data: [InvitationCodeVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusImageVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusImageVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusImageVO: Codable {
    let data: PagePlusImageVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusImageVO: Codable {
    let data: [PlusImageVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusImMessageMarkReadForm: Codable {
    let conversationId: Int?
}

struct PlusImMessageQueryForm: Codable {
    let id: Int?
    let createdAtFrom: String?
    let createdAtTo: String?
    let conversationId: Int?
    let senderId: Int?
    let receiverId: Int?
    let groupId: Int?
    let type: String?
}

struct PagePlusMessage: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusMessage]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusMessage: Codable {
    let data: PagePlusMessage?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusMessage: Codable {
    let id: Int?
    let uuid: String?
    let createdAt: String?
    let updatedAt: String?
    let sendAt: String?
    let conversationId: Int?
    let type: String?
    let sender: Participant?
    let receiver: Participant?
    let groupId: Int?
    let msgId: String?
    let clientMsgId: String?
    let body: MessageBody?
    let metadata: [String: Any]?
    let content: String?
}

struct PagePlusImGroupVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusImGroupVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusImGroupVO: Codable {
    let data: PagePlusImGroupVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusImGroupVO: Codable {
    let data: [PlusImGroupVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct GenerateVoiceSpeakerForm: Codable {
    let voiceSpeakerName: String?
    let voiceType: String?
    let text: String?
    let speed: Double?
    let pitch: Double?
    let volume: Int?
    let model: String?
    let responseFormat: String?
    let prompt: String?
}

struct AudioMediaResourceList: Codable {
    let audios: [AudioMediaResource]?
    let resources: [AssetMediaResource]?
}

struct GenerateVoiceSpeakerVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let requestId: String?
    let taskId: String?
    let taskStatus: String?
    let voiceResources: AudioMediaResourceList?
    let voiceSpeakerId: String?
    let voiceSpeakerName: String?
    let voiceType: String?
    let voiceStyle: String?
    let model: String?
    let duration: Int?
    let errorMessage: String?
}

struct PlusApiResultGenerateVoiceSpeakerVO: Codable {
    let data: GenerateVoiceSpeakerVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct GenerateVideoForm: Codable {
    let prompt: String?
    let negativePrompt: String?
    let n: Int?
    let width: Int?
    let height: Int?
    let model: String?
    let responseFormat: String?
    let style: String?
    let aspectRatio: String?
}

struct GenerateVideoVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let requestId: String?
    let taskId: String?
    let taskStatus: String?
    let videos: VideoMediaResourceList?
    let status: String?
}

struct PlusApiResultGenerateVideoVO: Codable {
    let data: GenerateVideoVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VideoMediaResourceList: Codable {
    let videos: [VideoMediaResource]?
    let resources: [AssetMediaResource]?
}

struct GenerateMusicForm: Codable {
    let prompt: String?
    let lyrics: String?
    let n: Int?
    let model: String?
    let tempo: Int?
    let style: String?
    let instrument: String?
}

struct GenerateMusicVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let requestId: String?
    let taskId: String?
    let taskStatus: String?
    let audios: AudioMediaResourceList?
    let lyrics: String?
}

struct PlusApiResultGenerateMusicVO: Codable {
    let data: GenerateMusicVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusAiGenerationVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusAiGenerationVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusAiGenerationVO: Codable {
    let data: PagePlusAiGenerationVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusAiGenerationVO: Codable {
    let data: [PlusAiGenerationVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct GenerateImageForm: Codable {
    let prompt: String?
    let negativePrompt: String?
    let n: Int?
    let width: Int?
    let height: Int?
    let model: String?
    let responseFormat: String?
    let style: String?
    let aspectRatio: String?
}

struct GenerateImageVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let requestId: String?
    let taskId: String?
    let taskStatus: String?
    let images: ImageMediaResourceList?
}

struct PlusApiResultGenerateImageVO: Codable {
    let data: GenerateImageVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusAiGenerationContentVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusAiGenerationContentVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusAiGenerationContentVO: Codable {
    let data: PagePlusAiGenerationContentVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusAiGenerationContentVO: Codable {
    let data: [PlusAiGenerationContentVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct GenerateCharacterForm: Codable {
    let name: String?
    let description: String?
    let appearance: String?
    let personality: String?
    let background: String?
    let style: String?
    let responseFormat: String?
    let model: String?
    let n: Int?
    let width: Int?
    let height: Int?
    let quality: String?
    let prompt: String?
    let negativePrompt: String?
}

struct GenerateCharacterVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let requestId: String?
    let taskId: String?
    let taskStatus: String?
    let characterImages: [ImageMediaResource]?
    let characterId: String?
    let characterName: String?
    let characterDescription: String?
    let model: String?
    let duration: Int?
    let errorMessage: String?
}

struct PlusApiResultGenerateCharacterVO: Codable {
    let data: GenerateCharacterVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct GenerateAudioForm: Codable {
    let title: String?
    let prompt: String?
    let voice: String?
    let model: String?
    let format: String?
    let speed: Double?
}

struct GenerateAudioVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let requestId: String?
    let taskId: String?
    let taskStatus: String?
}

struct PlusApiResultGenerateAudioVO: Codable {
    let data: GenerateAudioVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct GenerateAudioEffectForm: Codable {
    let title: String?
    let prompt: String?
    let audioType: String?
    let effectType: String?
    let intensity: Int?
    let effectParams: String?
    let model: String?
    let channel: String?
}

struct GenerateAudioEffectVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let requestId: String?
    let taskId: String?
    let taskStatus: String?
}

struct PlusApiResultGenerateAudioEffectVO: Codable {
    let data: GenerateAudioEffectVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameTournamentRegistrationForm: Codable {
    let userId: Int?
}

struct PlusGameTournamentPlayerManageForm: Codable {
    let status: String?
    let seedNo: Int?
    let rankNo: Int?
    let teamNo: Int?
    let scoreValue: Double?
    let totalMatchCount: Int?
    let winCount: Int?
    let loseCount: Int?
}

struct PlusApiResultPlusGameTournamentPlayerVO: Codable {
    let data: PlusGameTournamentPlayerVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameTournamentPlayerVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let playerId: Int?
    let tournamentId: Int?
    let userId: Int?
    let gameType: String?
    let clubId: Int?
    let teamNo: Int?
    let status: String?
    let seedNo: Int?
    let rankNo: Int?
    let nicknameSnapshot: String?
    let avatarUrl: String?
    let scoreValue: Double?
    let totalMatchCount: Int?
    let winCount: Int?
    let loseCount: Int?
    let registeredAt: String?
    let checkedInAt: String?
    let finishedAt: String?
}

struct PlusGameTournamentPlayerQueryForm: Codable {
    let id: Int?
    let createdAtFrom: String?
    let createdAtTo: String?
    let tournamentId: Int?
    let userId: Int?
    let status: String?
}

struct PagePlusGameTournamentPlayerVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusGameTournamentPlayerVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusGameTournamentPlayerVO: Codable {
    let data: PagePlusGameTournamentPlayerVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameTournamentBatchStatusForm: Codable {
    let userIds: [Int]?
    let playerItems: [PlusGameTournamentBatchStatusPlayerForm]?
    let status: String?
    let startRankNo: Int?
}

struct PlusGameTournamentBatchStatusPlayerForm: Codable {
    let userId: Int?
    let status: String?
    let rankNo: Int?
    let scoreValue: Double?
    let totalMatchCount: Int?
    let winCount: Int?
    let loseCount: Int?
}

struct PlusApiResultListPlusGameTournamentPlayerVO: Codable {
    let data: [PlusGameTournamentPlayerVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameTournamentBatchArrangeForm: Codable {
    let userIds: [Int]?
    let arrangePlayers: [PlusGameTournamentBatchArrangePlayerForm]?
    let seedNoStart: Int?
    let teamNoStart: Int?
    let groupSize: Int?
    let overwriteExistingSeedNo: Bool?
    let overwriteExistingTeamNo: Bool?
}

struct PlusGameTournamentBatchArrangePlayerForm: Codable {
    let userId: Int?
    let seedNo: Int?
    let teamNo: Int?
}

struct PlusGameTournamentManageForm: Codable {
    let status: String?
    let signUpStartAt: String?
    let signUpEndAt: String?
    let startAt: String?
    let endAt: String?
    let winnerUserId: Int?
    let winnerClubId: Int?
}

struct PlusApiResultPlusGameTournamentVO: Codable {
    let data: PlusGameTournamentVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameTournamentVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let tournamentId: Int?
    let tournamentNo: String?
    let name: String?
    let shortName: String?
    let description: String?
    let gameType: String?
    let gameModeCode: String?
    let tournamentType: String?
    let status: String?
    let organizerUserId: Int?
    let clubId: Int?
    let seasonKey: String?
    let regionCode: String?
    let minPlayerCount: Int?
    let maxPlayerCount: Int?
    let teamSize: Int?
    let registrationRequired: Bool?
    let ranked: Bool?
    let replayEnabled: Bool?
    let signUpStartAt: String?
    let signUpEndAt: String?
    let startAt: String?
    let endAt: String?
    let winnerUserId: Int?
    let winnerClubId: Int?
    let totalParticipantCount: Int?
    let totalMatchCount: Int?
    let registeredCount: Int?
    let checkedInCount: Int?
    let playingCount: Int?
    let advancedCount: Int?
    let eliminatedCount: Int?
    let finishedCount: Int?
    let withdrawnCount: Int?
}

struct PlusGameTournamentQueryForm: Codable {
    let id: Int?
    let createdAtFrom: String?
    let createdAtTo: String?
    let gameType: String?
    let status: String?
}

struct PagePlusGameTournamentVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusGameTournamentVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusGameTournamentVO: Codable {
    let data: PagePlusGameTournamentVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameStatsQueryForm: Codable {
    let userId: Int?
    let gameType: String?
    let gameModeCode: String?
    let seasonKey: String?
    let scopeType: String?
    let scopeOwnerId: Int?
}

struct PlusApiResultPlusGameStatsVO: Codable {
    let data: PlusGameStatsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameStatsVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let statsId: Int?
    let userId: Int?
    let gameType: String?
    let gameModeCode: String?
    let seasonKey: String?
    let scopeType: String?
    let scopeOwnerId: Int?
    let clubId: Int?
    let regionCode: String?
    let nicknameSnapshot: String?
    let avatarUrl: String?
    let rankingType: String?
    let totalMatchCount: Int?
    let winCount: Int?
    let loseCount: Int?
    let drawCount: Int?
    let escapeCount: Int?
    let totalRoundCount: Int?
    let totalActionCount: Int?
    let totalMoveCount: Int?
    let totalDurationSeconds: Int?
    let score: Int?
    let ratingScore: Int?
    let chipsBalance: Int?
    let profitAmount: Int?
    let winRate: Double?
    let currentWinStreak: Int?
    let bestWinStreak: Int?
    let highestRatingScore: Int?
    let bestRankNo: Int?
    let bestDailyRankNo: Int?
    let bestWeeklyRankNo: Int?
    let bestMonthlyRankNo: Int?
    let bestQuarterlyRankNo: Int?
    let bestYearlyRankNo: Int?
    let honorCount: Int?
    let leaderboardPosition: Int?
    let lastMatchAt: String?
    let challengeTotalCount: Int?
    let challengeWinCount: Int?
    let challengeLoseCount: Int?
    let arenaAttackWinCount: Int?
    let arenaDefenseWinCount: Int?
    let arenaDefenseLoseCount: Int?
    let arenaBestDefenseStreak: Int?
}

struct PlusGameScoreRecordQueryForm: Codable {
    let id: Int?
    let createdAtFrom: String?
    let createdAtTo: String?
    let userId: Int?
    let gameType: String?
    let changeType: String?
    let tournamentId: Int?
    let roomId: Int?
    let matchId: Int?
    let leaderboardId: Int?
    let bizNo: String?
    let operatorUserId: Int?
}

struct PagePlusGameScoreRecordVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusGameScoreRecordVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusGameScoreRecordVO: Codable {
    let data: PagePlusGameScoreRecordVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameScoreRecordVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let recordId: Int?
    let userId: Int?
    let gameType: String?
    let seasonKey: String?
    let tournamentId: Int?
    let roomId: Int?
    let matchId: Int?
    let leaderboardId: Int?
    let changeType: String?
    let rankingType: String?
    let periodType: String?
    let scopeType: String?
    let bizNo: String?
    let reason: String?
    let scoreBefore: Int?
    let scoreDelta: Int?
    let scoreAfter: Int?
    let ratingBefore: Int?
    let ratingDelta: Int?
    let ratingAfter: Int?
    let chipsBefore: Int?
    let chipsDelta: Int?
    let chipsAfter: Int?
    let operatorUserId: Int?
    let occurredAt: String?
    let settlementData: [String: Any]?
    let extData: [String: Any]?
}

struct PlusGameRoomSeatManageForm: Codable {
    let userId: Int?
    let status: String?
    let playerType: String?
    let nicknameSnapshot: String?
    let avatarUrl: String?
    let joinSource: String?
    let teamNo: Int?
    let ready: Bool?
    let trusteeship: Bool?
    let spectator: Bool?
    let roomScore: Int?
    let chips: Int?
    let eliminatedRankNo: Int?
}

struct PlusApiResultPlusGameRoomSeatVO: Codable {
    let data: PlusGameRoomSeatVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameRoomSeatVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let seatId: Int?
    let roomId: Int?
    let definitionId: Int?
    let gameType: String?
    let userId: Int?
    let seatNo: Int?
    let status: String?
    let playerType: String?
    let nicknameSnapshot: String?
    let avatarUrl: String?
    let joinSource: String?
    let teamNo: Int?
    let ready: Bool?
    let trusteeship: Bool?
    let spectator: Bool?
    let roomScore: Int?
    let chips: Int?
    let eliminatedRankNo: Int?
    let joinedAt: String?
    let eliminatedAt: String?
    let leftAt: String?
    let handSnapshot: [String: Any]?
}

struct PlusGameRoomSeatQueryForm: Codable {
    let id: Int?
    let createdAtFrom: String?
    let createdAtTo: String?
    let roomId: Int?
    let userId: Int?
    let status: String?
}

struct PagePlusGameRoomSeatVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusGameRoomSeatVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusGameRoomSeatVO: Codable {
    let data: PagePlusGameRoomSeatVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameDismissRoomForm: Codable {
    let reason: String?
}

struct PlusApiResultPlusGameRoomVO: Codable {
    let data: PlusGameRoomVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameRoomVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let roomId: Int?
    let userId: Int?
    let definitionId: Int?
    let gameType: String?
    let gameModeCode: String?
    let seasonKey: String?
    let roomNo: String?
    let name: String?
    let roomType: String?
    let status: String?
    let visibility: String?
    let seatCount: Int?
    let currentPlayerCount: Int?
    let minStartPlayerCount: Int?
    let hostSeatNo: Int?
    let clubId: Int?
    let tournamentId: Int?
    let regionCode: String?
    let currentMatchId: Int?
    let currentRoundNo: Int?
    let plannedRoundCount: Int?
    let finishedRoundCount: Int?
    let ranked: Bool?
    let allowSpectator: Bool?
    let allowRobot: Bool?
    let allowTrusteeship: Bool?
    let leaderboardEligible: Bool?
    let replayEnabled: Bool?
    let spectatorCount: Int?
    let inviteCode: String?
    let ruleConfig: [String: Any]?
    let extData: [String: Any]?
    let startedAt: String?
    let endedAt: String?
    let lastActiveAt: String?
}

struct PlusGameRoomQueryForm: Codable {
    let id: Int?
    let createdAtFrom: String?
    let createdAtTo: String?
    let userId: Int?
    let definitionId: Int?
    let gameType: String?
    let gameModeCode: String?
    let seasonKey: String?
    let roomNo: String?
    let roomNoLike: String?
    let nameLike: String?
    let roomType: String?
    let status: String?
    let visibility: String?
    let ranked: Bool?
    let allowSpectator: Bool?
    let leaderboardEligible: Bool?
    let replayEnabled: Bool?
    let clubId: Int?
    let tournamentId: Int?
    let regionCode: String?
    let currentMatchId: Int?
}

struct PagePlusGameRoomVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusGameRoomVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusGameRoomVO: Codable {
    let data: PagePlusGameRoomVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameReplayManageForm: Codable {
    let title: String?
    let publicVisible: Bool?
    let allowShare: Bool?
    let status: String?
    let coverUrl: String?
    let expiredAt: String?
}

struct PlusApiResultPlusGameReplayVO: Codable {
    let data: PlusGameReplayVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameReplayVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let replayId: Int?
    let replayNo: String?
    let roomId: Int?
    let matchId: Int?
    let gameType: String?
    let roomType: String?
    let gameModeCode: String?
    let seasonKey: String?
    let clubId: Int?
    let tournamentId: Int?
    let regionCode: String?
    let ownerUserId: Int?
    let title: String?
    let status: String?
    let publicVisible: Bool?
    let allowShare: Bool?
    let durationSeconds: Int?
    let actionCount: Int?
    let keyFrameCount: Int?
    let storageKey: String?
    let coverUrl: String?
    let boardSnapshot: [String: Any]?
    let keyFrames: [String: Any]?
    let startedAt: String?
    let endedAt: String?
    let expiredAt: String?
}

struct PlusGameReplayQueryForm: Codable {
    let id: Int?
    let createdAtFrom: String?
    let createdAtTo: String?
    let roomId: Int?
    let matchId: Int?
    let gameType: String?
    let roomType: String?
    let gameModeCode: String?
    let seasonKey: String?
    let clubId: Int?
    let tournamentId: Int?
    let regionCode: String?
    let ownerUserId: Int?
    let titleLike: String?
    let status: String?
    let publicVisible: Bool?
    let allowShare: Bool?
}

struct PagePlusGameReplayVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusGameReplayVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusGameReplayVO: Codable {
    let data: PagePlusGameReplayVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameRecordQueryForm: Codable {
    let id: Int?
    let createdAtFrom: String?
    let createdAtTo: String?
    let userId: Int?
    let roomId: Int?
    let matchId: Int?
    let tournamentId: Int?
    let clubId: Int?
    let seatNo: Int?
    let winner: Bool?
    let escaped: Bool?
    let gameType: String?
    let gameModeCode: String?
    let resultType: String?
}

struct PagePlusGameRecordVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusGameRecordVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusGameRecordVO: Codable {
    let data: PagePlusGameRecordVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameRecordVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let recordId: Int?
    let roomId: Int?
    let matchId: Int?
    let userId: Int?
    let gameType: String?
    let gameModeCode: String?
    let seasonKey: String?
    let clubId: Int?
    let tournamentId: Int?
    let regionCode: String?
    let seatNo: Int?
    let teamNo: Int?
    let resultType: String?
    let rankNo: Int?
    let nicknameSnapshot: String?
    let avatarUrl: String?
    let winner: Bool?
    let escaped: Bool?
    let leaderboardEligible: Bool?
    let actionCount: Int?
    let moveCount: Int?
    let scoreBefore: Int?
    let scoreDelta: Int?
    let scoreAfter: Int?
    let ratingBefore: Int?
    let ratingDelta: Int?
    let ratingAfter: Int?
    let chipsBefore: Int?
    let chipsDelta: Int?
    let chipsAfter: Int?
    let joinedAt: String?
    let finishedAt: String?
    let bestRankSnapshot: Int?
    let settlementData: [String: Any]?
    let honorSnapshot: [String: Any]?
}

struct PlusApiResultPlusGameMatchVO: Codable {
    let data: PlusGameMatchVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameMatchVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let matchId: Int?
    let definitionId: Int?
    let roomId: Int?
    let gameType: String?
    let gameModeCode: String?
    let seasonKey: String?
    let matchNo: String?
    let roomType: String?
    let status: String?
    let ranked: Bool?
    let totalPlayerCount: Int?
    let clubId: Int?
    let tournamentId: Int?
    let regionCode: String?
    let currentRoundNo: Int?
    let maxRoundCount: Int?
    let currentTurnSeatNo: Int?
    let dealerSeatNo: Int?
    let winnerSeatNo: Int?
    let winnerUserId: Int?
    let replayId: Int?
    let actionCount: Int?
    let moveCount: Int?
    let leaderboardEligible: Bool?
    let validForStats: Bool?
    let resultConfirmed: Bool?
    let abnormalFinished: Bool?
    let invalidReason: String?
    let startedAt: String?
    let settledAt: String?
    let endedAt: String?
    let durationSeconds: Int?
}

struct PlusGameMatchManageForm: Codable {
    let status: String?
    let currentRoundNo: Int?
    let maxRoundCount: Int?
    let currentTurnSeatNo: Int?
    let dealerSeatNo: Int?
    let winnerSeatNo: Int?
    let winnerUserId: Int?
    let leaderboardEligible: Bool?
    let validForStats: Bool?
    let resultConfirmed: Bool?
    let abnormalFinished: Bool?
    let invalidReason: String?
}

struct PlusGameStartMatchForm: Codable {
    let roomId: Int?
}

struct PlusGameMatchQueryForm: Codable {
    let id: Int?
    let createdAtFrom: String?
    let createdAtTo: String?
    let definitionId: Int?
    let roomId: Int?
    let gameType: String?
    let gameModeCode: String?
    let seasonKey: String?
    let matchNo: String?
    let matchNoLike: String?
    let roomType: String?
    let status: String?
    let ranked: Bool?
    let clubId: Int?
    let tournamentId: Int?
    let regionCode: String?
    let winnerUserId: Int?
    let replayId: Int?
    let leaderboardEligible: Bool?
    let validForStats: Bool?
    let resultConfirmed: Bool?
    let abnormalFinished: Bool?
}

struct PagePlusGameMatchVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusGameMatchVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusGameMatchVO: Codable {
    let data: PagePlusGameMatchVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusGameLeaderboardEntryVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusGameLeaderboardEntryVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusGameLeaderboardEntryVO: Codable {
    let data: PagePlusGameLeaderboardEntryVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameLeaderboardEntryVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let entryId: Int?
    let leaderboardId: Int?
    let userId: Int?
    let rankingType: String?
    let periodType: String?
    let scopeType: String?
    let scopeOwnerId: Int?
    let seasonKey: String?
    let nicknameSnapshot: String?
    let avatarUrl: String?
    let rankNo: Int?
    let previousRankNo: Int?
    let peakRankNo: Int?
    let status: String?
    let scoreValue: Double?
    let scoreDelta: Double?
    let tieBreakerValue: Double?
    let displayValue: String?
    let totalMatchCount: Int?
    let winCount: Int?
    let loseCount: Int?
    let drawCount: Int?
    let streakCount: Int?
    let rewardGranted: Bool?
    let rewardIssuedAt: String?
    let badgeCode: String?
}

struct PlusGameLeaderboardQueryForm: Codable {
    let id: Int?
    let createdAtFrom: String?
    let createdAtTo: String?
    let gameType: String?
    let gameModeCode: String?
    let seasonKey: String?
    let scopeOwnerId: Int?
    let rankingType: String?
    let periodType: String?
    let scopeType: String?
}

struct PagePlusGameLeaderboardVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusGameLeaderboardVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusGameLeaderboardVO: Codable {
    let data: PagePlusGameLeaderboardVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameLeaderboardVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let leaderboardId: Int?
    let leaderboardNo: String?
    let name: String?
    let shortName: String?
    let gameType: String?
    let gameModeCode: String?
    let rankingType: String?
    let periodType: String?
    let scopeType: String?
    let scopeOwnerId: Int?
    let scopeName: String?
    let seasonKey: String?
    let clubId: Int?
    let tournamentId: Int?
    let regionCode: String?
    let status: String?
    let rankedOnly: Bool?
    let includeFriendRoom: Bool?
    let includeTournamentRoom: Bool?
    let includeClubRoom: Bool?
    let minMatchCount: Int?
    let minWinRateMatchCount: Int?
    let totalParticipantCount: Int?
    let periodStartAt: String?
    let periodEndAt: String?
    let publishedAt: String?
    let settledAt: String?
    let entries: [PlusGameLeaderboardEntryVO]?
}

struct PlusGameHonorQueryForm: Codable {
    let userId: Int?
    let seasonKey: String?
}

struct PlusApiResultListPlusGameHonorVO: Codable {
    let data: [PlusGameHonorVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameHonorVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let honorId: Int?
    let userId: Int?
    let gameType: String?
    let seasonKey: String?
    let sourceType: String?
    let sourceId: Int?
    let leaderboardId: Int?
    let tournamentId: Int?
    let periodType: String?
    let rankingType: String?
    let status: String?
    let clubId: Int?
    let regionCode: String?
    let title: String?
    let subtitle: String?
    let description: String?
    let badgeCode: String?
    let iconUrl: String?
    let rankNo: Int?
    let scoreValue: Double?
    let wallVisible: Bool?
    let grantedAt: String?
    let expiredAt: String?
}

struct PlusGameGrowthRewardClaimQueryForm: Codable {
    let accountId: Int?
    let userId: Int?
    let accountType: String?
    let gameType: String?
    let gameModeCode: String?
    let seasonKey: String?
}

struct PlusApiResultListPlusGameGrowthRewardClaimVO: Codable {
    let data: [PlusGameGrowthRewardClaimVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameGrowthRewardClaimVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let accountId: Int?
    let userId: Int?
    let accountType: String?
    let gameType: String?
    let gameModeCode: String?
    let seasonKey: String?
    let currentLevelNo: Int?
    let levelNo: Int?
    let levelCode: String?
    let levelName: String?
    let title: String?
    let badgeCode: String?
    let claimedAt: String?
    let rewardIssuedAt: String?
    let operatorUserId: Int?
    let rewardConfig: [String: Any]?
    let rewardSummary: [String: Any]?
}

struct PlusGameGrowthRecordQueryForm: Codable {
    let id: Int?
    let createdAtFrom: String?
    let createdAtTo: String?
    let userId: Int?
    let accountType: String?
    let gameType: String?
    let gameModeCode: String?
    let seasonKey: String?
    let roomId: Int?
    let matchId: Int?
    let tournamentId: Int?
    let sourceType: String?
}

struct PagePlusGameGrowthRecordVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusGameGrowthRecordVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusGameGrowthRecordVO: Codable {
    let data: PagePlusGameGrowthRecordVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameGrowthRecordVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let recordId: Int?
    let userId: Int?
    let accountType: String?
    let gameType: String?
    let gameModeCode: String?
    let seasonKey: String?
    let roomId: Int?
    let matchId: Int?
    let tournamentId: Int?
    let sourceType: String?
    let bizNo: String?
    let reason: String?
    let expBefore: Int?
    let expDelta: Int?
    let expAfter: Int?
    let totalExpBefore: Int?
    let totalExpDelta: Int?
    let totalExpAfter: Int?
    let levelConfigIdBefore: Int?
    let levelConfigIdAfter: Int?
    let levelNoBefore: Int?
    let levelNoAfter: Int?
    let levelCodeBefore: String?
    let levelCodeAfter: String?
    let levelUp: Bool?
    let operatorUserId: Int?
    let occurredAt: String?
    let settlementData: [String: Any]?
    let extData: [String: Any]?
}

struct PlusGameGrowthLevelConfigQueryForm: Codable {
    let id: Int?
    let createdAtFrom: String?
    let createdAtTo: String?
    let accountType: String?
    let gameType: String?
    let gameModeCode: String?
    let seasonKey: String?
    let status: String?
}

struct PagePlusGameGrowthLevelConfigVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusGameGrowthLevelConfigVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusGameGrowthLevelConfigVO: Codable {
    let data: PagePlusGameGrowthLevelConfigVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameGrowthLevelConfigVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let configId: Int?
    let accountType: String?
    let gameType: String?
    let gameModeCode: String?
    let seasonKey: String?
    let levelNo: Int?
    let levelCode: String?
    let levelName: String?
    let title: String?
    let badgeCode: String?
    let iconUrl: String?
    let requiredExp: Int?
    let expStartValue: Int?
    let expEndValue: Int?
    let winExpReward: Int?
    let loseExpReward: Int?
    let drawExpReward: Int?
    let escapeExpPenalty: Int?
    let status: String?
    let visible: Bool?
    let description: String?
    let rewardConfig: [String: Any]?
    let benefitConfig: [String: Any]?
    let extData: [String: Any]?
}

struct PlusGameGrowthAccountRefreshForm: Codable {
    let userId: Int?
    let accountType: String?
    let gameType: String?
    let gameModeCode: String?
    let seasonKey: String?
}

struct PlusApiResultPlusGameGrowthAccountVO: Codable {
    let data: PlusGameGrowthAccountVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameGrowthAccountVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let accountId: Int?
    let userId: Int?
    let accountType: String?
    let gameType: String?
    let gameModeCode: String?
    let seasonKey: String?
    let currentLevelConfigId: Int?
    let currentLevelNo: Int?
    let currentLevelCode: String?
    let currentLevelName: String?
    let currentTitle: String?
    let currentBadgeCode: String?
    let currentExp: Int?
    let totalExp: Int?
    let currentLevelStartExp: Int?
    let nextLevelRequiredExp: Int?
    let expToNextLevel: Int?
    let progressPercent: Double?
    let peakLevelNo: Int?
    let peakExp: Int?
    let levelUpCount: Int?
    let rewardClaimedCount: Int?
    let lastGainAt: String?
    let lastLevelUpAt: String?
    let lastResetAt: String?
    let active: Bool?
    let lastClaimedLevelNo: Int?
    let lastRewardClaimedAt: String?
    let lastRewardIssuedAt: String?
    let lastClaimedRewardLevelCode: String?
    let lastClaimedRewardLevelName: String?
    let lastClaimedRewardSummary: [String: Any]?
    let lastClaimedRewardConfig: [String: Any]?
    let extData: [String: Any]?
}

struct PlusGameGrowthAccountQueryForm: Codable {
    let id: Int?
    let createdAtFrom: String?
    let createdAtTo: String?
    let userId: Int?
    let accountType: String?
    let gameType: String?
    let gameModeCode: String?
    let seasonKey: String?
    let active: Bool?
}

struct PagePlusGameGrowthAccountVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusGameGrowthAccountVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusGameGrowthAccountVO: Codable {
    let data: PagePlusGameGrowthAccountVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameDefinitionQueryForm: Codable {
    let id: Int?
    let createdAtFrom: String?
    let createdAtTo: String?
    let code: String?
    let codeLike: String?
    let nameLike: String?
    let gameType: String?
    let category: String?
    let gameModeCode: String?
    let enabled: Bool?
    let ranked: Bool?
    let supportsReplay: Bool?
    let supportsTournament: Bool?
}

struct PagePlusGameDefinitionVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusGameDefinitionVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusGameDefinitionVO: Codable {
    let data: PagePlusGameDefinitionVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusGameDefinitionVO: Codable {
    let data: [PlusGameDefinitionVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameChallengeManageForm: Codable {
    let status: String?
    let winnerUserId: Int?
    let roomId: Int?
    let matchId: Int?
    let reason: String?
}

struct PlusApiResultPlusGameChallengeVO: Codable {
    let data: PlusGameChallengeVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameChallengeVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let challengeId: Int?
    let challengeNo: String?
    let arenaId: Int?
    let sourceType: String?
    let gameType: String?
    let gameModeCode: String?
    let status: String?
    let challengerUserId: Int?
    let targetUserId: Int?
    let winnerUserId: Int?
    let loserUserId: Int?
    let stakeScore: Int?
    let challengerStakeLocked: Int?
    let targetStakeLocked: Int?
    let leaderboardId: Int?
    let roomId: Int?
    let matchId: Int?
    let reason: String?
    let challengedAt: String?
    let acceptedAt: String?
    let settledAt: String?
    let expiredAt: String?
    let canceledAt: String?
}

struct PlusGameChallengeQueryForm: Codable {
    let id: Int?
    let createdAtFrom: String?
    let createdAtTo: String?
    let challengerUserId: Int?
    let targetUserId: Int?
    let arenaId: Int?
    let winnerUserId: Int?
    let gameType: String?
    let status: String?
    let sourceType: String?
}

struct PagePlusGameChallengeVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusGameChallengeVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusGameChallengeVO: Codable {
    let data: PagePlusGameChallengeVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameChallengeCreateForm: Codable {
    let challengerUserId: Int?
    let targetUserId: Int?
    let gameType: String?
    let gameModeCode: String?
    let stakeScore: Int?
    let sourceType: String?
    let arenaId: Int?
    let leaderboardId: Int?
    let reason: String?
}

struct PlusGameArenaManageForm: Codable {
    let ownerUserId: Int?
    let currentChampionUserId: Int?
    let gameType: String?
    let gameModeCode: String?
    let status: String?
    let name: String?
    let description: String?
    let stakeScore: Int?
    let roomId: Int?
    let matchId: Int?
    let reason: String?
}

struct PlusApiResultPlusGameArenaVO: Codable {
    let data: PlusGameArenaVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameArenaVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let arenaId: Int?
    let arenaNo: String?
    let name: String?
    let description: String?
    let gameType: String?
    let gameModeCode: String?
    let status: String?
    let ownerUserId: Int?
    let currentChampionUserId: Int?
    let currentChallengeId: Int?
    let stakeScore: Int?
    let totalChallengeCount: Int?
    let successfulDefenseCount: Int?
    let failedDefenseCount: Int?
    let currentDefenseStreak: Int?
    let bestDefenseStreak: Int?
    let totalRewardScore: Int?
    let roomId: Int?
    let matchId: Int?
    let openedAt: String?
    let lastChallengeAt: String?
    let lastSettledAt: String?
    let closedAt: String?
}

struct PlusGameArenaQueryForm: Codable {
    let id: Int?
    let createdAtFrom: String?
    let createdAtTo: String?
    let ownerUserId: Int?
    let currentChampionUserId: Int?
    let gameType: String?
    let gameModeCode: String?
    let status: String?
}

struct PagePlusGameArenaVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusGameArenaVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusGameArenaVO: Codable {
    let data: PagePlusGameArenaVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameActionRecordQueryForm: Codable {
    let id: Int?
    let createdAtFrom: String?
    let createdAtTo: String?
    let roomId: Int?
    let matchId: Int?
    let playerUserId: Int?
    let actionType: String?
    let actionCode: String?
}

struct PagePlusGameActionRecordVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusGameActionRecordVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusGameActionRecordVO: Codable {
    let data: PagePlusGameActionRecordVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGameActionRecordVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let actionId: Int?
    let roomId: Int?
    let matchId: Int?
    let roundId: Int?
    let gameType: String?
    let roomType: String?
    let replayId: Int?
    let tournamentId: Int?
    let playerUserId: Int?
    let seatNo: Int?
    let playerType: String?
    let seqNo: Int?
    let turnNo: Int?
    let phaseName: String?
    let actionType: String?
    let actionCode: String?
    let notation: String?
    let targetSeatNo: Int?
    let sourcePosition: String?
    let targetPosition: String?
    let consumeMillis: Int?
    let validAction: Bool?
    let systemAction: Bool?
    let timeoutAction: Bool?
    let actionAt: String?
    let actionPayload: [String: Any]?
    let beforeState: [String: Any]?
    let afterState: [String: Any]?
}

struct PagePlusFilePartVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusFilePartVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusFilePartVO: Codable {
    let data: PagePlusFilePartVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusFilePartVO: Codable {
    let data: [PlusFilePartVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusFileVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusFileVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusFileVO: Codable {
    let data: PagePlusFileVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusFileVO: Codable {
    let data: [PlusFileVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultSetPlusTreeNodePlusFileVO: Codable {
    let data: [PlusTreeNodePlusFileVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusTreeNodePlusFileVO: Codable {
    let data: PlusFileVO?
    let parent: PlusTreeNodePlusFileVO?
    let children: [PlusTreeNodePlusFileVO]?
    let index: Int?
    let root: Bool?
    let leaf: Bool?
    let childrenCount: Int?
    let depth: Int?
}

struct PagePlusFileContentVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusFileContentVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusFileContentVO: Codable {
    let data: PagePlusFileContentVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusFileContentVO: Codable {
    let data: [PlusFileContentVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusFeedsVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusFeedsVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusFeedsVO: Codable {
    let data: PagePlusFeedsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusFeedsVO: Codable {
    let data: [PlusFeedsVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusFeedbackVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusFeedbackVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusFeedbackVO: Codable {
    let data: PagePlusFeedbackVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusFeedbackVO: Codable {
    let data: [PlusFeedbackVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusFavoriteVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusFavoriteVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusFavoriteVO: Codable {
    let data: PagePlusFavoriteVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusFavoriteVO: Codable {
    let data: [PlusFavoriteVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusDiskMemberVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusDiskMemberVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusDiskMemberVO: Codable {
    let data: PagePlusDiskMemberVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusDiskMemberVO: Codable {
    let data: [PlusDiskMemberVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusDiskVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusDiskVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusDiskVO: Codable {
    let data: PagePlusDiskVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusDiskVO: Codable {
    let data: [PlusDiskVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusDetailVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusDetailVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusDetailVO: Codable {
    let data: PagePlusDetailVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusDetailVO: Codable {
    let data: [PlusDetailVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusDepartmentVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusDepartmentVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusDepartmentVO: Codable {
    let data: PagePlusDepartmentVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusDepartmentVO: Codable {
    let data: [PlusDepartmentVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusDatasourceVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusDatasourceVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusDatasourceVO: Codable {
    let data: PagePlusDatasourceVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusDatasourceVO: Codable {
    let data: [PlusDatasourceVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CouponPointsExchangeForm: Codable {
    let requestNo: String?
}

struct PagePlusCouponTemplateVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusCouponTemplateVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusCouponTemplateVO: Codable {
    let data: PagePlusCouponTemplateVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusCouponTemplateVO: Codable {
    let data: [PlusCouponTemplateVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CouponRedeemForm: Codable {
    let redeemCode: String?
}

struct CouponRollbackForm: Codable {
    let reason: String?
}

struct PagePlusCouponVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusCouponVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusCouponVO: Codable {
    let data: PagePlusCouponVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusCouponVO: Codable {
    let data: [PlusCouponVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusConversationOpenForm: Codable {
    let conversationId: String?
    let uuid: String?
    let userId: Int?
    let agentId: Int?
    let knowledgeBaseId: Int?
    let dataSourceId: Int?
    let chatOptions: PlusChatOptions?
}

struct PlusMessageFeedbackForm: Codable {
    let id: String?
    let conversationId: String?
    let rating: String?
}

struct PlusConversationQueryListForm: Codable {
    let id: Int?
    let createdAtFrom: String?
    let createdAtTo: String?
    let initDefaults: Bool?
}

struct PagePlusConversationVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusConversationVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusConversationVO: Codable {
    let data: PagePlusConversationVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusConversationVO: Codable {
    let data: [PlusConversationVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CreateChapterForm: Codable {
    let contentWorkId: Int?
    let parentDirectoryId: Int?
    let fileName: String?
    let isDirectory: Bool?
    let content: String?
}

struct CreateContentForm: Codable {
    let title: String?
    let type: String?
    let description: String?
    let coverUrl: String?
}

struct ContentWorkVO: Codable {
    let id: Int?
    let uuid: String?
    let title: String?
    let type: String?
    let typeDesc: String?
    let description: String?
    let coverUrl: String?
    let path: String?
    let createdAt: String?
    let updatedAt: String?
}

struct PlusCommentsReplyForm: Codable {
    let content: String?
    let userId: Int?
}

struct PagePlusCommentsVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusCommentsVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusCommentsVO: Codable {
    let data: PagePlusCommentsVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusCommentsVO: Codable {
    let data: [PlusCommentsVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusColumnVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusColumnVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusColumnVO: Codable {
    let data: PagePlusColumnVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusColumnVO: Codable {
    let data: [PlusColumnVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusCollectionVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusCollectionVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusCollectionVO: Codable {
    let data: PagePlusCollectionVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusCollectionVO: Codable {
    let data: [PlusCollectionVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusCollectionItemVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusCollectionItemVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusCollectionItemVO: Codable {
    let data: PagePlusCollectionItemVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusCollectionItemVO: Codable {
    let data: [PlusCollectionItemVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ChatMessageQueryListForm: Codable {
    let id: Int?
    let createdAtFrom: String?
    let createdAtTo: String?
    let conversationId: Int?
    let conversationUuid: String?
    let lastSyncMessageId: String?
}

struct PagePlusChatMessageVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusChatMessageVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusChatMessageVO: Codable {
    let data: PagePlusChatMessageVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusChatMessageVO: Codable {
    let data: [PlusChatMessageVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusCharacterVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusCharacterVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusCharacterVO: Codable {
    let data: PagePlusCharacterVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusCharacterVO: Codable {
    let data: [PlusCharacterVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusChannelResourceVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusChannelResourceVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusChannelResourceVO: Codable {
    let data: PagePlusChannelResourceVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusChannelResourceVO: Codable {
    let data: [PlusChannelResourceVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusChannelProxyVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusChannelProxyVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusChannelProxyVO: Codable {
    let data: PagePlusChannelProxyVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusChannelProxyVO: Codable {
    let data: [PlusChannelProxyVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusChannelVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusChannelVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusChannelVO: Codable {
    let data: PagePlusChannelVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusChannelVO: Codable {
    let data: [PlusChannelVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusChannelAccountQueryForm: Codable {
    let id: Int?
    let createdAtFrom: String?
    let createdAtTo: String?
    let channel: String?
    let status: String?
    let resourceType: String?
    let resourceTypes: [String]?
}

struct PlusApiResultListPlusChannelAccountVO: Codable {
    let data: [PlusChannelAccountVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusChannelAccountVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusChannelAccountVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusChannelAccountVO: Codable {
    let data: PagePlusChannelAccountVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusCategoryVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusCategoryVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusCategoryVO: Codable {
    let data: PagePlusCategoryVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusCategoryVO: Codable {
    let data: [PlusCategoryVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultSetPlusTreeNodePlusCategoryVO: Codable {
    let data: [PlusTreeNodePlusCategoryVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusTreeNodePlusCategoryVO: Codable {
    let data: PlusCategoryVO?
    let parent: PlusTreeNodePlusCategoryVO?
    let children: [PlusTreeNodePlusCategoryVO]?
    let index: Int?
    let root: Bool?
    let leaf: Bool?
    let childrenCount: Int?
    let depth: Int?
}

struct PagePlusCardTemplateVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusCardTemplateVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusCardTemplateVO: Codable {
    let data: PagePlusCardTemplateVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusCardTemplateVO: Codable {
    let data: [PlusCardTemplateVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusCardVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusCardVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusCardVO: Codable {
    let data: PagePlusCardVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusCardVO: Codable {
    let data: [PlusCardVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PhoneVerificationForm: Codable {
    let phone: String?
    let code: String?
    let type: String?
}

struct PlusApiResultVerificationVO: Codable {
    let data: VerificationVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct VerificationVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let success: Bool?
    let message: String?
    let token: String?
}

struct EmailVerificationForm: Codable {
    let email: String?
    let code: String?
    let type: String?
}

struct SendVerificationCodeForm: Codable {
    let identifier: String?
    let method: String?
    let type: String?
}

struct PlusApiResultQrCodeVO: Codable {
    let data: QrCodeVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct QrCodeVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let qrKey: String?
    let qrUrl: String?
    let qrContent: String?
    let expireTime: Int?
}

struct QrCodeConfirmForm: Codable {
    let qrKey: String?
    let token: String?
}

struct PlusApiResultVoid: Codable {
    let data: Any?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct OAuthLoginRequestForm: Codable {
    let provider: String?
    let redirectUri: String?
    let scope: String?
    let state: String?
}

struct OAuthLoginResponseVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let provider: String?
    let authUrl: String?
    let qrCodeUrl: String?
    let qrCodeContent: String?
    let expiresIn: Int?
}

struct PlusApiResultOAuthLoginResponseVO: Codable {
    let data: OAuthLoginResponseVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct OAuthCallbackForm: Codable {
    let provider: String?
    let code: String?
    let state: String?
}

struct LoginResultVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let token: String?
    let refreshToken: String?
    let expiresIn: Int?
    let refreshExpiresIn: Int?
    let userId: Int?
    let user: UserVO?
}

struct PlusApiResultLoginResultVO: Codable {
    let data: LoginResultVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct UserVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let username: String?
    let email: String?
    let phone: String?
}

struct RoleCheckForm: Codable {
    let role: String?
}

struct PermissionCheckForm: Codable {
    let permission: String?
}

struct PasswordResetForm: Codable {
    let token: String?
    let newPassword: String?
}

struct PasswordResetResultVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let success: Bool?
    let message: String?
    let expiresIn: Int?
    let token: String?
}

struct PlusApiResultPasswordResetResultVO: Codable {
    let data: PasswordResetResultVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PasswordResetRequestForm: Codable {
    let email: String?
}

struct RegisterForm: Codable {
    let username: String?
    let password: String?
    let confirmPassword: String?
    let email: String?
    let phone: String?
    let captcha: String?
    let captchaId: String?
    let type: String?
    let verificationCode: String?
    let invitationCode: String?
}

struct PlusApiResultRegisterResultVO: Codable {
    let data: RegisterResultVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct RegisterResultVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let user: UserVO?
}

struct RefreshTokenForm: Codable {
    let refreshToken: String?
}

struct LoginForm: Codable {
    let type: String?
    let email: String?
    let phone: String?
    let username: String?
    let password: String?
    let owner: String?
    let captcha: String?
    let captchaId: String?
    let rememberMe: Bool?
    let verificationCode: String?
    let invitationCode: String?
}

struct ChangePasswordForm: Codable {
    let userId: String?
    let oldPassword: String?
    let newPassword: String?
}

struct GetCurrentAccessTokenForm: Codable {
    let appId: Int?
    let platform: String?
}

struct CurrentAccessTokenVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let appId: Int?
    let appName: String?
    let platform: String?
    let tenantId: Int?
    let organizationId: Int?
    let tenantAccessToken: TokenResult?
    let organizationAccessToken: TokenResult?
}

struct PlusApiResultCurrentAccessTokenVO: Codable {
    let data: CurrentAccessTokenVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusAttributeVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusAttributeVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusAttributeVO: Codable {
    let data: PagePlusAttributeVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusAttributeVO: Codable {
    let data: [PlusAttributeVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusArticleVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusArticleVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusArticleVO: Codable {
    let data: PagePlusArticleVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusArticleVO: Codable {
    let data: [PlusArticleVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusAppVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusAppVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusAppVO: Codable {
    let data: PagePlusAppVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusAppVO: Codable {
    let data: [PlusAppVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct CreateJsapiSignatureForm: Codable {
    let url: String?
}

struct AppSdkConfigVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let platform: String?
    let officialAccount: OfficialAccountSdkConfigVO?
    let miniProgram: MiniProgramSdkConfigVO?
    let app: MobileAppSdkConfigVO?
}

struct MiniProgramSdkConfigVO: Codable {
    let appId: String?
    let timestamp: Int?
    let nonceStr: String?
    let signature: String?
    let jsApiList: [String]?
}

struct MobileAppSdkConfigVO: Codable {
    let packageName: String?
    let version: String?
    let appKey: String?
    let pushToken: String?
}

struct OfficialAccountSdkConfigVO: Codable {
    let debug: Bool?
    let appId: String?
    let timestamp: String?
    let nonceStr: String?
    let signature: String?
    let jsApiList: [String]?
}

struct PlusApiResultAppSdkConfigVO: Codable {
    let data: AppSdkConfigVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiKeySelfCreateForm: Codable {
    let name: String?
    let type: String?
    let expireTime: String?
    let description: String?
}

struct PagePlusApiKeyVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusApiKeyVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusApiKeyVO: Codable {
    let data: PagePlusApiKeyVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusApiKeyVO: Codable {
    let data: [PlusApiKeyVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusAiAgentToolVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusAiAgentToolVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusAiAgentToolVO: Codable {
    let data: PagePlusAiAgentToolVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusAiAgentToolVO: Codable {
    let data: [PlusAiAgentToolVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusAiAgentQueryListForm: Codable {
    let id: Int?
    let createdAtFrom: String?
    let createdAtTo: String?
    let userId: Int?
    let keyword: String?
    let status: String?
    let dataScope: String?
}

struct PagePlusAiAgentVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusAiAgentVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusAiAgentVO: Codable {
    let data: PagePlusAiAgentVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusAiAgentVO: Codable {
    let data: [PlusAiAgentVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusAccountVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusAccountVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusAccountVO: Codable {
    let data: PagePlusAccountVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusAccountVO: Codable {
    let data: [PlusAccountVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusAccountHistoryVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusAccountHistoryVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusAccountHistoryVO: Codable {
    let data: PagePlusAccountHistoryVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListPlusAccountHistoryVO: Codable {
    let data: [PlusAccountHistoryVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusGetAccountForm: Codable {
    let loadHistory: Bool?
}

struct PlusApiResultPlusUserProfileVO: Codable {
    let data: PlusUserProfileVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusUserProfileVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let uuid: String?
    let faceImage: ImageMediaResource?
    let faceVideo: VideoMediaResource?
    let username: String?
    let nickname: String?
    let email: String?
    let phone: String?
    let gender: String?
    let status: String?
    let countryCode: String?
    let provinceCode: String?
    let cityCode: String?
    let districtCode: String?
    let address: String?
    let bio: String?
    let birthDate: String?
    let socialInfoList: SocialInfoList?
}

struct PagePlusSystemInvoiceVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusSystemInvoiceVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusSystemInvoiceVO: Codable {
    let data: PagePlusSystemInvoiceVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct UserRoleKey: Codable {
    let userId: Int?
    let roleId: Int?
}

struct FileListVO: Codable {
    let data: [FileItemVO]?
    let object: String?
}

struct PlusApiResultFileListVO: Codable {
    let data: FileListVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultListLong: Codable {
    let data: [Int]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusNotesVO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusNotesVO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusNotesVO: Codable {
    let data: PagePlusNotesVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PagePlusMediaPublishRecordDTO: Codable {
    let totalElements: Int?
    let totalPages: Int?
    let size: Int?
    let content: [PlusMediaPublishRecordDTO]?
    let number: Int?
    let numberOfElements: Int?
    let sort: SortObject?
    let pageable: PageableObject?
    let first: Bool?
    let last: Bool?
    let empty: Bool?
}

struct PlusApiResultPagePlusMediaPublishRecordDTO: Codable {
    let data: PagePlusMediaPublishRecordDTO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusMediaPublishRecordDTO: Codable {
    let id: Int?
    let uuid: String?
    let createdAt: String?
    let updatedAt: String?
    let version: Int?
    let batchId: String?
    let userId: Int?
    let noteId: Int?
    let noteUuid: String?
    let noteTitle: String?
    let platform: String?
    let action: String?
    let status: String?
    let draftMediaId: String?
    let publishId: String?
    let articleId: String?
    let articleIndex: Int?
    let errcode: Int?
    let errmsg: String?
    let requestPayload: [String: Any]?
    let responsePayload: [String: Any]?
    let startedAt: String?
    let finishedAt: String?
}

struct PlusApiResultListPlusNotesVO: Codable {
    let data: [PlusNotesVO]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultPlusGameScoreRecordVO: Codable {
    let data: PlusGameScoreRecordVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultPlusGameRecordVO: Codable {
    let data: PlusGameRecordVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultPlusGameLeaderboardVO: Codable {
    let data: PlusGameLeaderboardVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultPlusGameLeaderboardEntryVO: Codable {
    let data: PlusGameLeaderboardEntryVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultPlusGameGrowthRecordVO: Codable {
    let data: PlusGameGrowthRecordVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultPlusGameGrowthLevelConfigVO: Codable {
    let data: PlusGameGrowthLevelConfigVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultPlusGameActionRecordVO: Codable {
    let data: PlusGameActionRecordVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct ContentStatsVO: Codable {
    let wordCount: Int?
    let chapterCount: Int?
    let fileSize: Int?
}

struct PlusApiResultQrCodeStatusVO: Codable {
    let data: QrCodeStatusVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct QrCodeStatusVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let status: String?
    let userInfo: UserVO?
    let token: LoginResultVO?
}

struct PlusApiResultListString: Codable {
    let data: [String]?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct PlusApiResultUserVO: Codable {
    let data: UserVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct AppInfoVO: Codable {
    let createdAt: String?
    let updatedAt: String?
    let id: Int?
    let name: String?
    let version: String?
    let description: String?
    let projectId: Int?
    let icon: ImageMediaResource?
    let resourceList: AssetMediaResourceList?
    let iconUrl: String?
    let accessUrl: String?
    let status: String?
    let appType: String?
    let platforms: AppPlatforms?
    let installPlatforms: AppPlatforms?
    let installSkill: AppInstallSkill?
    let installConfig: AppInstallConfig?
    let packageName: String?
    let bundleId: String?
    let storeUrl: String?
    let downloadUrl: String?
    let buildTime: String?
    let startTime: String?
    let environment: String?
}

struct PlusApiResultAppInfoVO: Codable {
    let data: AppInfoVO?
    let code: String?
    let msg: String?
    let requestId: String?
    let ip: String?
    let hostname: String?
    let errorName: String?
}

struct UploadFileRequest: Codable {
    let file: String?
}

struct UploadFilePostRequest: Codable {
    let file: String?
}

struct CreateUploadFileRequest: Codable {
    let file: String?
}

struct GetAllContentsResponse: Codable {

}

struct GetAllScriptsResponse: Codable {

}

struct GetAllProseResponse: Codable {

}

struct GetAllNovelsResponse: Codable {

}

struct GetAllArticlesResponse: Codable {

}
