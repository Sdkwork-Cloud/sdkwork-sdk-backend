using System;
using Backend.Http;
using SDKwork.Common.Core;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;
using Backend.Api;

namespace Backend
{
    public class SdkworkBackendClient
    {
        private readonly HttpClient _httpClient;

        public WorkspaceApi Workspace { get; }
        public ContentVoteApi ContentVote { get; }
        public VoiceSpeakerApi VoiceSpeaker { get; }
        public VisitHistoryApi VisitHistory { get; }
        public VipUserApi VipUser { get; }
        public VipRechargeApi VipRecharge { get; }
        public VipRechargePackageApi VipRechargePackage { get; }
        public VipPointChangeApi VipPointChange { get; }
        public VipPackageGroupApi VipPackageGroup { get; }
        public VipPackageApi VipPackage { get; }
        public VipLevelApi VipLevel { get; }
        public VipLevelBenefitApi VipLevelBenefit { get; }
        public VipBenefitApi VipBenefit { get; }
        public VipBenefitUsageApi VipBenefitUsage { get; }
        public VideoApi Video { get; }
        public UserApi User { get; }
        public UserOauthAccountApi UserOauthAccount { get; }
        public UserCouponApi UserCoupon { get; }
        public UserCardApi UserCard { get; }
        public UserAddressApi UserAddress { get; }
        public AiUsageRecordApi AiUsageRecord { get; }
        public ShoppingCartApi ShoppingCart { get; }
        public ShoppingCartItemApi ShoppingCartItem { get; }
        public RefundApi Refund { get; }
        public PaymentApi Payment { get; }
        public OrderApi Order { get; }
        public OrderItemApi OrderItem { get; }
        public AiToolApi AiTool { get; }
        public TenantApi Tenant { get; }
        public DatabaseTableApi DatabaseTable { get; }
        public ProductSkuApi ProductSku { get; }
        public ShortUrlApi ShortUrl { get; }
        public ShopApi Shop { get; }
        public ShareApi Share { get; }
        public ShareVisitRecordApi ShareVisitRecord { get; }
        public ShardingKeyApi ShardingKey { get; }
        public SchemaApi Schema { get; }
        public RbacRoleApi RbacRole { get; }
        public RolePermissionApi RolePermission { get; }
        public InvocationRecordApi InvocationRecord { get; }
        public RbacUserRoleApi RbacUserRole { get; }
        public AiPromptApi AiPrompt { get; }
        public ProjectApi Project { get; }
        public ProductApi Product { get; }
        public PptTemplateApi PptTemplate { get; }
        public PptTemplateSlideApi PptTemplateSlide { get; }
        public PartnerApi Partner { get; }
        public ChatParticipantApi ChatParticipant { get; }
        public OssBucketApi OssBucket { get; }
        public OrganizationApi Organization { get; }
        public PositionApi Position { get; }
        public MemberRelationsApi MemberRelations { get; }
        public OrganizationMemberApi OrganizationMember { get; }
        public NotificationApi Notification { get; }
        public NotesApi Notes { get; }
        public NewsApi News { get; }
        public HostApi Host { get; }
        public DnsRecordApi DnsRecord { get; }
        public MusicApi Music { get; }
        public AiModelInformationApi AiModelInformation { get; }
        public AiModelPriceApi AiModelPrice { get; }
        public ChatMessageApi ChatMessage { get; }
        public MemberLevelApi MemberLevel { get; }
        public MemberCardApi MemberCard { get; }
        public KnowledgeBaseApi KnowledgeBase { get; }
        public InvitationRelationApi InvitationRelation { get; }
        public InvitationCodeApi InvitationCode { get; }
        public ImageApi Image { get; }
        public ChatGroupApi ChatGroup { get; }
        public AiGenerationApi AiGeneration { get; }
        public AiGenerationContentApi AiGenerationContent { get; }
        public FileApi File { get; }
        public FilePartApi FilePart { get; }
        public FileContentApi FileContent { get; }
        public FeedsApi Feeds { get; }
        public FeedbackApi Feedback { get; }
        public FavoriteApi Favorite { get; }
        public FileDiskApi FileDisk { get; }
        public DiskMemberApi DiskMember { get; }
        public DetailApi Detail { get; }
        public DepartmentApi Department { get; }
        public DatasourceApi Datasource { get; }
        public CouponApi Coupon { get; }
        public CouponTemplateApi CouponTemplate { get; }
        public AiConversationApi AiConversation { get; }
        public CommentApi Comment { get; }
        public ColumnApi Column { get; }
        public CollectionApi Collection { get; }
        public CollectionItemApi CollectionItem { get; }
        public CharacterApi Character { get; }
        public ChannelResourceApi ChannelResource { get; }
        public ChannelAccountApi ChannelAccount { get; }
        public AiCategoryApi AiCategory { get; }
        public MembershipCardApi MembershipCard { get; }
        public CardTemplateApi CardTemplate { get; }
        public AttributeApi Attribute { get; }
        public AiArticleApi AiArticle { get; }
        public ApplicationApi Application { get; }
        public ApiKeyApi ApiKey { get; }
        public AiAgentApi AiAgent { get; }
        public AiAgentToolRelationshipApi AiAgentToolRelationship { get; }
        public AccountApi Account { get; }
        public AccountHistoryApi AccountHistory { get; }
        public SearchChatApi SearchChat { get; }
        public PptTemplateRenderingApi PptTemplateRendering { get; }
        public PptTemplateChatApi PptTemplateChat { get; }
        public KnowledgeBaseFileApi KnowledgeBaseFile { get; }
        public KnowledgeBaseChatApi KnowledgeBaseChat { get; }
        public ImMessageApi ImMessage { get; }
        public AiVoiceSpeakerGenerationApi AiVoiceSpeakerGeneration { get; }
        public AiVideoGenerationApi AiVideoGeneration { get; }
        public AiMusicGenerationApi AiMusicGeneration { get; }
        public AiImageGenerationApi AiImageGeneration { get; }
        public AiCharacterGenerationApi AiCharacterGeneration { get; }
        public AiAudioGenerationApi AiAudioGeneration { get; }
        public AiAudioEffectGenerationApi AiAudioEffectGeneration { get; }
        public AiChatApi AiChat { get; }
        public VerificationApi Verification { get; }
        public OauthAuthenticationApi OauthAuthentication { get; }
        public AuthorizationApi Authorization { get; }
        public AuthenticationApi Authentication { get; }
        public AppApi App { get; }
        public AiAgentChatApi AiAgentChat { get; }

