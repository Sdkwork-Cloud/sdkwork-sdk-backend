package com.sdkwork.backend;

import com.sdkwork.common.core.Types;
import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.api.WorkspaceApi;
import com.sdkwork.backend.api.ContentVoteApi;
import com.sdkwork.backend.api.VoiceSpeakerApi;
import com.sdkwork.backend.api.VisitHistoryApi;
import com.sdkwork.backend.api.VipUserApi;
import com.sdkwork.backend.api.VipRechargeApi;
import com.sdkwork.backend.api.VipRechargePackageApi;
import com.sdkwork.backend.api.VipPointChangeApi;
import com.sdkwork.backend.api.VipPackageGroupApi;
import com.sdkwork.backend.api.VipPackageApi;
import com.sdkwork.backend.api.VipLevelApi;
import com.sdkwork.backend.api.VipLevelBenefitApi;
import com.sdkwork.backend.api.VipBenefitApi;
import com.sdkwork.backend.api.VipBenefitUsageApi;
import com.sdkwork.backend.api.VideoApi;
import com.sdkwork.backend.api.UserApi;
import com.sdkwork.backend.api.UserOauthAccountApi;
import com.sdkwork.backend.api.UserCouponApi;
import com.sdkwork.backend.api.UserCardApi;
import com.sdkwork.backend.api.UserAddressApi;
import com.sdkwork.backend.api.AiUsageRecordApi;
import com.sdkwork.backend.api.ShoppingCartApi;
import com.sdkwork.backend.api.ShoppingCartItemApi;
import com.sdkwork.backend.api.RefundApi;
import com.sdkwork.backend.api.PaymentApi;
import com.sdkwork.backend.api.OrderApi;
import com.sdkwork.backend.api.OrderItemApi;
import com.sdkwork.backend.api.AiToolApi;
import com.sdkwork.backend.api.TenantApi;
import com.sdkwork.backend.api.DatabaseTableApi;
import com.sdkwork.backend.api.ProductSkuApi;
import com.sdkwork.backend.api.ShortUrlApi;
import com.sdkwork.backend.api.ShopApi;
import com.sdkwork.backend.api.ShareApi;
import com.sdkwork.backend.api.ShareVisitRecordApi;
import com.sdkwork.backend.api.ShardingKeyApi;
import com.sdkwork.backend.api.SchemaApi;
import com.sdkwork.backend.api.RbacRoleApi;
import com.sdkwork.backend.api.RolePermissionApi;
import com.sdkwork.backend.api.InvocationRecordApi;
import com.sdkwork.backend.api.RbacUserRoleApi;
import com.sdkwork.backend.api.AiPromptApi;
import com.sdkwork.backend.api.ProjectApi;
import com.sdkwork.backend.api.ProductApi;
import com.sdkwork.backend.api.PptTemplateApi;
import com.sdkwork.backend.api.PptTemplateSlideApi;
import com.sdkwork.backend.api.PartnerApi;
import com.sdkwork.backend.api.ChatParticipantApi;
import com.sdkwork.backend.api.OssBucketApi;
import com.sdkwork.backend.api.OrganizationApi;
import com.sdkwork.backend.api.PositionApi;
import com.sdkwork.backend.api.MemberRelationsApi;
import com.sdkwork.backend.api.OrganizationMemberApi;
import com.sdkwork.backend.api.NotificationApi;
import com.sdkwork.backend.api.NotesApi;
import com.sdkwork.backend.api.NewsApi;
import com.sdkwork.backend.api.HostApi;
import com.sdkwork.backend.api.DnsRecordApi;
import com.sdkwork.backend.api.MusicApi;
import com.sdkwork.backend.api.AiModelInformationApi;
import com.sdkwork.backend.api.AiModelPriceApi;
import com.sdkwork.backend.api.ChatMessageApi;
import com.sdkwork.backend.api.MemberLevelApi;
import com.sdkwork.backend.api.MemberCardApi;
import com.sdkwork.backend.api.KnowledgeBaseApi;
import com.sdkwork.backend.api.InvitationRelationApi;
import com.sdkwork.backend.api.InvitationCodeApi;
import com.sdkwork.backend.api.ImageApi;
import com.sdkwork.backend.api.ChatGroupApi;
import com.sdkwork.backend.api.AiGenerationApi;
import com.sdkwork.backend.api.AiGenerationContentApi;
import com.sdkwork.backend.api.FileApi;
import com.sdkwork.backend.api.FilePartApi;
import com.sdkwork.backend.api.FileContentApi;
import com.sdkwork.backend.api.FeedsApi;
import com.sdkwork.backend.api.FeedbackApi;
import com.sdkwork.backend.api.FavoriteApi;
import com.sdkwork.backend.api.FileDiskApi;
import com.sdkwork.backend.api.DiskMemberApi;
import com.sdkwork.backend.api.DetailApi;
import com.sdkwork.backend.api.DepartmentApi;
import com.sdkwork.backend.api.DatasourceApi;
import com.sdkwork.backend.api.CouponApi;
import com.sdkwork.backend.api.CouponTemplateApi;
import com.sdkwork.backend.api.AiConversationApi;
import com.sdkwork.backend.api.CommentApi;
import com.sdkwork.backend.api.ColumnApi;
import com.sdkwork.backend.api.CollectionApi;
import com.sdkwork.backend.api.CollectionItemApi;
import com.sdkwork.backend.api.CharacterApi;
import com.sdkwork.backend.api.ChannelResourceApi;
import com.sdkwork.backend.api.ChannelAccountApi;
import com.sdkwork.backend.api.AiCategoryApi;
import com.sdkwork.backend.api.MembershipCardApi;
import com.sdkwork.backend.api.CardTemplateApi;
import com.sdkwork.backend.api.AttributeApi;
import com.sdkwork.backend.api.AiArticleApi;
import com.sdkwork.backend.api.ApplicationApi;
import com.sdkwork.backend.api.ApiKeyApi;
import com.sdkwork.backend.api.AiAgentApi;
import com.sdkwork.backend.api.AiAgentToolRelationshipApi;
import com.sdkwork.backend.api.AccountApi;
import com.sdkwork.backend.api.AccountHistoryApi;
import com.sdkwork.backend.api.SearchChatApi;
import com.sdkwork.backend.api.PptTemplateRenderingApi;
import com.sdkwork.backend.api.PptTemplateChatApi;
import com.sdkwork.backend.api.KnowledgeBaseFileApi;
import com.sdkwork.backend.api.KnowledgeBaseChatApi;
import com.sdkwork.backend.api.ImMessageApi;
import com.sdkwork.backend.api.AiVoiceSpeakerGenerationApi;
import com.sdkwork.backend.api.AiVideoGenerationApi;
import com.sdkwork.backend.api.AiMusicGenerationApi;
import com.sdkwork.backend.api.AiImageGenerationApi;
import com.sdkwork.backend.api.AiCharacterGenerationApi;
import com.sdkwork.backend.api.AiAudioGenerationApi;
import com.sdkwork.backend.api.AiAudioEffectGenerationApi;
import com.sdkwork.backend.api.AiChatApi;
import com.sdkwork.backend.api.VerificationApi;
import com.sdkwork.backend.api.OauthAuthenticationApi;
import com.sdkwork.backend.api.AuthorizationApi;
import com.sdkwork.backend.api.AuthenticationApi;
import com.sdkwork.backend.api.AppApi;
import com.sdkwork.backend.api.AiAgentChatApi;

