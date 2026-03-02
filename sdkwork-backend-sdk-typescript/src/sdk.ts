import { HttpClient, createHttpClient } from './http/client';
import type { SdkworkBackendConfig } from './types/common';
import type { AuthTokenManager } from '@sdkwork/sdk-common';

import { WorkspaceApi, createWorkspaceApi } from './api/workspace';
import { ContentVoteApi, createContentVoteApi } from './api/content-vote';
import { VoiceSpeakerApi, createVoiceSpeakerApi } from './api/voice-speaker';
import { VisitHistoryApi, createVisitHistoryApi } from './api/visit-history';
import { VipUserApi, createVipUserApi } from './api/vip-user';
import { VipRechargeApi, createVipRechargeApi } from './api/vip-recharge';
import { VipRechargePackageApi, createVipRechargePackageApi } from './api/vip-recharge-package';
import { VipPointChangeApi, createVipPointChangeApi } from './api/vip-point-change';
import { VipPackageGroupApi, createVipPackageGroupApi } from './api/vip-package-group';
import { VipPackageApi, createVipPackageApi } from './api/vip-package';
import { VipLevelApi, createVipLevelApi } from './api/vip-level';
import { VipLevelBenefitApi, createVipLevelBenefitApi } from './api/vip-level-benefit';
import { VipBenefitApi, createVipBenefitApi } from './api/vip-benefit';
import { VipBenefitUsageApi, createVipBenefitUsageApi } from './api/vip-benefit-usage';
import { VideoApi, createVideoApi } from './api/video';
import { UserApi, createUserApi } from './api/user';
import { UserOauthAccountApi, createUserOauthAccountApi } from './api/user-oauth-account';
import { UserCouponApi, createUserCouponApi } from './api/user-coupon';
import { UserCardApi, createUserCardApi } from './api/user-card';
import { UserAddressApi, createUserAddressApi } from './api/user-address';
import { AiUsageRecordApi, createAiUsageRecordApi } from './api/ai-usage-record';
import { ShoppingCartApi, createShoppingCartApi } from './api/shopping-cart';
import { ShoppingCartItemApi, createShoppingCartItemApi } from './api/shopping-cart-item';
import { RefundApi, createRefundApi } from './api/refund';
import { PaymentApi, createPaymentApi } from './api/payment';
import { OrderApi, createOrderApi } from './api/order';
import { OrderItemApi, createOrderItemApi } from './api/order-item';
import { AiToolApi, createAiToolApi } from './api/ai-tool';
import { TenantApi, createTenantApi } from './api/tenant';
import { DatabaseTableApi, createDatabaseTableApi } from './api/database-table';
import { ProductSkuApi, createProductSkuApi } from './api/product-sku';
import { ShortUrlApi, createShortUrlApi } from './api/short-url';
import { ShopApi, createShopApi } from './api/shop';
import { ShareApi, createShareApi } from './api/share';
import { ShareVisitRecordApi, createShareVisitRecordApi } from './api/share-visit-record';
import { ShardingKeyApi, createShardingKeyApi } from './api/sharding-key';
import { SchemaApi, createSchemaApi } from './api/schema';
import { RbacRoleApi, createRbacRoleApi } from './api/rbac-role';
import { RolePermissionApi, createRolePermissionApi } from './api/role-permission';
import { InvocationRecordApi, createInvocationRecordApi } from './api/invocation-record';
import { RbacUserRoleApi, createRbacUserRoleApi } from './api/rbac-user-role';
import { AiPromptApi, createAiPromptApi } from './api/ai-prompt';
import { ProjectApi, createProjectApi } from './api/project';
import { ProductApi, createProductApi } from './api/product';
import { PptTemplateApi, createPptTemplateApi } from './api/ppt-template';
import { PptTemplateSlideApi, createPptTemplateSlideApi } from './api/ppt-template-slide';
import { PartnerApi, createPartnerApi } from './api/partner';
import { ChatParticipantApi, createChatParticipantApi } from './api/chat-participant';
import { OssBucketApi, createOssBucketApi } from './api/oss-bucket';
import { OrganizationApi, createOrganizationApi } from './api/organization';
import { PositionApi, createPositionApi } from './api/position';
import { MemberRelationsApi, createMemberRelationsApi } from './api/member-relations';
import { OrganizationMemberApi, createOrganizationMemberApi } from './api/organization-member';
import { NotificationApi, createNotificationApi } from './api/notification';
import { NotesApi, createNotesApi } from './api/notes';
import { NewsApi, createNewsApi } from './api/news';
import { HostApi, createHostApi } from './api/host';
import { DnsRecordApi, createDnsRecordApi } from './api/dns-record';
import { MusicApi, createMusicApi } from './api/music';
import { AiModelInformationApi, createAiModelInformationApi } from './api/ai-model-information';
import { AiModelPriceApi, createAiModelPriceApi } from './api/ai-model-price';
import { ChatMessageApi, createChatMessageApi } from './api/chat-message';
import { MemberLevelApi, createMemberLevelApi } from './api/member-level';
import { MemberCardApi, createMemberCardApi } from './api/member-card';
import { KnowledgeBaseApi, createKnowledgeBaseApi } from './api/knowledge-base';
import { InvitationRelationApi, createInvitationRelationApi } from './api/invitation-relation';
import { InvitationCodeApi, createInvitationCodeApi } from './api/invitation-code';
import { ImageApi, createImageApi } from './api/image';
import { ChatGroupApi, createChatGroupApi } from './api/chat-group';
import { AiGenerationApi, createAiGenerationApi } from './api/ai-generation';
import { AiGenerationContentApi, createAiGenerationContentApi } from './api/ai-generation-content';
import { FileApi, createFileApi } from './api/file';
import { FilePartApi, createFilePartApi } from './api/file-part';
import { FileContentApi, createFileContentApi } from './api/file-content';
import { FeedsApi, createFeedsApi } from './api/feeds';
import { FeedbackApi, createFeedbackApi } from './api/feedback';
import { FavoriteApi, createFavoriteApi } from './api/favorite';
import { FileDiskApi, createFileDiskApi } from './api/file-disk';
import { DiskMemberApi, createDiskMemberApi } from './api/disk-member';
import { DetailApi, createDetailApi } from './api/detail';
import { DepartmentApi, createDepartmentApi } from './api/department';
import { DatasourceApi, createDatasourceApi } from './api/datasource';
import { CouponApi, createCouponApi } from './api/coupon';
import { CouponTemplateApi, createCouponTemplateApi } from './api/coupon-template';
import { AiConversationApi, createAiConversationApi } from './api/ai-conversation';
import { CommentApi, createCommentApi } from './api/comment';
import { ColumnApi, createColumnApi } from './api/column';
import { CollectionApi, createCollectionApi } from './api/collection';
import { CollectionItemApi, createCollectionItemApi } from './api/collection-item';
import { CharacterApi, createCharacterApi } from './api/character';
import { ChannelResourceApi, createChannelResourceApi } from './api/channel-resource';
import { ChannelAccountApi, createChannelAccountApi } from './api/channel-account';
import { AiCategoryApi, createAiCategoryApi } from './api/ai-category';
import { MembershipCardApi, createMembershipCardApi } from './api/membership-card';
import { CardTemplateApi, createCardTemplateApi } from './api/card-template';
import { AttributeApi, createAttributeApi } from './api/attribute';
import { AiArticleApi, createAiArticleApi } from './api/ai-article';
import { ApplicationApi, createApplicationApi } from './api/application';
import { ApiKeyApi, createApiKeyApi } from './api/api-key';
import { AiAgentApi, createAiAgentApi } from './api/ai-agent';
import { AiAgentToolRelationshipApi, createAiAgentToolRelationshipApi } from './api/ai-agent-tool-relationship';
import { AccountApi, createAccountApi } from './api/account';
import { AccountHistoryApi, createAccountHistoryApi } from './api/account-history';
import { SearchChatApi, createSearchChatApi } from './api/search-chat';
import { PptTemplateRenderingApi, createPptTemplateRenderingApi } from './api/ppt-template-rendering';
import { PptTemplateChatApi, createPptTemplateChatApi } from './api/ppt-template-chat';
import { KnowledgeBaseFileApi, createKnowledgeBaseFileApi } from './api/knowledge-base-file';
import { KnowledgeBaseChatApi, createKnowledgeBaseChatApi } from './api/knowledge-base-chat';
import { ImMessageApi, createImMessageApi } from './api/im-message';
import { AiVoiceSpeakerGenerationApi, createAiVoiceSpeakerGenerationApi } from './api/ai-voice-speaker-generation';
import { AiVideoGenerationApi, createAiVideoGenerationApi } from './api/ai-video-generation';
import { AiMusicGenerationApi, createAiMusicGenerationApi } from './api/ai-music-generation';
import { AiImageGenerationApi, createAiImageGenerationApi } from './api/ai-image-generation';
import { AiCharacterGenerationApi, createAiCharacterGenerationApi } from './api/ai-character-generation';
import { AiAudioGenerationApi, createAiAudioGenerationApi } from './api/ai-audio-generation';
import { AiAudioEffectGenerationApi, createAiAudioEffectGenerationApi } from './api/ai-audio-effect-generation';
import { AiChatApi, createAiChatApi } from './api/ai-chat';
import { VerificationApi, createVerificationApi } from './api/verification';
import { OauthAuthenticationApi, createOauthAuthenticationApi } from './api/oauth-authentication';
import { AuthorizationApi, createAuthorizationApi } from './api/authorization';
import { AuthenticationApi, createAuthenticationApi } from './api/authentication';
import { AppApi, createAppApi } from './api/app';
import { AiAgentChatApi, createAiAgentChatApi } from './api/ai-agent-chat';

