package com.sdkwork.backend;

import com.sdkwork.common.core.Types;
import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.api.WorkspaceApi;
import com.sdkwork.backend.api.VoteApi;
import com.sdkwork.backend.api.VoiceApi;
import com.sdkwork.backend.api.VisitHistoryApi;
import com.sdkwork.backend.api.VipApi;
import com.sdkwork.backend.api.VideoApi;
import com.sdkwork.backend.api.UserApi;
import com.sdkwork.backend.api.UsageApi;
import com.sdkwork.backend.api.TradeApi;
import com.sdkwork.backend.api.ToolApi;
import com.sdkwork.backend.api.TenantApi;
import com.sdkwork.backend.api.TableApi;
import com.sdkwork.backend.api.SkuApi;
import com.sdkwork.backend.api.SkillApi;
import com.sdkwork.backend.api.ShortUrlApi;
import com.sdkwork.backend.api.ShopApi;
import com.sdkwork.backend.api.ShareApi;
import com.sdkwork.backend.api.ShardingApi;
import com.sdkwork.backend.api.SecurityApi;
import com.sdkwork.backend.api.SchemaApi;
import com.sdkwork.backend.api.RoleApi;
import com.sdkwork.backend.api.RecordApi;
import com.sdkwork.backend.api.RbacApi;
import com.sdkwork.backend.api.PromptApi;
import com.sdkwork.backend.api.ProjectApi;
import com.sdkwork.backend.api.ProductApi;
import com.sdkwork.backend.api.PptApi;
import com.sdkwork.backend.api.PermissionApi;
import com.sdkwork.backend.api.PartnerApi;
import com.sdkwork.backend.api.ParticipantApi;
import com.sdkwork.backend.api.OssApi;
import com.sdkwork.backend.api.OrganizationApi;
import com.sdkwork.backend.api.OrganizationMemberApi;
import com.sdkwork.backend.api.NotificationApi;
import com.sdkwork.backend.api.NoteApi;
import com.sdkwork.backend.api.NewsApi;
import com.sdkwork.backend.api.NetApi;
import com.sdkwork.backend.api.MusicApi;
import com.sdkwork.backend.api.ModelApi;
import com.sdkwork.backend.api.MessageApi;
import com.sdkwork.backend.api.MemberApi;
import com.sdkwork.backend.api.KnowledgeBaseApi;
import com.sdkwork.backend.api.InvitationApi;
import com.sdkwork.backend.api.ImageApi;
import com.sdkwork.backend.api.ImApi;
import com.sdkwork.backend.api.GenerationApi;
import com.sdkwork.backend.api.GameApi;
import com.sdkwork.backend.api.FileApi;
import com.sdkwork.backend.api.FeedApi;
import com.sdkwork.backend.api.FeedbackApi;
import com.sdkwork.backend.api.FavoriteApi;
import com.sdkwork.backend.api.DiskApi;
import com.sdkwork.backend.api.DetailApi;
import com.sdkwork.backend.api.DepartmentApi;
import com.sdkwork.backend.api.DatasourceApi;
import com.sdkwork.backend.api.CouponApi;
import com.sdkwork.backend.api.ConversationApi;
import com.sdkwork.backend.api.ContentWritingApi;
import com.sdkwork.backend.api.CommentApi;
import com.sdkwork.backend.api.ColumnApi;
import com.sdkwork.backend.api.CollectionApi;
import com.sdkwork.backend.api.CollectionItemApi;
import com.sdkwork.backend.api.ChatApi;
import com.sdkwork.backend.api.CharacterApi;
import com.sdkwork.backend.api.ChannelApi;
import com.sdkwork.backend.api.CategoryApi;
import com.sdkwork.backend.api.CardApi;
import com.sdkwork.backend.api.AttributeApi;
import com.sdkwork.backend.api.ArticleApi;
import com.sdkwork.backend.api.AppApi;
import com.sdkwork.backend.api.ApikeyApi;
import com.sdkwork.backend.api.AgentApi;
import com.sdkwork.backend.api.AccountApi;
import com.sdkwork.backend.api.SystemApi;
import com.sdkwork.backend.api.SearchApi;
import com.sdkwork.backend.api.AuthApi;

