import Foundation
import SDKworkCommon

public class SdkworkBackendClient {
    private let httpClient: HttpClient
    public let workspace: WorkspaceApi
    public let vote: VoteApi
    public let voice: VoiceApi
    public let visitHistory: VisitHistoryApi
    public let vip: VipApi
    public let video: VideoApi
    public let user: UserApi
    public let usage: UsageApi
    public let trade: TradeApi
    public let tool: ToolApi
    public let tenant: TenantApi
    public let table: TableApi
    public let sku: SkuApi
    public let skill: SkillApi
    public let shortUrl: ShortUrlApi
    public let shop: ShopApi
    public let share: ShareApi
    public let sharding: ShardingApi
    public let security: SecurityApi
    public let schema: SchemaApi
    public let role: RoleApi
    public let record: RecordApi
    public let rbac: RbacApi
    public let prompt: PromptApi
    public let project: ProjectApi
    public let product: ProductApi
    public let ppt: PptApi
    public let permission: PermissionApi
    public let partner: PartnerApi
    public let participant: ParticipantApi
    public let oss: OssApi
    public let organization: OrganizationApi
    public let organizationMember: OrganizationMemberApi
    public let notification: NotificationApi
    public let note: NoteApi
    public let news: NewsApi
    public let net: NetApi
    public let music: MusicApi
    public let model: ModelApi
    public let message: MessageApi
    public let member: MemberApi
    public let knowledgeBase: KnowledgeBaseApi
    public let invitation: InvitationApi
    public let image: ImageApi
    public let im: ImApi
    public let generation: GenerationApi
    public let game: GameApi
    public let file: FileApi
    public let feed: FeedApi
    public let feedback: FeedbackApi
    public let favorite: FavoriteApi
    public let disk: DiskApi
    public let detail: DetailApi
    public let department: DepartmentApi
    public let datasource: DatasourceApi
    public let coupon: CouponApi
    public let conversation: ConversationApi
    public let contentWriting: ContentWritingApi
    public let comment: CommentApi
    public let column: ColumnApi
    public let collection: CollectionApi
    public let collectionItem: CollectionItemApi
    public let chat: ChatApi
    public let character: CharacterApi
    public let channel: ChannelApi
    public let category: CategoryApi
    public let card: CardApi
    public let attribute: AttributeApi
    public let article: ArticleApi
    public let app: AppApi
    public let apikey: ApikeyApi
    public let agent: AgentApi
    public let account: AccountApi
    public let system: SystemApi
    public let search: SearchApi
    public let auth: AuthApi

    public init(baseURL: String) {
        self.httpClient = HttpClient(baseURL: baseURL)
        self.workspace = WorkspaceApi(client: httpClient)
        self.vote = VoteApi(client: httpClient)
        self.voice = VoiceApi(client: httpClient)
        self.visitHistory = VisitHistoryApi(client: httpClient)
        self.vip = VipApi(client: httpClient)
        self.video = VideoApi(client: httpClient)
        self.user = UserApi(client: httpClient)
        self.usage = UsageApi(client: httpClient)
        self.trade = TradeApi(client: httpClient)
        self.tool = ToolApi(client: httpClient)
        self.tenant = TenantApi(client: httpClient)
        self.table = TableApi(client: httpClient)
        self.sku = SkuApi(client: httpClient)
        self.skill = SkillApi(client: httpClient)
        self.shortUrl = ShortUrlApi(client: httpClient)
        self.shop = ShopApi(client: httpClient)
        self.share = ShareApi(client: httpClient)
        self.sharding = ShardingApi(client: httpClient)
        self.security = SecurityApi(client: httpClient)
        self.schema = SchemaApi(client: httpClient)
        self.role = RoleApi(client: httpClient)
        self.record = RecordApi(client: httpClient)
        self.rbac = RbacApi(client: httpClient)
        self.prompt = PromptApi(client: httpClient)
        self.project = ProjectApi(client: httpClient)
        self.product = ProductApi(client: httpClient)
        self.ppt = PptApi(client: httpClient)
        self.permission = PermissionApi(client: httpClient)
        self.partner = PartnerApi(client: httpClient)
        self.participant = ParticipantApi(client: httpClient)
        self.oss = OssApi(client: httpClient)
        self.organization = OrganizationApi(client: httpClient)
        self.organizationMember = OrganizationMemberApi(client: httpClient)
        self.notification = NotificationApi(client: httpClient)
        self.note = NoteApi(client: httpClient)
        self.news = NewsApi(client: httpClient)
        self.net = NetApi(client: httpClient)
        self.music = MusicApi(client: httpClient)
        self.model = ModelApi(client: httpClient)
        self.message = MessageApi(client: httpClient)
        self.member = MemberApi(client: httpClient)
        self.knowledgeBase = KnowledgeBaseApi(client: httpClient)
        self.invitation = InvitationApi(client: httpClient)
        self.image = ImageApi(client: httpClient)
        self.im = ImApi(client: httpClient)
        self.generation = GenerationApi(client: httpClient)
        self.game = GameApi(client: httpClient)
        self.file = FileApi(client: httpClient)
        self.feed = FeedApi(client: httpClient)
        self.feedback = FeedbackApi(client: httpClient)
        self.favorite = FavoriteApi(client: httpClient)
        self.disk = DiskApi(client: httpClient)
        self.detail = DetailApi(client: httpClient)
        self.department = DepartmentApi(client: httpClient)
        self.datasource = DatasourceApi(client: httpClient)
        self.coupon = CouponApi(client: httpClient)
        self.conversation = ConversationApi(client: httpClient)
        self.contentWriting = ContentWritingApi(client: httpClient)
        self.comment = CommentApi(client: httpClient)
        self.column = ColumnApi(client: httpClient)
        self.collection = CollectionApi(client: httpClient)
        self.collectionItem = CollectionItemApi(client: httpClient)
        self.chat = ChatApi(client: httpClient)
        self.character = CharacterApi(client: httpClient)
        self.channel = ChannelApi(client: httpClient)
        self.category = CategoryApi(client: httpClient)
        self.card = CardApi(client: httpClient)
        self.attribute = AttributeApi(client: httpClient)
        self.article = ArticleApi(client: httpClient)
        self.app = AppApi(client: httpClient)
        self.apikey = ApikeyApi(client: httpClient)
        self.agent = AgentApi(client: httpClient)
        self.account = AccountApi(client: httpClient)
        self.system = SystemApi(client: httpClient)
        self.search = SearchApi(client: httpClient)
        self.auth = AuthApi(client: httpClient)
    }

