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
import com.sdkwork.backend.api.AiUsageRecordApi
import com.sdkwork.backend.api.ShoppingCartApi
import com.sdkwork.backend.api.ShoppingCartItemApi
import com.sdkwork.backend.api.RefundApi
import com.sdkwork.backend.api.PaymentApi
import com.sdkwork.backend.api.OrderApi
import com.sdkwork.backend.api.OrderItemApi
import com.sdkwork.backend.api.AiToolApi
import com.sdkwork.backend.api.TenantApi
import com.sdkwork.backend.api.DatabaseTableApi
import com.sdkwork.backend.api.ProductSkuApi
import com.sdkwork.backend.api.ShortUrlApi
import com.sdkwork.backend.api.ShopApi
import com.sdkwork.backend.api.ShareApi
import com.sdkwork.backend.api.ShareVisitRecordApi
import com.sdkwork.backend.api.ShardingKeyApi
import com.sdkwork.backend.api.SchemaApi
import com.sdkwork.backend.api.RbacRoleApi
import com.sdkwork.backend.api.RolePermissionApi
import com.sdkwork.backend.api.InvocationRecordApi
import com.sdkwork.backend.api.RbacUserRoleApi
import com.sdkwork.backend.api.AiPromptApi
import com.sdkwork.backend.api.ProjectApi
import com.sdkwork.backend.api.ProductApi
import com.sdkwork.backend.api.PptTemplateApi
import com.sdkwork.backend.api.PptTemplateSlideApi
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
import com.sdkwork.backend.api.HostApi
import com.sdkwork.backend.api.DnsRecordApi
import com.sdkwork.backend.api.MusicApi
import com.sdkwork.backend.api.AiModelInformationApi
import com.sdkwork.backend.api.AiModelPriceApi
import com.sdkwork.backend.api.ChatMessageApi
import com.sdkwork.backend.api.MemberLevelApi
import com.sdkwork.backend.api.MemberCardApi
import com.sdkwork.backend.api.KnowledgeBaseApi
import com.sdkwork.backend.api.InvitationRelationApi
import com.sdkwork.backend.api.InvitationCodeApi
import com.sdkwork.backend.api.ImageApi
import com.sdkwork.backend.api.ChatGroupApi
import com.sdkwork.backend.api.AiGenerationApi
import com.sdkwork.backend.api.AiGenerationContentApi
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
import com.sdkwork.backend.api.AiConversationApi
import com.sdkwork.backend.api.CommentApi
import com.sdkwork.backend.api.ColumnApi
import com.sdkwork.backend.api.CollectionApi
import com.sdkwork.backend.api.CollectionItemApi
import com.sdkwork.backend.api.CharacterApi
import com.sdkwork.backend.api.ChannelResourceApi
import com.sdkwork.backend.api.ChannelAccountApi
import com.sdkwork.backend.api.AiCategoryApi
import com.sdkwork.backend.api.MembershipCardApi
import com.sdkwork.backend.api.CardTemplateApi
import com.sdkwork.backend.api.AttributeApi
import com.sdkwork.backend.api.AiArticleApi
import com.sdkwork.backend.api.ApplicationApi
import com.sdkwork.backend.api.ApiKeyApi
import com.sdkwork.backend.api.AiAgentApi
import com.sdkwork.backend.api.AiAgentToolRelationshipApi
import com.sdkwork.backend.api.AccountApi
import com.sdkwork.backend.api.AccountHistoryApi
import com.sdkwork.backend.api.SearchChatApi
import com.sdkwork.backend.api.PptTemplateRenderingApi
import com.sdkwork.backend.api.PptTemplateChatApi
import com.sdkwork.backend.api.KnowledgeBaseFileApi
import com.sdkwork.backend.api.KnowledgeBaseChatApi
import com.sdkwork.backend.api.ImMessageApi
import com.sdkwork.backend.api.AiVoiceSpeakerGenerationApi
import com.sdkwork.backend.api.AiVideoGenerationApi
import com.sdkwork.backend.api.AiMusicGenerationApi
import com.sdkwork.backend.api.AiImageGenerationApi
import com.sdkwork.backend.api.AiCharacterGenerationApi
import com.sdkwork.backend.api.AiAudioGenerationApi
import com.sdkwork.backend.api.AiAudioEffectGenerationApi
import com.sdkwork.backend.api.AiChatApi
import com.sdkwork.backend.api.VerificationApi
import com.sdkwork.backend.api.OauthAuthenticationApi
import com.sdkwork.backend.api.AuthorizationApi
import com.sdkwork.backend.api.AuthenticationApi
import com.sdkwork.backend.api.AppApi
import com.sdkwork.backend.api.AiAgentChatApi

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
    lateinit var aiUsageRecord: AiUsageRecordApi
    lateinit var shoppingCart: ShoppingCartApi
    lateinit var shoppingCartItem: ShoppingCartItemApi
    lateinit var refund: RefundApi
    lateinit var payment: PaymentApi
    lateinit var order: OrderApi
    lateinit var orderItem: OrderItemApi
    lateinit var aiTool: AiToolApi
    lateinit var tenant: TenantApi
    lateinit var databaseTable: DatabaseTableApi
    lateinit var productSku: ProductSkuApi
    lateinit var shortUrl: ShortUrlApi
    lateinit var shop: ShopApi
    lateinit var share: ShareApi
    lateinit var shareVisitRecord: ShareVisitRecordApi
    lateinit var shardingKey: ShardingKeyApi
    lateinit var schema: SchemaApi
    lateinit var rbacRole: RbacRoleApi
    lateinit var rolePermission: RolePermissionApi
    lateinit var invocationRecord: InvocationRecordApi
    lateinit var rbacUserRole: RbacUserRoleApi
    lateinit var aiPrompt: AiPromptApi
    lateinit var project: ProjectApi
    lateinit var product: ProductApi
    lateinit var pptTemplate: PptTemplateApi
    lateinit var pptTemplateSlide: PptTemplateSlideApi
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
    lateinit var host: HostApi
    lateinit var dnsRecord: DnsRecordApi
    lateinit var music: MusicApi
    lateinit var aiModelInformation: AiModelInformationApi
    lateinit var aiModelPrice: AiModelPriceApi
    lateinit var chatMessage: ChatMessageApi
    lateinit var memberLevel: MemberLevelApi
    lateinit var memberCard: MemberCardApi
    lateinit var knowledgeBase: KnowledgeBaseApi
    lateinit var invitationRelation: InvitationRelationApi
    lateinit var invitationCode: InvitationCodeApi
    lateinit var image: ImageApi
    lateinit var chatGroup: ChatGroupApi
    lateinit var aiGeneration: AiGenerationApi
    lateinit var aiGenerationContent: AiGenerationContentApi
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
    lateinit var aiConversation: AiConversationApi
    lateinit var comment: CommentApi
    lateinit var column: ColumnApi
    lateinit var collection: CollectionApi
    lateinit var collectionItem: CollectionItemApi
    lateinit var character: CharacterApi
    lateinit var channelResource: ChannelResourceApi
    lateinit var channelAccount: ChannelAccountApi
    lateinit var aiCategory: AiCategoryApi
    lateinit var membershipCard: MembershipCardApi
    lateinit var cardTemplate: CardTemplateApi
    lateinit var attribute: AttributeApi
    lateinit var aiArticle: AiArticleApi
    lateinit var application: ApplicationApi
    lateinit var apiKey: ApiKeyApi
    lateinit var aiAgent: AiAgentApi
    lateinit var aiAgentToolRelationship: AiAgentToolRelationshipApi
    lateinit var account: AccountApi
    lateinit var accountHistory: AccountHistoryApi
    lateinit var searchChat: SearchChatApi
    lateinit var pptTemplateRendering: PptTemplateRenderingApi
    lateinit var pptTemplateChat: PptTemplateChatApi
    lateinit var knowledgeBaseFile: KnowledgeBaseFileApi
    lateinit var knowledgeBaseChat: KnowledgeBaseChatApi
    lateinit var imMessage: ImMessageApi
    lateinit var aiVoiceSpeakerGeneration: AiVoiceSpeakerGenerationApi
    lateinit var aiVideoGeneration: AiVideoGenerationApi
    lateinit var aiMusicGeneration: AiMusicGenerationApi
    lateinit var aiImageGeneration: AiImageGenerationApi
    lateinit var aiCharacterGeneration: AiCharacterGenerationApi
    lateinit var aiAudioGeneration: AiAudioGenerationApi
    lateinit var aiAudioEffectGeneration: AiAudioEffectGenerationApi
    lateinit var aiChat: AiChatApi
    lateinit var verification: VerificationApi
    lateinit var oauthAuthentication: OauthAuthenticationApi
    lateinit var authorization: AuthorizationApi
    lateinit var authentication: AuthenticationApi
    lateinit var app: AppApi
    lateinit var aiAgentChat: AiAgentChatApi

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
        aiUsageRecord = AiUsageRecordApi(httpClient)
        shoppingCart = ShoppingCartApi(httpClient)
        shoppingCartItem = ShoppingCartItemApi(httpClient)
        refund = RefundApi(httpClient)
        payment = PaymentApi(httpClient)
        order = OrderApi(httpClient)
        orderItem = OrderItemApi(httpClient)
        aiTool = AiToolApi(httpClient)
        tenant = TenantApi(httpClient)
        databaseTable = DatabaseTableApi(httpClient)
        productSku = ProductSkuApi(httpClient)
        shortUrl = ShortUrlApi(httpClient)
        shop = ShopApi(httpClient)
        share = ShareApi(httpClient)
        shareVisitRecord = ShareVisitRecordApi(httpClient)
        shardingKey = ShardingKeyApi(httpClient)
        schema = SchemaApi(httpClient)
        rbacRole = RbacRoleApi(httpClient)
        rolePermission = RolePermissionApi(httpClient)
        invocationRecord = InvocationRecordApi(httpClient)
        rbacUserRole = RbacUserRoleApi(httpClient)
        aiPrompt = AiPromptApi(httpClient)
        project = ProjectApi(httpClient)
        product = ProductApi(httpClient)
        pptTemplate = PptTemplateApi(httpClient)
        pptTemplateSlide = PptTemplateSlideApi(httpClient)
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
        host = HostApi(httpClient)
        dnsRecord = DnsRecordApi(httpClient)
        music = MusicApi(httpClient)
        aiModelInformation = AiModelInformationApi(httpClient)
        aiModelPrice = AiModelPriceApi(httpClient)
        chatMessage = ChatMessageApi(httpClient)
        memberLevel = MemberLevelApi(httpClient)
        memberCard = MemberCardApi(httpClient)
        knowledgeBase = KnowledgeBaseApi(httpClient)
        invitationRelation = InvitationRelationApi(httpClient)
        invitationCode = InvitationCodeApi(httpClient)
        image = ImageApi(httpClient)
        chatGroup = ChatGroupApi(httpClient)
        aiGeneration = AiGenerationApi(httpClient)
        aiGenerationContent = AiGenerationContentApi(httpClient)
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
        aiConversation = AiConversationApi(httpClient)
        comment = CommentApi(httpClient)
        column = ColumnApi(httpClient)
        collection = CollectionApi(httpClient)
        collectionItem = CollectionItemApi(httpClient)
        character = CharacterApi(httpClient)
        channelResource = ChannelResourceApi(httpClient)
        channelAccount = ChannelAccountApi(httpClient)
        aiCategory = AiCategoryApi(httpClient)
        membershipCard = MembershipCardApi(httpClient)
        cardTemplate = CardTemplateApi(httpClient)
        attribute = AttributeApi(httpClient)
        aiArticle = AiArticleApi(httpClient)
        application = ApplicationApi(httpClient)
        apiKey = ApiKeyApi(httpClient)
        aiAgent = AiAgentApi(httpClient)
        aiAgentToolRelationship = AiAgentToolRelationshipApi(httpClient)
        account = AccountApi(httpClient)
        accountHistory = AccountHistoryApi(httpClient)
        searchChat = SearchChatApi(httpClient)
        pptTemplateRendering = PptTemplateRenderingApi(httpClient)
        pptTemplateChat = PptTemplateChatApi(httpClient)
        knowledgeBaseFile = KnowledgeBaseFileApi(httpClient)
        knowledgeBaseChat = KnowledgeBaseChatApi(httpClient)
        imMessage = ImMessageApi(httpClient)
        aiVoiceSpeakerGeneration = AiVoiceSpeakerGenerationApi(httpClient)
        aiVideoGeneration = AiVideoGenerationApi(httpClient)
        aiMusicGeneration = AiMusicGenerationApi(httpClient)
        aiImageGeneration = AiImageGenerationApi(httpClient)
        aiCharacterGeneration = AiCharacterGenerationApi(httpClient)
        aiAudioGeneration = AiAudioGenerationApi(httpClient)
        aiAudioEffectGeneration = AiAudioEffectGenerationApi(httpClient)
        aiChat = AiChatApi(httpClient)
        verification = VerificationApi(httpClient)
        oauthAuthentication = OauthAuthenticationApi(httpClient)
        authorization = AuthorizationApi(httpClient)
        authentication = AuthenticationApi(httpClient)
        app = AppApi(httpClient)
        aiAgentChat = AiAgentChatApi(httpClient)
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
        aiUsageRecord = AiUsageRecordApi(httpClient)
        shoppingCart = ShoppingCartApi(httpClient)
        shoppingCartItem = ShoppingCartItemApi(httpClient)
        refund = RefundApi(httpClient)
        payment = PaymentApi(httpClient)
        order = OrderApi(httpClient)
        orderItem = OrderItemApi(httpClient)
        aiTool = AiToolApi(httpClient)
        tenant = TenantApi(httpClient)
        databaseTable = DatabaseTableApi(httpClient)
        productSku = ProductSkuApi(httpClient)
        shortUrl = ShortUrlApi(httpClient)
        shop = ShopApi(httpClient)
        share = ShareApi(httpClient)
        shareVisitRecord = ShareVisitRecordApi(httpClient)
        shardingKey = ShardingKeyApi(httpClient)
        schema = SchemaApi(httpClient)
        rbacRole = RbacRoleApi(httpClient)
        rolePermission = RolePermissionApi(httpClient)
        invocationRecord = InvocationRecordApi(httpClient)
        rbacUserRole = RbacUserRoleApi(httpClient)
        aiPrompt = AiPromptApi(httpClient)
        project = ProjectApi(httpClient)
        product = ProductApi(httpClient)
        pptTemplate = PptTemplateApi(httpClient)
        pptTemplateSlide = PptTemplateSlideApi(httpClient)
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
        host = HostApi(httpClient)
        dnsRecord = DnsRecordApi(httpClient)
        music = MusicApi(httpClient)
        aiModelInformation = AiModelInformationApi(httpClient)
        aiModelPrice = AiModelPriceApi(httpClient)
        chatMessage = ChatMessageApi(httpClient)
        memberLevel = MemberLevelApi(httpClient)
        memberCard = MemberCardApi(httpClient)
        knowledgeBase = KnowledgeBaseApi(httpClient)
        invitationRelation = InvitationRelationApi(httpClient)
        invitationCode = InvitationCodeApi(httpClient)
        image = ImageApi(httpClient)
        chatGroup = ChatGroupApi(httpClient)
        aiGeneration = AiGenerationApi(httpClient)
        aiGenerationContent = AiGenerationContentApi(httpClient)
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
        aiConversation = AiConversationApi(httpClient)
        comment = CommentApi(httpClient)
        column = ColumnApi(httpClient)
        collection = CollectionApi(httpClient)
        collectionItem = CollectionItemApi(httpClient)
        character = CharacterApi(httpClient)
        channelResource = ChannelResourceApi(httpClient)
        channelAccount = ChannelAccountApi(httpClient)
        aiCategory = AiCategoryApi(httpClient)
        membershipCard = MembershipCardApi(httpClient)
        cardTemplate = CardTemplateApi(httpClient)
        attribute = AttributeApi(httpClient)
        aiArticle = AiArticleApi(httpClient)
        application = ApplicationApi(httpClient)
        apiKey = ApiKeyApi(httpClient)
        aiAgent = AiAgentApi(httpClient)
        aiAgentToolRelationship = AiAgentToolRelationshipApi(httpClient)
        account = AccountApi(httpClient)
        accountHistory = AccountHistoryApi(httpClient)
        searchChat = SearchChatApi(httpClient)
        pptTemplateRendering = PptTemplateRenderingApi(httpClient)
        pptTemplateChat = PptTemplateChatApi(httpClient)
        knowledgeBaseFile = KnowledgeBaseFileApi(httpClient)
        knowledgeBaseChat = KnowledgeBaseChatApi(httpClient)
        imMessage = ImMessageApi(httpClient)
        aiVoiceSpeakerGeneration = AiVoiceSpeakerGenerationApi(httpClient)
        aiVideoGeneration = AiVideoGenerationApi(httpClient)
        aiMusicGeneration = AiMusicGenerationApi(httpClient)
        aiImageGeneration = AiImageGenerationApi(httpClient)
        aiCharacterGeneration = AiCharacterGenerationApi(httpClient)
        aiAudioGeneration = AiAudioGenerationApi(httpClient)
        aiAudioEffectGeneration = AiAudioEffectGenerationApi(httpClient)
        aiChat = AiChatApi(httpClient)
        verification = VerificationApi(httpClient)
        oauthAuthentication = OauthAuthenticationApi(httpClient)
        authorization = AuthorizationApi(httpClient)
        authentication = AuthenticationApi(httpClient)
        app = AppApi(httpClient)
        aiAgentChat = AiAgentChatApi(httpClient)
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