public class SdkworkBackendClient {
    private final HttpClient httpClient;
    private WorkspaceApi workspace;
    private ContentVoteApi contentVote;
    private VoiceSpeakerApi voiceSpeaker;
    private VisitHistoryApi visitHistory;
    private VipUserApi vipUser;
    private VipRechargeApi vipRecharge;
    private VipRechargePackageApi vipRechargePackage;
    private VipPointChangeApi vipPointChange;
    private VipPackageGroupApi vipPackageGroup;
    private VipPackageApi vipPackage;
    private VipLevelApi vipLevel;
    private VipLevelBenefitApi vipLevelBenefit;
    private VipBenefitApi vipBenefit;
    private VipBenefitUsageApi vipBenefitUsage;
    private VideoApi video;
    private UserApi user;
    private UserOauthAccountApi userOauthAccount;
    private UserCouponApi userCoupon;
    private UserCardApi userCard;
    private UserAddressApi userAddress;
    private AiUsageRecordApi aiUsageRecord;
    private ShoppingCartApi shoppingCart;
    private ShoppingCartItemApi shoppingCartItem;
    private RefundApi refund;
    private PaymentApi payment;
    private OrderApi order;
    private OrderItemApi orderItem;
    private AiToolApi aiTool;
    private TenantApi tenant;
    private DatabaseTableApi databaseTable;
    private ProductSkuApi productSku;
    private ShortUrlApi shortUrl;
    private ShopApi shop;
    private ShareApi share;
    private ShareVisitRecordApi shareVisitRecord;
    private ShardingKeyApi shardingKey;
    private SchemaApi schema;
    private RbacRoleApi rbacRole;
    private RolePermissionApi rolePermission;
    private InvocationRecordApi invocationRecord;
    private RbacUserRoleApi rbacUserRole;
    private AiPromptApi aiPrompt;
    private ProjectApi project;
    private ProductApi product;
    private PptTemplateApi pptTemplate;
    private PptTemplateSlideApi pptTemplateSlide;
    private PartnerApi partner;
    private ChatParticipantApi chatParticipant;
    private OssBucketApi ossBucket;
    private OrganizationApi organization;
    private PositionApi position;
    private MemberRelationsApi memberRelations;
    private OrganizationMemberApi organizationMember;
    private NotificationApi notification;
    private NotesApi notes;
    private NewsApi news;
    private HostApi host;
    private DnsRecordApi dnsRecord;
    private MusicApi music;
    private AiModelInformationApi aiModelInformation;
    private AiModelPriceApi aiModelPrice;
    private ChatMessageApi chatMessage;
    private MemberLevelApi memberLevel;
    private MemberCardApi memberCard;
    private KnowledgeBaseApi knowledgeBase;
    private InvitationRelationApi invitationRelation;
    private InvitationCodeApi invitationCode;
    private ImageApi image;
    private ChatGroupApi chatGroup;
    private AiGenerationApi aiGeneration;
    private AiGenerationContentApi aiGenerationContent;
    private FileApi file;
    private FilePartApi filePart;
    private FileContentApi fileContent;
    private FeedsApi feeds;
    private FeedbackApi feedback;
    private FavoriteApi favorite;
    private FileDiskApi fileDisk;
    private DiskMemberApi diskMember;
    private DetailApi detail;
    private DepartmentApi department;
    private DatasourceApi datasource;
    private CouponApi coupon;
    private CouponTemplateApi couponTemplate;
    private AiConversationApi aiConversation;
    private CommentApi comment;
    private ColumnApi column;
    private CollectionApi collection;
    private CollectionItemApi collectionItem;
    private CharacterApi character;
    private ChannelResourceApi channelResource;
    private ChannelAccountApi channelAccount;
    private AiCategoryApi aiCategory;
    private MembershipCardApi membershipCard;
    private CardTemplateApi cardTemplate;
    private AttributeApi attribute;
    private AiArticleApi aiArticle;
    private ApplicationApi application;
    private ApiKeyApi apiKey;
    private AiAgentApi aiAgent;
    private AiAgentToolRelationshipApi aiAgentToolRelationship;
    private AccountApi account;
    private AccountHistoryApi accountHistory;
    private SearchChatApi searchChat;
    private PptTemplateRenderingApi pptTemplateRendering;
    private PptTemplateChatApi pptTemplateChat;
    private KnowledgeBaseFileApi knowledgeBaseFile;
    private KnowledgeBaseChatApi knowledgeBaseChat;
    private ImMessageApi imMessage;
    private AiVoiceSpeakerGenerationApi aiVoiceSpeakerGeneration;
    private AiVideoGenerationApi aiVideoGeneration;
    private AiMusicGenerationApi aiMusicGeneration;
    private AiImageGenerationApi aiImageGeneration;
    private AiCharacterGenerationApi aiCharacterGeneration;
    private AiAudioGenerationApi aiAudioGeneration;
    private AiAudioEffectGenerationApi aiAudioEffectGeneration;
    private AiChatApi aiChat;
    private VerificationApi verification;
    private OauthAuthenticationApi oauthAuthentication;
    private AuthorizationApi authorization;
    private AuthenticationApi authentication;
    private AppApi app;
    private AiAgentChatApi aiAgentChat;

