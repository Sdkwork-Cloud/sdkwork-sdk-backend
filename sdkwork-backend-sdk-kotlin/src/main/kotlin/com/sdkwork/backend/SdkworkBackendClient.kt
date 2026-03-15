package com.sdkwork.backend

import com.sdkwork.common.core.SdkConfig
import com.sdkwork.backend.http.HttpClient
import com.sdkwork.backend.api.WorkspaceApi
import com.sdkwork.backend.api.VoteApi
import com.sdkwork.backend.api.VoiceApi
import com.sdkwork.backend.api.VisitHistoryApi
import com.sdkwork.backend.api.VipApi
import com.sdkwork.backend.api.VideoApi
import com.sdkwork.backend.api.UserApi
import com.sdkwork.backend.api.UsageApi
import com.sdkwork.backend.api.TradeApi
import com.sdkwork.backend.api.ToolApi
import com.sdkwork.backend.api.TenantApi
import com.sdkwork.backend.api.TableApi
import com.sdkwork.backend.api.SkuApi
import com.sdkwork.backend.api.SkillApi
import com.sdkwork.backend.api.ShortUrlApi
import com.sdkwork.backend.api.ShopApi
import com.sdkwork.backend.api.ShareApi
import com.sdkwork.backend.api.ShardingApi
import com.sdkwork.backend.api.SecurityApi
import com.sdkwork.backend.api.SchemaApi
import com.sdkwork.backend.api.RoleApi
import com.sdkwork.backend.api.RecordApi
import com.sdkwork.backend.api.RbacApi
import com.sdkwork.backend.api.PromptApi
import com.sdkwork.backend.api.ProjectApi
import com.sdkwork.backend.api.ProductApi
import com.sdkwork.backend.api.PptApi
import com.sdkwork.backend.api.PermissionApi
import com.sdkwork.backend.api.PartnerApi
import com.sdkwork.backend.api.ParticipantApi
import com.sdkwork.backend.api.OssApi
import com.sdkwork.backend.api.OrganizationApi
import com.sdkwork.backend.api.OrganizationMemberApi
import com.sdkwork.backend.api.NotificationApi
import com.sdkwork.backend.api.NoteApi
import com.sdkwork.backend.api.NewsApi
import com.sdkwork.backend.api.NetApi
import com.sdkwork.backend.api.MusicApi
import com.sdkwork.backend.api.ModelApi
import com.sdkwork.backend.api.MessageApi
import com.sdkwork.backend.api.MemberApi
import com.sdkwork.backend.api.KnowledgeBaseApi
import com.sdkwork.backend.api.InvitationApi
import com.sdkwork.backend.api.ImageApi
import com.sdkwork.backend.api.ImApi
import com.sdkwork.backend.api.GenerationApi
import com.sdkwork.backend.api.GameApi
import com.sdkwork.backend.api.FileApi
import com.sdkwork.backend.api.FeedApi
import com.sdkwork.backend.api.FeedbackApi
import com.sdkwork.backend.api.FavoriteApi
import com.sdkwork.backend.api.DiskApi
import com.sdkwork.backend.api.DetailApi
import com.sdkwork.backend.api.DepartmentApi
import com.sdkwork.backend.api.DatasourceApi
import com.sdkwork.backend.api.CouponApi
import com.sdkwork.backend.api.ConversationApi
import com.sdkwork.backend.api.ContentWritingApi
import com.sdkwork.backend.api.CommentApi
import com.sdkwork.backend.api.ColumnApi
import com.sdkwork.backend.api.CollectionApi
import com.sdkwork.backend.api.CollectionItemApi
import com.sdkwork.backend.api.ChatApi
import com.sdkwork.backend.api.CharacterApi
import com.sdkwork.backend.api.ChannelApi
import com.sdkwork.backend.api.CategoryApi
import com.sdkwork.backend.api.CardApi
import com.sdkwork.backend.api.AttributeApi
import com.sdkwork.backend.api.ArticleApi
import com.sdkwork.backend.api.AppApi
import com.sdkwork.backend.api.ApikeyApi
import com.sdkwork.backend.api.AgentApi
import com.sdkwork.backend.api.AccountApi
import com.sdkwork.backend.api.SystemApi
import com.sdkwork.backend.api.SearchApi
import com.sdkwork.backend.api.AuthApi

class SdkworkBackendClient {
    private val httpClient: HttpClient