    public init(config: SdkConfig) {
        self.httpClient = HttpClient(config: config)
        self.workspace = WorkspaceApi(client: httpClient)
        self.vote = VoteApi(client: httpClient)
        self.voice = VoiceApi(client: httpClient)
        self.visitHistory = VisitHistoryApi(client: httpClient)
        self.vip = VipApi(client: httpClient)
        self.video = VideoApi(client: httpClient)
        self.user = UserApi(client: httpClient)
        self.usage = UsageApi(client: httpClient)
        self.trade = TradeApi(client: httpClient)
        self.tool = ToolApi(client: httpClient)
        self.tenant = TenantApi(client: httpClient)
        self.table = TableApi(client: httpClient)
        self.sku = SkuApi(client: httpClient)
        self.skill = SkillApi(client: httpClient)
        self.shortUrl = ShortUrlApi(client: httpClient)
        self.shop = ShopApi(client: httpClient)
        self.share = ShareApi(client: httpClient)
        self.sharding = ShardingApi(client: httpClient)
        self.security = SecurityApi(client: httpClient)
        self.schema = SchemaApi(client: httpClient)
        self.role = RoleApi(client: httpClient)
        self.record = RecordApi(client: httpClient)
        self.rbac = RbacApi(client: httpClient)
        self.prompt = PromptApi(client: httpClient)
        self.project = ProjectApi(client: httpClient)
        self.product = ProductApi(client: httpClient)
        self.ppt = PptApi(client: httpClient)
        self.permission = PermissionApi(client: httpClient)
        self.partner = PartnerApi(client: httpClient)
        self.participant = ParticipantApi(client: httpClient)
        self.oss = OssApi(client: httpClient)
        self.organization = OrganizationApi(client: httpClient)
        self.organizationMember = OrganizationMemberApi(client: httpClient)
        self.notification = NotificationApi(client: httpClient)
        self.note = NoteApi(client: httpClient)
        self.news = NewsApi(client: httpClient)
        self.net = NetApi(client: httpClient)
        self.music = MusicApi(client: httpClient)
        self.model = ModelApi(client: httpClient)
        self.message = MessageApi(client: httpClient)
        self.member = MemberApi(client: httpClient)
        self.knowledgeBase = KnowledgeBaseApi(client: httpClient)
        self.invitation = InvitationApi(client: httpClient)
        self.image = ImageApi(client: httpClient)
        self.im = ImApi(client: httpClient)
        self.generation = GenerationApi(client: httpClient)
        self.game = GameApi(client: httpClient)
        self.file = FileApi(client: httpClient)
        self.feed = FeedApi(client: httpClient)
        self.feedback = FeedbackApi(client: httpClient)
        self.favorite = FavoriteApi(client: httpClient)
        self.disk = DiskApi(client: httpClient)
        self.detail = DetailApi(client: httpClient)
        self.department = DepartmentApi(client: httpClient)
        self.datasource = DatasourceApi(client: httpClient)
        self.coupon = CouponApi(client: httpClient)
        self.conversation = ConversationApi(client: httpClient)
        self.contentWriting = ContentWritingApi(client: httpClient)
        self.comment = CommentApi(client: httpClient)
        self.column = ColumnApi(client: httpClient)
        self.collection = CollectionApi(client: httpClient)
        self.collectionItem = CollectionItemApi(client: httpClient)
        self.chat = ChatApi(client: httpClient)
        self.character = CharacterApi(client: httpClient)
        self.channel = ChannelApi(client: httpClient)
        self.category = CategoryApi(client: httpClient)
        self.card = CardApi(client: httpClient)
        self.attribute = AttributeApi(client: httpClient)
        self.article = ArticleApi(client: httpClient)
        self.app = AppApi(client: httpClient)
        self.apikey = ApikeyApi(client: httpClient)
        self.agent = AgentApi(client: httpClient)
        self.account = AccountApi(client: httpClient)
        self.system = SystemApi(client: httpClient)
        self.search = SearchApi(client: httpClient)
        self.auth = AuthApi(client: httpClient)
    }

    public func setApiKey(_ apiKey: String) -> SdkworkBackendClient {
        httpClient.setApiKey(apiKey)
        return self
    }

    public func setAuthToken(_ token: String) -> SdkworkBackendClient {
        httpClient.setAuthToken(token)
        return self
    }

    public func setAccessToken(_ token: String) -> SdkworkBackendClient {
        httpClient.setAccessToken(token)
        return self
    }

    public func setHeader(_ key: String, value: String) -> SdkworkBackendClient {
        httpClient.setHeader(key, value: value)
        return self
    }
}