    public SdkworkBackendClient(String baseUrl) {
        this.httpClient = new HttpClient(baseUrl);
        this.workspace = new WorkspaceApi(httpClient);
        this.contentVote = new ContentVoteApi(httpClient);
        this.voiceSpeaker = new VoiceSpeakerApi(httpClient);
        this.visitHistory = new VisitHistoryApi(httpClient);
        this.vipUser = new VipUserApi(httpClient);
        this.vipRecharge = new VipRechargeApi(httpClient);
        this.vipRechargePackage = new VipRechargePackageApi(httpClient);
        this.vipPointChange = new VipPointChangeApi(httpClient);
        this.vipPackageGroup = new VipPackageGroupApi(httpClient);
        this.vipPackage = new VipPackageApi(httpClient);
        this.vipLevel = new VipLevelApi(httpClient);
        this.vipLevelBenefit = new VipLevelBenefitApi(httpClient);
        this.vipBenefit = new VipBenefitApi(httpClient);
        this.vipBenefitUsage = new VipBenefitUsageApi(httpClient);
        this.video = new VideoApi(httpClient);
        this.user = new UserApi(httpClient);
        this.userOauthAccount = new UserOauthAccountApi(httpClient);
        this.userCoupon = new UserCouponApi(httpClient);
        this.userCard = new UserCardApi(httpClient);
        this.userAddress = new UserAddressApi(httpClient);
        this.aiUsageRecord = new AiUsageRecordApi(httpClient);
        this.shoppingCart = new ShoppingCartApi(httpClient);
        this.shoppingCartItem = new ShoppingCartItemApi(httpClient);
        this.refund = new RefundApi(httpClient);
        this.payment = new PaymentApi(httpClient);
        this.order = new OrderApi(httpClient);
        this.orderItem = new OrderItemApi(httpClient);
        this.aiTool = new AiToolApi(httpClient);
        this.tenant = new TenantApi(httpClient);
        this.databaseTable = new DatabaseTableApi(httpClient);
        this.productSku = new ProductSkuApi(httpClient);
        this.shortUrl = new ShortUrlApi(httpClient);
        this.shop = new ShopApi(httpClient);
        this.share = new ShareApi(httpClient);
        this.shareVisitRecord = new ShareVisitRecordApi(httpClient);
        this.shardingKey = new ShardingKeyApi(httpClient);
        this.schema = new SchemaApi(httpClient);
        this.rbacRole = new RbacRoleApi(httpClient);
        this.rolePermission = new RolePermissionApi(httpClient);
        this.invocationRecord = new InvocationRecordApi(httpClient);
        this.rbacUserRole = new RbacUserRoleApi(httpClient);
        this.aiPrompt = new AiPromptApi(httpClient);
        this.project = new ProjectApi(httpClient);
        this.product = new ProductApi(httpClient);
        this.pptTemplate = new PptTemplateApi(httpClient);
        this.pptTemplateSlide = new PptTemplateSlideApi(httpClient);
        this.partner = new PartnerApi(httpClient);
        this.chatParticipant = new ChatParticipantApi(httpClient);
        this.ossBucket = new OssBucketApi(httpClient);
        this.organization = new OrganizationApi(httpClient);
        this.position = new PositionApi(httpClient);
        this.memberRelations = new MemberRelationsApi(httpClient);
        this.organizationMember = new OrganizationMemberApi(httpClient);
        this.notification = new NotificationApi(httpClient);
        this.notes = new NotesApi(httpClient);
        this.news = new NewsApi(httpClient);
        this.host = new HostApi(httpClient);
        this.dnsRecord = new DnsRecordApi(httpClient);
        this.music = new MusicApi(httpClient);
        this.aiModelInformation = new AiModelInformationApi(httpClient);
        this.aiModelPrice = new AiModelPriceApi(httpClient);
        this.chatMessage = new ChatMessageApi(httpClient);
        this.memberLevel = new MemberLevelApi(httpClient);
        this.memberCard = new MemberCardApi(httpClient);
        this.knowledgeBase = new KnowledgeBaseApi(httpClient);
        this.invitationRelation = new InvitationRelationApi(httpClient);
        this.invitationCode = new InvitationCodeApi(httpClient);
        this.image = new ImageApi(httpClient);
        this.chatGroup = new ChatGroupApi(httpClient);
        this.aiGeneration = new AiGenerationApi(httpClient);
        this.aiGenerationContent = new AiGenerationContentApi(httpClient);
        this.file = new FileApi(httpClient);
        this.filePart = new FilePartApi(httpClient);
        this.fileContent = new FileContentApi(httpClient);
        this.feeds = new FeedsApi(httpClient);
        this.feedback = new FeedbackApi(httpClient);
        this.favorite = new FavoriteApi(httpClient);
        this.fileDisk = new FileDiskApi(httpClient);
        this.diskMember = new DiskMemberApi(httpClient);
        this.detail = new DetailApi(httpClient);
        this.department = new DepartmentApi(httpClient);
        this.datasource = new DatasourceApi(httpClient);
        this.coupon = new CouponApi(httpClient);
        this.couponTemplate = new CouponTemplateApi(httpClient);
        this.aiConversation = new AiConversationApi(httpClient);
        this.comment = new CommentApi(httpClient);
        this.column = new ColumnApi(httpClient);
        this.collection = new CollectionApi(httpClient);
        this.collectionItem = new CollectionItemApi(httpClient);
        this.character = new CharacterApi(httpClient);
        this.channelResource = new ChannelResourceApi(httpClient);
        this.channelAccount = new ChannelAccountApi(httpClient);
        this.aiCategory = new AiCategoryApi(httpClient);
        this.membershipCard = new MembershipCardApi(httpClient);
        this.cardTemplate = new CardTemplateApi(httpClient);
        this.attribute = new AttributeApi(httpClient);
        this.aiArticle = new AiArticleApi(httpClient);
        this.application = new ApplicationApi(httpClient);
        this.apiKey = new ApiKeyApi(httpClient);
        this.aiAgent = new AiAgentApi(httpClient);
        this.aiAgentToolRelationship = new AiAgentToolRelationshipApi(httpClient);
        this.account = new AccountApi(httpClient);
        this.accountHistory = new AccountHistoryApi(httpClient);
        this.searchChat = new SearchChatApi(httpClient);
        this.pptTemplateRendering = new PptTemplateRenderingApi(httpClient);
        this.pptTemplateChat = new PptTemplateChatApi(httpClient);
        this.knowledgeBaseFile = new KnowledgeBaseFileApi(httpClient);
        this.knowledgeBaseChat = new KnowledgeBaseChatApi(httpClient);
        this.imMessage = new ImMessageApi(httpClient);
        this.aiVoiceSpeakerGeneration = new AiVoiceSpeakerGenerationApi(httpClient);
        this.aiVideoGeneration = new AiVideoGenerationApi(httpClient);
        this.aiMusicGeneration = new AiMusicGenerationApi(httpClient);
        this.aiImageGeneration = new AiImageGenerationApi(httpClient);
        this.aiCharacterGeneration = new AiCharacterGenerationApi(httpClient);
        this.aiAudioGeneration = new AiAudioGenerationApi(httpClient);
        this.aiAudioEffectGeneration = new AiAudioEffectGenerationApi(httpClient);
        this.aiChat = new AiChatApi(httpClient);
        this.verification = new VerificationApi(httpClient);
        this.oauthAuthentication = new OauthAuthenticationApi(httpClient);
        this.authorization = new AuthorizationApi(httpClient);
        this.authentication = new AuthenticationApi(httpClient);
        this.app = new AppApi(httpClient);
        this.aiAgentChat = new AiAgentChatApi(httpClient);
    }

