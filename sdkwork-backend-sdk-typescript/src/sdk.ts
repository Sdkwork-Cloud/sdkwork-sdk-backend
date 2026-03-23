import { HttpClient, createHttpClient } from './http/client';
import type { SdkworkBackendConfig } from './types/common';
import type { AuthTokenManager } from '@sdkwork/sdk-common';

import { WorkspaceApi, createWorkspaceApi } from './api/workspace';
import { VoteApi, createVoteApi } from './api/vote';
import { VoiceApi, createVoiceApi } from './api/voice';
import { VisitHistoryApi, createVisitHistoryApi } from './api/visit-history';
import { VipApi, createVipApi } from './api/vip';
import { VideoApi, createVideoApi } from './api/video';
import { UserApi, createUserApi } from './api/user';
import { UsageApi, createUsageApi } from './api/usage';
import { TradeApi, createTradeApi } from './api/trade';
import { ToolApi, createToolApi } from './api/tool';
import { TenantApi, createTenantApi } from './api/tenant';
import { TableApi, createTableApi } from './api/table';
import { SkuApi, createSkuApi } from './api/sku';
import { SkillApi, createSkillApi } from './api/skill';
import { ShortUrlApi, createShortUrlApi } from './api/short-url';
import { ShopApi, createShopApi } from './api/shop';
import { ShareApi, createShareApi } from './api/share';
import { ShardingApi, createShardingApi } from './api/sharding';
import { SecurityApi, createSecurityApi } from './api/security';
import { SchemaApi, createSchemaApi } from './api/schema';
import { RoleApi, createRoleApi } from './api/role';
import { RecordApi, createRecordApi } from './api/record';
import { RbacApi, createRbacApi } from './api/rbac';
import { PromptApi, createPromptApi } from './api/prompt';
import { ProjectApi, createProjectApi } from './api/project';
import { ProductApi, createProductApi } from './api/product';
import { PptApi, createPptApi } from './api/ppt';
import { PermissionApi, createPermissionApi } from './api/permission';
import { PartnerApi, createPartnerApi } from './api/partner';
import { ParticipantApi, createParticipantApi } from './api/participant';
import { OssApi, createOssApi } from './api/oss';
import { OrganizationApi, createOrganizationApi } from './api/organization';
import { OrganizationMemberApi, createOrganizationMemberApi } from './api/organization-member';
import { NotificationApi, createNotificationApi } from './api/notification';
import { NoteApi, createNoteApi } from './api/note';
import { NotaryApi, createNotaryApi } from './api/notary';
import { NewsApi, createNewsApi } from './api/news';
import { NetApi, createNetApi } from './api/net';
import { MusicApi, createMusicApi } from './api/music';
import { ModelApi, createModelApi } from './api/model';
import { MessageApi, createMessageApi } from './api/message';
import { MemberApi, createMemberApi } from './api/member';
import { KnowledgeBaseApi, createKnowledgeBaseApi } from './api/knowledge-base';
import { InvitationApi, createInvitationApi } from './api/invitation';
import { ImageApi, createImageApi } from './api/image';
import { ImApi, createImApi } from './api/im';
import { GenerationApi, createGenerationApi } from './api/generation';
import { GameApi, createGameApi } from './api/game';
import { FileApi, createFileApi } from './api/file';
import { FeedApi, createFeedApi } from './api/feed';
import { FeedbackApi, createFeedbackApi } from './api/feedback';
import { FavoriteApi, createFavoriteApi } from './api/favorite';
import { DiskApi, createDiskApi } from './api/disk';
import { DetailApi, createDetailApi } from './api/detail';
import { DepartmentApi, createDepartmentApi } from './api/department';
import { DatasourceApi, createDatasourceApi } from './api/datasource';
import { CouponApi, createCouponApi } from './api/coupon';
import { ConversationApi, createConversationApi } from './api/conversation';
import { ContentWritingApi, createContentWritingApi } from './api/content-writing';
import { CommentApi, createCommentApi } from './api/comment';
import { ColumnApi, createColumnApi } from './api/column';
import { CollectionApi, createCollectionApi } from './api/collection';
import { CollectionItemApi, createCollectionItemApi } from './api/collection-item';
import { ChatApi, createChatApi } from './api/chat';
import { CharacterApi, createCharacterApi } from './api/character';
import { ChannelApi, createChannelApi } from './api/channel';
import { CategoryApi, createCategoryApi } from './api/category';
import { CardApi, createCardApi } from './api/card';
import { AttributeApi, createAttributeApi } from './api/attribute';
import { ArticleApi, createArticleApi } from './api/article';
import { AppApi, createAppApi } from './api/app';
import { ApikeyApi, createApikeyApi } from './api/apikey';
import { AgentApi, createAgentApi } from './api/agent';
import { AccountApi, createAccountApi } from './api/account';
import { SystemApi, createSystemApi } from './api/system';
import { SearchApi, createSearchApi } from './api/search';
import { RtcApi, createRtcApi } from './api/rtc';
import { FinanceApi, createFinanceApi } from './api/finance';
import { AuthApi, createAuthApi } from './api/auth';