    lateinit var workspace: WorkspaceApi
    lateinit var vote: VoteApi
    lateinit var voice: VoiceApi
    lateinit var visitHistory: VisitHistoryApi
    lateinit var vip: VipApi
    lateinit var video: VideoApi
    lateinit var user: UserApi
    lateinit var usage: UsageApi
    lateinit var trade: TradeApi
    lateinit var tool: ToolApi
    lateinit var tenant: TenantApi
    lateinit var table: TableApi
    lateinit var sku: SkuApi
    lateinit var skill: SkillApi
    lateinit var shortUrl: ShortUrlApi
    lateinit var shop: ShopApi
    lateinit var share: ShareApi
    lateinit var sharding: ShardingApi
    lateinit var security: SecurityApi
    lateinit var schema: SchemaApi
    lateinit var role: RoleApi
    lateinit var record: RecordApi
    lateinit var rbac: RbacApi
    lateinit var prompt: PromptApi
    lateinit var project: ProjectApi
    lateinit var product: ProductApi
    lateinit var ppt: PptApi
    lateinit var permission: PermissionApi
    lateinit var partner: PartnerApi
    lateinit var participant: ParticipantApi
    lateinit var oss: OssApi
    lateinit var organization: OrganizationApi
    lateinit var organizationMember: OrganizationMemberApi
    lateinit var notification: NotificationApi
    lateinit var note: NoteApi
    lateinit var news: NewsApi
    lateinit var net: NetApi
    lateinit var music: MusicApi
    lateinit var model: ModelApi
    lateinit var message: MessageApi
    lateinit var member: MemberApi
    lateinit var knowledgeBase: KnowledgeBaseApi
    lateinit var invitation: InvitationApi
    lateinit var image: ImageApi
    lateinit var im: ImApi
    lateinit var generation: GenerationApi
    lateinit var game: GameApi
    lateinit var file: FileApi
    lateinit var feed: FeedApi
    lateinit var feedback: FeedbackApi
    lateinit var favorite: FavoriteApi
    lateinit var disk: DiskApi
    lateinit var detail: DetailApi
    lateinit var department: DepartmentApi
    lateinit var datasource: DatasourceApi
    lateinit var coupon: CouponApi
    lateinit var conversation: ConversationApi
    lateinit var contentWriting: ContentWritingApi
    lateinit var comment: CommentApi
    lateinit var column: ColumnApi
    lateinit var collection: CollectionApi
    lateinit var collectionItem: CollectionItemApi
    lateinit var chat: ChatApi
    lateinit var character: CharacterApi
    lateinit var channel: ChannelApi
    lateinit var category: CategoryApi
    lateinit var card: CardApi
    lateinit var attribute: AttributeApi
    lateinit var article: ArticleApi
    lateinit var app: AppApi
    lateinit var apikey: ApikeyApi
    lateinit var agent: AgentApi
    lateinit var account: AccountApi
    lateinit var system: SystemApi
    lateinit var search: SearchApi
    lateinit var auth: AuthApi

    constructor(baseUrl: String) {
        this.httpClient = HttpClient(baseUrl)
        workspace = WorkspaceApi(httpClient)
        vote = VoteApi(httpClient)
        voice = VoiceApi(httpClient)
        visitHistory = VisitHistoryApi(httpClient)
        vip = VipApi(httpClient)
        video = VideoApi(httpClient)
        user = UserApi(httpClient)
        usage = UsageApi(httpClient)
        trade = TradeApi(httpClient)
        tool = ToolApi(httpClient)
        tenant = TenantApi(httpClient)
        table = TableApi(httpClient)
        sku = SkuApi(httpClient)
        skill = SkillApi(httpClient)
        shortUrl = ShortUrlApi(httpClient)
        shop = ShopApi(httpClient)
        share = ShareApi(httpClient)
        sharding = ShardingApi(httpClient)
        security = SecurityApi(httpClient)
        schema = SchemaApi(httpClient)
        role = RoleApi(httpClient)
        record = RecordApi(httpClient)
        rbac = RbacApi(httpClient)
        prompt = PromptApi(httpClient)
        project = ProjectApi(httpClient)
        product = ProductApi(httpClient)
        ppt = PptApi(httpClient)
        permission = PermissionApi(httpClient)
        partner = PartnerApi(httpClient)
        participant = ParticipantApi(httpClient)
        oss = OssApi(httpClient)
        organization = OrganizationApi(httpClient)
        organizationMember = OrganizationMemberApi(httpClient)
        notification = NotificationApi(httpClient)
        note = NoteApi(httpClient)
        news = NewsApi(httpClient)
        net = NetApi(httpClient)
        music = MusicApi(httpClient)
        model = ModelApi(httpClient)
        message = MessageApi(httpClient)
        member = MemberApi(httpClient)
        knowledgeBase = KnowledgeBaseApi(httpClient)
        invitation = InvitationApi(httpClient)
        image = ImageApi(httpClient)
        im = ImApi(httpClient)
        generation = GenerationApi(httpClient)
        game = GameApi(httpClient)
        file = FileApi(httpClient)
        feed = FeedApi(httpClient)
        feedback = FeedbackApi(httpClient)
        favorite = FavoriteApi(httpClient)
        disk = DiskApi(httpClient)
        detail = DetailApi(httpClient)
        department = DepartmentApi(httpClient)
        datasource = DatasourceApi(httpClient)
        coupon = CouponApi(httpClient)
        conversation = ConversationApi(httpClient)
        contentWriting = ContentWritingApi(httpClient)
        comment = CommentApi(httpClient)
        column = ColumnApi(httpClient)
        collection = CollectionApi(httpClient)
        collectionItem = CollectionItemApi(httpClient)
        chat = ChatApi(httpClient)
        character = CharacterApi(httpClient)
        channel = ChannelApi(httpClient)
        category = CategoryApi(httpClient)
        card = CardApi(httpClient)
        attribute = AttributeApi(httpClient)
        article = ArticleApi(httpClient)
        app = AppApi(httpClient)
        apikey = ApikeyApi(httpClient)
        agent = AgentApi(httpClient)
        account = AccountApi(httpClient)
        system = SystemApi(httpClient)
        search = SearchApi(httpClient)
        auth = AuthApi(httpClient)
    }

