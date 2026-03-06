package com.sdkwork.backend

import com.sdkwork.common.core.SdkConfig
import com.sdkwork.backend.http.HttpClient
import com.sdkwork.backend.api.WorkspaceApi
import com.sdkwork.backend.api.ContentVoteApi
import com.sdkwork.backend.api.VoiceSpeakerApi
import com.sdkwork.backend.api.VisitHistoryApi
import com.sdkwork.backend.api.VipUserApi
import com.sdkwork.backend.api.VipRechargeApi
import com.sdkwork.backend.api.VipRechargePackageApi
import com.sdkwork.backend.api.VipPointChangeApi
import com.sdkwork.backend.api.VipPackageGroupApi
import com.sdkwork.backend.api.VipPackageApi
import com.sdkwork.backend.api.VipLevelApi
import com.sdkwork.backend.api.VipLevelBenefitApi
import com.sdkwork.backend.api.VipBenefitApi
import com.sdkwork.backend.api.VipBenefitUsageApi
import com.sdkwork.backend.api.VideoApi
import com.sdkwork.backend.api.UserApi
import com.sdkwork.backend.api.UserOauthAccountApi
import com.sdkwork.backend.api.UserCouponApi
import com.sdkwork.backend.api.UserCardApi
import com.sdkwork.backend.api.UserAddressApi
import com.sdkwork.backend.api.UsageRecordApi
import com.sdkwork.backend.api.ShoppingCartApi
import com.sdkwork.backend.api.ShoppingCartItemApi
import com.sdkwork.backend.api.RefundApi
import com.sdkwork.backend.api.PaymentApi
import com.sdkwork.backend.api.OrderApi
import com.sdkwork.backend.api.OrderItemApi
import com.sdkwork.backend.api.ToolApi
import com.sdkwork.backend.api.TenantApi
import com.sdkwork.backend.api.DatabaseTableApi
import com.sdkwork.backend.api.ProductSkuApi
import com.sdkwork.backend.api.SkillApi
import com.sdkwork.backend.api.SkillPackageApi
import com.sdkwork.backend.api.ShortUrlApi
import com.sdkwork.backend.api.ShopApi
import com.sdkwork.backend.api.ShareApi
import com.sdkwork.backend.api.ShareVisitRecordApi
import com.sdkwork.backend.api.ShardingKeyApi
import com.sdkwork.backend.api.ApiSecurityPolicyApi
import com.sdkwork.backend.api.SchemaApi
import com.sdkwork.backend.api.RbacRoleApi
import com.sdkwork.backend.api.RolePermissionApi
import com.sdkwork.backend.api.InvocationRecordApi
import com.sdkwork.backend.api.RbacUserRoleApi
import com.sdkwork.backend.api.PromptApi
import com.sdkwork.backend.api.ProjectApi
import com.sdkwork.backend.api.ProductApi
import com.sdkwork.backend.api.PptTemplateApi
import com.sdkwork.backend.api.PptTemplateSlideApi
import com.sdkwork.backend.api.RbacPermissionApi
import com.sdkwork.backend.api.PartnerApi
import com.sdkwork.backend.api.ChatParticipantApi
import com.sdkwork.backend.api.OssBucketApi
import com.sdkwork.backend.api.OrganizationApi
import com.sdkwork.backend.api.PositionApi
import com.sdkwork.backend.api.MemberRelationsApi
import com.sdkwork.backend.api.OrganizationMemberApi
import com.sdkwork.backend.api.NotificationApi
import com.sdkwork.backend.api.NotesApi
import com.sdkwork.backend.api.NewsApi
import com.sdkwork.backend.api.NetApi
import com.sdkwork.backend.api.DnsRecordApi
import com.sdkwork.backend.api.MusicApi
import com.sdkwork.backend.api.ModelInformationApi
import com.sdkwork.backend.api.ModelPriceApi
import com.sdkwork.backend.api.ChatMessageApi
import com.sdkwork.backend.api.MemberLevelApi
import com.sdkwork.backend.api.MemberCardApi
import com.sdkwork.backend.api.KnowledgeBaseApi
import com.sdkwork.backend.api.InvitationRelationApi
import com.sdkwork.backend.api.InvitationCodeApi
import com.sdkwork.backend.api.ImageApi
import com.sdkwork.backend.api.ChatGroupApi
import com.sdkwork.backend.api.GenerationApi
import com.sdkwork.backend.api.GenerationContentApi
import com.sdkwork.backend.api.FileApi
import com.sdkwork.backend.api.FilePartApi
import com.sdkwork.backend.api.FileContentApi
import com.sdkwork.backend.api.FeedsApi
import com.sdkwork.backend.api.FeedbackApi
import com.sdkwork.backend.api.FavoriteApi
import com.sdkwork.backend.api.FileDiskApi
import com.sdkwork.backend.api.DiskMemberApi
import com.sdkwork.backend.api.DetailApi
import com.sdkwork.backend.api.DepartmentApi
import com.sdkwork.backend.api.DatasourceApi
import com.sdkwork.backend.api.CouponApi
import com.sdkwork.backend.api.CouponTemplateApi
import com.sdkwork.backend.api.ConversationApi
import com.sdkwork.backend.api.ContentWritingApi
import com.sdkwork.backend.api.CommentApi
import com.sdkwork.backend.api.ColumnApi
import com.sdkwork.backend.api.CollectionApi
import com.sdkwork.backend.api.CollectionItemApi
import com.sdkwork.backend.api.CharacterApi
import com.sdkwork.backend.api.ChannelApi
import com.sdkwork.backend.api.ChannelResourceApi
import com.sdkwork.backend.api.ChannelProxyApi
import com.sdkwork.backend.api.ChannelAccountApi
import com.sdkwork.backend.api.CategoryApi
import com.sdkwork.backend.api.MembershipCardApi
import com.sdkwork.backend.api.CardTemplateApi
import com.sdkwork.backend.api.AttributeApi
import com.sdkwork.backend.api.ArticleApi
import com.sdkwork.backend.api.AppApi
import com.sdkwork.backend.api.ApiKeyApi
import com.sdkwork.backend.api.AgentApi
import com.sdkwork.backend.api.AgentToolRelationshipApi
import com.sdkwork.backend.api.AccountApi
import com.sdkwork.backend.api.AccountHistoryApi
import com.sdkwork.backend.api.AccountExchangeConfigApi
import com.sdkwork.backend.api.InvoiceApi
import com.sdkwork.backend.api.SearchChatApi
import com.sdkwork.backend.api.PptTemplateRenderingApi
import com.sdkwork.backend.api.PptTemplateChatApi
import com.sdkwork.backend.api.KnowledgeBaseFileApi
import com.sdkwork.backend.api.KnowledgeBaseChatApi
import com.sdkwork.backend.api.ImMessageApi
import com.sdkwork.backend.api.VoiceSpeakerGenerationApi
import com.sdkwork.backend.api.VideoGenerationApi
import com.sdkwork.backend.api.MusicGenerationApi
import com.sdkwork.backend.api.ImageGenerationApi
import com.sdkwork.backend.api.CharacterGenerationApi
import com.sdkwork.backend.api.AudioGenerationApi
import com.sdkwork.backend.api.AudioEffectGenerationApi
import com.sdkwork.backend.api.ChatApi
import com.sdkwork.backend.api.AuthApi
import com.sdkwork.backend.api.AgentChatApi