export class SdkworkBackendClient {
  private httpClient: HttpClient;

  public readonly workspace: WorkspaceApi;
  public readonly vote: VoteApi;
  public readonly voice: VoiceApi;
  public readonly visitHistory: VisitHistoryApi;
  public readonly vip: VipApi;
  public readonly video: VideoApi;
  public readonly user: UserApi;
  public readonly usage: UsageApi;
  public readonly trade: TradeApi;
  public readonly tool: ToolApi;
  public readonly tenant: TenantApi;
  public readonly table: TableApi;
  public readonly sku: SkuApi;
  public readonly skill: SkillApi;
  public readonly shortUrl: ShortUrlApi;
  public readonly shop: ShopApi;
  public readonly share: ShareApi;
  public readonly sharding: ShardingApi;
  public readonly security: SecurityApi;
  public readonly schema: SchemaApi;
  public readonly role: RoleApi;
  public readonly record: RecordApi;
  public readonly rbac: RbacApi;
  public readonly prompt: PromptApi;
  public readonly project: ProjectApi;
  public readonly product: ProductApi;
  public readonly ppt: PptApi;
  public readonly permission: PermissionApi;
  public readonly partner: PartnerApi;
  public readonly participant: ParticipantApi;
  public readonly oss: OssApi;
  public readonly organization: OrganizationApi;
  public readonly organizationMember: OrganizationMemberApi;
  public readonly notification: NotificationApi;
  public readonly note: NoteApi;
  public readonly notary: NotaryApi;
  public readonly news: NewsApi;
  public readonly net: NetApi;
  public readonly music: MusicApi;
  public readonly model: ModelApi;
  public readonly message: MessageApi;
  public readonly member: MemberApi;
  public readonly knowledgeBase: KnowledgeBaseApi;
  public readonly invitation: InvitationApi;
  public readonly image: ImageApi;
  public readonly im: ImApi;
  public readonly generation: GenerationApi;
  public readonly game: GameApi;
  public readonly file: FileApi;
  public readonly feed: FeedApi;
  public readonly feedback: FeedbackApi;
  public readonly favorite: FavoriteApi;
  public readonly disk: DiskApi;
  public readonly detail: DetailApi;
  public readonly department: DepartmentApi;
  public readonly datasource: DatasourceApi;
  public readonly coupon: CouponApi;
  public readonly conversation: ConversationApi;
  public readonly contentWriting: ContentWritingApi;
  public readonly comment: CommentApi;
  public readonly column: ColumnApi;
  public readonly collection: CollectionApi;
  public readonly collectionItem: CollectionItemApi;
  public readonly chat: ChatApi;
  public readonly character: CharacterApi;
  public readonly channel: ChannelApi;
  public readonly category: CategoryApi;
  public readonly card: CardApi;
  public readonly attribute: AttributeApi;
  public readonly article: ArticleApi;
  public readonly app: AppApi;
  public readonly apikey: ApikeyApi;
  public readonly agent: AgentApi;
  public readonly account: AccountApi;
  public readonly system: SystemApi;
  public readonly search: SearchApi;
  public readonly rtc: RtcApi;
  public readonly finance: FinanceApi;
  public readonly auth: AuthApi;