    constructor(config: SdkConfig) {
        this.httpClient = HttpClient(config)
        workspace = WorkspaceApi(httpClient)
        vote = VoteApi(httpClient)
        voice = VoiceApi(httpClient)
        visitHistory = VisitHistoryApi(httpClient)
        vip = VipApi(httpClient)
        video = VideoApi(httpClient)
        user = UserApi(httpClient)
        usage = UsageApi(httpClient)
        trade = TradeApi(httpClient)
        tool = ToolApi(httpClient)
        tenant = TenantApi(httpClient)
        table = TableApi(httpClient)
        sku = SkuApi(httpClient)
        skill = SkillApi(httpClient)
        shortUrl = ShortUrlApi(httpClient)
        shop = ShopApi(httpClient)
        share = ShareApi(httpClient)
        sharding = ShardingApi(httpClient)
        security = SecurityApi(httpClient)
        schema = SchemaApi(httpClient)
        role = RoleApi(httpClient)
        record = RecordApi(httpClient)
        rbac = RbacApi(httpClient)
        prompt = PromptApi(httpClient)
        project = ProjectApi(httpClient)
        product = ProductApi(httpClient)
        ppt = PptApi(httpClient)
        permission = PermissionApi(httpClient)
        partner = PartnerApi(httpClient)
        participant = ParticipantApi(httpClient)
        oss = OssApi(httpClient)
        organization = OrganizationApi(httpClient)
        organizationMember = OrganizationMemberApi(httpClient)
        notification = NotificationApi(httpClient)
        note = NoteApi(httpClient)
        news = NewsApi(httpClient)
        net = NetApi(httpClient)
        music = MusicApi(httpClient)
        model = ModelApi(httpClient)
        message = MessageApi(httpClient)
        member = MemberApi(httpClient)
        knowledgeBase = KnowledgeBaseApi(httpClient)
        invitation = InvitationApi(httpClient)
        image = ImageApi(httpClient)
        im = ImApi(httpClient)
        generation = GenerationApi(httpClient)
        game = GameApi(httpClient)
        file = FileApi(httpClient)
        feed = FeedApi(httpClient)
        feedback = FeedbackApi(httpClient)
        favorite = FavoriteApi(httpClient)
        disk = DiskApi(httpClient)
        detail = DetailApi(httpClient)
        department = DepartmentApi(httpClient)
        datasource = DatasourceApi(httpClient)
        coupon = CouponApi(httpClient)
        conversation = ConversationApi(httpClient)
        contentWriting = ContentWritingApi(httpClient)
        comment = CommentApi(httpClient)
        column = ColumnApi(httpClient)
        collection = CollectionApi(httpClient)
        collectionItem = CollectionItemApi(httpClient)
        chat = ChatApi(httpClient)
        character = CharacterApi(httpClient)
        channel = ChannelApi(httpClient)
        category = CategoryApi(httpClient)
        card = CardApi(httpClient)
        attribute = AttributeApi(httpClient)
        article = ArticleApi(httpClient)
        app = AppApi(httpClient)
        apikey = ApikeyApi(httpClient)
        agent = AgentApi(httpClient)
        account = AccountApi(httpClient)
        system = SystemApi(httpClient)
        search = SearchApi(httpClient)
        auth = AuthApi(httpClient)
    }

    fun setApiKey(apiKey: String): SdkworkBackendClient {
        httpClient.setApiKey(apiKey)
        return this
    }

    fun setAuthToken(token: String): SdkworkBackendClient {
        httpClient.setAuthToken(token)
        return this
    }

    fun setAccessToken(token: String): SdkworkBackendClient {
        httpClient.setAccessToken(token)
        return this
    }

    fun setHeader(key: String, value: String): SdkworkBackendClient {
        httpClient.setHeader(key, value)
        return this
    }
}
