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

namespace Backend
{
    public class SdkworkBackendClient
    {
        private readonly HttpClient _httpClient;

        public WorkspaceApi Workspace { get; }
        public VoteApi Vote { get; }
        public VoiceApi Voice { get; }
        public VisitHistoryApi VisitHistory { get; }
        public VipApi Vip { get; }
        public VideoApi Video { get; }
        public UserApi User { get; }
        public UsageApi Usage { get; }
        public TradeApi Trade { get; }
        public ToolApi Tool { get; }
        public TenantApi Tenant { get; }
        public TableApi Table { get; }
        public SkuApi Sku { get; }
        public SkillApi Skill { get; }
        public ShortUrlApi ShortUrl { get; }
        public ShopApi Shop { get; }
        public ShareApi Share { get; }
        public ShardingApi Sharding { get; }
        public SecurityApi Security { get; }
        public SchemaApi Schema { get; }
        public RoleApi Role { get; }
        public RecordApi Record { get; }
        public RbacApi Rbac { get; }
        public PromptApi Prompt { get; }
        public ProjectApi Project { get; }
        public ProductApi Product { get; }
        public PptApi Ppt { get; }
        public PermissionApi Permission { get; }
        public PartnerApi Partner { get; }
        public ParticipantApi Participant { get; }
        public OssApi Oss { get; }
        public OrganizationApi Organization { get; }
        public OrganizationMemberApi OrganizationMember { get; }
        public NotificationApi Notification { get; }
        public NoteApi Note { get; }
        public NewsApi News { get; }
        public NetApi Net { get; }
        public MusicApi Music { get; }
        public ModelApi Model { get; }
        public MessageApi Message { get; }
        public MemberApi Member { get; }
        public KnowledgeBaseApi KnowledgeBase { get; }
        public InvitationApi Invitation { get; }
        public ImageApi Image { get; }
        public ImApi Im { get; }
        public GenerationApi Generation { get; }
        public GameApi Game { get; }
        public FileApi File { get; }
        public FeedApi Feed { get; }
        public FeedbackApi Feedback { get; }
        public FavoriteApi Favorite { get; }
        public DiskApi Disk { get; }
        public DetailApi Detail { get; }
        public DepartmentApi Department { get; }
        public DatasourceApi Datasource { get; }
        public CouponApi Coupon { get; }
        public ConversationApi Conversation { get; }
        public ContentWritingApi ContentWriting { get; }
        public CommentApi Comment { get; }
        public ColumnApi Column { get; }
        public CollectionApi Collection { get; }
        public CollectionItemApi CollectionItem { get; }
        public ChatApi Chat { get; }
        public CharacterApi Character { get; }
        public ChannelApi Channel { get; }
        public CategoryApi Category { get; }
        public CardApi Card { get; }
        public AttributeApi Attribute { get; }
        public ArticleApi Article { get; }
        public AppApi App { get; }
        public ApikeyApi Apikey { get; }
        public AgentApi Agent { get; }
        public AccountApi Account { get; }
        public SystemApi System { get; }
        public SearchApi Search { get; }
        public AuthApi Auth { get; }

        public SdkworkBackendClient(string baseUrl)
        {
            _httpClient = new HttpClient(baseUrl);
            Workspace = new WorkspaceApi(_httpClient);
            Vote = new VoteApi(_httpClient);
            Voice = new VoiceApi(_httpClient);
            VisitHistory = new VisitHistoryApi(_httpClient);
            Vip = new VipApi(_httpClient);
            Video = new VideoApi(_httpClient);
            User = new UserApi(_httpClient);
            Usage = new UsageApi(_httpClient);
            Trade = new TradeApi(_httpClient);
            Tool = new ToolApi(_httpClient);
            Tenant = new TenantApi(_httpClient);
            Table = new TableApi(_httpClient);
            Sku = new SkuApi(_httpClient);
            Skill = new SkillApi(_httpClient);
            ShortUrl = new ShortUrlApi(_httpClient);
            Shop = new ShopApi(_httpClient);
            Share = new ShareApi(_httpClient);
            Sharding = new ShardingApi(_httpClient);
            Security = new SecurityApi(_httpClient);
            Schema = new SchemaApi(_httpClient);
            Role = new RoleApi(_httpClient);
            Record = new RecordApi(_httpClient);
            Rbac = new RbacApi(_httpClient);
            Prompt = new PromptApi(_httpClient);
            Project = new ProjectApi(_httpClient);
            Product = new ProductApi(_httpClient);
            Ppt = new PptApi(_httpClient);
            Permission = new PermissionApi(_httpClient);
            Partner = new PartnerApi(_httpClient);
            Participant = new ParticipantApi(_httpClient);
            Oss = new OssApi(_httpClient);
            Organization = new OrganizationApi(_httpClient);
            OrganizationMember = new OrganizationMemberApi(_httpClient);
            Notification = new NotificationApi(_httpClient);
            Note = new NoteApi(_httpClient);
            News = new NewsApi(_httpClient);
            Net = new NetApi(_httpClient);
            Music = new MusicApi(_httpClient);
            Model = new ModelApi(_httpClient);
            Message = new MessageApi(_httpClient);
            Member = new MemberApi(_httpClient);
            KnowledgeBase = new KnowledgeBaseApi(_httpClient);
            Invitation = new InvitationApi(_httpClient);
            Image = new ImageApi(_httpClient);
            Im = new ImApi(_httpClient);
            Generation = new GenerationApi(_httpClient);
            Game = new GameApi(_httpClient);
            File = new FileApi(_httpClient);
            Feed = new FeedApi(_httpClient);
            Feedback = new FeedbackApi(_httpClient);
            Favorite = new FavoriteApi(_httpClient);
            Disk = new DiskApi(_httpClient);
            Detail = new DetailApi(_httpClient);
            Department = new DepartmentApi(_httpClient);
            Datasource = new DatasourceApi(_httpClient);
            Coupon = new CouponApi(_httpClient);
            Conversation = new ConversationApi(_httpClient);
            ContentWriting = new ContentWritingApi(_httpClient);
            Comment = new CommentApi(_httpClient);
            Column = new ColumnApi(_httpClient);
            Collection = new CollectionApi(_httpClient);
            CollectionItem = new CollectionItemApi(_httpClient);
            Chat = new ChatApi(_httpClient);
            Character = new CharacterApi(_httpClient);
            Channel = new ChannelApi(_httpClient);
            Category = new CategoryApi(_httpClient);
            Card = new CardApi(_httpClient);
            Attribute = new AttributeApi(_httpClient);
            Article = new ArticleApi(_httpClient);
            App = new AppApi(_httpClient);
            Apikey = new ApikeyApi(_httpClient);
            Agent = new AgentApi(_httpClient);
            Account = new AccountApi(_httpClient);
            System = new SystemApi(_httpClient);
            Search = new SearchApi(_httpClient);
            Auth = new AuthApi(_httpClient);
        }