class SdkworkBackendClient {
    private val httpClient: HttpClient

    lateinit var workspace: WorkspaceApi
    lateinit var contentVote: ContentVoteApi
    lateinit var voiceSpeaker: VoiceSpeakerApi
    lateinit var visitHistory: VisitHistoryApi
    lateinit var vipUser: VipUserApi
    lateinit var vipRecharge: VipRechargeApi
    lateinit var vipRechargePackage: VipRechargePackageApi
    lateinit var vipPointChange: VipPointChangeApi
    lateinit var vipPackageGroup: VipPackageGroupApi
    lateinit var vipPackage: VipPackageApi
    lateinit var vipLevel: VipLevelApi
    lateinit var vipLevelBenefit: VipLevelBenefitApi
    lateinit var vipBenefit: VipBenefitApi
    lateinit var vipBenefitUsage: VipBenefitUsageApi
    lateinit var video: VideoApi
    lateinit var user: UserApi
    lateinit var userOauthAccount: UserOauthAccountApi
    lateinit var userCoupon: UserCouponApi
    lateinit var userCard: UserCardApi
    lateinit var userAddress: UserAddressApi
    lateinit var usageRecord: UsageRecordApi
    lateinit var shoppingCart: ShoppingCartApi
    lateinit var shoppingCartItem: ShoppingCartItemApi
    lateinit var refund: RefundApi
    lateinit var payment: PaymentApi
    lateinit var order: OrderApi
    lateinit var orderItem: OrderItemApi
    lateinit var tool: ToolApi
    lateinit var tenant: TenantApi
    lateinit var databaseTable: DatabaseTableApi
    lateinit var productSku: ProductSkuApi
    lateinit var skill: SkillApi
    lateinit var skillPackage: SkillPackageApi
    lateinit var shortUrl: ShortUrlApi
    lateinit var shop: ShopApi
    lateinit var share: ShareApi
    lateinit var shareVisitRecord: ShareVisitRecordApi
    lateinit var shardingKey: ShardingKeyApi
    lateinit var apiSecurityPolicy: ApiSecurityPolicyApi
    lateinit var schema: SchemaApi
    lateinit var rbacRole: RbacRoleApi
    lateinit var rolePermission: RolePermissionApi
    lateinit var invocationRecord: InvocationRecordApi
    lateinit var rbacUserRole: RbacUserRoleApi
    lateinit var prompt: PromptApi
    lateinit var project: ProjectApi
    lateinit var product: ProductApi
    lateinit var pptTemplate: PptTemplateApi
    lateinit var pptTemplateSlide: PptTemplateSlideApi
    lateinit var rbacPermission: RbacPermissionApi
    lateinit var partner: PartnerApi
    lateinit var chatParticipant: ChatParticipantApi
    lateinit var ossBucket: OssBucketApi
    lateinit var organization: OrganizationApi
    lateinit var position: PositionApi
    lateinit var memberRelations: MemberRelationsApi
    lateinit var organizationMember: OrganizationMemberApi
    lateinit var notification: NotificationApi
    lateinit var notes: NotesApi
    lateinit var news: NewsApi
    lateinit var net: NetApi
    lateinit var dnsRecord: DnsRecordApi
    lateinit var music: MusicApi
    lateinit var modelInformation: ModelInformationApi
    lateinit var modelPrice: ModelPriceApi
    lateinit var chatMessage: ChatMessageApi
    lateinit var memberLevel: MemberLevelApi
    lateinit var memberCard: MemberCardApi
    lateinit var knowledgeBase: KnowledgeBaseApi
    lateinit var invitationRelation: InvitationRelationApi
    lateinit var invitationCode: InvitationCodeApi
    lateinit var image: ImageApi
    lateinit var chatGroup: ChatGroupApi
    lateinit var generation: GenerationApi
    lateinit var generationContent: GenerationContentApi
    lateinit var file: FileApi
    lateinit var filePart: FilePartApi
    lateinit var fileContent: FileContentApi
    lateinit var feeds: FeedsApi
    lateinit var feedback: FeedbackApi
    lateinit var favorite: FavoriteApi
    lateinit var fileDisk: FileDiskApi
    lateinit var diskMember: DiskMemberApi
    lateinit var detail: DetailApi
    lateinit var department: DepartmentApi
    lateinit var datasource: DatasourceApi
    lateinit var coupon: CouponApi
    lateinit var couponTemplate: CouponTemplateApi
    lateinit var conversation: ConversationApi
    lateinit var contentWriting: ContentWritingApi
    lateinit var comment: CommentApi
    lateinit var column: ColumnApi
    lateinit var collection: CollectionApi
    lateinit var collectionItem: CollectionItemApi
    lateinit var character: CharacterApi
    lateinit var channel: ChannelApi
    lateinit var channelResource: ChannelResourceApi
    lateinit var channelProxy: ChannelProxyApi
    lateinit var channelAccount: ChannelAccountApi
    lateinit var category: CategoryApi
    lateinit var membershipCard: MembershipCardApi
    lateinit var cardTemplate: CardTemplateApi
    lateinit var attribute: AttributeApi
    lateinit var article: ArticleApi
    lateinit var app: AppApi
    lateinit var apiKey: ApiKeyApi
    lateinit var agent: AgentApi
    lateinit var agentToolRelationship: AgentToolRelationshipApi
    lateinit var account: AccountApi
    lateinit var accountHistory: AccountHistoryApi
    lateinit var accountExchangeConfig: AccountExchangeConfigApi
    lateinit var invoice: InvoiceApi
    lateinit var searchChat: SearchChatApi
    lateinit var pptTemplateRendering: PptTemplateRenderingApi
    lateinit var pptTemplateChat: PptTemplateChatApi
    lateinit var knowledgeBaseFile: KnowledgeBaseFileApi
    lateinit var knowledgeBaseChat: KnowledgeBaseChatApi
    lateinit var imMessage: ImMessageApi
    lateinit var voiceSpeakerGeneration: VoiceSpeakerGenerationApi
    lateinit var videoGeneration: VideoGenerationApi
    lateinit var musicGeneration: MusicGenerationApi
    lateinit var imageGeneration: ImageGenerationApi
    lateinit var characterGeneration: CharacterGenerationApi
    lateinit var audioGeneration: AudioGenerationApi
    lateinit var audioEffectGeneration: AudioEffectGenerationApi
    lateinit var chat: ChatApi
    lateinit var auth: AuthApi
    lateinit var agentChat: AgentChatApi

