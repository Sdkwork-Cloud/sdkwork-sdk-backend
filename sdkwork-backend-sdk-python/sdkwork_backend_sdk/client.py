from .http_client import HttpClient, SdkConfig
from .api.workspace import WorkspaceApi
from .api.vote import VoteApi
from .api.voice import VoiceApi
from .api.visit_history import VisitHistoryApi
from .api.vip import VipApi
from .api.video import VideoApi
from .api.user import UserApi
from .api.usage import UsageApi
from .api.trade import TradeApi
from .api.tool import ToolApi
from .api.tenant import TenantApi
from .api.table import TableApi
from .api.sku import SkuApi
from .api.skill import SkillApi
from .api.short_url import ShortUrlApi
from .api.shop import ShopApi
from .api.share import ShareApi
from .api.sharding import ShardingApi
from .api.security import SecurityApi
from .api.schema import SchemaApi
from .api.role import RoleApi
from .api.record import RecordApi
from .api.rbac import RbacApi
from .api.prompt import PromptApi
from .api.project import ProjectApi
from .api.product import ProductApi
from .api.ppt import PptApi
from .api.permission import PermissionApi
from .api.partner import PartnerApi
from .api.participant import ParticipantApi
from .api.oss import OssApi
from .api.organization import OrganizationApi
from .api.organization_member import OrganizationMemberApi
from .api.notification import NotificationApi
from .api.note import NoteApi
from .api.news import NewsApi
from .api.net import NetApi
from .api.music import MusicApi
from .api.model import ModelApi
from .api.message import MessageApi
from .api.member import MemberApi
from .api.knowledge_base import KnowledgeBaseApi
from .api.invitation import InvitationApi
from .api.image import ImageApi
from .api.im import ImApi
from .api.generation import GenerationApi
from .api.game import GameApi
from .api.file import FileApi
from .api.feed import FeedApi
from .api.feedback import FeedbackApi
from .api.favorite import FavoriteApi
from .api.disk import DiskApi
from .api.detail import DetailApi
from .api.department import DepartmentApi
from .api.datasource import DatasourceApi
from .api.coupon import CouponApi
from .api.conversation import ConversationApi
from .api.content_writing import ContentWritingApi
from .api.comment import CommentApi
from .api.column import ColumnApi
from .api.collection import CollectionApi
from .api.collection_item import CollectionItemApi
from .api.chat import ChatApi
from .api.character import CharacterApi
from .api.channel import ChannelApi
from .api.category import CategoryApi
from .api.card import CardApi
from .api.attribute import AttributeApi
from .api.article import ArticleApi
from .api.app import AppApi
from .api.apikey import ApikeyApi
from .api.agent import AgentApi
from .api.account import AccountApi
from .api.system import SystemApi
from .api.search import SearchApi
from .api.auth import AuthApi