        public SdkworkBackendClient(string baseUrl)
        {
            _httpClient = new HttpClient(baseUrl);
            Workspace = new WorkspaceApi(_httpClient);
            ContentVote = new ContentVoteApi(_httpClient);
            VoiceSpeaker = new VoiceSpeakerApi(_httpClient);
            VisitHistory = new VisitHistoryApi(_httpClient);
            VipUser = new VipUserApi(_httpClient);
            VipRecharge = new VipRechargeApi(_httpClient);
            VipRechargePackage = new VipRechargePackageApi(_httpClient);
            VipPointChange = new VipPointChangeApi(_httpClient);
            VipPackageGroup = new VipPackageGroupApi(_httpClient);
            VipPackage = new VipPackageApi(_httpClient);
            VipLevel = new VipLevelApi(_httpClient);
            VipLevelBenefit = new VipLevelBenefitApi(_httpClient);
            VipBenefit = new VipBenefitApi(_httpClient);
            VipBenefitUsage = new VipBenefitUsageApi(_httpClient);
            Video = new VideoApi(_httpClient);
            User = new UserApi(_httpClient);
            UserOauthAccount = new UserOauthAccountApi(_httpClient);
            UserCoupon = new UserCouponApi(_httpClient);
            UserCard = new UserCardApi(_httpClient);
            UserAddress = new UserAddressApi(_httpClient);
            AiUsageRecord = new AiUsageRecordApi(_httpClient);
            ShoppingCart = new ShoppingCartApi(_httpClient);
            ShoppingCartItem = new ShoppingCartItemApi(_httpClient);
            Refund = new RefundApi(_httpClient);
            Payment = new PaymentApi(_httpClient);
            Order = new OrderApi(_httpClient);
            OrderItem = new OrderItemApi(_httpClient);
            AiTool = new AiToolApi(_httpClient);
            Tenant = new TenantApi(_httpClient);
            DatabaseTable = new DatabaseTableApi(_httpClient);
            ProductSku = new ProductSkuApi(_httpClient);
            ShortUrl = new ShortUrlApi(_httpClient);
            Shop = new ShopApi(_httpClient);
            Share = new ShareApi(_httpClient);
            ShareVisitRecord = new ShareVisitRecordApi(_httpClient);
            ShardingKey = new ShardingKeyApi(_httpClient);
            Schema = new SchemaApi(_httpClient);
            RbacRole = new RbacRoleApi(_httpClient);
            RolePermission = new RolePermissionApi(_httpClient);
            InvocationRecord = new InvocationRecordApi(_httpClient);
            RbacUserRole = new RbacUserRoleApi(_httpClient);
            AiPrompt = new AiPromptApi(_httpClient);
            Project = new ProjectApi(_httpClient);
            Product = new ProductApi(_httpClient);
            PptTemplate = new PptTemplateApi(_httpClient);
            PptTemplateSlide = new PptTemplateSlideApi(_httpClient);
            Partner = new PartnerApi(_httpClient);
            ChatParticipant = new ChatParticipantApi(_httpClient);
            OssBucket = new OssBucketApi(_httpClient);
            Organization = new OrganizationApi(_httpClient);
            Position = new PositionApi(_httpClient);
            MemberRelations = new MemberRelationsApi(_httpClient);
            OrganizationMember = new OrganizationMemberApi(_httpClient);
            Notification = new NotificationApi(_httpClient);
            Notes = new NotesApi(_httpClient);
            News = new NewsApi(_httpClient);
            Host = new HostApi(_httpClient);
            DnsRecord = new DnsRecordApi(_httpClient);
            Music = new MusicApi(_httpClient);
            AiModelInformation = new AiModelInformationApi(_httpClient);
            AiModelPrice = new AiModelPriceApi(_httpClient);
            ChatMessage = new ChatMessageApi(_httpClient);
            MemberLevel = new MemberLevelApi(_httpClient);
            MemberCard = new MemberCardApi(_httpClient);
            KnowledgeBase = new KnowledgeBaseApi(_httpClient);
            InvitationRelation = new InvitationRelationApi(_httpClient);
            InvitationCode = new InvitationCodeApi(_httpClient);
            Image = new ImageApi(_httpClient);
            ChatGroup = new ChatGroupApi(_httpClient);
            AiGeneration = new AiGenerationApi(_httpClient);
            AiGenerationContent = new AiGenerationContentApi(_httpClient);
            File = new FileApi(_httpClient);
            FilePart = new FilePartApi(_httpClient);
            FileContent = new FileContentApi(_httpClient);
            Feeds = new FeedsApi(_httpClient);
            Feedback = new FeedbackApi(_httpClient);
            Favorite = new FavoriteApi(_httpClient);
            FileDisk = new FileDiskApi(_httpClient);
            DiskMember = new DiskMemberApi(_httpClient);
            Detail = new DetailApi(_httpClient);
            Department = new DepartmentApi(_httpClient);
            Datasource = new DatasourceApi(_httpClient);
            Coupon = new CouponApi(_httpClient);
            CouponTemplate = new CouponTemplateApi(_httpClient);
            AiConversation = new AiConversationApi(_httpClient);
            Comment = new CommentApi(_httpClient);
            Column = new ColumnApi(_httpClient);
            Collection = new CollectionApi(_httpClient);
            CollectionItem = new CollectionItemApi(_httpClient);
            Character = new CharacterApi(_httpClient);
            ChannelResource = new ChannelResourceApi(_httpClient);
            ChannelAccount = new ChannelAccountApi(_httpClient);
            AiCategory = new AiCategoryApi(_httpClient);
            MembershipCard = new MembershipCardApi(_httpClient);
            CardTemplate = new CardTemplateApi(_httpClient);
            Attribute = new AttributeApi(_httpClient);
            AiArticle = new AiArticleApi(_httpClient);
            Application = new ApplicationApi(_httpClient);
            ApiKey = new ApiKeyApi(_httpClient);
            AiAgent = new AiAgentApi(_httpClient);
            AiAgentToolRelationship = new AiAgentToolRelationshipApi(_httpClient);
            Account = new AccountApi(_httpClient);
            AccountHistory = new AccountHistoryApi(_httpClient);
            SearchChat = new SearchChatApi(_httpClient);
            PptTemplateRendering = new PptTemplateRenderingApi(_httpClient);
            PptTemplateChat = new PptTemplateChatApi(_httpClient);
            KnowledgeBaseFile = new KnowledgeBaseFileApi(_httpClient);
            KnowledgeBaseChat = new KnowledgeBaseChatApi(_httpClient);
            ImMessage = new ImMessageApi(_httpClient);
            AiVoiceSpeakerGeneration = new AiVoiceSpeakerGenerationApi(_httpClient);
            AiVideoGeneration = new AiVideoGenerationApi(_httpClient);
            AiMusicGeneration = new AiMusicGenerationApi(_httpClient);
            AiImageGeneration = new AiImageGenerationApi(_httpClient);
            AiCharacterGeneration = new AiCharacterGenerationApi(_httpClient);
            AiAudioGeneration = new AiAudioGenerationApi(_httpClient);
            AiAudioEffectGeneration = new AiAudioEffectGenerationApi(_httpClient);
            AiChat = new AiChatApi(_httpClient);
            Verification = new VerificationApi(_httpClient);
            OauthAuthentication = new OauthAuthenticationApi(_httpClient);
            Authorization = new AuthorizationApi(_httpClient);
            Authentication = new AuthenticationApi(_httpClient);
            App = new AppApi(_httpClient);
            AiAgentChat = new AiAgentChatApi(_httpClient);
        }

