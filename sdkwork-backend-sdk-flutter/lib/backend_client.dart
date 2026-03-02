import 'package:sdkwork_common_flutter/sdkwork_common_flutter.dart';
import 'src/http/client.dart';
import '../api/workspace.dart';
import '../api/content_vote.dart';
import '../api/voice_speaker.dart';
import '../api/visit_history.dart';
import '../api/vip_user.dart';
import '../api/vip_recharge.dart';
import '../api/vip_recharge_package.dart';
import '../api/vip_point_change.dart';
import '../api/vip_package_group.dart';
import '../api/vip_package.dart';
import '../api/vip_level.dart';
import '../api/vip_level_benefit.dart';
import '../api/vip_benefit.dart';
import '../api/vip_benefit_usage.dart';
import '../api/video.dart';
import '../api/user.dart';
import '../api/user_oauth_account.dart';
import '../api/user_coupon.dart';
import '../api/user_card.dart';
import '../api/user_address.dart';
import '../api/ai_usage_record.dart';
import '../api/shopping_cart.dart';
import '../api/shopping_cart_item.dart';
import '../api/refund.dart';
import '../api/payment.dart';
import '../api/order.dart';
import '../api/order_item.dart';
import '../api/ai_tool.dart';
import '../api/tenant.dart';
import '../api/database_table.dart';
import '../api/product_sku.dart';
import '../api/short_url.dart';
import '../api/shop.dart';
import '../api/share.dart';
import '../api/share_visit_record.dart';
import '../api/sharding_key.dart';
import '../api/schema.dart';
import '../api/rbac_role.dart';
import '../api/role_permission.dart';
import '../api/invocation_record.dart';
import '../api/rbac_user_role.dart';
import '../api/ai_prompt.dart';
import '../api/project.dart';
import '../api/product.dart';
import '../api/ppt_template.dart';
import '../api/ppt_template_slide.dart';
import '../api/partner.dart';
import '../api/chat_participant.dart';
import '../api/oss_bucket.dart';
import '../api/organization.dart';
import '../api/position.dart';
import '../api/member_relations.dart';
import '../api/organization_member.dart';
import '../api/notification.dart';
import '../api/notes.dart';
import '../api/news.dart';
import '../api/host.dart';
import '../api/dns_record.dart';
import '../api/music.dart';
import '../api/ai_model_information.dart';
import '../api/ai_model_price.dart';
import '../api/chat_message.dart';
import '../api/member_level.dart';
import '../api/member_card.dart';
import '../api/knowledge_base.dart';
import '../api/invitation_relation.dart';
import '../api/invitation_code.dart';
import '../api/image.dart';
import '../api/chat_group.dart';
import '../api/ai_generation.dart';
import '../api/ai_generation_content.dart';
import '../api/file.dart';
import '../api/file_part.dart';
import '../api/file_content.dart';
import '../api/feeds.dart';
import '../api/feedback.dart';
import '../api/favorite.dart';
import '../api/file_disk.dart';
import '../api/disk_member.dart';
import '../api/detail.dart';
import '../api/department.dart';
import '../api/datasource.dart';
import '../api/coupon.dart';
import '../api/coupon_template.dart';
import '../api/ai_conversation.dart';
import '../api/comment.dart';
import '../api/column.dart';
import '../api/collection.dart';
import '../api/collection_item.dart';
import '../api/character.dart';
import '../api/channel_resource.dart';
import '../api/channel_account.dart';
import '../api/ai_category.dart';
import '../api/membership_card.dart';
import '../api/card_template.dart';
import '../api/attribute.dart';
import '../api/ai_article.dart';
import '../api/application.dart';
import '../api/api_key.dart';
import '../api/ai_agent.dart';
import '../api/ai_agent_tool_relationship.dart';
import '../api/account.dart';
import '../api/account_history.dart';
import '../api/search_chat.dart';
import '../api/ppt_template_rendering.dart';
import '../api/ppt_template_chat.dart';
import '../api/knowledge_base_file.dart';
import '../api/knowledge_base_chat.dart';
import '../api/im_message.dart';
import '../api/ai_voice_speaker_generation.dart';
import '../api/ai_video_generation.dart';
import '../api/ai_music_generation.dart';
import '../api/ai_image_generation.dart';
import '../api/ai_character_generation.dart';
import '../api/ai_audio_generation.dart';
import '../api/ai_audio_effect_generation.dart';
import '../api/ai_chat.dart';
import '../api/verification.dart';
import '../api/oauth_authentication.dart';
import '../api/authorization.dart';
import '../api/authentication.dart';
import '../api/app.dart';
import '../api/ai_agent_chat.dart';