    constructor(baseUrl: String) {
        this.httpClient = HttpClient(baseUrl)
        workspace = WorkspaceApi(httpClient)
        contentVote = ContentVoteApi(httpClient)
        voiceSpeaker = VoiceSpeakerApi(httpClient)
        visitHistory = VisitHistoryApi(httpClient)
        vipUser = VipUserApi(httpClient)
        vipRecharge = VipRechargeApi(httpClient)
        vipRechargePackage = VipRechargePackageApi(httpClient)
        vipPointChange = VipPointChangeApi(httpClient)
        vipPackageGroup = VipPackageGroupApi(httpClient)
        vipPackage = VipPackageApi(httpClient)
        vipLevel = VipLevelApi(httpClient)
        vipLevelBenefit = VipLevelBenefitApi(httpClient)
        vipBenefit = VipBenefitApi(httpClient)
        vipBenefitUsage = VipBenefitUsageApi(httpClient)
        video = VideoApi(httpClient)
        user = UserApi(httpClient)
        userOauthAccount = UserOauthAccountApi(httpClient)
        userCoupon = UserCouponApi(httpClient)
        userCard = UserCardApi(httpClient)
        userAddress = UserAddressApi(httpClient)
        usageRecord = UsageRecordApi(httpClient)
        shoppingCart = ShoppingCartApi(httpClient)
        shoppingCartItem = ShoppingCartItemApi(httpClient)
        refund = RefundApi(httpClient)
        payment = PaymentApi(httpClient)
        order = OrderApi(httpClient)
        orderItem = OrderItemApi(httpClient)
        tool = ToolApi(httpClient)
        tenant = TenantApi(httpClient)
        databaseTable = DatabaseTableApi(httpClient)
        productSku = ProductSkuApi(httpClient)
        skill = SkillApi(httpClient)
        skillPackage = SkillPackageApi(httpClient)
        shortUrl = ShortUrlApi(httpClient)
        shop = ShopApi(httpClient)
        share = ShareApi(httpClient)
        shareVisitRecord = ShareVisitRecordApi(httpClient)
        shardingKey = ShardingKeyApi(httpClient)
        apiSecurityPolicy = ApiSecurityPolicyApi(httpClient)
        schema = SchemaApi(httpClient)
        rbacRole = RbacRoleApi(httpClient)
        rolePermission = RolePermissionApi(httpClient)
        invocationRecord = InvocationRecordApi(httpClient)
        rbacUserRole = RbacUserRoleApi(httpClient)
        prompt = PromptApi(httpClient)
        project = ProjectApi(httpClient)
        product = ProductApi(httpClient)
        pptTemplate = PptTemplateApi(httpClient)
        pptTemplateSlide = PptTemplateSlideApi(httpClient)
        rbacPermission = RbacPermissionApi(httpClient)
        partner = PartnerApi(httpClient)
        chatParticipant = ChatParticipantApi(httpClient)
        ossBucket = OssBucketApi(httpClient)
        organization = OrganizationApi(httpClient)
        position = PositionApi(httpClient)
        memberRelations = MemberRelationsApi(httpClient)
        organizationMember = OrganizationMemberApi(httpClient)
        notification = NotificationApi(httpClient)
        notes = NotesApi(httpClient)
        news = NewsApi(httpClient)
        net = NetApi(httpClient)
        dnsRecord = DnsRecordApi(httpClient)
        music = MusicApi(httpClient)
        modelInformation = ModelInformationApi(httpClient)
        modelPrice = ModelPriceApi(httpClient)
        chatMessage = ChatMessageApi(httpClient)
        memberLevel = MemberLevelApi(httpClient)
        memberCard = MemberCardApi(httpClient)
        knowledgeBase = KnowledgeBaseApi(httpClient)
        invitationRelation = InvitationRelationApi(httpClient)
        invitationCode = InvitationCodeApi(httpClient)
        image = ImageApi(httpClient)
        chatGroup = ChatGroupApi(httpClient)
        generation = GenerationApi(httpClient)
        generationContent = GenerationContentApi(httpClient)
        file = FileApi(httpClient)
        filePart = FilePartApi(httpClient)
        fileContent = FileContentApi(httpClient)
        feeds = FeedsApi(httpClient)
        feedback = FeedbackApi(httpClient)
        favorite = FavoriteApi(httpClient)
        fileDisk = FileDiskApi(httpClient)
        diskMember = DiskMemberApi(httpClient)
        detail = DetailApi(httpClient)
        department = DepartmentApi(httpClient)
        datasource = DatasourceApi(httpClient)
        coupon = CouponApi(httpClient)
        couponTemplate = CouponTemplateApi(httpClient)
        conversation = ConversationApi(httpClient)
        contentWriting = ContentWritingApi(httpClient)
        comment = CommentApi(httpClient)
        column = ColumnApi(httpClient)
        collection = CollectionApi(httpClient)
        collectionItem = CollectionItemApi(httpClient)
        character = CharacterApi(httpClient)
        channel = ChannelApi(httpClient)
        channelResource = ChannelResourceApi(httpClient)
        channelProxy = ChannelProxyApi(httpClient)
        channelAccount = ChannelAccountApi(httpClient)
        category = CategoryApi(httpClient)
        membershipCard = MembershipCardApi(httpClient)
        cardTemplate = CardTemplateApi(httpClient)
        attribute = AttributeApi(httpClient)
        article = ArticleApi(httpClient)
        app = AppApi(httpClient)
        apiKey = ApiKeyApi(httpClient)
        agent = AgentApi(httpClient)
        agentToolRelationship = AgentToolRelationshipApi(httpClient)
        account = AccountApi(httpClient)
        accountHistory = AccountHistoryApi(httpClient)
        accountExchangeConfig = AccountExchangeConfigApi(httpClient)
        invoice = InvoiceApi(httpClient)
        searchChat = SearchChatApi(httpClient)
        pptTemplateRendering = PptTemplateRenderingApi(httpClient)
        pptTemplateChat = PptTemplateChatApi(httpClient)
        knowledgeBaseFile = KnowledgeBaseFileApi(httpClient)
        knowledgeBaseChat = KnowledgeBaseChatApi(httpClient)
        imMessage = ImMessageApi(httpClient)
        voiceSpeakerGeneration = VoiceSpeakerGenerationApi(httpClient)
        videoGeneration = VideoGenerationApi(httpClient)
        musicGeneration = MusicGenerationApi(httpClient)
        imageGeneration = ImageGenerationApi(httpClient)
        characterGeneration = CharacterGenerationApi(httpClient)
        audioGeneration = AudioGenerationApi(httpClient)
        audioEffectGeneration = AudioEffectGenerationApi(httpClient)
        chat = ChatApi(httpClient)
        auth = AuthApi(httpClient)
        agentChat = AgentChatApi(httpClient)
    }