    public SdkworkBackendClient(Types.SdkConfig config) {
        this.httpClient = new HttpClient(config);
        this.workspace = new WorkspaceApi(httpClient);
        this.contentVote = new ContentVoteApi(httpClient);
        this.voiceSpeaker = new VoiceSpeakerApi(httpClient);
        this.visitHistory = new VisitHistoryApi(httpClient);
        this.vipUser = new VipUserApi(httpClient);
        this.vipRecharge = new VipRechargeApi(httpClient);
        this.vipRechargePackage = new VipRechargePackageApi(httpClient);
        this.vipPointChange = new VipPointChangeApi(httpClient);
        this.vipPackageGroup = new VipPackageGroupApi(httpClient);
        this.vipPackage = new VipPackageApi(httpClient);
        this.vipLevel = new VipLevelApi(httpClient);
        this.vipLevelBenefit = new VipLevelBenefitApi(httpClient);
        this.vipBenefit = new VipBenefitApi(httpClient);
        this.vipBenefitUsage = new VipBenefitUsageApi(httpClient);
        this.video = new VideoApi(httpClient);
        this.user = new UserApi(httpClient);
        this.userOauthAccount = new UserOauthAccountApi(httpClient);
        this.userCoupon = new UserCouponApi(httpClient);
        this.userCard = new UserCardApi(httpClient);
        this.userAddress = new UserAddressApi(httpClient);
        this.aiUsageRecord = new AiUsageRecordApi(httpClient);
        this.shoppingCart = new ShoppingCartApi(httpClient);
        this.shoppingCartItem = new ShoppingCartItemApi(httpClient);
        this.refund = new RefundApi(httpClient);
        this.payment = new PaymentApi(httpClient);
        this.order = new OrderApi(httpClient);
        this.orderItem = new OrderItemApi(httpClient);
        this.aiTool = new AiToolApi(httpClient);
        this.tenant = new TenantApi(httpClient);
        this.databaseTable = new DatabaseTableApi(httpClient);
        this.productSku = new ProductSkuApi(httpClient);
        this.shortUrl = new ShortUrlApi(httpClient);
        this.shop = new ShopApi(httpClient);
        this.share = new ShareApi(httpClient);
        this.shareVisitRecord = new ShareVisitRecordApi(httpClient);
        this.shardingKey = new ShardingKeyApi(httpClient);
        this.schema = new SchemaApi(httpClient);
        this.rbacRole = new RbacRoleApi(httpClient);
        this.rolePermission = new RolePermissionApi(httpClient);
        this.invocationRecord = new InvocationRecordApi(httpClient);
        this.rbacUserRole = new RbacUserRoleApi(httpClient);
        this.aiPrompt = new AiPromptApi(httpClient);
        this.project = new ProjectApi(httpClient);
        this.product = new ProductApi(httpClient);
        this.pptTemplate = new PptTemplateApi(httpClient);
        this.pptTemplateSlide = new PptTemplateSlideApi(httpClient);
        this.partner = new PartnerApi(httpClient);
        this.chatParticipant = new ChatParticipantApi(httpClient);
        this.ossBucket = new OssBucketApi(httpClient);
        this.organization = new OrganizationApi(httpClient);
        this.position = new PositionApi(httpClient);
        this.memberRelations = new MemberRelationsApi(httpClient);
        this.organizationMember = new OrganizationMemberApi(httpClient);
        this.notification = new NotificationApi(httpClient);
        this.notes = new NotesApi(httpClient);
        this.news = new NewsApi(httpClient);
        this.host = new HostApi(httpClient);
        this.dnsRecord = new DnsRecordApi(httpClient);
        this.music = new MusicApi(httpClient);
        this.aiModelInformation = new AiModelInformationApi(httpClient);
        this.aiModelPrice = new AiModelPriceApi(httpClient);
        this.chatMessage = new ChatMessageApi(httpClient);
        this.memberLevel = new MemberLevelApi(httpClient);
        this.memberCard = new MemberCardApi(httpClient);
        this.knowledgeBase = new KnowledgeBaseApi(httpClient);
        this.invitationRelation = new InvitationRelationApi(httpClient);
        this.invitationCode = new InvitationCodeApi(httpClient);
        this.image = new ImageApi(httpClient);
        this.chatGroup = new ChatGroupApi(httpClient);
        this.aiGeneration = new AiGenerationApi(httpClient);
        this.aiGenerationContent = new AiGenerationContentApi(httpClient);
        this.file = new FileApi(httpClient);
        this.filePart = new FilePartApi(httpClient);
        this.fileContent = new FileContentApi(httpClient);
        this.feeds = new FeedsApi(httpClient);
        this.feedback = new FeedbackApi(httpClient);
        this.favorite = new FavoriteApi(httpClient);
        this.fileDisk = new FileDiskApi(httpClient);
        this.diskMember = new DiskMemberApi(httpClient);
        this.detail = new DetailApi(httpClient);
        this.department = new DepartmentApi(httpClient);
        this.datasource = new DatasourceApi(httpClient);
        this.coupon = new CouponApi(httpClient);
        this.couponTemplate = new CouponTemplateApi(httpClient);
        this.aiConversation = new AiConversationApi(httpClient);
        this.comment = new CommentApi(httpClient);
        this.column = new ColumnApi(httpClient);
        this.collection = new CollectionApi(httpClient);
        this.collectionItem = new CollectionItemApi(httpClient);
        this.character = new CharacterApi(httpClient);
        this.channelResource = new ChannelResourceApi(httpClient);
        this.channelAccount = new ChannelAccountApi(httpClient);
        this.aiCategory = new AiCategoryApi(httpClient);
        this.membershipCard = new MembershipCardApi(httpClient);
        this.cardTemplate = new CardTemplateApi(httpClient);
        this.attribute = new AttributeApi(httpClient);
        this.aiArticle = new AiArticleApi(httpClient);
        this.application = new ApplicationApi(httpClient);
        this.apiKey = new ApiKeyApi(httpClient);
        this.aiAgent = new AiAgentApi(httpClient);
        this.aiAgentToolRelationship = new AiAgentToolRelationshipApi(httpClient);
        this.account = new AccountApi(httpClient);
        this.accountHistory = new AccountHistoryApi(httpClient);
        this.searchChat = new SearchChatApi(httpClient);
        this.pptTemplateRendering = new PptTemplateRenderingApi(httpClient);
        this.pptTemplateChat = new PptTemplateChatApi(httpClient);
        this.knowledgeBaseFile = new KnowledgeBaseFileApi(httpClient);
        this.knowledgeBaseChat = new KnowledgeBaseChatApi(httpClient);
        this.imMessage = new ImMessageApi(httpClient);
        this.aiVoiceSpeakerGeneration = new AiVoiceSpeakerGenerationApi(httpClient);
        this.aiVideoGeneration = new AiVideoGenerationApi(httpClient);
        this.aiMusicGeneration = new AiMusicGenerationApi(httpClient);
        this.aiImageGeneration = new AiImageGenerationApi(httpClient);
        this.aiCharacterGeneration = new AiCharacterGenerationApi(httpClient);
        this.aiAudioGeneration = new AiAudioGenerationApi(httpClient);
        this.aiAudioEffectGeneration = new AiAudioEffectGenerationApi(httpClient);
        this.aiChat = new AiChatApi(httpClient);
        this.verification = new VerificationApi(httpClient);
        this.oauthAuthentication = new OauthAuthenticationApi(httpClient);
        this.authorization = new AuthorizationApi(httpClient);
        this.authentication = new AuthenticationApi(httpClient);
        this.app = new AppApi(httpClient);
        this.aiAgentChat = new AiAgentChatApi(httpClient);
    }

