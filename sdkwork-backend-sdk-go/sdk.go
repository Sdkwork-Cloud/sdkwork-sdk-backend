package backend

import (
    "github.com/sdkwork/backend-sdk/api"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type SdkworkBackendClient struct {
    http *sdkhttp.Client
    Workspace *api.WorkspaceApi
    Vote *api.VoteApi
    Voice *api.VoiceApi
    VisitHistory *api.VisitHistoryApi
    Vip *api.VipApi
    Video *api.VideoApi
    User *api.UserApi
    Usage *api.UsageApi
    Trade *api.TradeApi
    Tool *api.ToolApi
    Tenant *api.TenantApi
    Table *api.TableApi
    Sku *api.SkuApi
    Skill *api.SkillApi
    ShortUrl *api.ShortUrlApi
    Shop *api.ShopApi
    Share *api.ShareApi
    Sharding *api.ShardingApi
    Security *api.SecurityApi
    Schema *api.SchemaApi
    Role *api.RoleApi
    Record *api.RecordApi
    Rbac *api.RbacApi
    Prompt *api.PromptApi
    Project *api.ProjectApi
    Product *api.ProductApi
    Ppt *api.PptApi
    Permission *api.PermissionApi
    Partner *api.PartnerApi
    Participant *api.ParticipantApi
    Oss *api.OssApi
    Organization *api.OrganizationApi
    OrganizationMember *api.OrganizationMemberApi
    Notification *api.NotificationApi
    Note *api.NoteApi
    News *api.NewsApi
    Net *api.NetApi
    Music *api.MusicApi
    Model *api.ModelApi
    Message *api.MessageApi
    Member *api.MemberApi
    KnowledgeBase *api.KnowledgeBaseApi
    Invitation *api.InvitationApi
    Image *api.ImageApi
    Im *api.ImApi
    Generation *api.GenerationApi
    Game *api.GameApi
    File *api.FileApi
    Feed *api.FeedApi
    Feedback *api.FeedbackApi
    Favorite *api.FavoriteApi
    Disk *api.DiskApi
    Detail *api.DetailApi
    Department *api.DepartmentApi
    Datasource *api.DatasourceApi
    Coupon *api.CouponApi
    Conversation *api.ConversationApi
    ContentWriting *api.ContentWritingApi
    Comment *api.CommentApi
    Column *api.ColumnApi
    Collection *api.CollectionApi
    CollectionItem *api.CollectionItemApi
    Chat *api.ChatApi
    Character *api.CharacterApi
    Channel *api.ChannelApi
    Category *api.CategoryApi
    Card *api.CardApi
    Attribute *api.AttributeApi
    Article *api.ArticleApi
    App *api.AppApi
    Apikey *api.ApikeyApi
    Agent *api.AgentApi
    Account *api.AccountApi
    System *api.SystemApi
    Search *api.SearchApi
    Auth *api.AuthApi
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
        Vote: api.NewVoteApi(client),
        Voice: api.NewVoiceApi(client),
        VisitHistory: api.NewVisitHistoryApi(client),
        Vip: api.NewVipApi(client),
        Video: api.NewVideoApi(client),
        User: api.NewUserApi(client),
        Usage: api.NewUsageApi(client),
        Trade: api.NewTradeApi(client),
        Tool: api.NewToolApi(client),
        Tenant: api.NewTenantApi(client),
        Table: api.NewTableApi(client),
        Sku: api.NewSkuApi(client),
        Skill: api.NewSkillApi(client),
        ShortUrl: api.NewShortUrlApi(client),
        Shop: api.NewShopApi(client),
        Share: api.NewShareApi(client),
        Sharding: api.NewShardingApi(client),
        Security: api.NewSecurityApi(client),
        Schema: api.NewSchemaApi(client),
        Role: api.NewRoleApi(client),
        Record: api.NewRecordApi(client),
        Rbac: api.NewRbacApi(client),
        Prompt: api.NewPromptApi(client),
        Project: api.NewProjectApi(client),
        Product: api.NewProductApi(client),
        Ppt: api.NewPptApi(client),
        Permission: api.NewPermissionApi(client),
        Partner: api.NewPartnerApi(client),
        Participant: api.NewParticipantApi(client),
        Oss: api.NewOssApi(client),
        Organization: api.NewOrganizationApi(client),
        OrganizationMember: api.NewOrganizationMemberApi(client),
        Notification: api.NewNotificationApi(client),
        Note: api.NewNoteApi(client),
        News: api.NewNewsApi(client),
        Net: api.NewNetApi(client),
        Music: api.NewMusicApi(client),
        Model: api.NewModelApi(client),
        Message: api.NewMessageApi(client),
        Member: api.NewMemberApi(client),
        KnowledgeBase: api.NewKnowledgeBaseApi(client),
        Invitation: api.NewInvitationApi(client),
        Image: api.NewImageApi(client),
        Im: api.NewImApi(client),
        Generation: api.NewGenerationApi(client),
        Game: api.NewGameApi(client),
        File: api.NewFileApi(client),
        Feed: api.NewFeedApi(client),
        Feedback: api.NewFeedbackApi(client),
        Favorite: api.NewFavoriteApi(client),
        Disk: api.NewDiskApi(client),
        Detail: api.NewDetailApi(client),
        Department: api.NewDepartmentApi(client),
        Datasource: api.NewDatasourceApi(client),
        Coupon: api.NewCouponApi(client),
        Conversation: api.NewConversationApi(client),
        ContentWriting: api.NewContentWritingApi(client),
        Comment: api.NewCommentApi(client),
        Column: api.NewColumnApi(client),
        Collection: api.NewCollectionApi(client),
        CollectionItem: api.NewCollectionItemApi(client),
        Chat: api.NewChatApi(client),
        Character: api.NewCharacterApi(client),
        Channel: api.NewChannelApi(client),
        Category: api.NewCategoryApi(client),
        Card: api.NewCardApi(client),
        Attribute: api.NewAttributeApi(client),
        Article: api.NewArticleApi(client),
        App: api.NewAppApi(client),
        Apikey: api.NewApikeyApi(client),
        Agent: api.NewAgentApi(client),
        Account: api.NewAccountApi(client),
        System: api.NewSystemApi(client),
        Search: api.NewSearchApi(client),
        Auth: api.NewAuthApi(client),
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