    constructor(config: SdkConfig) {
        this.httpClient = HttpClient(config)
        workspace = WorkspaceApi(httpClient)
        contentVote = ContentVoteApi(httpClient)
        voiceSpeaker = VoiceSpeakerApi(httpClient)
        visitHistory = VisitHistoryApi(httpClient)
        vipUser = VipUserApi(httpClient)
        vipRecharge = VipRechargeApi(httpClient)
        vipRechargePackage = VipRechargePackageApi(httpClient)
        vipPointChange = VipPointChangeApi(httpClient)
        vipPackageGroup = VipPackageGroupApi(httpClient)
        vipPackage = VipPackageApi(httpClient)
        vipLevel = VipLevelApi(httpClient)
        vipLevelBenefit = VipLevelBenefitApi(httpClient)
        vipBenefit = VipBenefitApi(httpClient)
        vipBenefitUsage = VipBenefitUsageApi(httpClient)
        video = VideoApi(httpClient)
        user = UserApi(httpClient)
        userOauthAccount = UserOauthAccountApi(httpClient)
        userCoupon = UserCouponApi(httpClient)
        userCard = UserCardApi(httpClient)
        userAddress = UserAddressApi(httpClient)
        usageRecord = UsageRecordApi(httpClient)
        shoppingCart = ShoppingCartApi(httpClient)
        shoppingCartItem = ShoppingCartItemApi(httpClient)
        refund = RefundApi(httpClient)
        payment = PaymentApi(httpClient)
        order = OrderApi(httpClient)
        orderItem = OrderItemApi(httpClient)
        tool = ToolApi(httpClient)
        tenant = TenantApi(httpClient)
        databaseTable = DatabaseTableApi(httpClient)
        productSku = ProductSkuApi(httpClient)
        skill = SkillApi(httpClient)
        skillPackage = SkillPackageApi(httpClient)
        shortUrl = ShortUrlApi(httpClient)
        shop = ShopApi(httpClient)
        share = ShareApi(httpClient)
        shareVisitRecord = ShareVisitRecordApi(httpClient)
        shardingKey = ShardingKeyApi(httpClient)
        apiSecurityPolicy = ApiSecurityPolicyApi(httpClient)
        schema = SchemaApi(httpClient)
        rbacRole = RbacRoleApi(httpClient)
        rolePermission = RolePermissionApi(httpClient)
        invocationRecord = InvocationRecordApi(httpClient)
        rbacUserRole = RbacUserRoleApi(httpClient)
        prompt = PromptApi(httpClient)
        project = ProjectApi(httpClient)
        product = ProductApi(httpClient)
        pptTemplate = PptTemplateApi(httpClient)
        pptTemplateSlide = PptTemplateSlideApi(httpClient)
        rbacPermission = RbacPermissionApi(httpClient)
        partner = PartnerApi(httpClient)
        chatParticipant = ChatParticipantApi(httpClient)
        ossBucket = OssBucketApi(httpClient)
        organization = OrganizationApi(httpClient)
        position = PositionApi(httpClient)
        memberRelations = MemberRelationsApi(httpClient)
        organizationMember = OrganizationMemberApi(httpClient)
        notification = NotificationApi(httpClient)
        notes = NotesApi(httpClient)
        news = NewsApi(httpClient)
        net = NetApi(httpClient)
        dnsRecord = DnsRecordApi(httpClient)
        music = MusicApi(httpClient)
        modelInformation = ModelInformationApi(httpClient)
        modelPrice = ModelPriceApi(httpClient)
        chatMessage = ChatMessageApi(httpClient)
        memberLevel = MemberLevelApi(httpClient)
        memberCard = MemberCardApi(httpClient)
        knowledgeBase = KnowledgeBaseApi(httpClient)
        invitationRelation = InvitationRelationApi(httpClient)
        invitationCode = InvitationCodeApi(httpClient)
        image = ImageApi(httpClient)
        chatGroup = ChatGroupApi(httpClient)
        generation = GenerationApi(httpClient)
        generationContent = GenerationContentApi(httpClient)
        file = FileApi(httpClient)
        filePart = FilePartApi(httpClient)
        fileContent = FileContentApi(httpClient)
        feeds = FeedsApi(httpClient)
        feedback = FeedbackApi(httpClient)
        favorite = FavoriteApi(httpClient)
        fileDisk = FileDiskApi(httpClient)
        diskMember = DiskMemberApi(httpClient)
        detail = DetailApi(httpClient)
        department = DepartmentApi(httpClient)
        datasource = DatasourceApi(httpClient)
        coupon = CouponApi(httpClient)
        couponTemplate = CouponTemplateApi(httpClient)
        conversation = ConversationApi(httpClient)
        contentWriting = ContentWritingApi(httpClient)
        comment = CommentApi(httpClient)
        column = ColumnApi(httpClient)
        collection = CollectionApi(httpClient)
        collectionItem = CollectionItemApi(httpClient)
        character = CharacterApi(httpClient)
        channel = ChannelApi(httpClient)
        channelResource = ChannelResourceApi(httpClient)
        channelProxy = ChannelProxyApi(httpClient)
        channelAccount = ChannelAccountApi(httpClient)
        category = CategoryApi(httpClient)
        membershipCard = MembershipCardApi(httpClient)
        cardTemplate = CardTemplateApi(httpClient)
        attribute = AttributeApi(httpClient)
        article = ArticleApi(httpClient)
        app = AppApi(httpClient)
        apiKey = ApiKeyApi(httpClient)
        agent = AgentApi(httpClient)
        agentToolRelationship = AgentToolRelationshipApi(httpClient)
        account = AccountApi(httpClient)
        accountHistory = AccountHistoryApi(httpClient)
        accountExchangeConfig = AccountExchangeConfigApi(httpClient)
        invoice = InvoiceApi(httpClient)
        searchChat = SearchChatApi(httpClient)
        pptTemplateRendering = PptTemplateRenderingApi(httpClient)
        pptTemplateChat = PptTemplateChatApi(httpClient)
        knowledgeBaseFile = KnowledgeBaseFileApi(httpClient)
        knowledgeBaseChat = KnowledgeBaseChatApi(httpClient)
        imMessage = ImMessageApi(httpClient)
        voiceSpeakerGeneration = VoiceSpeakerGenerationApi(httpClient)
        videoGeneration = VideoGenerationApi(httpClient)
        musicGeneration = MusicGenerationApi(httpClient)
        imageGeneration = ImageGenerationApi(httpClient)
        characterGeneration = CharacterGenerationApi(httpClient)
        audioGeneration = AudioGenerationApi(httpClient)
        audioEffectGeneration = AudioEffectGenerationApi(httpClient)
        chat = ChatApi(httpClient)
        auth = AuthApi(httpClient)
        agentChat = AgentChatApi(httpClient)
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