  constructor(config: SdkworkBackendConfig) {
    this.httpClient = createHttpClient(config);
    this.workspace = createWorkspaceApi(this.httpClient);

    this.vote = createVoteApi(this.httpClient);

    this.voice = createVoiceApi(this.httpClient);

    this.visitHistory = createVisitHistoryApi(this.httpClient);

    this.vip = createVipApi(this.httpClient);

    this.video = createVideoApi(this.httpClient);

    this.user = createUserApi(this.httpClient);

    this.usage = createUsageApi(this.httpClient);

    this.trade = createTradeApi(this.httpClient);

    this.tool = createToolApi(this.httpClient);

    this.tenant = createTenantApi(this.httpClient);

    this.table = createTableApi(this.httpClient);

    this.sku = createSkuApi(this.httpClient);

    this.skill = createSkillApi(this.httpClient);

    this.shortUrl = createShortUrlApi(this.httpClient);

    this.shop = createShopApi(this.httpClient);

    this.share = createShareApi(this.httpClient);

    this.sharding = createShardingApi(this.httpClient);

    this.security = createSecurityApi(this.httpClient);

    this.schema = createSchemaApi(this.httpClient);

    this.role = createRoleApi(this.httpClient);

    this.record = createRecordApi(this.httpClient);

    this.rbac = createRbacApi(this.httpClient);

    this.prompt = createPromptApi(this.httpClient);

    this.project = createProjectApi(this.httpClient);

    this.product = createProductApi(this.httpClient);

    this.ppt = createPptApi(this.httpClient);

    this.permission = createPermissionApi(this.httpClient);

    this.partner = createPartnerApi(this.httpClient);

    this.participant = createParticipantApi(this.httpClient);

    this.oss = createOssApi(this.httpClient);

    this.organization = createOrganizationApi(this.httpClient);

    this.organizationMember = createOrganizationMemberApi(this.httpClient);

    this.notification = createNotificationApi(this.httpClient);

    this.note = createNoteApi(this.httpClient);

    this.notary = createNotaryApi(this.httpClient);

    this.news = createNewsApi(this.httpClient);

    this.net = createNetApi(this.httpClient);

    this.music = createMusicApi(this.httpClient);

    this.model = createModelApi(this.httpClient);

    this.message = createMessageApi(this.httpClient);

    this.member = createMemberApi(this.httpClient);

    this.knowledgeBase = createKnowledgeBaseApi(this.httpClient);

    this.invitation = createInvitationApi(this.httpClient);

    this.image = createImageApi(this.httpClient);

    this.im = createImApi(this.httpClient);

    this.generation = createGenerationApi(this.httpClient);

    this.game = createGameApi(this.httpClient);

    this.file = createFileApi(this.httpClient);

    this.feed = createFeedApi(this.httpClient);

    this.feedback = createFeedbackApi(this.httpClient);

    this.favorite = createFavoriteApi(this.httpClient);

    this.disk = createDiskApi(this.httpClient);

    this.detail = createDetailApi(this.httpClient);

    this.department = createDepartmentApi(this.httpClient);

    this.datasource = createDatasourceApi(this.httpClient);

    this.coupon = createCouponApi(this.httpClient);

    this.conversation = createConversationApi(this.httpClient);

    this.contentWriting = createContentWritingApi(this.httpClient);

    this.comment = createCommentApi(this.httpClient);

    this.column = createColumnApi(this.httpClient);

    this.collection = createCollectionApi(this.httpClient);

    this.collectionItem = createCollectionItemApi(this.httpClient);

    this.chat = createChatApi(this.httpClient);

    this.character = createCharacterApi(this.httpClient);

    this.channel = createChannelApi(this.httpClient);

    this.category = createCategoryApi(this.httpClient);

    this.card = createCardApi(this.httpClient);

    this.attribute = createAttributeApi(this.httpClient);

    this.article = createArticleApi(this.httpClient);

    this.app = createAppApi(this.httpClient);

    this.apikey = createApikeyApi(this.httpClient);

    this.agent = createAgentApi(this.httpClient);

    this.account = createAccountApi(this.httpClient);

    this.system = createSystemApi(this.httpClient);

    this.search = createSearchApi(this.httpClient);

    this.rtc = createRtcApi(this.httpClient);

    this.finance = createFinanceApi(this.httpClient);

    this.auth = createAuthApi(this.httpClient);
  }

  setApiKey(apiKey: string): this {
    this.httpClient.setApiKey(apiKey);
    return this;
  }

  setAuthToken(token: string): this {
    this.httpClient.setAuthToken(token);
    return this;
  }

  setAccessToken(token: string): this {
    this.httpClient.setAccessToken(token);
    return this;
  }

  setTokenManager(manager: AuthTokenManager): this {
    this.httpClient.setTokenManager(manager);
    return this;
  }

  get http(): HttpClient {
    return this.httpClient;
  }
}

export function createClient(config: SdkworkBackendConfig): SdkworkBackendClient {
  return new SdkworkBackendClient(config);
}

export default SdkworkBackendClient;