class SdkworkBackendClient {
  final HttpClient _httpClient;

  late final WorkspaceApi workspace;
  late final ContentVoteApi contentVote;
  late final VoiceSpeakerApi voiceSpeaker;
  late final VisitHistoryApi visitHistory;
  late final VipUserApi vipUser;
  late final VipRechargeApi vipRecharge;
  late final VipRechargePackageApi vipRechargePackage;
  late final VipPointChangeApi vipPointChange;
  late final VipPackageGroupApi vipPackageGroup;
  late final VipPackageApi vipPackage;
  late final VipLevelApi vipLevel;
  late final VipLevelBenefitApi vipLevelBenefit;
  late final VipBenefitApi vipBenefit;
  late final VipBenefitUsageApi vipBenefitUsage;
  late final VideoApi video;
  late final UserApi user;
  late final UserOauthAccountApi userOauthAccount;
  late final UserCouponApi userCoupon;
  late final UserCardApi userCard;
  late final UserAddressApi userAddress;
  late final AiUsageRecordApi aiUsageRecord;
  late final ShoppingCartApi shoppingCart;
  late final ShoppingCartItemApi shoppingCartItem;
  late final RefundApi refund;
  late final PaymentApi payment;
  late final OrderApi order;
  late final OrderItemApi orderItem;
  late final AiToolApi aiTool;
  late final TenantApi tenant;
  late final DatabaseTableApi databaseTable;
  late final ProductSkuApi productSku;
  late final ShortUrlApi shortUrl;
  late final ShopApi shop;
  late final ShareApi share;
  late final ShareVisitRecordApi shareVisitRecord;
  late final ShardingKeyApi shardingKey;
  late final SchemaApi schema;
  late final RbacRoleApi rbacRole;
  late final RolePermissionApi rolePermission;
  late final InvocationRecordApi invocationRecord;
  late final RbacUserRoleApi rbacUserRole;
  late final AiPromptApi aiPrompt;
  late final ProjectApi project;
  late final ProductApi product;
  late final PptTemplateApi pptTemplate;
  late final PptTemplateSlideApi pptTemplateSlide;
  late final PartnerApi partner;
  late final ChatParticipantApi chatParticipant;
  late final OssBucketApi ossBucket;
  late final OrganizationApi organization;
  late final PositionApi position;
  late final MemberRelationsApi memberRelations;
  late final OrganizationMemberApi organizationMember;
  late final NotificationApi notification;
  late final NotesApi notes;
  late final NewsApi news;
  late final HostApi host;
  late final DnsRecordApi dnsRecord;
  late final MusicApi music;
  late final AiModelInformationApi aiModelInformation;
  late final AiModelPriceApi aiModelPrice;
  late final ChatMessageApi chatMessage;
  late final MemberLevelApi memberLevel;
  late final MemberCardApi memberCard;
  late final KnowledgeBaseApi knowledgeBase;
  late final InvitationRelationApi invitationRelation;
  late final InvitationCodeApi invitationCode;
  late final ImageApi image;
  late final ChatGroupApi chatGroup;
  late final AiGenerationApi aiGeneration;
  late final AiGenerationContentApi aiGenerationContent;
  late final FileApi file;
  late final FilePartApi filePart;
  late final FileContentApi fileContent;
  late final FeedsApi feeds;
  late final FeedbackApi feedback;
  late final FavoriteApi favorite;
  late final FileDiskApi fileDisk;
  late final DiskMemberApi diskMember;
  late final DetailApi detail;
  late final DepartmentApi department;
  late final DatasourceApi datasource;
  late final CouponApi coupon;
  late final CouponTemplateApi couponTemplate;
  late final AiConversationApi aiConversation;
  late final CommentApi comment;
  late final ColumnApi column;
  late final CollectionApi collection;
  late final CollectionItemApi collectionItem;
  late final CharacterApi character;
  late final ChannelResourceApi channelResource;
  late final ChannelAccountApi channelAccount;
  late final AiCategoryApi aiCategory;
  late final MembershipCardApi membershipCard;
  late final CardTemplateApi cardTemplate;
  late final AttributeApi attribute;
  late final AiArticleApi aiArticle;
  late final ApplicationApi application;
  late final ApiKeyApi apiKey;
  late final AiAgentApi aiAgent;
  late final AiAgentToolRelationshipApi aiAgentToolRelationship;
  late final AccountApi account;
  late final AccountHistoryApi accountHistory;
  late final SearchChatApi searchChat;
  late final PptTemplateRenderingApi pptTemplateRendering;
  late final PptTemplateChatApi pptTemplateChat;
  late final KnowledgeBaseFileApi knowledgeBaseFile;
  late final KnowledgeBaseChatApi knowledgeBaseChat;
  late final ImMessageApi imMessage;
  late final AiVoiceSpeakerGenerationApi aiVoiceSpeakerGeneration;
  late final AiVideoGenerationApi aiVideoGeneration;
  late final AiMusicGenerationApi aiMusicGeneration;
  late final AiImageGenerationApi aiImageGeneration;
  late final AiCharacterGenerationApi aiCharacterGeneration;
  late final AiAudioGenerationApi aiAudioGeneration;
  late final AiAudioEffectGenerationApi aiAudioEffectGeneration;
  late final AiChatApi aiChat;
  late final VerificationApi verification;
  late final OauthAuthenticationApi oauthAuthentication;
  late final AuthorizationApi authorization;
  late final AuthenticationApi authentication;
  late final AppApi app;
  late final AiAgentChatApi aiAgentChat;