    public WorkspaceApi getWorkspace() {
        return this.workspace;
    }

    public ContentVoteApi getContentVote() {
        return this.contentVote;
    }

    public VoiceSpeakerApi getVoiceSpeaker() {
        return this.voiceSpeaker;
    }

    public VisitHistoryApi getVisitHistory() {
        return this.visitHistory;
    }

    public VipUserApi getVipUser() {
        return this.vipUser;
    }

    public VipRechargeApi getVipRecharge() {
        return this.vipRecharge;
    }

    public VipRechargePackageApi getVipRechargePackage() {
        return this.vipRechargePackage;
    }

    public VipPointChangeApi getVipPointChange() {
        return this.vipPointChange;
    }

    public VipPackageGroupApi getVipPackageGroup() {
        return this.vipPackageGroup;
    }

    public VipPackageApi getVipPackage() {
        return this.vipPackage;
    }

    public VipLevelApi getVipLevel() {
        return this.vipLevel;
    }

    public VipLevelBenefitApi getVipLevelBenefit() {
        return this.vipLevelBenefit;
    }

    public VipBenefitApi getVipBenefit() {
        return this.vipBenefit;
    }

    public VipBenefitUsageApi getVipBenefitUsage() {
        return this.vipBenefitUsage;
    }

    public VideoApi getVideo() {
        return this.video;
    }

