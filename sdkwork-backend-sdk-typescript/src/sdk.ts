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
import { UsageRecordApi, createUsageRecordApi } from './api/usage-record';
import { ShoppingCartApi, createShoppingCartApi } from './api/shopping-cart';
import { ShoppingCartItemApi, createShoppingCartItemApi } from './api/shopping-cart-item';
import { RefundApi, createRefundApi } from './api/refund';
import { PaymentApi, createPaymentApi } from './api/payment';
import { OrderApi, createOrderApi } from './api/order';
import { OrderItemApi, createOrderItemApi } from './api/order-item';
import { ToolApi, createToolApi } from './api/tool';
import { TenantApi, createTenantApi } from './api/tenant';
import { DatabaseTableApi, createDatabaseTableApi } from './api/database-table';
import { ProductSkuApi, createProductSkuApi } from './api/product-sku';
import { SkillApi, createSkillApi } from './api/skill';
import { SkillPackageApi, createSkillPackageApi } from './api/skill-package';
import { ShortUrlApi, createShortUrlApi } from './api/short-url';
import { ShopApi, createShopApi } from './api/shop';
import { ShareApi, createShareApi } from './api/share';
import { ShareVisitRecordApi, createShareVisitRecordApi } from './api/share-visit-record';
import { ShardingKeyApi, createShardingKeyApi } from './api/sharding-key';
import { ApiSecurityPolicyApi, createApiSecurityPolicyApi } from './api/api-security-policy';
import { SchemaApi, createSchemaApi } from './api/schema';
import { RbacRoleApi, createRbacRoleApi } from './api/rbac-role';
import { RolePermissionApi, createRolePermissionApi } from './api/role-permission';
import { InvocationRecordApi, createInvocationRecordApi } from './api/invocation-record';
import { RbacUserRoleApi, createRbacUserRoleApi } from './api/rbac-user-role';
import { PromptApi, createPromptApi } from './api/prompt';
import { ProjectApi, createProjectApi } from './api/project';
import { ProductApi, createProductApi } from './api/product';
import { PptTemplateApi, createPptTemplateApi } from './api/ppt-template';
import { PptTemplateSlideApi, createPptTemplateSlideApi } from './api/ppt-template-slide';
import { RbacPermissionApi, createRbacPermissionApi } from './api/rbac-permission';
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
import { NetApi, createNetApi } from './api/net';
import { DnsRecordApi, createDnsRecordApi } from './api/dns-record';
import { MusicApi, createMusicApi } from './api/music';
import { ModelInformationApi, createModelInformationApi } from './api/model-information';
import { ModelPriceApi, createModelPriceApi } from './api/model-price';
import { ChatMessageApi, createChatMessageApi } from './api/chat-message';
import { MemberLevelApi, createMemberLevelApi } from './api/member-level';
import { MemberCardApi, createMemberCardApi } from './api/member-card';
import { KnowledgeBaseApi, createKnowledgeBaseApi } from './api/knowledge-base';
import { InvitationRelationApi, createInvitationRelationApi } from './api/invitation-relation';
import { InvitationCodeApi, createInvitationCodeApi } from './api/invitation-code';
import { ImageApi, createImageApi } from './api/image';
import { ChatGroupApi, createChatGroupApi } from './api/chat-group';
import { GenerationApi, createGenerationApi } from './api/generation';
import { GenerationContentApi, createGenerationContentApi } from './api/generation-content';
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
import { ConversationApi, createConversationApi } from './api/conversation';
import { ContentWritingApi, createContentWritingApi } from './api/content-writing';
import { CommentApi, createCommentApi } from './api/comment';
import { ColumnApi, createColumnApi } from './api/column';
import { CollectionApi, createCollectionApi } from './api/collection';
import { CollectionItemApi, createCollectionItemApi } from './api/collection-item';
import { CharacterApi, createCharacterApi } from './api/character';
import { ChannelApi, createChannelApi } from './api/channel';
import { ChannelResourceApi, createChannelResourceApi } from './api/channel-resource';
import { ChannelProxyApi, createChannelProxyApi } from './api/channel-proxy';
import { ChannelAccountApi, createChannelAccountApi } from './api/channel-account';
import { CategoryApi, createCategoryApi } from './api/category';
import { MembershipCardApi, createMembershipCardApi } from './api/membership-card';
import { CardTemplateApi, createCardTemplateApi } from './api/card-template';
import { AttributeApi, createAttributeApi } from './api/attribute';
import { ArticleApi, createArticleApi } from './api/article';
import { AppApi, createAppApi } from './api/app';
import { ApiKeyApi, createApiKeyApi } from './api/api-key';
import { AgentApi, createAgentApi } from './api/agent';
import { AgentToolRelationshipApi, createAgentToolRelationshipApi } from './api/agent-tool-relationship';
import { AccountApi, createAccountApi } from './api/account';
import { AccountHistoryApi, createAccountHistoryApi } from './api/account-history';
import { AccountExchangeConfigApi, createAccountExchangeConfigApi } from './api/account-exchange-config';
import { InvoiceApi, createInvoiceApi } from './api/invoice';
import { SearchChatApi, createSearchChatApi } from './api/search-chat';
import { PptTemplateRenderingApi, createPptTemplateRenderingApi } from './api/ppt-template-rendering';
import { PptTemplateChatApi, createPptTemplateChatApi } from './api/ppt-template-chat';
import { KnowledgeBaseFileApi, createKnowledgeBaseFileApi } from './api/knowledge-base-file';
import { KnowledgeBaseChatApi, createKnowledgeBaseChatApi } from './api/knowledge-base-chat';
import { ImMessageApi, createImMessageApi } from './api/im-message';
import { VoiceSpeakerGenerationApi, createVoiceSpeakerGenerationApi } from './api/voice-speaker-generation';
import { VideoGenerationApi, createVideoGenerationApi } from './api/video-generation';
import { MusicGenerationApi, createMusicGenerationApi } from './api/music-generation';
import { ImageGenerationApi, createImageGenerationApi } from './api/image-generation';
import { CharacterGenerationApi, createCharacterGenerationApi } from './api/character-generation';
import { AudioGenerationApi, createAudioGenerationApi } from './api/audio-generation';
import { AudioEffectGenerationApi, createAudioEffectGenerationApi } from './api/audio-effect-generation';
import { ChatApi, createChatApi } from './api/chat';
import { AuthApi, createAuthApi } from './api/auth';
import { AgentChatApi, createAgentChatApi } from './api/agent-chat';

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
  public readonly usageRecord: UsageRecordApi;
  public readonly shoppingCart: ShoppingCartApi;
  public readonly shoppingCartItem: ShoppingCartItemApi;
  public readonly refund: RefundApi;
  public readonly payment: PaymentApi;
  public readonly order: OrderApi;
  public readonly orderItem: OrderItemApi;
  public readonly tool: ToolApi;
  public readonly tenant: TenantApi;
  public readonly databaseTable: DatabaseTableApi;
  public readonly productSku: ProductSkuApi;
  public readonly skill: SkillApi;
  public readonly skillPackage: SkillPackageApi;
  public readonly shortUrl: ShortUrlApi;
  public readonly shop: ShopApi;
  public readonly share: ShareApi;
  public readonly shareVisitRecord: ShareVisitRecordApi;
  public readonly shardingKey: ShardingKeyApi;
  public readonly apiSecurityPolicy: ApiSecurityPolicyApi;
  public readonly schema: SchemaApi;
  public readonly rbacRole: RbacRoleApi;
  public readonly rolePermission: RolePermissionApi;
  public readonly invocationRecord: InvocationRecordApi;
  public readonly rbacUserRole: RbacUserRoleApi;
  public readonly prompt: PromptApi;
  public readonly project: ProjectApi;
  public readonly product: ProductApi;
  public readonly pptTemplate: PptTemplateApi;
  public readonly pptTemplateSlide: PptTemplateSlideApi;
  public readonly rbacPermission: RbacPermissionApi;
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
  public readonly net: NetApi;
  public readonly dnsRecord: DnsRecordApi;
  public readonly music: MusicApi;
  public readonly modelInformation: ModelInformationApi;
  public readonly modelPrice: ModelPriceApi;
  public readonly chatMessage: ChatMessageApi;
  public readonly memberLevel: MemberLevelApi;
  public readonly memberCard: MemberCardApi;
  public readonly knowledgeBase: KnowledgeBaseApi;
  public readonly invitationRelation: InvitationRelationApi;
  public readonly invitationCode: InvitationCodeApi;
  public readonly image: ImageApi;
  public readonly chatGroup: ChatGroupApi;
  public readonly generation: GenerationApi;
  public readonly generationContent: GenerationContentApi;
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
  public readonly conversation: ConversationApi;
  public readonly contentWriting: ContentWritingApi;
  public readonly comment: CommentApi;
  public readonly column: ColumnApi;
  public readonly collection: CollectionApi;
  public readonly collectionItem: CollectionItemApi;
  public readonly character: CharacterApi;
  public readonly channel: ChannelApi;
  public readonly channelResource: ChannelResourceApi;
  public readonly channelProxy: ChannelProxyApi;
  public readonly channelAccount: ChannelAccountApi;
  public readonly category: CategoryApi;
  public readonly membershipCard: MembershipCardApi;
  public readonly cardTemplate: CardTemplateApi;
  public readonly attribute: AttributeApi;
  public readonly article: ArticleApi;
  public readonly app: AppApi;
  public readonly apiKey: ApiKeyApi;
  public readonly agent: AgentApi;
  public readonly agentToolRelationship: AgentToolRelationshipApi;
  public readonly account: AccountApi;
  public readonly accountHistory: AccountHistoryApi;
  public readonly accountExchangeConfig: AccountExchangeConfigApi;
  public readonly invoice: InvoiceApi;
  public readonly searchChat: SearchChatApi;
  public readonly pptTemplateRendering: PptTemplateRenderingApi;
  public readonly pptTemplateChat: PptTemplateChatApi;
  public readonly knowledgeBaseFile: KnowledgeBaseFileApi;
  public readonly knowledgeBaseChat: KnowledgeBaseChatApi;
  public readonly imMessage: ImMessageApi;
  public readonly voiceSpeakerGeneration: VoiceSpeakerGenerationApi;
  public readonly videoGeneration: VideoGenerationApi;
  public readonly musicGeneration: MusicGenerationApi;
  public readonly imageGeneration: ImageGenerationApi;
  public readonly characterGeneration: CharacterGenerationApi;
  public readonly audioGeneration: AudioGenerationApi;
  public readonly audioEffectGeneration: AudioEffectGenerationApi;
  public readonly chat: ChatApi;
  public readonly auth: AuthApi;
  public readonly agentChat: AgentChatApi;

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

    this.usageRecord = createUsageRecordApi(this.httpClient);

    this.shoppingCart = createShoppingCartApi(this.httpClient);

    this.shoppingCartItem = createShoppingCartItemApi(this.httpClient);

    this.refund = createRefundApi(this.httpClient);

    this.payment = createPaymentApi(this.httpClient);

    this.order = createOrderApi(this.httpClient);

    this.orderItem = createOrderItemApi(this.httpClient);

    this.tool = createToolApi(this.httpClient);

    this.tenant = createTenantApi(this.httpClient);

    this.databaseTable = createDatabaseTableApi(this.httpClient);

    this.productSku = createProductSkuApi(this.httpClient);

    this.skill = createSkillApi(this.httpClient);

    this.skillPackage = createSkillPackageApi(this.httpClient);

    this.shortUrl = createShortUrlApi(this.httpClient);

    this.shop = createShopApi(this.httpClient);

    this.share = createShareApi(this.httpClient);

    this.shareVisitRecord = createShareVisitRecordApi(this.httpClient);

    this.shardingKey = createShardingKeyApi(this.httpClient);

    this.apiSecurityPolicy = createApiSecurityPolicyApi(this.httpClient);

    this.schema = createSchemaApi(this.httpClient);

    this.rbacRole = createRbacRoleApi(this.httpClient);

    this.rolePermission = createRolePermissionApi(this.httpClient);

    this.invocationRecord = createInvocationRecordApi(this.httpClient);

    this.rbacUserRole = createRbacUserRoleApi(this.httpClient);

    this.prompt = createPromptApi(this.httpClient);

    this.project = createProjectApi(this.httpClient);

    this.product = createProductApi(this.httpClient);

    this.pptTemplate = createPptTemplateApi(this.httpClient);

    this.pptTemplateSlide = createPptTemplateSlideApi(this.httpClient);

    this.rbacPermission = createRbacPermissionApi(this.httpClient);

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

    this.net = createNetApi(this.httpClient);

    this.dnsRecord = createDnsRecordApi(this.httpClient);

    this.music = createMusicApi(this.httpClient);

    this.modelInformation = createModelInformationApi(this.httpClient);

    this.modelPrice = createModelPriceApi(this.httpClient);

    this.chatMessage = createChatMessageApi(this.httpClient);

    this.memberLevel = createMemberLevelApi(this.httpClient);

    this.memberCard = createMemberCardApi(this.httpClient);

    this.knowledgeBase = createKnowledgeBaseApi(this.httpClient);

    this.invitationRelation = createInvitationRelationApi(this.httpClient);

    this.invitationCode = createInvitationCodeApi(this.httpClient);

    this.image = createImageApi(this.httpClient);

    this.chatGroup = createChatGroupApi(this.httpClient);

    this.generation = createGenerationApi(this.httpClient);

    this.generationContent = createGenerationContentApi(this.httpClient);

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

    this.conversation = createConversationApi(this.httpClient);

    this.contentWriting = createContentWritingApi(this.httpClient);

    this.comment = createCommentApi(this.httpClient);

    this.column = createColumnApi(this.httpClient);

    this.collection = createCollectionApi(this.httpClient);

    this.collectionItem = createCollectionItemApi(this.httpClient);

    this.character = createCharacterApi(this.httpClient);

    this.channel = createChannelApi(this.httpClient);

    this.channelResource = createChannelResourceApi(this.httpClient);

    this.channelProxy = createChannelProxyApi(this.httpClient);

    this.channelAccount = createChannelAccountApi(this.httpClient);

    this.category = createCategoryApi(this.httpClient);

    this.membershipCard = createMembershipCardApi(this.httpClient);

    this.cardTemplate = createCardTemplateApi(this.httpClient);

    this.attribute = createAttributeApi(this.httpClient);

    this.article = createArticleApi(this.httpClient);

    this.app = createAppApi(this.httpClient);

    this.apiKey = createApiKeyApi(this.httpClient);

    this.agent = createAgentApi(this.httpClient);

    this.agentToolRelationship = createAgentToolRelationshipApi(this.httpClient);

    this.account = createAccountApi(this.httpClient);

    this.accountHistory = createAccountHistoryApi(this.httpClient);

    this.accountExchangeConfig = createAccountExchangeConfigApi(this.httpClient);

    this.invoice = createInvoiceApi(this.httpClient);

    this.searchChat = createSearchChatApi(this.httpClient);

    this.pptTemplateRendering = createPptTemplateRenderingApi(this.httpClient);

    this.pptTemplateChat = createPptTemplateChatApi(this.httpClient);

    this.knowledgeBaseFile = createKnowledgeBaseFileApi(this.httpClient);

    this.knowledgeBaseChat = createKnowledgeBaseChatApi(this.httpClient);

    this.imMessage = createImMessageApi(this.httpClient);

    this.voiceSpeakerGeneration = createVoiceSpeakerGenerationApi(this.httpClient);

    this.videoGeneration = createVideoGenerationApi(this.httpClient);

    this.musicGeneration = createMusicGenerationApi(this.httpClient);

    this.imageGeneration = createImageGenerationApi(this.httpClient);

    this.characterGeneration = createCharacterGenerationApi(this.httpClient);

    this.audioGeneration = createAudioGenerationApi(this.httpClient);

    this.audioEffectGeneration = createAudioEffectGenerationApi(this.httpClient);

    this.chat = createChatApi(this.httpClient);

    this.auth = createAuthApi(this.httpClient);

    this.agentChat = createAgentChatApi(this.httpClient);
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