export class SdkworkBackendClient {
  private httpClient: HttpClient;

  public readonly workspace: WorkspaceApi;
  public readonly contentVote: ContentVoteApi;
  public readonly voiceSpeaker: VoiceSpeakerApi;
  public readonly visitHistory: VisitHistoryApi;
  public readonly vipUser: VipUserApi;
  public readonly vipRecharge: VipRechargeApi;
  public readonly vipRechargePackage: VipRechargePackageApi;
  public readonly vipPointChange: VipPointChangeApi;
  public readonly vipPackageGroup: VipPackageGroupApi;
  public readonly vipPackage: VipPackageApi;
  public readonly vipLevel: VipLevelApi;
  public readonly vipLevelBenefit: VipLevelBenefitApi;
  public readonly vipBenefit: VipBenefitApi;
  public readonly vipBenefitUsage: VipBenefitUsageApi;
  public readonly video: VideoApi;
  public readonly user: UserApi;
  public readonly userOauthAccount: UserOauthAccountApi;
  public readonly userCoupon: UserCouponApi;
  public readonly userCard: UserCardApi;
  public readonly userAddress: UserAddressApi;
  public readonly aiUsageRecord: AiUsageRecordApi;
  public readonly shoppingCart: ShoppingCartApi;
  public readonly shoppingCartItem: ShoppingCartItemApi;
  public readonly refund: RefundApi;
  public readonly payment: PaymentApi;
  public readonly order: OrderApi;
  public readonly orderItem: OrderItemApi;
  public readonly aiTool: AiToolApi;
  public readonly tenant: TenantApi;
  public readonly databaseTable: DatabaseTableApi;
  public readonly productSku: ProductSkuApi;
  public readonly shortUrl: ShortUrlApi;
  public readonly shop: ShopApi;
  public readonly share: ShareApi;
  public readonly shareVisitRecord: ShareVisitRecordApi;
  public readonly shardingKey: ShardingKeyApi;
  public readonly schema: SchemaApi;
  public readonly rbacRole: RbacRoleApi;
  public readonly rolePermission: RolePermissionApi;
  public readonly invocationRecord: InvocationRecordApi;
  public readonly rbacUserRole: RbacUserRoleApi;
  public readonly aiPrompt: AiPromptApi;
  public readonly project: ProjectApi;
  public readonly product: ProductApi;
  public readonly pptTemplate: PptTemplateApi;
  public readonly pptTemplateSlide: PptTemplateSlideApi;
  public readonly partner: PartnerApi;
  public readonly chatParticipant: ChatParticipantApi;
  public readonly ossBucket: OssBucketApi;
  public readonly organization: OrganizationApi;
  public readonly position: PositionApi;
  public readonly memberRelations: MemberRelationsApi;
  public readonly organizationMember: OrganizationMemberApi;
  public readonly notification: NotificationApi;
  public readonly notes: NotesApi;
  public readonly news: NewsApi;
  public readonly host: HostApi;
  public readonly dnsRecord: DnsRecordApi;
  public readonly music: MusicApi;
  public readonly aiModelInformation: AiModelInformationApi;
  public readonly aiModelPrice: AiModelPriceApi;
  public readonly chatMessage: ChatMessageApi;
  public readonly memberLevel: MemberLevelApi;
  public readonly memberCard: MemberCardApi;
  public readonly knowledgeBase: KnowledgeBaseApi;
  public readonly invitationRelation: InvitationRelationApi;
  public readonly invitationCode: InvitationCodeApi;
  public readonly image: ImageApi;
  public readonly chatGroup: ChatGroupApi;
  public readonly aiGeneration: AiGenerationApi;
  public readonly aiGenerationContent: AiGenerationContentApi;
  public readonly file: FileApi;
  public readonly filePart: FilePartApi;
  public readonly fileContent: FileContentApi;
  public readonly feeds: FeedsApi;
  public readonly feedback: FeedbackApi;
  public readonly favorite: FavoriteApi;
  public readonly fileDisk: FileDiskApi;
  public readonly diskMember: DiskMemberApi;
  public readonly detail: DetailApi;
  public readonly department: DepartmentApi;
  public readonly datasource: DatasourceApi;
  public readonly coupon: CouponApi;
  public readonly couponTemplate: CouponTemplateApi;
  public readonly aiConversation: AiConversationApi;
  public readonly comment: CommentApi;
  public readonly column: ColumnApi;
  public readonly collection: CollectionApi;
  public readonly collectionItem: CollectionItemApi;
  public readonly character: CharacterApi;
  public readonly channelResource: ChannelResourceApi;
  public readonly channelAccount: ChannelAccountApi;
  public readonly aiCategory: AiCategoryApi;
  public readonly membershipCard: MembershipCardApi;
  public readonly cardTemplate: CardTemplateApi;
  public readonly attribute: AttributeApi;
  public readonly aiArticle: AiArticleApi;
  public readonly application: ApplicationApi;
  public readonly apiKey: ApiKeyApi;
  public readonly aiAgent: AiAgentApi;
  public readonly aiAgentToolRelationship: AiAgentToolRelationshipApi;
  public readonly account: AccountApi;
  public readonly accountHistory: AccountHistoryApi;
  public readonly searchChat: SearchChatApi;
  public readonly pptTemplateRendering: PptTemplateRenderingApi;
  public readonly pptTemplateChat: PptTemplateChatApi;
  public readonly knowledgeBaseFile: KnowledgeBaseFileApi;
  public readonly knowledgeBaseChat: KnowledgeBaseChatApi;
  public readonly imMessage: ImMessageApi;
  public readonly aiVoiceSpeakerGeneration: AiVoiceSpeakerGenerationApi;
  public readonly aiVideoGeneration: AiVideoGenerationApi;
  public readonly aiMusicGeneration: AiMusicGenerationApi;
  public readonly aiImageGeneration: AiImageGenerationApi;
  public readonly aiCharacterGeneration: AiCharacterGenerationApi;
  public readonly aiAudioGeneration: AiAudioGenerationApi;
  public readonly aiAudioEffectGeneration: AiAudioEffectGenerationApi;
  public readonly aiChat: AiChatApi;
  public readonly verification: VerificationApi;
  public readonly oauthAuthentication: OauthAuthenticationApi;
  public readonly authorization: AuthorizationApi;
  public readonly authentication: AuthenticationApi;
  public readonly app: AppApi;
  public readonly aiAgentChat: AiAgentChatApi;