    public UserApi getUser() {
        return this.user;
    }

    public UserOauthAccountApi getUserOauthAccount() {
        return this.userOauthAccount;
    }

    public UserCouponApi getUserCoupon() {
        return this.userCoupon;
    }

    public UserCardApi getUserCard() {
        return this.userCard;
    }

    public UserAddressApi getUserAddress() {
        return this.userAddress;
    }

    public AiUsageRecordApi getAiUsageRecord() {
        return this.aiUsageRecord;
    }

    public ShoppingCartApi getShoppingCart() {
        return this.shoppingCart;
    }

    public ShoppingCartItemApi getShoppingCartItem() {
        return this.shoppingCartItem;
    }

    public RefundApi getRefund() {
        return this.refund;
    }

    public PaymentApi getPayment() {
        return this.payment;
    }

    public OrderApi getOrder() {
        return this.order;
    }

    public OrderItemApi getOrderItem() {
        return this.orderItem;
    }

    public AiToolApi getAiTool() {
        return this.aiTool;
    }

    public TenantApi getTenant() {
        return this.tenant;
    }

    public DatabaseTableApi getDatabaseTable() {
        return this.databaseTable;
    }

    public ProductSkuApi getProductSku() {
        return this.productSku;
    }

    public ShortUrlApi getShortUrl() {
        return this.shortUrl;
    }