        public SdkworkBackendClient(SdkConfig config)
        {
            _httpClient = new HttpClient(config);
            Workspace = new WorkspaceApi(_httpClient);
            ContentVote = new ContentVoteApi(_httpClient);
            VoiceSpeaker = new VoiceSpeakerApi(_httpClient);
            VisitHistory = new VisitHistoryApi(_httpClient);
            VipUser = new VipUserApi(_httpClient);
            VipRecharge = new VipRechargeApi(_httpClient);
            VipRechargePackage = new VipRechargePackageApi(_httpClient);
            VipPointChange = new VipPointChangeApi(_httpClient);
            VipPackageGroup = new VipPackageGroupApi(_httpClient);
            VipPackage = new VipPackageApi(_httpClient);
            VipLevel = new VipLevelApi(_httpClient);
            VipLevelBenefit = new VipLevelBenefitApi(_httpClient);
            VipBenefit = new VipBenefitApi(_httpClient);
            VipBenefitUsage = new VipBenefitUsageApi(_httpClient);
            Video = new VideoApi(_httpClient);
            User = new UserApi(_httpClient);
            UserOauthAccount = new UserOauthAccountApi(_httpClient);
            UserCoupon = new UserCouponApi(_httpClient);
            UserCard = new UserCardApi(_httpClient);
            UserAddress = new UserAddressApi(_httpClient);
            AiUsageRecord = new AiUsageRecordApi(_httpClient);
            ShoppingCart = new ShoppingCartApi(_httpClient);
            ShoppingCartItem = new ShoppingCartItemApi(_httpClient);
            Refund = new RefundApi(_httpClient);
            Payment = new PaymentApi(_httpClient);
            Order = new OrderApi(_httpClient);
            OrderItem = new OrderItemApi(_httpClient);
            AiTool = new AiToolApi(_httpClient);
            Tenant = new TenantApi(_httpClient);
            DatabaseTable = new DatabaseTableApi(_httpClient);
            ProductSku = new ProductSkuApi(_httpClient);
            ShortUrl = new ShortUrlApi(_httpClient);
            Shop = new ShopApi(_httpClient);
            Share = new ShareApi(_httpClient);
            ShareVisitRecord = new ShareVisitRecordApi(_httpClient);
            ShardingKey = new ShardingKeyApi(_httpClient);
            Schema = new SchemaApi(_httpClient);
            RbacRole = new RbacRoleApi(_httpClient);
            RolePermission = new RolePermissionApi(_httpClient);
            InvocationRecord = new InvocationRecordApi(_httpClient);
            RbacUserRole = new RbacUserRoleApi(_httpClient);
            AiPrompt = new AiPromptApi(_httpClient);
            Project = new ProjectApi(_httpClient);
            Product = new ProductApi(_httpClient);
            PptTemplate = new PptTemplateApi(_httpClient);
            PptTemplateSlide = new PptTemplateSlideApi(_httpClient);
            Partner = new PartnerApi(_httpClient);
            ChatParticipant = new ChatParticipantApi(_httpClient);
            OssBucket = new OssBucketApi(_httpClient);
            Organization = new OrganizationApi(_httpClient);
            Position = new PositionApi(_httpClient);
            MemberRelations = new MemberRelationsApi(_httpClient);
            OrganizationMember = new OrganizationMemberApi(_httpClient);
            Notification = new NotificationApi(_httpClient);
            Notes = new NotesApi(_httpClient);
            News = new NewsApi(_httpClient);
            Host = new HostApi(_httpClient);
            DnsRecord = new DnsRecordApi(_httpClient);
            Music = new MusicApi(_httpClient);
            AiModelInformation = new AiModelInformationApi(_httpClient);
            AiModelPrice = new AiModelPriceApi(_httpClient);
            ChatMessage = new ChatMessageApi(_httpClient);
            MemberLevel = new MemberLevelApi(_httpClient);
            MemberCard = new MemberCardApi(_httpClient);
            KnowledgeBase = new KnowledgeBaseApi(_httpClient);
            InvitationRelation = new InvitationRelationApi(_httpClient);
            InvitationCode = new InvitationCodeApi(_httpClient);
            Image = new ImageApi(_httpClient);
            ChatGroup = new ChatGroupApi(_httpClient);
            AiGeneration = new AiGenerationApi(_httpClient);
            AiGenerationContent = new AiGenerationContentApi(_httpClient);
            File = new FileApi(_httpClient);
            FilePart = new FilePartApi(_httpClient);
            FileContent = new FileContentApi(_httpClient);
            Feeds = new FeedsApi(_httpClient);
            Feedback = new FeedbackApi(_httpClient);
            Favorite = new FavoriteApi(_httpClient);
            FileDisk = new FileDiskApi(_httpClient);
            DiskMember = new DiskMemberApi(_httpClient);
            Detail = new DetailApi(_httpClient);
            Department = new DepartmentApi(_httpClient);
            Datasource = new DatasourceApi(_httpClient);
            Coupon = new CouponApi(_httpClient);
            CouponTemplate = new CouponTemplateApi(_httpClient);
            AiConversation = new AiConversationApi(_httpClient);
            Comment = new CommentApi(_httpClient);
            Column = new ColumnApi(_httpClient);
            Collection = new CollectionApi(_httpClient);
            CollectionItem = new CollectionItemApi(_httpClient);
            Character = new CharacterApi(_httpClient);
            ChannelResource = new ChannelResourceApi(_httpClient);
            ChannelAccount = new ChannelAccountApi(_httpClient);
            AiCategory = new AiCategoryApi(_httpClient);
            MembershipCard = new MembershipCardApi(_httpClient);
            CardTemplate = new CardTemplateApi(_httpClient);
            Attribute = new AttributeApi(_httpClient);
            AiArticle = new AiArticleApi(_httpClient);
            Application = new ApplicationApi(_httpClient);
            ApiKey = new ApiKeyApi(_httpClient);
            AiAgent = new AiAgentApi(_httpClient);
            AiAgentToolRelationship = new AiAgentToolRelationshipApi(_httpClient);
            Account = new AccountApi(_httpClient);
            AccountHistory = new AccountHistoryApi(_httpClient);
            SearchChat = new SearchChatApi(_httpClient);
            PptTemplateRendering = new PptTemplateRenderingApi(_httpClient);
            PptTemplateChat = new PptTemplateChatApi(_httpClient);
            KnowledgeBaseFile = new KnowledgeBaseFileApi(_httpClient);
            KnowledgeBaseChat = new KnowledgeBaseChatApi(_httpClient);
            ImMessage = new ImMessageApi(_httpClient);
            AiVoiceSpeakerGeneration = new AiVoiceSpeakerGenerationApi(_httpClient);
            AiVideoGeneration = new AiVideoGenerationApi(_httpClient);
            AiMusicGeneration = new AiMusicGenerationApi(_httpClient);
            AiImageGeneration = new AiImageGenerationApi(_httpClient);
            AiCharacterGeneration = new AiCharacterGenerationApi(_httpClient);
            AiAudioGeneration = new AiAudioGenerationApi(_httpClient);
            AiAudioEffectGeneration = new AiAudioEffectGenerationApi(_httpClient);
            AiChat = new AiChatApi(_httpClient);
            Verification = new VerificationApi(_httpClient);
            OauthAuthentication = new OauthAuthenticationApi(_httpClient);
            Authorization = new AuthorizationApi(_httpClient);
            Authentication = new AuthenticationApi(_httpClient);
            App = new AppApi(_httpClient);
            AiAgentChat = new AiAgentChatApi(_httpClient);
        }

        public SdkworkBackendClient SetApiKey(string apiKey)
        {
            _httpClient.SetApiKey(apiKey);
            return this;
        }

        public SdkworkBackendClient SetAuthToken(string token)
        {
            _httpClient.SetAuthToken(token);
            return this;
        }

        public SdkworkBackendClient SetAccessToken(string token)
        {
            _httpClient.SetAccessToken(token);
            return this;
        }

        public SdkworkBackendClient SetHeader(string key, string value)
        {
            _httpClient.SetHeader(key, value);
            return this;
        }
    }
}