        public SdkworkBackendClient(SdkConfig config)
        {
            _httpClient = new HttpClient(config);
            Workspace = new WorkspaceApi(_httpClient);
            Vote = new VoteApi(_httpClient);
            Voice = new VoiceApi(_httpClient);
            VisitHistory = new VisitHistoryApi(_httpClient);
            Vip = new VipApi(_httpClient);
            Video = new VideoApi(_httpClient);
            User = new UserApi(_httpClient);
            Usage = new UsageApi(_httpClient);
            Trade = new TradeApi(_httpClient);
            Tool = new ToolApi(_httpClient);
            Tenant = new TenantApi(_httpClient);
            Table = new TableApi(_httpClient);
            Sku = new SkuApi(_httpClient);
            Skill = new SkillApi(_httpClient);
            ShortUrl = new ShortUrlApi(_httpClient);
            Shop = new ShopApi(_httpClient);
            Share = new ShareApi(_httpClient);
            Sharding = new ShardingApi(_httpClient);
            Security = new SecurityApi(_httpClient);
            Schema = new SchemaApi(_httpClient);
            Role = new RoleApi(_httpClient);
            Record = new RecordApi(_httpClient);
            Rbac = new RbacApi(_httpClient);
            Prompt = new PromptApi(_httpClient);
            Project = new ProjectApi(_httpClient);
            Product = new ProductApi(_httpClient);
            Ppt = new PptApi(_httpClient);
            Permission = new PermissionApi(_httpClient);
            Partner = new PartnerApi(_httpClient);
            Participant = new ParticipantApi(_httpClient);
            Oss = new OssApi(_httpClient);
            Organization = new OrganizationApi(_httpClient);
            OrganizationMember = new OrganizationMemberApi(_httpClient);
            Notification = new NotificationApi(_httpClient);
            Note = new NoteApi(_httpClient);
            News = new NewsApi(_httpClient);
            Net = new NetApi(_httpClient);
            Music = new MusicApi(_httpClient);
            Model = new ModelApi(_httpClient);
            Message = new MessageApi(_httpClient);
            Member = new MemberApi(_httpClient);
            KnowledgeBase = new KnowledgeBaseApi(_httpClient);
            Invitation = new InvitationApi(_httpClient);
            Image = new ImageApi(_httpClient);
            Im = new ImApi(_httpClient);
            Generation = new GenerationApi(_httpClient);
            Game = new GameApi(_httpClient);
            File = new FileApi(_httpClient);
            Feed = new FeedApi(_httpClient);
            Feedback = new FeedbackApi(_httpClient);
            Favorite = new FavoriteApi(_httpClient);
            Disk = new DiskApi(_httpClient);
            Detail = new DetailApi(_httpClient);
            Department = new DepartmentApi(_httpClient);
            Datasource = new DatasourceApi(_httpClient);
            Coupon = new CouponApi(_httpClient);
            Conversation = new ConversationApi(_httpClient);
            ContentWriting = new ContentWritingApi(_httpClient);
            Comment = new CommentApi(_httpClient);
            Column = new ColumnApi(_httpClient);
            Collection = new CollectionApi(_httpClient);
            CollectionItem = new CollectionItemApi(_httpClient);
            Chat = new ChatApi(_httpClient);
            Character = new CharacterApi(_httpClient);
            Channel = new ChannelApi(_httpClient);
            Category = new CategoryApi(_httpClient);
            Card = new CardApi(_httpClient);
            Attribute = new AttributeApi(_httpClient);
            Article = new ArticleApi(_httpClient);
            App = new AppApi(_httpClient);
            Apikey = new ApikeyApi(_httpClient);
            Agent = new AgentApi(_httpClient);
            Account = new AccountApi(_httpClient);
            System = new SystemApi(_httpClient);
            Search = new SearchApi(_httpClient);
            Auth = new AuthApi(_httpClient);
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