    public ShopApi getShop() {
        return this.shop;
    }

    public ShareApi getShare() {
        return this.share;
    }

    public ShareVisitRecordApi getShareVisitRecord() {
        return this.shareVisitRecord;
    }

    public ShardingKeyApi getShardingKey() {
        return this.shardingKey;
    }

    public SchemaApi getSchema() {
        return this.schema;
    }

    public RbacRoleApi getRbacRole() {
        return this.rbacRole;
    }

    public RolePermissionApi getRolePermission() {
        return this.rolePermission;
    }

    public InvocationRecordApi getInvocationRecord() {
        return this.invocationRecord;
    }

    public RbacUserRoleApi getRbacUserRole() {
        return this.rbacUserRole;
    }

    public AiPromptApi getAiPrompt() {
        return this.aiPrompt;
    }

    public ProjectApi getProject() {
        return this.project;
    }

    public ProductApi getProduct() {
        return this.product;
    }

    public PptTemplateApi getPptTemplate() {
        return this.pptTemplate;
    }

    public PptTemplateSlideApi getPptTemplateSlide() {
        return this.pptTemplateSlide;
    }

    public PartnerApi getPartner() {
        return this.partner;
    }

    public ChatParticipantApi getChatParticipant() {
        return this.chatParticipant;
    }

    public OssBucketApi getOssBucket() {
        return this.ossBucket;
    }

    public OrganizationApi getOrganization() {
        return this.organization;
    }

    public PositionApi getPosition() {
        return this.position;
    }

    public MemberRelationsApi getMemberRelations() {
        return this.memberRelations;
    }

    public OrganizationMemberApi getOrganizationMember() {
        return this.organizationMember;
    }

    public NotificationApi getNotification() {
        return this.notification;
    }

    public NotesApi getNotes() {
        return this.notes;
    }

    public NewsApi getNews() {
        return this.news;
    }

    public HostApi getHost() {
        return this.host;
    }

    public DnsRecordApi getDnsRecord() {
        return this.dnsRecord;
    }

    public MusicApi getMusic() {
        return this.music;
    }

    public AiModelInformationApi getAiModelInformation() {
        return this.aiModelInformation;
    }

    public AiModelPriceApi getAiModelPrice() {
        return this.aiModelPrice;
    }

    public ChatMessageApi getChatMessage() {
        return this.chatMessage;
    }

    public MemberLevelApi getMemberLevel() {
        return this.memberLevel;
    }

    public MemberCardApi getMemberCard() {
        return this.memberCard;
    }

    public KnowledgeBaseApi getKnowledgeBase() {
        return this.knowledgeBase;
    }

    public InvitationRelationApi getInvitationRelation() {
        return this.invitationRelation;
    }

    public InvitationCodeApi getInvitationCode() {
        return this.invitationCode;
    }

    public ImageApi getImage() {
        return this.image;
    }

    public ChatGroupApi getChatGroup() {
        return this.chatGroup;
    }

    public AiGenerationApi getAiGeneration() {
        return this.aiGeneration;
    }

    public AiGenerationContentApi getAiGenerationContent() {
        return this.aiGenerationContent;
    }

    public FileApi getFile() {
        return this.file;
    }

    public FilePartApi getFilePart() {
        return this.filePart;
    }

