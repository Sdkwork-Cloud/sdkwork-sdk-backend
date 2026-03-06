package backend

import (
    "github.com/sdkwork/backend-sdk/api"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type SdkworkBackendClient struct {
    http *sdkhttp.Client
    Workspace *api.WorkspaceApi
    ContentVote *api.ContentVoteApi
    VoiceSpeaker *api.VoiceSpeakerApi
    VisitHistory *api.VisitHistoryApi
    VipUser *api.VipUserApi
    VipRecharge *api.VipRechargeApi
    VipRechargePackage *api.VipRechargePackageApi
    VipPointChange *api.VipPointChangeApi
    VipPackageGroup *api.VipPackageGroupApi
    VipPackage *api.VipPackageApi
    VipLevel *api.VipLevelApi
    VipLevelBenefit *api.VipLevelBenefitApi
    VipBenefit *api.VipBenefitApi
    VipBenefitUsage *api.VipBenefitUsageApi
    Video *api.VideoApi
    User *api.UserApi
    UserOauthAccount *api.UserOauthAccountApi
    UserCoupon *api.UserCouponApi
    UserCard *api.UserCardApi
    UserAddress *api.UserAddressApi
    UsageRecord *api.UsageRecordApi
    ShoppingCart *api.ShoppingCartApi
    ShoppingCartItem *api.ShoppingCartItemApi
    Refund *api.RefundApi
    Payment *api.PaymentApi
    Order *api.OrderApi
    OrderItem *api.OrderItemApi
    Tool *api.ToolApi
    Tenant *api.TenantApi
    DatabaseTable *api.DatabaseTableApi
    ProductSku *api.ProductSkuApi
    Skill *api.SkillApi
    SkillPackage *api.SkillPackageApi
    ShortUrl *api.ShortUrlApi
    Shop *api.ShopApi
    Share *api.ShareApi
    ShareVisitRecord *api.ShareVisitRecordApi
    ShardingKey *api.ShardingKeyApi
    ApiSecurityPolicy *api.ApiSecurityPolicyApi
    Schema *api.SchemaApi
    RbacRole *api.RbacRoleApi
    RolePermission *api.RolePermissionApi
    InvocationRecord *api.InvocationRecordApi
    RbacUserRole *api.RbacUserRoleApi
    Prompt *api.PromptApi
    Project *api.ProjectApi
    Product *api.ProductApi
    PptTemplate *api.PptTemplateApi
    PptTemplateSlide *api.PptTemplateSlideApi
    RbacPermission *api.RbacPermissionApi
    Partner *api.PartnerApi
    ChatParticipant *api.ChatParticipantApi
    OssBucket *api.OssBucketApi
    Organization *api.OrganizationApi
    Position *api.PositionApi
    MemberRelations *api.MemberRelationsApi
    OrganizationMember *api.OrganizationMemberApi
    Notification *api.NotificationApi
    Notes *api.NotesApi
    News *api.NewsApi
    Net *api.NetApi
    DnsRecord *api.DnsRecordApi
    Music *api.MusicApi
    ModelInformation *api.ModelInformationApi
    ModelPrice *api.ModelPriceApi
    ChatMessage *api.ChatMessageApi
    MemberLevel *api.MemberLevelApi
    MemberCard *api.MemberCardApi
    KnowledgeBase *api.KnowledgeBaseApi
    InvitationRelation *api.InvitationRelationApi
    InvitationCode *api.InvitationCodeApi
    Image *api.ImageApi
    ChatGroup *api.ChatGroupApi
    Generation *api.GenerationApi
    GenerationContent *api.GenerationContentApi
    File *api.FileApi
    FilePart *api.FilePartApi
    FileContent *api.FileContentApi
    Feeds *api.FeedsApi
    Feedback *api.FeedbackApi
    Favorite *api.FavoriteApi
    FileDisk *api.FileDiskApi
    DiskMember *api.DiskMemberApi
    Detail *api.DetailApi
    Department *api.DepartmentApi
    Datasource *api.DatasourceApi
    Coupon *api.CouponApi
    CouponTemplate *api.CouponTemplateApi
    Conversation *api.ConversationApi
    ContentWriting *api.ContentWritingApi
    Comment *api.CommentApi
    Column *api.ColumnApi
    Collection *api.CollectionApi
    CollectionItem *api.CollectionItemApi
    Character *api.CharacterApi
    Channel *api.ChannelApi
    ChannelResource *api.ChannelResourceApi
    ChannelProxy *api.ChannelProxyApi
    ChannelAccount *api.ChannelAccountApi
    Category *api.CategoryApi
    MembershipCard *api.MembershipCardApi
    CardTemplate *api.CardTemplateApi
    Attribute *api.AttributeApi
    Article *api.ArticleApi
    App *api.AppApi
    ApiKey *api.ApiKeyApi
    Agent *api.AgentApi
    AgentToolRelationship *api.AgentToolRelationshipApi
    Account *api.AccountApi
    AccountHistory *api.AccountHistoryApi
    AccountExchangeConfig *api.AccountExchangeConfigApi
    Invoice *api.InvoiceApi
    SearchChat *api.SearchChatApi
    PptTemplateRendering *api.PptTemplateRenderingApi
    PptTemplateChat *api.PptTemplateChatApi
    KnowledgeBaseFile *api.KnowledgeBaseFileApi
    KnowledgeBaseChat *api.KnowledgeBaseChatApi
    ImMessage *api.ImMessageApi
    VoiceSpeakerGeneration *api.VoiceSpeakerGenerationApi
    VideoGeneration *api.VideoGenerationApi
    MusicGeneration *api.MusicGenerationApi
    ImageGeneration *api.ImageGenerationApi
    CharacterGeneration *api.CharacterGenerationApi
    AudioGeneration *api.AudioGenerationApi
    AudioEffectGeneration *api.AudioEffectGenerationApi
    Chat *api.ChatApi
    Auth *api.AuthApi
    AgentChat *api.AgentChatApi
}

func NewSdkworkBackendClient(baseURL string) *SdkworkBackendClient {
    cfg := sdkhttp.NewDefaultConfig(baseURL)
    return NewSdkworkBackendClientWithConfig(cfg)
}

func NewSdkworkBackendClientWithConfig(config sdkhttp.Config) *SdkworkBackendClient {
    client := sdkhttp.NewClient(config)
    return &SdkworkBackendClient{
        http: client,
        Workspace: api.NewWorkspaceApi(client),
        ContentVote: api.NewContentVoteApi(client),
        VoiceSpeaker: api.NewVoiceSpeakerApi(client),
        VisitHistory: api.NewVisitHistoryApi(client),
        VipUser: api.NewVipUserApi(client),
        VipRecharge: api.NewVipRechargeApi(client),
        VipRechargePackage: api.NewVipRechargePackageApi(client),
        VipPointChange: api.NewVipPointChangeApi(client),
        VipPackageGroup: api.NewVipPackageGroupApi(client),
        VipPackage: api.NewVipPackageApi(client),
        VipLevel: api.NewVipLevelApi(client),
        VipLevelBenefit: api.NewVipLevelBenefitApi(client),
        VipBenefit: api.NewVipBenefitApi(client),
        VipBenefitUsage: api.NewVipBenefitUsageApi(client),
        Video: api.NewVideoApi(client),
        User: api.NewUserApi(client),
        UserOauthAccount: api.NewUserOauthAccountApi(client),
        UserCoupon: api.NewUserCouponApi(client),
        UserCard: api.NewUserCardApi(client),
        UserAddress: api.NewUserAddressApi(client),
        UsageRecord: api.NewUsageRecordApi(client),
        ShoppingCart: api.NewShoppingCartApi(client),
        ShoppingCartItem: api.NewShoppingCartItemApi(client),
        Refund: api.NewRefundApi(client),
        Payment: api.NewPaymentApi(client),
        Order: api.NewOrderApi(client),
        OrderItem: api.NewOrderItemApi(client),
        Tool: api.NewToolApi(client),
        Tenant: api.NewTenantApi(client),
        DatabaseTable: api.NewDatabaseTableApi(client),
        ProductSku: api.NewProductSkuApi(client),
        Skill: api.NewSkillApi(client),
        SkillPackage: api.NewSkillPackageApi(client),
        ShortUrl: api.NewShortUrlApi(client),
        Shop: api.NewShopApi(client),
        Share: api.NewShareApi(client),
        ShareVisitRecord: api.NewShareVisitRecordApi(client),
        ShardingKey: api.NewShardingKeyApi(client),
        ApiSecurityPolicy: api.NewApiSecurityPolicyApi(client),
        Schema: api.NewSchemaApi(client),
        RbacRole: api.NewRbacRoleApi(client),
        RolePermission: api.NewRolePermissionApi(client),
        InvocationRecord: api.NewInvocationRecordApi(client),
        RbacUserRole: api.NewRbacUserRoleApi(client),
        Prompt: api.NewPromptApi(client),
        Project: api.NewProjectApi(client),
        Product: api.NewProductApi(client),
        PptTemplate: api.NewPptTemplateApi(client),
        PptTemplateSlide: api.NewPptTemplateSlideApi(client),
        RbacPermission: api.NewRbacPermissionApi(client),
        Partner: api.NewPartnerApi(client),
        ChatParticipant: api.NewChatParticipantApi(client),
        OssBucket: api.NewOssBucketApi(client),
        Organization: api.NewOrganizationApi(client),
        Position: api.NewPositionApi(client),
        MemberRelations: api.NewMemberRelationsApi(client),
        OrganizationMember: api.NewOrganizationMemberApi(client),
        Notification: api.NewNotificationApi(client),
        Notes: api.NewNotesApi(client),
        News: api.NewNewsApi(client),
        Net: api.NewNetApi(client),
        DnsRecord: api.NewDnsRecordApi(client),
        Music: api.NewMusicApi(client),
        ModelInformation: api.NewModelInformationApi(client),
        ModelPrice: api.NewModelPriceApi(client),
        ChatMessage: api.NewChatMessageApi(client),
        MemberLevel: api.NewMemberLevelApi(client),
        MemberCard: api.NewMemberCardApi(client),
        KnowledgeBase: api.NewKnowledgeBaseApi(client),
        InvitationRelation: api.NewInvitationRelationApi(client),
        InvitationCode: api.NewInvitationCodeApi(client),
        Image: api.NewImageApi(client),
        ChatGroup: api.NewChatGroupApi(client),
        Generation: api.NewGenerationApi(client),
        GenerationContent: api.NewGenerationContentApi(client),
        File: api.NewFileApi(client),
        FilePart: api.NewFilePartApi(client),
        FileContent: api.NewFileContentApi(client),
        Feeds: api.NewFeedsApi(client),
        Feedback: api.NewFeedbackApi(client),
        Favorite: api.NewFavoriteApi(client),
        FileDisk: api.NewFileDiskApi(client),
        DiskMember: api.NewDiskMemberApi(client),
        Detail: api.NewDetailApi(client),
        Department: api.NewDepartmentApi(client),
        Datasource: api.NewDatasourceApi(client),
        Coupon: api.NewCouponApi(client),
        CouponTemplate: api.NewCouponTemplateApi(client),
        Conversation: api.NewConversationApi(client),
        ContentWriting: api.NewContentWritingApi(client),
        Comment: api.NewCommentApi(client),
        Column: api.NewColumnApi(client),
        Collection: api.NewCollectionApi(client),
        CollectionItem: api.NewCollectionItemApi(client),
        Character: api.NewCharacterApi(client),
        Channel: api.NewChannelApi(client),
        ChannelResource: api.NewChannelResourceApi(client),
        ChannelProxy: api.NewChannelProxyApi(client),
        ChannelAccount: api.NewChannelAccountApi(client),
        Category: api.NewCategoryApi(client),
        MembershipCard: api.NewMembershipCardApi(client),
        CardTemplate: api.NewCardTemplateApi(client),
        Attribute: api.NewAttributeApi(client),
        Article: api.NewArticleApi(client),
        App: api.NewAppApi(client),
        ApiKey: api.NewApiKeyApi(client),
        Agent: api.NewAgentApi(client),
        AgentToolRelationship: api.NewAgentToolRelationshipApi(client),
        Account: api.NewAccountApi(client),
        AccountHistory: api.NewAccountHistoryApi(client),
        AccountExchangeConfig: api.NewAccountExchangeConfigApi(client),
        Invoice: api.NewInvoiceApi(client),
        SearchChat: api.NewSearchChatApi(client),
        PptTemplateRendering: api.NewPptTemplateRenderingApi(client),
        PptTemplateChat: api.NewPptTemplateChatApi(client),
        KnowledgeBaseFile: api.NewKnowledgeBaseFileApi(client),
        KnowledgeBaseChat: api.NewKnowledgeBaseChatApi(client),
        ImMessage: api.NewImMessageApi(client),
        VoiceSpeakerGeneration: api.NewVoiceSpeakerGenerationApi(client),
        VideoGeneration: api.NewVideoGenerationApi(client),
        MusicGeneration: api.NewMusicGenerationApi(client),
        ImageGeneration: api.NewImageGenerationApi(client),
        CharacterGeneration: api.NewCharacterGenerationApi(client),
        AudioGeneration: api.NewAudioGenerationApi(client),
        AudioEffectGeneration: api.NewAudioEffectGenerationApi(client),
        Chat: api.NewChatApi(client),
        Auth: api.NewAuthApi(client),
        AgentChat: api.NewAgentChatApi(client),
    }
}

func (c *SdkworkBackendClient) SetApiKey(apiKey string) *SdkworkBackendClient {
    c.http.SetApiKey(apiKey)
    return c
}

func (c *SdkworkBackendClient) SetAuthToken(token string) *SdkworkBackendClient {
    c.http.SetAuthToken(token)
    return c
}

func (c *SdkworkBackendClient) SetAccessToken(token string) *SdkworkBackendClient {
    c.http.SetAccessToken(token)
    return c
}

func (c *SdkworkBackendClient) SetHeader(key string, value string) *SdkworkBackendClient {
    c.http.SetHeader(key, value)
    return c
}

func (c *SdkworkBackendClient) Http() *sdkhttp.Client {
    return c.http
}
