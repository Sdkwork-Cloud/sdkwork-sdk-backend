import 'package:sdkwork_common_flutter/sdkwork_common_flutter.dart';
import 'src/http/client.dart';
import '../api/workspace.dart';
import '../api/vote.dart';
import '../api/voice.dart';
import '../api/visit_history.dart';
import '../api/vip.dart';
import '../api/video.dart';
import '../api/user.dart';
import '../api/usage.dart';
import '../api/trade.dart';
import '../api/tool.dart';
import '../api/tenant.dart';
import '../api/table.dart';
import '../api/sku.dart';
import '../api/skill.dart';
import '../api/short_url.dart';
import '../api/shop.dart';
import '../api/share.dart';
import '../api/sharding.dart';
import '../api/security.dart';
import '../api/schema.dart';
import '../api/role.dart';
import '../api/record.dart';
import '../api/rbac.dart';
import '../api/prompt.dart';
import '../api/project.dart';
import '../api/product.dart';
import '../api/ppt.dart';
import '../api/permission.dart';
import '../api/partner.dart';
import '../api/participant.dart';
import '../api/oss.dart';
import '../api/organization.dart';
import '../api/organization_member.dart';
import '../api/notification.dart';
import '../api/note.dart';
import '../api/news.dart';
import '../api/net.dart';
import '../api/music.dart';
import '../api/model.dart';
import '../api/message.dart';
import '../api/member.dart';
import '../api/knowledge_base.dart';
import '../api/invitation.dart';
import '../api/image.dart';
import '../api/im.dart';
import '../api/generation.dart';
import '../api/game.dart';
import '../api/file.dart';
import '../api/feed.dart';
import '../api/feedback.dart';
import '../api/favorite.dart';
import '../api/disk.dart';
import '../api/detail.dart';
import '../api/department.dart';
import '../api/datasource.dart';
import '../api/coupon.dart';
import '../api/conversation.dart';
import '../api/content_writing.dart';
import '../api/comment.dart';
import '../api/column.dart';
import '../api/collection.dart';
import '../api/collection_item.dart';
import '../api/chat.dart';
import '../api/character.dart';
import '../api/channel.dart';
import '../api/category.dart';
import '../api/card.dart';
import '../api/attribute.dart';
import '../api/article.dart';
import '../api/app.dart';
import '../api/apikey.dart';
import '../api/agent.dart';
import '../api/account.dart';
import '../api/system.dart';
import '../api/search.dart';
import '../api/auth.dart';

class SdkworkBackendClient {
  final HttpClient _httpClient;

  late final WorkspaceApi workspace;
  late final VoteApi vote;
  late final VoiceApi voice;
  late final VisitHistoryApi visitHistory;
  late final VipApi vip;
  late final VideoApi video;
  late final UserApi user;
  late final UsageApi usage;
  late final TradeApi trade;
  late final ToolApi tool;
  late final TenantApi tenant;
  late final TableApi table;
  late final SkuApi sku;
  late final SkillApi skill;
  late final ShortUrlApi shortUrl;
  late final ShopApi shop;
  late final ShareApi share;
  late final ShardingApi sharding;
  late final SecurityApi security;
  late final SchemaApi schema;
  late final RoleApi role;
  late final RecordApi record;
  late final RbacApi rbac;
  late final PromptApi prompt;
  late final ProjectApi project;
  late final ProductApi product;
  late final PptApi ppt;
  late final PermissionApi permission;
  late final PartnerApi partner;
  late final ParticipantApi participant;
  late final OssApi oss;
  late final OrganizationApi organization;
  late final OrganizationMemberApi organizationMember;
  late final NotificationApi notification;
  late final NoteApi note;
  late final NewsApi news;
  late final NetApi net;
  late final MusicApi music;
  late final ModelApi model;
  late final MessageApi message;
  late final MemberApi member;
  late final KnowledgeBaseApi knowledgeBase;
  late final InvitationApi invitation;
  late final ImageApi image;
  late final ImApi im;
  late final GenerationApi generation;
  late final GameApi game;
  late final FileApi file;
  late final FeedApi feed;
  late final FeedbackApi feedback;
  late final FavoriteApi favorite;
  late final DiskApi disk;
  late final DetailApi detail;
  late final DepartmentApi department;
  late final DatasourceApi datasource;
  late final CouponApi coupon;
  late final ConversationApi conversation;
  late final ContentWritingApi contentWriting;
  late final CommentApi comment;
  late final ColumnApi column;
  late final CollectionApi collection;
  late final CollectionItemApi collectionItem;
  late final ChatApi chat;
  late final CharacterApi character;
  late final ChannelApi channel;
  late final CategoryApi category;
  late final CardApi card;
  late final AttributeApi attribute;
  late final ArticleApi article;
  late final AppApi app;
  late final ApikeyApi apikey;
  late final AgentApi agent;
  late final AccountApi account;
  late final SystemApi system;
  late final SearchApi search;
  late final AuthApi auth;