public class SdkworkBackendClient {
    private final HttpClient httpClient;
    private WorkspaceApi workspace;
    private VoteApi vote;
    private VoiceApi voice;
    private VisitHistoryApi visitHistory;
    private VipApi vip;
    private VideoApi video;
    private UserApi user;
    private UsageApi usage;
    private TradeApi trade;
    private ToolApi tool;
    private TenantApi tenant;
    private TableApi table;
    private SkuApi sku;
    private SkillApi skill;
    private ShortUrlApi shortUrl;
    private ShopApi shop;
    private ShareApi share;
    private ShardingApi sharding;
    private SecurityApi security;
    private SchemaApi schema;
    private RoleApi role;
    private RecordApi record;
    private RbacApi rbac;
    private PromptApi prompt;
    private ProjectApi project;
    private ProductApi product;
    private PptApi ppt;
    private PermissionApi permission;
    private PartnerApi partner;
    private ParticipantApi participant;
    private OssApi oss;
    private OrganizationApi organization;
    private OrganizationMemberApi organizationMember;
    private NotificationApi notification;
    private NoteApi note;
    private NewsApi news;
    private NetApi net;
    private MusicApi music;
    private ModelApi model;
    private MessageApi message;
    private MemberApi member;
    private KnowledgeBaseApi knowledgeBase;
    private InvitationApi invitation;
    private ImageApi image;
    private ImApi im;
    private GenerationApi generation;
    private GameApi game;
    private FileApi file;
    private FeedApi feed;
    private FeedbackApi feedback;
    private FavoriteApi favorite;
    private DiskApi disk;
    private DetailApi detail;
    private DepartmentApi department;
    private DatasourceApi datasource;
    private CouponApi coupon;
    private ConversationApi conversation;
    private ContentWritingApi contentWriting;
    private CommentApi comment;
    private ColumnApi column;
    private CollectionApi collection;
    private CollectionItemApi collectionItem;
    private ChatApi chat;
    private CharacterApi character;
    private ChannelApi channel;
    private CategoryApi category;
    private CardApi card;
    private AttributeApi attribute;
    private ArticleApi article;
    private AppApi app;
    private ApikeyApi apikey;
    private AgentApi agent;
    private AccountApi account;
    private SystemApi system;
    private SearchApi search;
    private AuthApi auth;

    public SdkworkBackendClient(String baseUrl) {
        this.httpClient = new HttpClient(baseUrl);
        this.workspace = new WorkspaceApi(httpClient);
        this.vote = new VoteApi(httpClient);
        this.voice = new VoiceApi(httpClient);
        this.visitHistory = new VisitHistoryApi(httpClient);
        this.vip = new VipApi(httpClient);
        this.video = new VideoApi(httpClient);
        this.user = new UserApi(httpClient);
        this.usage = new UsageApi(httpClient);
        this.trade = new TradeApi(httpClient);
        this.tool = new ToolApi(httpClient);
        this.tenant = new TenantApi(httpClient);
        this.table = new TableApi(httpClient);
        this.sku = new SkuApi(httpClient);
        this.skill = new SkillApi(httpClient);
        this.shortUrl = new ShortUrlApi(httpClient);
        this.shop = new ShopApi(httpClient);
        this.share = new ShareApi(httpClient);
        this.sharding = new ShardingApi(httpClient);
        this.security = new SecurityApi(httpClient);
        this.schema = new SchemaApi(httpClient);
        this.role = new RoleApi(httpClient);
        this.record = new RecordApi(httpClient);
        this.rbac = new RbacApi(httpClient);
        this.prompt = new PromptApi(httpClient);
        this.project = new ProjectApi(httpClient);
        this.product = new ProductApi(httpClient);
        this.ppt = new PptApi(httpClient);
        this.permission = new PermissionApi(httpClient);
        this.partner = new PartnerApi(httpClient);
        this.participant = new ParticipantApi(httpClient);
        this.oss = new OssApi(httpClient);
        this.organization = new OrganizationApi(httpClient);
        this.organizationMember = new OrganizationMemberApi(httpClient);
        this.notification = new NotificationApi(httpClient);
        this.note = new NoteApi(httpClient);
        this.news = new NewsApi(httpClient);
        this.net = new NetApi(httpClient);
        this.music = new MusicApi(httpClient);
        this.model = new ModelApi(httpClient);
        this.message = new MessageApi(httpClient);
        this.member = new MemberApi(httpClient);
        this.knowledgeBase = new KnowledgeBaseApi(httpClient);
        this.invitation = new InvitationApi(httpClient);
        this.image = new ImageApi(httpClient);
        this.im = new ImApi(httpClient);
        this.generation = new GenerationApi(httpClient);
        this.game = new GameApi(httpClient);
        this.file = new FileApi(httpClient);
        this.feed = new FeedApi(httpClient);
        this.feedback = new FeedbackApi(httpClient);
        this.favorite = new FavoriteApi(httpClient);
        this.disk = new DiskApi(httpClient);
        this.detail = new DetailApi(httpClient);
        this.department = new DepartmentApi(httpClient);
        this.datasource = new DatasourceApi(httpClient);
        this.coupon = new CouponApi(httpClient);
        this.conversation = new ConversationApi(httpClient);
        this.contentWriting = new ContentWritingApi(httpClient);
        this.comment = new CommentApi(httpClient);
        this.column = new ColumnApi(httpClient);
        this.collection = new CollectionApi(httpClient);
        this.collectionItem = new CollectionItemApi(httpClient);
        this.chat = new ChatApi(httpClient);
        this.character = new CharacterApi(httpClient);
        this.channel = new ChannelApi(httpClient);
        this.category = new CategoryApi(httpClient);
        this.card = new CardApi(httpClient);
        this.attribute = new AttributeApi(httpClient);
        this.article = new ArticleApi(httpClient);
        this.app = new AppApi(httpClient);
        this.apikey = new ApikeyApi(httpClient);
        this.agent = new AgentApi(httpClient);
        this.account = new AccountApi(httpClient);
        this.system = new SystemApi(httpClient);
        this.search = new SearchApi(httpClient);
        this.auth = new AuthApi(httpClient);
    }

