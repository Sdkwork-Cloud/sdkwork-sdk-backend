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
    AiUsageRecord *api.AiUsageRecordApi
    ShoppingCart *api.ShoppingCartApi
    ShoppingCartItem *api.ShoppingCartItemApi
    Refund *api.RefundApi
    Payment *api.PaymentApi
    Order *api.OrderApi
    OrderItem *api.OrderItemApi
    AiTool *api.AiToolApi
    Tenant *api.TenantApi
    DatabaseTable *api.DatabaseTableApi
    ProductSku *api.ProductSkuApi
    ShortUrl *api.ShortUrlApi
    Shop *api.ShopApi
    Share *api.ShareApi
    ShareVisitRecord *api.ShareVisitRecordApi
    ShardingKey *api.ShardingKeyApi
    Schema *api.SchemaApi
    RbacRole *api.RbacRoleApi
    RolePermission *api.RolePermissionApi
    InvocationRecord *api.InvocationRecordApi
    RbacUserRole *api.RbacUserRoleApi
    AiPrompt *api.AiPromptApi
    Project *api.ProjectApi
    Product *api.ProductApi
    PptTemplate *api.PptTemplateApi
    PptTemplateSlide *api.PptTemplateSlideApi
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
    Host *api.HostApi
    DnsRecord *api.DnsRecordApi
    Music *api.MusicApi
    AiModelInformation *api.AiModelInformationApi
    AiModelPrice *api.AiModelPriceApi
    ChatMessage *api.ChatMessageApi
    MemberLevel *api.MemberLevelApi
    MemberCard *api.MemberCardApi
    KnowledgeBase *api.KnowledgeBaseApi
    InvitationRelation *api.InvitationRelationApi
    InvitationCode *api.InvitationCodeApi
    Image *api.ImageApi
    ChatGroup *api.ChatGroupApi
    AiGeneration *api.AiGenerationApi
    AiGenerationContent *api.AiGenerationContentApi
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
    AiConversation *api.AiConversationApi
    Comment *api.CommentApi
    Column *api.ColumnApi
    Collection *api.CollectionApi
    CollectionItem *api.CollectionItemApi
    Character *api.CharacterApi
    ChannelResource *api.ChannelResourceApi
    ChannelAccount *api.ChannelAccountApi
    AiCategory *api.AiCategoryApi
    MembershipCard *api.MembershipCardApi
    CardTemplate *api.CardTemplateApi
    Attribute *api.AttributeApi
    AiArticle *api.AiArticleApi
    Application *api.ApplicationApi
    ApiKey *api.ApiKeyApi
    AiAgent *api.AiAgentApi
    AiAgentToolRelationship *api.AiAgentToolRelationshipApi
    Account *api.AccountApi
    AccountHistory *api.AccountHistoryApi
    SearchChat *api.SearchChatApi
    PptTemplateRendering *api.PptTemplateRenderingApi
    PptTemplateChat *api.PptTemplateChatApi
    KnowledgeBaseFile *api.KnowledgeBaseFileApi
    KnowledgeBaseChat *api.KnowledgeBaseChatApi
    ImMessage *api.ImMessageApi
    AiVoiceSpeakerGeneration *api.AiVoiceSpeakerGenerationApi
    AiVideoGeneration *api.AiVideoGenerationApi
    AiMusicGeneration *api.AiMusicGenerationApi
    AiImageGeneration *api.AiImageGenerationApi
    AiCharacterGeneration *api.AiCharacterGenerationApi
    AiAudioGeneration *api.AiAudioGenerationApi
    AiAudioEffectGeneration *api.AiAudioEffectGenerationApi
    AiChat *api.AiChatApi
    Verification *api.VerificationApi
    OauthAuthentication *api.OauthAuthenticationApi
    Authorization *api.AuthorizationApi
    Authentication *api.AuthenticationApi
    App *api.AppApi
    AiAgentChat *api.AiAgentChatApi
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
        AiUsageRecord: api.NewAiUsageRecordApi(client),
        ShoppingCart: api.NewShoppingCartApi(client),
        ShoppingCartItem: api.NewShoppingCartItemApi(client),
        Refund: api.NewRefundApi(client),
        Payment: api.NewPaymentApi(client),
        Order: api.NewOrderApi(client),
        OrderItem: api.NewOrderItemApi(client),
        AiTool: api.NewAiToolApi(client),
        Tenant: api.NewTenantApi(client),
        DatabaseTable: api.NewDatabaseTableApi(client),
        ProductSku: api.NewProductSkuApi(client),
        ShortUrl: api.NewShortUrlApi(client),
        Shop: api.NewShopApi(client),
        Share: api.NewShareApi(client),
        ShareVisitRecord: api.NewShareVisitRecordApi(client),
        ShardingKey: api.NewShardingKeyApi(client),
        Schema: api.NewSchemaApi(client),
        RbacRole: api.NewRbacRoleApi(client),
        RolePermission: api.NewRolePermissionApi(client),
        InvocationRecord: api.NewInvocationRecordApi(client),
        RbacUserRole: api.NewRbacUserRoleApi(client),
        AiPrompt: api.NewAiPromptApi(client),
        Project: api.NewProjectApi(client),
        Product: api.NewProductApi(client),
        PptTemplate: api.NewPptTemplateApi(client),
        PptTemplateSlide: api.NewPptTemplateSlideApi(client),
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
        Host: api.NewHostApi(client),
        DnsRecord: api.NewDnsRecordApi(client),
        Music: api.NewMusicApi(client),
        AiModelInformation: api.NewAiModelInformationApi(client),
        AiModelPrice: api.NewAiModelPriceApi(client),
        ChatMessage: api.NewChatMessageApi(client),
        MemberLevel: api.NewMemberLevelApi(client),
        MemberCard: api.NewMemberCardApi(client),
        KnowledgeBase: api.NewKnowledgeBaseApi(client),
        InvitationRelation: api.NewInvitationRelationApi(client),
        InvitationCode: api.NewInvitationCodeApi(client),
        Image: api.NewImageApi(client),
        ChatGroup: api.NewChatGroupApi(client),
        AiGeneration: api.NewAiGenerationApi(client),
        AiGenerationContent: api.NewAiGenerationContentApi(client),
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
        AiConversation: api.NewAiConversationApi(client),
        Comment: api.NewCommentApi(client),
        Column: api.NewColumnApi(client),
        Collection: api.NewCollectionApi(client),
        CollectionItem: api.NewCollectionItemApi(client),
        Character: api.NewCharacterApi(client),
        ChannelResource: api.NewChannelResourceApi(client),
        ChannelAccount: api.NewChannelAccountApi(client),
        AiCategory: api.NewAiCategoryApi(client),
        MembershipCard: api.NewMembershipCardApi(client),
        CardTemplate: api.NewCardTemplateApi(client),
        Attribute: api.NewAttributeApi(client),
        AiArticle: api.NewAiArticleApi(client),
        Application: api.NewApplicationApi(client),
        ApiKey: api.NewApiKeyApi(client),
        AiAgent: api.NewAiAgentApi(client),
        AiAgentToolRelationship: api.NewAiAgentToolRelationshipApi(client),
        Account: api.NewAccountApi(client),
        AccountHistory: api.NewAccountHistoryApi(client),
        SearchChat: api.NewSearchChatApi(client),
        PptTemplateRendering: api.NewPptTemplateRenderingApi(client),
        PptTemplateChat: api.NewPptTemplateChatApi(client),
        KnowledgeBaseFile: api.NewKnowledgeBaseFileApi(client),
        KnowledgeBaseChat: api.NewKnowledgeBaseChatApi(client),
        ImMessage: api.NewImMessageApi(client),
        AiVoiceSpeakerGeneration: api.NewAiVoiceSpeakerGenerationApi(client),
        AiVideoGeneration: api.NewAiVideoGenerationApi(client),
        AiMusicGeneration: api.NewAiMusicGenerationApi(client),
        AiImageGeneration: api.NewAiImageGenerationApi(client),
        AiCharacterGeneration: api.NewAiCharacterGenerationApi(client),
        AiAudioGeneration: api.NewAiAudioGenerationApi(client),
        AiAudioEffectGeneration: api.NewAiAudioEffectGenerationApi(client),
        AiChat: api.NewAiChatApi(client),
        Verification: api.NewVerificationApi(client),
        OauthAuthentication: api.NewOauthAuthenticationApi(client),
        Authorization: api.NewAuthorizationApi(client),
        Authentication: api.NewAuthenticationApi(client),
        App: api.NewAppApi(client),
        AiAgentChat: api.NewAiAgentChatApi(client),
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