    public FileContentApi getFileContent() {
        return this.fileContent;
    }

    public FeedsApi getFeeds() {
        return this.feeds;
    }

    public FeedbackApi getFeedback() {
        return this.feedback;
    }

    public FavoriteApi getFavorite() {
        return this.favorite;
    }

    public FileDiskApi getFileDisk() {
        return this.fileDisk;
    }

    public DiskMemberApi getDiskMember() {
        return this.diskMember;
    }

    public DetailApi getDetail() {
        return this.detail;
    }

    public DepartmentApi getDepartment() {
        return this.department;
    }

    public DatasourceApi getDatasource() {
        return this.datasource;
    }

    public CouponApi getCoupon() {
        return this.coupon;
    }

    public CouponTemplateApi getCouponTemplate() {
        return this.couponTemplate;
    }

    public AiConversationApi getAiConversation() {
        return this.aiConversation;
    }

    public CommentApi getComment() {
        return this.comment;
    }

    public ColumnApi getColumn() {
        return this.column;
    }

    public CollectionApi getCollection() {
        return this.collection;
    }

    public CollectionItemApi getCollectionItem() {
        return this.collectionItem;
    }

    public CharacterApi getCharacter() {
        return this.character;
    }

    public ChannelResourceApi getChannelResource() {
        return this.channelResource;
    }

    public ChannelAccountApi getChannelAccount() {
        return this.channelAccount;
    }

    public AiCategoryApi getAiCategory() {
        return this.aiCategory;
    }

    public MembershipCardApi getMembershipCard() {
        return this.membershipCard;
    }

    public CardTemplateApi getCardTemplate() {
        return this.cardTemplate;
    }

    public AttributeApi getAttribute() {
        return this.attribute;
    }

    public AiArticleApi getAiArticle() {
        return this.aiArticle;
    }

    public ApplicationApi getApplication() {
        return this.application;
    }

    public ApiKeyApi getApiKey() {
        return this.apiKey;
    }

    public AiAgentApi getAiAgent() {
        return this.aiAgent;
    }

    public AiAgentToolRelationshipApi getAiAgentToolRelationship() {
        return this.aiAgentToolRelationship;
    }

    public AccountApi getAccount() {
        return this.account;
    }

    public AccountHistoryApi getAccountHistory() {
        return this.accountHistory;
    }

    public SearchChatApi getSearchChat() {
        return this.searchChat;
    }

    public PptTemplateRenderingApi getPptTemplateRendering() {
        return this.pptTemplateRendering;
    }

    public PptTemplateChatApi getPptTemplateChat() {
        return this.pptTemplateChat;
    }

    public KnowledgeBaseFileApi getKnowledgeBaseFile() {
        return this.knowledgeBaseFile;
    }

    public KnowledgeBaseChatApi getKnowledgeBaseChat() {
        return this.knowledgeBaseChat;
    }

    public ImMessageApi getImMessage() {
        return this.imMessage;
    }

    public AiVoiceSpeakerGenerationApi getAiVoiceSpeakerGeneration() {
        return this.aiVoiceSpeakerGeneration;
    }

    public AiVideoGenerationApi getAiVideoGeneration() {
        return this.aiVideoGeneration;
    }

    public AiMusicGenerationApi getAiMusicGeneration() {
        return this.aiMusicGeneration;
    }

    public AiImageGenerationApi getAiImageGeneration() {
        return this.aiImageGeneration;
    }

    public AiCharacterGenerationApi getAiCharacterGeneration() {
        return this.aiCharacterGeneration;
    }

    public AiAudioGenerationApi getAiAudioGeneration() {
        return this.aiAudioGeneration;
    }

    public AiAudioEffectGenerationApi getAiAudioEffectGeneration() {
        return this.aiAudioEffectGeneration;
    }

    public AiChatApi getAiChat() {
        return this.aiChat;
    }

    public VerificationApi getVerification() {
        return this.verification;
    }

    public OauthAuthenticationApi getOauthAuthentication() {
        return this.oauthAuthentication;
    }

    public AuthorizationApi getAuthorization() {
        return this.authorization;
    }

    public AuthenticationApi getAuthentication() {
        return this.authentication;
    }

    public AppApi getApp() {
        return this.app;
    }

    public AiAgentChatApi getAiAgentChat() {
        return this.aiAgentChat;
    }

    public SdkworkBackendClient setApiKey(String apiKey) {
        httpClient.setApiKey(apiKey);
        return this;
    }

    public SdkworkBackendClient setAuthToken(String token) {
        httpClient.setAuthToken(token);
        return this;
    }

    public SdkworkBackendClient setAccessToken(String token) {
        httpClient.setAccessToken(token);
        return this;
    }

    public SdkworkBackendClient setHeader(String key, String value) {
        httpClient.setHeader(key, value);
        return this;
    }

    public HttpClient getHttpClient() {
        return httpClient;
    }
}