    public SdkworkBackendClient(Types.SdkConfig config) {
        this.httpClient = new HttpClient(config);
        this.workspace = new WorkspaceApi(httpClient);
        this.vote = new VoteApi(httpClient);
        this.voice = new VoiceApi(httpClient);
        this.visitHistory = new VisitHistoryApi(httpClient);
        this.vip = new VipApi(httpClient);
        this.video = new VideoApi(httpClient);
        this.user = new UserApi(httpClient);
        this.usage = new UsageApi(httpClient);
        this.trade = new TradeApi(httpClient);
        this.tool = new ToolApi(httpClient);
        this.tenant = new TenantApi(httpClient);
        this.table = new TableApi(httpClient);
        this.sku = new SkuApi(httpClient);
        this.skill = new SkillApi(httpClient);
        this.shortUrl = new ShortUrlApi(httpClient);
        this.shop = new ShopApi(httpClient);
        this.share = new ShareApi(httpClient);
        this.sharding = new ShardingApi(httpClient);
        this.security = new SecurityApi(httpClient);
        this.schema = new SchemaApi(httpClient);
        this.role = new RoleApi(httpClient);
        this.record = new RecordApi(httpClient);
        this.rbac = new RbacApi(httpClient);
        this.prompt = new PromptApi(httpClient);
        this.project = new ProjectApi(httpClient);
        this.product = new ProductApi(httpClient);
        this.ppt = new PptApi(httpClient);
        this.permission = new PermissionApi(httpClient);
        this.partner = new PartnerApi(httpClient);
        this.participant = new ParticipantApi(httpClient);
        this.oss = new OssApi(httpClient);
        this.organization = new OrganizationApi(httpClient);
        this.organizationMember = new OrganizationMemberApi(httpClient);
        this.notification = new NotificationApi(httpClient);
        this.note = new NoteApi(httpClient);
        this.news = new NewsApi(httpClient);
        this.net = new NetApi(httpClient);
        this.music = new MusicApi(httpClient);
        this.model = new ModelApi(httpClient);
        this.message = new MessageApi(httpClient);
        this.member = new MemberApi(httpClient);
        this.knowledgeBase = new KnowledgeBaseApi(httpClient);
        this.invitation = new InvitationApi(httpClient);
        this.image = new ImageApi(httpClient);
        this.im = new ImApi(httpClient);
        this.generation = new GenerationApi(httpClient);
        this.game = new GameApi(httpClient);
        this.file = new FileApi(httpClient);
        this.feed = new FeedApi(httpClient);
        this.feedback = new FeedbackApi(httpClient);
        this.favorite = new FavoriteApi(httpClient);
        this.disk = new DiskApi(httpClient);
        this.detail = new DetailApi(httpClient);
        this.department = new DepartmentApi(httpClient);
        this.datasource = new DatasourceApi(httpClient);
        this.coupon = new CouponApi(httpClient);
        this.conversation = new ConversationApi(httpClient);
        this.contentWriting = new ContentWritingApi(httpClient);
        this.comment = new CommentApi(httpClient);
        this.column = new ColumnApi(httpClient);
        this.collection = new CollectionApi(httpClient);
        this.collectionItem = new CollectionItemApi(httpClient);
        this.chat = new ChatApi(httpClient);
        this.character = new CharacterApi(httpClient);
        this.channel = new ChannelApi(httpClient);
        this.category = new CategoryApi(httpClient);
        this.card = new CardApi(httpClient);
        this.attribute = new AttributeApi(httpClient);
        this.article = new ArticleApi(httpClient);
        this.app = new AppApi(httpClient);
        this.apikey = new ApikeyApi(httpClient);
        this.agent = new AgentApi(httpClient);
        this.account = new AccountApi(httpClient);
        this.system = new SystemApi(httpClient);
        this.search = new SearchApi(httpClient);
        this.auth = new AuthApi(httpClient);
    }