  SdkworkBackendClient({
    required SdkConfig config,
  }) : _httpClient = HttpClient(config: config) {
    workspace = WorkspaceApi(_httpClient);
    vote = VoteApi(_httpClient);
    voice = VoiceApi(_httpClient);
    visitHistory = VisitHistoryApi(_httpClient);
    vip = VipApi(_httpClient);
    video = VideoApi(_httpClient);
    user = UserApi(_httpClient);
    usage = UsageApi(_httpClient);
    trade = TradeApi(_httpClient);
    tool = ToolApi(_httpClient);
    tenant = TenantApi(_httpClient);
    table = TableApi(_httpClient);
    sku = SkuApi(_httpClient);
    skill = SkillApi(_httpClient);
    shortUrl = ShortUrlApi(_httpClient);
    shop = ShopApi(_httpClient);
    share = ShareApi(_httpClient);
    sharding = ShardingApi(_httpClient);
    security = SecurityApi(_httpClient);
    schema = SchemaApi(_httpClient);
    role = RoleApi(_httpClient);
    record = RecordApi(_httpClient);
    rbac = RbacApi(_httpClient);
    prompt = PromptApi(_httpClient);
    project = ProjectApi(_httpClient);
    product = ProductApi(_httpClient);
    ppt = PptApi(_httpClient);
    permission = PermissionApi(_httpClient);
    partner = PartnerApi(_httpClient);
    participant = ParticipantApi(_httpClient);
    oss = OssApi(_httpClient);
    organization = OrganizationApi(_httpClient);
    organizationMember = OrganizationMemberApi(_httpClient);
    notification = NotificationApi(_httpClient);
    note = NoteApi(_httpClient);
    news = NewsApi(_httpClient);
    net = NetApi(_httpClient);
    music = MusicApi(_httpClient);
    model = ModelApi(_httpClient);
    message = MessageApi(_httpClient);
    member = MemberApi(_httpClient);
    knowledgeBase = KnowledgeBaseApi(_httpClient);
    invitation = InvitationApi(_httpClient);
    image = ImageApi(_httpClient);
    im = ImApi(_httpClient);
    generation = GenerationApi(_httpClient);
    game = GameApi(_httpClient);
    file = FileApi(_httpClient);
    feed = FeedApi(_httpClient);
    feedback = FeedbackApi(_httpClient);
    favorite = FavoriteApi(_httpClient);
    disk = DiskApi(_httpClient);
    detail = DetailApi(_httpClient);
    department = DepartmentApi(_httpClient);
    datasource = DatasourceApi(_httpClient);
    coupon = CouponApi(_httpClient);
    conversation = ConversationApi(_httpClient);
    contentWriting = ContentWritingApi(_httpClient);
    comment = CommentApi(_httpClient);
    column = ColumnApi(_httpClient);
    collection = CollectionApi(_httpClient);
    collectionItem = CollectionItemApi(_httpClient);
    chat = ChatApi(_httpClient);
    character = CharacterApi(_httpClient);
    channel = ChannelApi(_httpClient);
    category = CategoryApi(_httpClient);
    card = CardApi(_httpClient);
    attribute = AttributeApi(_httpClient);
    article = ArticleApi(_httpClient);
    app = AppApi(_httpClient);
    apikey = ApikeyApi(_httpClient);
    agent = AgentApi(_httpClient);
    account = AccountApi(_httpClient);
    system = SystemApi(_httpClient);
    search = SearchApi(_httpClient);
    auth = AuthApi(_httpClient);
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