  SdkworkBackendClient({
    required SdkConfig config,
  }) : _httpClient = HttpClient(config: config) {
    workspace = WorkspaceApi(_httpClient);
    contentVote = ContentVoteApi(_httpClient);
    voiceSpeaker = VoiceSpeakerApi(_httpClient);
    visitHistory = VisitHistoryApi(_httpClient);
    vipUser = VipUserApi(_httpClient);
    vipRecharge = VipRechargeApi(_httpClient);
    vipRechargePackage = VipRechargePackageApi(_httpClient);
    vipPointChange = VipPointChangeApi(_httpClient);
    vipPackageGroup = VipPackageGroupApi(_httpClient);
    vipPackage = VipPackageApi(_httpClient);
    vipLevel = VipLevelApi(_httpClient);
    vipLevelBenefit = VipLevelBenefitApi(_httpClient);
    vipBenefit = VipBenefitApi(_httpClient);
    vipBenefitUsage = VipBenefitUsageApi(_httpClient);
    video = VideoApi(_httpClient);
    user = UserApi(_httpClient);
    userOauthAccount = UserOauthAccountApi(_httpClient);
    userCoupon = UserCouponApi(_httpClient);
    userCard = UserCardApi(_httpClient);
    userAddress = UserAddressApi(_httpClient);
    aiUsageRecord = AiUsageRecordApi(_httpClient);
    shoppingCart = ShoppingCartApi(_httpClient);
    shoppingCartItem = ShoppingCartItemApi(_httpClient);
    refund = RefundApi(_httpClient);
    payment = PaymentApi(_httpClient);
    order = OrderApi(_httpClient);
    orderItem = OrderItemApi(_httpClient);
    aiTool = AiToolApi(_httpClient);
    tenant = TenantApi(_httpClient);
    databaseTable = DatabaseTableApi(_httpClient);
    productSku = ProductSkuApi(_httpClient);
    shortUrl = ShortUrlApi(_httpClient);
    shop = ShopApi(_httpClient);
    share = ShareApi(_httpClient);
    shareVisitRecord = ShareVisitRecordApi(_httpClient);
    shardingKey = ShardingKeyApi(_httpClient);
    schema = SchemaApi(_httpClient);
    rbacRole = RbacRoleApi(_httpClient);
    rolePermission = RolePermissionApi(_httpClient);
    invocationRecord = InvocationRecordApi(_httpClient);
    rbacUserRole = RbacUserRoleApi(_httpClient);
    aiPrompt = AiPromptApi(_httpClient);
    project = ProjectApi(_httpClient);
    product = ProductApi(_httpClient);
    pptTemplate = PptTemplateApi(_httpClient);
    pptTemplateSlide = PptTemplateSlideApi(_httpClient);
    partner = PartnerApi(_httpClient);
    chatParticipant = ChatParticipantApi(_httpClient);
    ossBucket = OssBucketApi(_httpClient);
    organization = OrganizationApi(_httpClient);
    position = PositionApi(_httpClient);
    memberRelations = MemberRelationsApi(_httpClient);
    organizationMember = OrganizationMemberApi(_httpClient);
    notification = NotificationApi(_httpClient);
    notes = NotesApi(_httpClient);
    news = NewsApi(_httpClient);
    host = HostApi(_httpClient);
    dnsRecord = DnsRecordApi(_httpClient);
    music = MusicApi(_httpClient);
    aiModelInformation = AiModelInformationApi(_httpClient);
    aiModelPrice = AiModelPriceApi(_httpClient);
    chatMessage = ChatMessageApi(_httpClient);
    memberLevel = MemberLevelApi(_httpClient);
    memberCard = MemberCardApi(_httpClient);
    knowledgeBase = KnowledgeBaseApi(_httpClient);
    invitationRelation = InvitationRelationApi(_httpClient);
    invitationCode = InvitationCodeApi(_httpClient);
    image = ImageApi(_httpClient);
    chatGroup = ChatGroupApi(_httpClient);
    aiGeneration = AiGenerationApi(_httpClient);
    aiGenerationContent = AiGenerationContentApi(_httpClient);
    file = FileApi(_httpClient);
    filePart = FilePartApi(_httpClient);
    fileContent = FileContentApi(_httpClient);
    feeds = FeedsApi(_httpClient);
    feedback = FeedbackApi(_httpClient);
    favorite = FavoriteApi(_httpClient);
    fileDisk = FileDiskApi(_httpClient);
    diskMember = DiskMemberApi(_httpClient);
    detail = DetailApi(_httpClient);
    department = DepartmentApi(_httpClient);
    datasource = DatasourceApi(_httpClient);
    coupon = CouponApi(_httpClient);
    couponTemplate = CouponTemplateApi(_httpClient);
    aiConversation = AiConversationApi(_httpClient);
    comment = CommentApi(_httpClient);
    column = ColumnApi(_httpClient);
    collection = CollectionApi(_httpClient);
    collectionItem = CollectionItemApi(_httpClient);
    character = CharacterApi(_httpClient);
    channelResource = ChannelResourceApi(_httpClient);
    channelAccount = ChannelAccountApi(_httpClient);
    aiCategory = AiCategoryApi(_httpClient);
    membershipCard = MembershipCardApi(_httpClient);
    cardTemplate = CardTemplateApi(_httpClient);
    attribute = AttributeApi(_httpClient);
    aiArticle = AiArticleApi(_httpClient);
    application = ApplicationApi(_httpClient);
    apiKey = ApiKeyApi(_httpClient);
    aiAgent = AiAgentApi(_httpClient);
    aiAgentToolRelationship = AiAgentToolRelationshipApi(_httpClient);
    account = AccountApi(_httpClient);
    accountHistory = AccountHistoryApi(_httpClient);
    searchChat = SearchChatApi(_httpClient);
    pptTemplateRendering = PptTemplateRenderingApi(_httpClient);
    pptTemplateChat = PptTemplateChatApi(_httpClient);
    knowledgeBaseFile = KnowledgeBaseFileApi(_httpClient);
    knowledgeBaseChat = KnowledgeBaseChatApi(_httpClient);
    imMessage = ImMessageApi(_httpClient);
    aiVoiceSpeakerGeneration = AiVoiceSpeakerGenerationApi(_httpClient);
    aiVideoGeneration = AiVideoGenerationApi(_httpClient);
    aiMusicGeneration = AiMusicGenerationApi(_httpClient);
    aiImageGeneration = AiImageGenerationApi(_httpClient);
    aiCharacterGeneration = AiCharacterGenerationApi(_httpClient);
    aiAudioGeneration = AiAudioGenerationApi(_httpClient);
    aiAudioEffectGeneration = AiAudioEffectGenerationApi(_httpClient);
    aiChat = AiChatApi(_httpClient);
    verification = VerificationApi(_httpClient);
    oauthAuthentication = OauthAuthenticationApi(_httpClient);
    authorization = AuthorizationApi(_httpClient);
    authentication = AuthenticationApi(_httpClient);
    app = AppApi(_httpClient);
    aiAgentChat = AiAgentChatApi(_httpClient);
  }

  factory SdkworkBackendClient.withBaseUrl({
    required String baseUrl,
    String? apiKey,
    String? authToken,
    String? accessToken,
    String apiKeyHeader = 'Authorization',
    bool apiKeyAsBearer = true,
    Map<String, String>? headers,
    int timeout = 30000,
  }) {
    return SdkworkBackendClient(
      config: SdkConfig(
        baseUrl: baseUrl,
        timeout: timeout,
        headers: headers ?? const {},
        apiKey: apiKey,
        apiKeyHeader: apiKeyHeader,
        apiKeyAsBearer: apiKeyAsBearer,
        authToken: authToken,
        accessToken: accessToken,
      ),
    );
  }

  void setApiKey(String apiKey) {
    _httpClient.setApiKey(apiKey);
  }

  void setAuthToken(String token) {
    _httpClient.setAuthToken(token);
  }

  void setAccessToken(String token) {
    _httpClient.setAccessToken(token);
  }

  void setHeader(String key, String value) {
    _httpClient.setHeader(key, value);
  }
}