    public WorkspaceApi getWorkspace() {
        return this.workspace;
    }

    public VoteApi getVote() {
        return this.vote;
    }

    public VoiceApi getVoice() {
        return this.voice;
    }

    public VisitHistoryApi getVisitHistory() {
        return this.visitHistory;
    }

    public VipApi getVip() {
        return this.vip;
    }

    public VideoApi getVideo() {
        return this.video;
    }

    public UserApi getUser() {
        return this.user;
    }

    public UsageApi getUsage() {
        return this.usage;
    }

    public TradeApi getTrade() {
        return this.trade;
    }

    public ToolApi getTool() {
        return this.tool;
    }

    public TenantApi getTenant() {
        return this.tenant;
    }

    public TableApi getTable() {
        return this.table;
    }

    public SkuApi getSku() {
        return this.sku;
    }

    public SkillApi getSkill() {
        return this.skill;
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

    public ShardingApi getSharding() {
        return this.sharding;
    }

    public SecurityApi getSecurity() {
        return this.security;
    }

    public SchemaApi getSchema() {
        return this.schema;
    }

    public RoleApi getRole() {
        return this.role;
    }

    public RecordApi getRecord() {
        return this.record;
    }

    public RbacApi getRbac() {
        return this.rbac;
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

    public PptApi getPpt() {
        return this.ppt;
    }

    public PermissionApi getPermission() {
        return this.permission;
    }

    public PartnerApi getPartner() {
        return this.partner;
    }

    public ParticipantApi getParticipant() {
        return this.participant;
    }

    public OssApi getOss() {
        return this.oss;
    }

    public OrganizationApi getOrganization() {
        return this.organization;
    }

    public OrganizationMemberApi getOrganizationMember() {
        return this.organizationMember;
    }

    public NotificationApi getNotification() {
        return this.notification;
    }

    public NoteApi getNote() {
        return this.note;
    }

    public NewsApi getNews() {
        return this.news;
    }

    public NetApi getNet() {
        return this.net;
    }

    public MusicApi getMusic() {
        return this.music;
    }

    public ModelApi getModel() {
        return this.model;
    }

    public MessageApi getMessage() {
        return this.message;
    }

    public MemberApi getMember() {
        return this.member;
    }

    public KnowledgeBaseApi getKnowledgeBase() {
        return this.knowledgeBase;
    }

    public InvitationApi getInvitation() {
        return this.invitation;
    }

    public ImageApi getImage() {
        return this.image;
    }

    public ImApi getIm() {
        return this.im;
    }

    public GenerationApi getGeneration() {
        return this.generation;
    }

    public GameApi getGame() {
        return this.game;
    }

    public FileApi getFile() {
        return this.file;
    }

    public FeedApi getFeed() {
        return this.feed;
    }

    public FeedbackApi getFeedback() {
        return this.feedback;
    }

    public FavoriteApi getFavorite() {
        return this.favorite;
    }

    public DiskApi getDisk() {
        return this.disk;
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

    public ChatApi getChat() {
        return this.chat;
    }

    public CharacterApi getCharacter() {
        return this.character;
    }

    public ChannelApi getChannel() {
        return this.channel;
    }

    public CategoryApi getCategory() {
        return this.category;
    }

    public CardApi getCard() {
        return this.card;
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

    public ApikeyApi getApikey() {
        return this.apikey;
    }

    public AgentApi getAgent() {
        return this.agent;
    }

    public AccountApi getAccount() {
        return this.account;
    }

    public SystemApi getSystem() {
        return this.system;
    }

    public SearchApi getSearch() {
        return this.search;
    }

    public AuthApi getAuth() {
        return this.auth;
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
