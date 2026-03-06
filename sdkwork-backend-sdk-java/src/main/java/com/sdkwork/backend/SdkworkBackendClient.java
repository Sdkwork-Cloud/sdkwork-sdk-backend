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
import com.sdkwork.backend.api.UsageRecordApi;
import com.sdkwork.backend.api.ShoppingCartApi;
import com.sdkwork.backend.api.ShoppingCartItemApi;
import com.sdkwork.backend.api.RefundApi;
import com.sdkwork.backend.api.PaymentApi;
import com.sdkwork.backend.api.OrderApi;
import com.sdkwork.backend.api.OrderItemApi;
import com.sdkwork.backend.api.ToolApi;
import com.sdkwork.backend.api.TenantApi;
import com.sdkwork.backend.api.DatabaseTableApi;
import com.sdkwork.backend.api.ProductSkuApi;
import com.sdkwork.backend.api.SkillApi;
import com.sdkwork.backend.api.SkillPackageApi;
import com.sdkwork.backend.api.ShortUrlApi;
import com.sdkwork.backend.api.ShopApi;
import com.sdkwork.backend.api.ShareApi;
import com.sdkwork.backend.api.ShareVisitRecordApi;
import com.sdkwork.backend.api.ShardingKeyApi;
import com.sdkwork.backend.api.ApiSecurityPolicyApi;
import com.sdkwork.backend.api.SchemaApi;
import com.sdkwork.backend.api.RbacRoleApi;
import com.sdkwork.backend.api.RolePermissionApi;
import com.sdkwork.backend.api.InvocationRecordApi;
import com.sdkwork.backend.api.RbacUserRoleApi;
import com.sdkwork.backend.api.PromptApi;
import com.sdkwork.backend.api.ProjectApi;
import com.sdkwork.backend.api.ProductApi;
import com.sdkwork.backend.api.PptTemplateApi;
import com.sdkwork.backend.api.PptTemplateSlideApi;
import com.sdkwork.backend.api.RbacPermissionApi;
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
import com.sdkwork.backend.api.NetApi;
import com.sdkwork.backend.api.DnsRecordApi;
import com.sdkwork.backend.api.MusicApi;
import com.sdkwork.backend.api.ModelInformationApi;
import com.sdkwork.backend.api.ModelPriceApi;
import com.sdkwork.backend.api.ChatMessageApi;
import com.sdkwork.backend.api.MemberLevelApi;
import com.sdkwork.backend.api.MemberCardApi;
import com.sdkwork.backend.api.KnowledgeBaseApi;
import com.sdkwork.backend.api.InvitationRelationApi;
import com.sdkwork.backend.api.InvitationCodeApi;
import com.sdkwork.backend.api.ImageApi;
import com.sdkwork.backend.api.ChatGroupApi;
import com.sdkwork.backend.api.GenerationApi;
import com.sdkwork.backend.api.GenerationContentApi;
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
import com.sdkwork.backend.api.ConversationApi;
import com.sdkwork.backend.api.ContentWritingApi;
import com.sdkwork.backend.api.CommentApi;
import com.sdkwork.backend.api.ColumnApi;
import com.sdkwork.backend.api.CollectionApi;
import com.sdkwork.backend.api.CollectionItemApi;
import com.sdkwork.backend.api.CharacterApi;
import com.sdkwork.backend.api.ChannelApi;
import com.sdkwork.backend.api.ChannelResourceApi;
import com.sdkwork.backend.api.ChannelProxyApi;
import com.sdkwork.backend.api.ChannelAccountApi;
import com.sdkwork.backend.api.CategoryApi;
import com.sdkwork.backend.api.MembershipCardApi;
import com.sdkwork.backend.api.CardTemplateApi;
import com.sdkwork.backend.api.AttributeApi;
import com.sdkwork.backend.api.ArticleApi;
import com.sdkwork.backend.api.AppApi;
import com.sdkwork.backend.api.ApiKeyApi;
import com.sdkwork.backend.api.AgentApi;
import com.sdkwork.backend.api.AgentToolRelationshipApi;
import com.sdkwork.backend.api.AccountApi;
import com.sdkwork.backend.api.AccountHistoryApi;
import com.sdkwork.backend.api.AccountExchangeConfigApi;
import com.sdkwork.backend.api.InvoiceApi;
import com.sdkwork.backend.api.SearchChatApi;
import com.sdkwork.backend.api.PptTemplateRenderingApi;
import com.sdkwork.backend.api.PptTemplateChatApi;
import com.sdkwork.backend.api.KnowledgeBaseFileApi;
import com.sdkwork.backend.api.KnowledgeBaseChatApi;
import com.sdkwork.backend.api.ImMessageApi;
import com.sdkwork.backend.api.VoiceSpeakerGenerationApi;
import com.sdkwork.backend.api.VideoGenerationApi;
import com.sdkwork.backend.api.MusicGenerationApi;
import com.sdkwork.backend.api.ImageGenerationApi;
import com.sdkwork.backend.api.CharacterGenerationApi;
import com.sdkwork.backend.api.AudioGenerationApi;
import com.sdkwork.backend.api.AudioEffectGenerationApi;
import com.sdkwork.backend.api.ChatApi;
import com.sdkwork.backend.api.AuthApi;
import com.sdkwork.backend.api.AgentChatApi;

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
    private UsageRecordApi usageRecord;
    private ShoppingCartApi shoppingCart;
    private ShoppingCartItemApi shoppingCartItem;
    private RefundApi refund;
    private PaymentApi payment;
    private OrderApi order;
    private OrderItemApi orderItem;
    private ToolApi tool;
    private TenantApi tenant;
    private DatabaseTableApi databaseTable;
    private ProductSkuApi productSku;
    private SkillApi skill;
    private SkillPackageApi skillPackage;
    private ShortUrlApi shortUrl;
    private ShopApi shop;
    private ShareApi share;
    private ShareVisitRecordApi shareVisitRecord;
    private ShardingKeyApi shardingKey;
    private ApiSecurityPolicyApi apiSecurityPolicy;
    private SchemaApi schema;
    private RbacRoleApi rbacRole;
    private RolePermissionApi rolePermission;
    private InvocationRecordApi invocationRecord;
    private RbacUserRoleApi rbacUserRole;
    private PromptApi prompt;
    private ProjectApi project;
    private ProductApi product;
    private PptTemplateApi pptTemplate;
    private PptTemplateSlideApi pptTemplateSlide;
    private RbacPermissionApi rbacPermission;
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
    private NetApi net;
    private DnsRecordApi dnsRecord;
    private MusicApi music;
    private ModelInformationApi modelInformation;
    private ModelPriceApi modelPrice;
    private ChatMessageApi chatMessage;
    private MemberLevelApi memberLevel;
    private MemberCardApi memberCard;
    private KnowledgeBaseApi knowledgeBase;
    private InvitationRelationApi invitationRelation;
    private InvitationCodeApi invitationCode;
    private ImageApi image;
    private ChatGroupApi chatGroup;
    private GenerationApi generation;
    private GenerationContentApi generationContent;
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
    private ConversationApi conversation;
    private ContentWritingApi contentWriting;
    private CommentApi comment;
    private ColumnApi column;
    private CollectionApi collection;
    private CollectionItemApi collectionItem;
    private CharacterApi character;
    private ChannelApi channel;
    private ChannelResourceApi channelResource;
    private ChannelProxyApi channelProxy;
    private ChannelAccountApi channelAccount;
    private CategoryApi category;
    private MembershipCardApi membershipCard;
    private CardTemplateApi cardTemplate;
    private AttributeApi attribute;
    private ArticleApi article;
    private AppApi app;
    private ApiKeyApi apiKey;
    private AgentApi agent;
    private AgentToolRelationshipApi agentToolRelationship;
    private AccountApi account;
    private AccountHistoryApi accountHistory;
    private AccountExchangeConfigApi accountExchangeConfig;
    private InvoiceApi invoice;
    private SearchChatApi searchChat;
    private PptTemplateRenderingApi pptTemplateRendering;
    private PptTemplateChatApi pptTemplateChat;
    private KnowledgeBaseFileApi knowledgeBaseFile;
    private KnowledgeBaseChatApi knowledgeBaseChat;
    private ImMessageApi imMessage;
    private VoiceSpeakerGenerationApi voiceSpeakerGeneration;
    private VideoGenerationApi videoGeneration;
    private MusicGenerationApi musicGeneration;
    private ImageGenerationApi imageGeneration;
    private CharacterGenerationApi characterGeneration;
    private AudioGenerationApi audioGeneration;
    private AudioEffectGenerationApi audioEffectGeneration;
    private ChatApi chat;
    private AuthApi auth;
    private AgentChatApi agentChat;

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
        this.usageRecord = new UsageRecordApi(httpClient);
        this.shoppingCart = new ShoppingCartApi(httpClient);
        this.shoppingCartItem = new ShoppingCartItemApi(httpClient);
        this.refund = new RefundApi(httpClient);
        this.payment = new PaymentApi(httpClient);
        this.order = new OrderApi(httpClient);
        this.orderItem = new OrderItemApi(httpClient);
        this.tool = new ToolApi(httpClient);
        this.tenant = new TenantApi(httpClient);
        this.databaseTable = new DatabaseTableApi(httpClient);
        this.productSku = new ProductSkuApi(httpClient);
        this.skill = new SkillApi(httpClient);
        this.skillPackage = new SkillPackageApi(httpClient);
        this.shortUrl = new ShortUrlApi(httpClient);
        this.shop = new ShopApi(httpClient);
        this.share = new ShareApi(httpClient);
        this.shareVisitRecord = new ShareVisitRecordApi(httpClient);
        this.shardingKey = new ShardingKeyApi(httpClient);
        this.apiSecurityPolicy = new ApiSecurityPolicyApi(httpClient);
        this.schema = new SchemaApi(httpClient);
        this.rbacRole = new RbacRoleApi(httpClient);
        this.rolePermission = new RolePermissionApi(httpClient);
        this.invocationRecord = new InvocationRecordApi(httpClient);
        this.rbacUserRole = new RbacUserRoleApi(httpClient);
        this.prompt = new PromptApi(httpClient);
        this.project = new ProjectApi(httpClient);
        this.product = new ProductApi(httpClient);
        this.pptTemplate = new PptTemplateApi(httpClient);
        this.pptTemplateSlide = new PptTemplateSlideApi(httpClient);
        this.rbacPermission = new RbacPermissionApi(httpClient);
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
        this.net = new NetApi(httpClient);
        this.dnsRecord = new DnsRecordApi(httpClient);
        this.music = new MusicApi(httpClient);
        this.modelInformation = new ModelInformationApi(httpClient);
        this.modelPrice = new ModelPriceApi(httpClient);
        this.chatMessage = new ChatMessageApi(httpClient);
        this.memberLevel = new MemberLevelApi(httpClient);
        this.memberCard = new MemberCardApi(httpClient);
        this.knowledgeBase = new KnowledgeBaseApi(httpClient);
        this.invitationRelation = new InvitationRelationApi(httpClient);
        this.invitationCode = new InvitationCodeApi(httpClient);
        this.image = new ImageApi(httpClient);
        this.chatGroup = new ChatGroupApi(httpClient);
        this.generation = new GenerationApi(httpClient);
        this.generationContent = new GenerationContentApi(httpClient);
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
        this.conversation = new ConversationApi(httpClient);
        this.contentWriting = new ContentWritingApi(httpClient);
        this.comment = new CommentApi(httpClient);
        this.column = new ColumnApi(httpClient);
        this.collection = new CollectionApi(httpClient);
        this.collectionItem = new CollectionItemApi(httpClient);
        this.character = new CharacterApi(httpClient);
        this.channel = new ChannelApi(httpClient);
        this.channelResource = new ChannelResourceApi(httpClient);
        this.channelProxy = new ChannelProxyApi(httpClient);
        this.channelAccount = new ChannelAccountApi(httpClient);
        this.category = new CategoryApi(httpClient);
        this.membershipCard = new MembershipCardApi(httpClient);
        this.cardTemplate = new CardTemplateApi(httpClient);
        this.attribute = new AttributeApi(httpClient);
        this.article = new ArticleApi(httpClient);
        this.app = new AppApi(httpClient);
        this.apiKey = new ApiKeyApi(httpClient);
        this.agent = new AgentApi(httpClient);
        this.agentToolRelationship = new AgentToolRelationshipApi(httpClient);
        this.account = new AccountApi(httpClient);
        this.accountHistory = new AccountHistoryApi(httpClient);
        this.accountExchangeConfig = new AccountExchangeConfigApi(httpClient);
        this.invoice = new InvoiceApi(httpClient);
        this.searchChat = new SearchChatApi(httpClient);
        this.pptTemplateRendering = new PptTemplateRenderingApi(httpClient);
        this.pptTemplateChat = new PptTemplateChatApi(httpClient);
        this.knowledgeBaseFile = new KnowledgeBaseFileApi(httpClient);
        this.knowledgeBaseChat = new KnowledgeBaseChatApi(httpClient);
        this.imMessage = new ImMessageApi(httpClient);
        this.voiceSpeakerGeneration = new VoiceSpeakerGenerationApi(httpClient);
        this.videoGeneration = new VideoGenerationApi(httpClient);
        this.musicGeneration = new MusicGenerationApi(httpClient);
        this.imageGeneration = new ImageGenerationApi(httpClient);
        this.characterGeneration = new CharacterGenerationApi(httpClient);
        this.audioGeneration = new AudioGenerationApi(httpClient);
        this.audioEffectGeneration = new AudioEffectGenerationApi(httpClient);
        this.chat = new ChatApi(httpClient);
        this.auth = new AuthApi(httpClient);
        this.agentChat = new AgentChatApi(httpClient);
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
        this.usageRecord = new UsageRecordApi(httpClient);
        this.shoppingCart = new ShoppingCartApi(httpClient);
        this.shoppingCartItem = new ShoppingCartItemApi(httpClient);
        this.refund = new RefundApi(httpClient);
        this.payment = new PaymentApi(httpClient);
        this.order = new OrderApi(httpClient);
        this.orderItem = new OrderItemApi(httpClient);
        this.tool = new ToolApi(httpClient);
        this.tenant = new TenantApi(httpClient);
        this.databaseTable = new DatabaseTableApi(httpClient);
        this.productSku = new ProductSkuApi(httpClient);
        this.skill = new SkillApi(httpClient);
        this.skillPackage = new SkillPackageApi(httpClient);
        this.shortUrl = new ShortUrlApi(httpClient);
        this.shop = new ShopApi(httpClient);
        this.share = new ShareApi(httpClient);
        this.shareVisitRecord = new ShareVisitRecordApi(httpClient);
        this.shardingKey = new ShardingKeyApi(httpClient);
        this.apiSecurityPolicy = new ApiSecurityPolicyApi(httpClient);
        this.schema = new SchemaApi(httpClient);
        this.rbacRole = new RbacRoleApi(httpClient);
        this.rolePermission = new RolePermissionApi(httpClient);
        this.invocationRecord = new InvocationRecordApi(httpClient);
        this.rbacUserRole = new RbacUserRoleApi(httpClient);
        this.prompt = new PromptApi(httpClient);
        this.project = new ProjectApi(httpClient);
        this.product = new ProductApi(httpClient);
        this.pptTemplate = new PptTemplateApi(httpClient);
        this.pptTemplateSlide = new PptTemplateSlideApi(httpClient);
        this.rbacPermission = new RbacPermissionApi(httpClient);
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
        this.net = new NetApi(httpClient);
        this.dnsRecord = new DnsRecordApi(httpClient);
        this.music = new MusicApi(httpClient);
        this.modelInformation = new ModelInformationApi(httpClient);
        this.modelPrice = new ModelPriceApi(httpClient);
        this.chatMessage = new ChatMessageApi(httpClient);
        this.memberLevel = new MemberLevelApi(httpClient);
        this.memberCard = new MemberCardApi(httpClient);
        this.knowledgeBase = new KnowledgeBaseApi(httpClient);
        this.invitationRelation = new InvitationRelationApi(httpClient);
        this.invitationCode = new InvitationCodeApi(httpClient);
        this.image = new ImageApi(httpClient);
        this.chatGroup = new ChatGroupApi(httpClient);
        this.generation = new GenerationApi(httpClient);
        this.generationContent = new GenerationContentApi(httpClient);
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
        this.conversation = new ConversationApi(httpClient);
        this.contentWriting = new ContentWritingApi(httpClient);
        this.comment = new CommentApi(httpClient);
        this.column = new ColumnApi(httpClient);
        this.collection = new CollectionApi(httpClient);
        this.collectionItem = new CollectionItemApi(httpClient);
        this.character = new CharacterApi(httpClient);
        this.channel = new ChannelApi(httpClient);
        this.channelResource = new ChannelResourceApi(httpClient);
        this.channelProxy = new ChannelProxyApi(httpClient);
        this.channelAccount = new ChannelAccountApi(httpClient);
        this.category = new CategoryApi(httpClient);
        this.membershipCard = new MembershipCardApi(httpClient);
        this.cardTemplate = new CardTemplateApi(httpClient);
        this.attribute = new AttributeApi(httpClient);
        this.article = new ArticleApi(httpClient);
        this.app = new AppApi(httpClient);
        this.apiKey = new ApiKeyApi(httpClient);
        this.agent = new AgentApi(httpClient);
        this.agentToolRelationship = new AgentToolRelationshipApi(httpClient);
        this.account = new AccountApi(httpClient);
        this.accountHistory = new AccountHistoryApi(httpClient);
        this.accountExchangeConfig = new AccountExchangeConfigApi(httpClient);
        this.invoice = new InvoiceApi(httpClient);
        this.searchChat = new SearchChatApi(httpClient);
        this.pptTemplateRendering = new PptTemplateRenderingApi(httpClient);
        this.pptTemplateChat = new PptTemplateChatApi(httpClient);
        this.knowledgeBaseFile = new KnowledgeBaseFileApi(httpClient);
        this.knowledgeBaseChat = new KnowledgeBaseChatApi(httpClient);
        this.imMessage = new ImMessageApi(httpClient);
        this.voiceSpeakerGeneration = new VoiceSpeakerGenerationApi(httpClient);
        this.videoGeneration = new VideoGenerationApi(httpClient);
        this.musicGeneration = new MusicGenerationApi(httpClient);
        this.imageGeneration = new ImageGenerationApi(httpClient);
        this.characterGeneration = new CharacterGenerationApi(httpClient);
        this.audioGeneration = new AudioGenerationApi(httpClient);
        this.audioEffectGeneration = new AudioEffectGenerationApi(httpClient);
        this.chat = new ChatApi(httpClient);
        this.auth = new AuthApi(httpClient);
        this.agentChat = new AgentChatApi(httpClient);
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

    public UsageRecordApi getUsageRecord() {
        return this.usageRecord;
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

    public ToolApi getTool() {
        return this.tool;
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

    public SkillApi getSkill() {
        return this.skill;
    }

    public SkillPackageApi getSkillPackage() {
        return this.skillPackage;
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

    public ApiSecurityPolicyApi getApiSecurityPolicy() {
        return this.apiSecurityPolicy;
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

    public PromptApi getPrompt() {
        return this.prompt;
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

    public RbacPermissionApi getRbacPermission() {
        return this.rbacPermission;
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

    public NetApi getNet() {
        return this.net;
    }

    public DnsRecordApi getDnsRecord() {
        return this.dnsRecord;
    }

    public MusicApi getMusic() {
        return this.music;
    }

    public ModelInformationApi getModelInformation() {
        return this.modelInformation;
    }

    public ModelPriceApi getModelPrice() {
        return this.modelPrice;
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

    public GenerationApi getGeneration() {
        return this.generation;
    }

    public GenerationContentApi getGenerationContent() {
        return this.generationContent;
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

    public ConversationApi getConversation() {
        return this.conversation;
    }

    public ContentWritingApi getContentWriting() {
        return this.contentWriting;
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

    public ChannelApi getChannel() {
        return this.channel;
    }

    public ChannelResourceApi getChannelResource() {
        return this.channelResource;
    }

    public ChannelProxyApi getChannelProxy() {
        return this.channelProxy;
    }

    public ChannelAccountApi getChannelAccount() {
        return this.channelAccount;
    }

    public CategoryApi getCategory() {
        return this.category;
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

    public ArticleApi getArticle() {
        return this.article;
    }

    public AppApi getApp() {
        return this.app;
    }

    public ApiKeyApi getApiKey() {
        return this.apiKey;
    }

    public AgentApi getAgent() {
        return this.agent;
    }

    public AgentToolRelationshipApi getAgentToolRelationship() {
        return this.agentToolRelationship;
    }

    public AccountApi getAccount() {
        return this.account;
    }

    public AccountHistoryApi getAccountHistory() {
        return this.accountHistory;
    }

    public AccountExchangeConfigApi getAccountExchangeConfig() {
        return this.accountExchangeConfig;
    }

    public InvoiceApi getInvoice() {
        return this.invoice;
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

    public VoiceSpeakerGenerationApi getVoiceSpeakerGeneration() {
        return this.voiceSpeakerGeneration;
    }

    public VideoGenerationApi getVideoGeneration() {
        return this.videoGeneration;
    }

    public MusicGenerationApi getMusicGeneration() {
        return this.musicGeneration;
    }

    public ImageGenerationApi getImageGeneration() {
        return this.imageGeneration;
    }

    public CharacterGenerationApi getCharacterGeneration() {
        return this.characterGeneration;
    }

    public AudioGenerationApi getAudioGeneration() {
        return this.audioGeneration;
    }

    public AudioEffectGenerationApi getAudioEffectGeneration() {
        return this.audioEffectGeneration;
    }

    public ChatApi getChat() {
        return this.chat;
    }

    public AuthApi getAuth() {
        return this.auth;
    }

    public AgentChatApi getAgentChat() {
        return this.agentChat;
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