  constructor(config: SdkworkBackendConfig) {
    this.httpClient = createHttpClient(config);
    this.workspace = createWorkspaceApi(this.httpClient);

    this.contentVote = createContentVoteApi(this.httpClient);

    this.voiceSpeaker = createVoiceSpeakerApi(this.httpClient);

    this.visitHistory = createVisitHistoryApi(this.httpClient);

    this.vipUser = createVipUserApi(this.httpClient);

    this.vipRecharge = createVipRechargeApi(this.httpClient);

    this.vipRechargePackage = createVipRechargePackageApi(this.httpClient);

    this.vipPointChange = createVipPointChangeApi(this.httpClient);

    this.vipPackageGroup = createVipPackageGroupApi(this.httpClient);

    this.vipPackage = createVipPackageApi(this.httpClient);

    this.vipLevel = createVipLevelApi(this.httpClient);

    this.vipLevelBenefit = createVipLevelBenefitApi(this.httpClient);

    this.vipBenefit = createVipBenefitApi(this.httpClient);

    this.vipBenefitUsage = createVipBenefitUsageApi(this.httpClient);

    this.video = createVideoApi(this.httpClient);

    this.user = createUserApi(this.httpClient);

    this.userOauthAccount = createUserOauthAccountApi(this.httpClient);

    this.userCoupon = createUserCouponApi(this.httpClient);

    this.userCard = createUserCardApi(this.httpClient);

    this.userAddress = createUserAddressApi(this.httpClient);

    this.aiUsageRecord = createAiUsageRecordApi(this.httpClient);

    this.shoppingCart = createShoppingCartApi(this.httpClient);

    this.shoppingCartItem = createShoppingCartItemApi(this.httpClient);

    this.refund = createRefundApi(this.httpClient);

    this.payment = createPaymentApi(this.httpClient);

    this.order = createOrderApi(this.httpClient);

    this.orderItem = createOrderItemApi(this.httpClient);

    this.aiTool = createAiToolApi(this.httpClient);

    this.tenant = createTenantApi(this.httpClient);

    this.databaseTable = createDatabaseTableApi(this.httpClient);

    this.productSku = createProductSkuApi(this.httpClient);

    this.shortUrl = createShortUrlApi(this.httpClient);

    this.shop = createShopApi(this.httpClient);

    this.share = createShareApi(this.httpClient);

    this.shareVisitRecord = createShareVisitRecordApi(this.httpClient);

    this.shardingKey = createShardingKeyApi(this.httpClient);

    this.schema = createSchemaApi(this.httpClient);

    this.rbacRole = createRbacRoleApi(this.httpClient);

    this.rolePermission = createRolePermissionApi(this.httpClient);

    this.invocationRecord = createInvocationRecordApi(this.httpClient);

    this.rbacUserRole = createRbacUserRoleApi(this.httpClient);

    this.aiPrompt = createAiPromptApi(this.httpClient);

    this.project = createProjectApi(this.httpClient);

    this.product = createProductApi(this.httpClient);

    this.pptTemplate = createPptTemplateApi(this.httpClient);

    this.pptTemplateSlide = createPptTemplateSlideApi(this.httpClient);

    this.partner = createPartnerApi(this.httpClient);

    this.chatParticipant = createChatParticipantApi(this.httpClient);

    this.ossBucket = createOssBucketApi(this.httpClient);

    this.organization = createOrganizationApi(this.httpClient);

    this.position = createPositionApi(this.httpClient);

    this.memberRelations = createMemberRelationsApi(this.httpClient);

    this.organizationMember = createOrganizationMemberApi(this.httpClient);

    this.notification = createNotificationApi(this.httpClient);

    this.notes = createNotesApi(this.httpClient);

    this.news = createNewsApi(this.httpClient);

    this.host = createHostApi(this.httpClient);

    this.dnsRecord = createDnsRecordApi(this.httpClient);

    this.music = createMusicApi(this.httpClient);

    this.aiModelInformation = createAiModelInformationApi(this.httpClient);

    this.aiModelPrice = createAiModelPriceApi(this.httpClient);

    this.chatMessage = createChatMessageApi(this.httpClient);

    this.memberLevel = createMemberLevelApi(this.httpClient);

    this.memberCard = createMemberCardApi(this.httpClient);

    this.knowledgeBase = createKnowledgeBaseApi(this.httpClient);

    this.invitationRelation = createInvitationRelationApi(this.httpClient);

    this.invitationCode = createInvitationCodeApi(this.httpClient);

    this.image = createImageApi(this.httpClient);

    this.chatGroup = createChatGroupApi(this.httpClient);

    this.aiGeneration = createAiGenerationApi(this.httpClient);

    this.aiGenerationContent = createAiGenerationContentApi(this.httpClient);

    this.file = createFileApi(this.httpClient);

    this.filePart = createFilePartApi(this.httpClient);

    this.fileContent = createFileContentApi(this.httpClient);

    this.feeds = createFeedsApi(this.httpClient);

    this.feedback = createFeedbackApi(this.httpClient);

    this.favorite = createFavoriteApi(this.httpClient);

    this.fileDisk = createFileDiskApi(this.httpClient);

    this.diskMember = createDiskMemberApi(this.httpClient);

    this.detail = createDetailApi(this.httpClient);

    this.department = createDepartmentApi(this.httpClient);

    this.datasource = createDatasourceApi(this.httpClient);

    this.coupon = createCouponApi(this.httpClient);

    this.couponTemplate = createCouponTemplateApi(this.httpClient);

    this.aiConversation = createAiConversationApi(this.httpClient);

    this.comment = createCommentApi(this.httpClient);

    this.column = createColumnApi(this.httpClient);

    this.collection = createCollectionApi(this.httpClient);

    this.collectionItem = createCollectionItemApi(this.httpClient);

    this.character = createCharacterApi(this.httpClient);

    this.channelResource = createChannelResourceApi(this.httpClient);

    this.channelAccount = createChannelAccountApi(this.httpClient);

    this.aiCategory = createAiCategoryApi(this.httpClient);

    this.membershipCard = createMembershipCardApi(this.httpClient);

    this.cardTemplate = createCardTemplateApi(this.httpClient);

    this.attribute = createAttributeApi(this.httpClient);

    this.aiArticle = createAiArticleApi(this.httpClient);

    this.application = createApplicationApi(this.httpClient);

    this.apiKey = createApiKeyApi(this.httpClient);

    this.aiAgent = createAiAgentApi(this.httpClient);

    this.aiAgentToolRelationship = createAiAgentToolRelationshipApi(this.httpClient);

    this.account = createAccountApi(this.httpClient);

    this.accountHistory = createAccountHistoryApi(this.httpClient);

    this.searchChat = createSearchChatApi(this.httpClient);

    this.pptTemplateRendering = createPptTemplateRenderingApi(this.httpClient);

    this.pptTemplateChat = createPptTemplateChatApi(this.httpClient);

    this.knowledgeBaseFile = createKnowledgeBaseFileApi(this.httpClient);

    this.knowledgeBaseChat = createKnowledgeBaseChatApi(this.httpClient);

    this.imMessage = createImMessageApi(this.httpClient);

    this.aiVoiceSpeakerGeneration = createAiVoiceSpeakerGenerationApi(this.httpClient);

    this.aiVideoGeneration = createAiVideoGenerationApi(this.httpClient);

    this.aiMusicGeneration = createAiMusicGenerationApi(this.httpClient);

    this.aiImageGeneration = createAiImageGenerationApi(this.httpClient);

    this.aiCharacterGeneration = createAiCharacterGenerationApi(this.httpClient);

    this.aiAudioGeneration = createAiAudioGenerationApi(this.httpClient);

    this.aiAudioEffectGeneration = createAiAudioEffectGenerationApi(this.httpClient);

    this.aiChat = createAiChatApi(this.httpClient);

    this.verification = createVerificationApi(this.httpClient);

    this.oauthAuthentication = createOauthAuthenticationApi(this.httpClient);

    this.authorization = createAuthorizationApi(this.httpClient);

    this.authentication = createAuthenticationApi(this.httpClient);

    this.app = createAppApi(this.httpClient);

    this.aiAgentChat = createAiAgentChatApi(this.httpClient);
  }

  setApiKey(apiKey: string): this {
    this.httpClient.setApiKey(apiKey);
    return this;
  }

  setAuthToken(token: string): this {
    this.httpClient.setAuthToken(token);
    return this;
  }

  setAccessToken(token: string): this {
    this.httpClient.setAccessToken(token);
    return this;
  }

  setTokenManager(manager: AuthTokenManager): this {
    this.httpClient.setTokenManager(manager);
    return this;
  }

  get http(): HttpClient {
    return this.httpClient;
  }
}

export function createClient(config: SdkworkBackendConfig): SdkworkBackendClient {
  return new SdkworkBackendClient(config);
}

export default SdkworkBackendClient;