class SdkworkBackendClient:
    """sdkwork-backend-sdk SDK Client."""

    def __init__(self, config: SdkConfig):
        self._client = HttpClient(config)
        self.workspace: WorkspaceApi
        self.vote: VoteApi
        self.voice: VoiceApi
        self.visit_history: VisitHistoryApi
        self.vip: VipApi
        self.video: VideoApi
        self.user: UserApi
        self.usage: UsageApi
        self.trade: TradeApi
        self.tool: ToolApi
        self.tenant: TenantApi
        self.table: TableApi
        self.sku: SkuApi
        self.skill: SkillApi
        self.short_url: ShortUrlApi
        self.shop: ShopApi
        self.share: ShareApi
        self.sharding: ShardingApi
        self.security: SecurityApi
        self.schema: SchemaApi
        self.role: RoleApi
        self.record: RecordApi
        self.rbac: RbacApi
        self.prompt: PromptApi
        self.project: ProjectApi
        self.product: ProductApi
        self.ppt: PptApi
        self.permission: PermissionApi
        self.partner: PartnerApi
        self.participant: ParticipantApi
        self.oss: OssApi
        self.organization: OrganizationApi
        self.organization_member: OrganizationMemberApi
        self.notification: NotificationApi
        self.note: NoteApi
        self.news: NewsApi
        self.net: NetApi
        self.music: MusicApi
        self.model: ModelApi
        self.message: MessageApi
        self.member: MemberApi
        self.knowledge_base: KnowledgeBaseApi
        self.invitation: InvitationApi
        self.image: ImageApi
        self.im: ImApi
        self.generation: GenerationApi
        self.game: GameApi
        self.file: FileApi
        self.feed: FeedApi
        self.feedback: FeedbackApi
        self.favorite: FavoriteApi
        self.disk: DiskApi
        self.detail: DetailApi
        self.department: DepartmentApi
        self.datasource: DatasourceApi
        self.coupon: CouponApi
        self.conversation: ConversationApi
        self.content_writing: ContentWritingApi
        self.comment: CommentApi
        self.column: ColumnApi
        self.collection: CollectionApi
        self.collection_item: CollectionItemApi
        self.chat: ChatApi
        self.character: CharacterApi
        self.channel: ChannelApi
        self.category: CategoryApi
        self.card: CardApi
        self.attribute: AttributeApi
        self.article: ArticleApi
        self.app: AppApi
        self.apikey: ApikeyApi
        self.agent: AgentApi
        self.account: AccountApi
        self.system: SystemApi
        self.search: SearchApi
        self.auth: AuthApi

        # Initialize API modules
        self.workspace = WorkspaceApi(self._client)
        self.vote = VoteApi(self._client)
        self.voice = VoiceApi(self._client)
        self.visit_history = VisitHistoryApi(self._client)
        self.vip = VipApi(self._client)
        self.video = VideoApi(self._client)
        self.user = UserApi(self._client)
        self.usage = UsageApi(self._client)
        self.trade = TradeApi(self._client)
        self.tool = ToolApi(self._client)
        self.tenant = TenantApi(self._client)
        self.table = TableApi(self._client)
        self.sku = SkuApi(self._client)
        self.skill = SkillApi(self._client)
        self.short_url = ShortUrlApi(self._client)
        self.shop = ShopApi(self._client)
        self.share = ShareApi(self._client)
        self.sharding = ShardingApi(self._client)
        self.security = SecurityApi(self._client)
        self.schema = SchemaApi(self._client)
        self.role = RoleApi(self._client)
        self.record = RecordApi(self._client)
        self.rbac = RbacApi(self._client)
        self.prompt = PromptApi(self._client)
        self.project = ProjectApi(self._client)
        self.product = ProductApi(self._client)
        self.ppt = PptApi(self._client)
        self.permission = PermissionApi(self._client)
        self.partner = PartnerApi(self._client)
        self.participant = ParticipantApi(self._client)
        self.oss = OssApi(self._client)
        self.organization = OrganizationApi(self._client)
        self.organization_member = OrganizationMemberApi(self._client)
        self.notification = NotificationApi(self._client)
        self.note = NoteApi(self._client)
        self.news = NewsApi(self._client)
        self.net = NetApi(self._client)
        self.music = MusicApi(self._client)
        self.model = ModelApi(self._client)
        self.message = MessageApi(self._client)
        self.member = MemberApi(self._client)
        self.knowledge_base = KnowledgeBaseApi(self._client)
        self.invitation = InvitationApi(self._client)
        self.image = ImageApi(self._client)
        self.im = ImApi(self._client)
        self.generation = GenerationApi(self._client)
        self.game = GameApi(self._client)
        self.file = FileApi(self._client)
        self.feed = FeedApi(self._client)
        self.feedback = FeedbackApi(self._client)
        self.favorite = FavoriteApi(self._client)
        self.disk = DiskApi(self._client)
        self.detail = DetailApi(self._client)
        self.department = DepartmentApi(self._client)
        self.datasource = DatasourceApi(self._client)
        self.coupon = CouponApi(self._client)
        self.conversation = ConversationApi(self._client)
        self.content_writing = ContentWritingApi(self._client)
        self.comment = CommentApi(self._client)
        self.column = ColumnApi(self._client)
        self.collection = CollectionApi(self._client)
        self.collection_item = CollectionItemApi(self._client)
        self.chat = ChatApi(self._client)
        self.character = CharacterApi(self._client)
        self.channel = ChannelApi(self._client)
        self.category = CategoryApi(self._client)
        self.card = CardApi(self._client)
        self.attribute = AttributeApi(self._client)
        self.article = ArticleApi(self._client)
        self.app = AppApi(self._client)
        self.apikey = ApikeyApi(self._client)
        self.agent = AgentApi(self._client)
        self.account = AccountApi(self._client)
        self.system = SystemApi(self._client)
        self.search = SearchApi(self._client)
        self.auth = AuthApi(self._client)

    def set_api_key(self, api_key: str) -> 'SdkworkBackendClient':
        """Set API key for authentication."""
        self._client.set_api_key(api_key)
        return self

    def set_auth_token(self, token: str) -> 'SdkworkBackendClient':
        """Set auth token for authentication."""
        self._client.set_auth_token(token)
        return self

    def set_access_token(self, token: str) -> 'SdkworkBackendClient':
        """Set access token for authentication."""
        self._client.set_access_token(token)
        return self

    def set_header(self, key: str, value: str) -> 'SdkworkBackendClient':
        """Set custom header."""
        self._client.set_header(key, value)
        return self

    @property
    def http(self) -> HttpClient:
        """Get the underlying HTTP client."""
        return self._client


def create_client(config: SdkConfig) -> SdkworkBackendClient:
    """Create a new SDK client instance."""
    return SdkworkBackendClient(config)
