from .http_client import HttpClient, SdkConfig
from .api.workspace import WorkspaceApi
from .api.content_vote import ContentVoteApi
from .api.voice_speaker import VoiceSpeakerApi
from .api.visit_history import VisitHistoryApi
from .api.vip_user import VipUserApi
from .api.vip_recharge import VipRechargeApi
from .api.vip_recharge_package import VipRechargePackageApi
from .api.vip_point_change import VipPointChangeApi
from .api.vip_package_group import VipPackageGroupApi
from .api.vip_package import VipPackageApi
from .api.vip_level import VipLevelApi
from .api.vip_level_benefit import VipLevelBenefitApi
from .api.vip_benefit import VipBenefitApi
from .api.vip_benefit_usage import VipBenefitUsageApi
from .api.video import VideoApi
from .api.user import UserApi
from .api.user_oauth_account import UserOauthAccountApi
from .api.user_coupon import UserCouponApi
from .api.user_card import UserCardApi
from .api.user_address import UserAddressApi
from .api.usage_record import UsageRecordApi
from .api.shopping_cart import ShoppingCartApi
from .api.shopping_cart_item import ShoppingCartItemApi
from .api.refund import RefundApi
from .api.payment import PaymentApi
from .api.order import OrderApi
from .api.order_item import OrderItemApi
from .api.tool import ToolApi
from .api.tenant import TenantApi
from .api.database_table import DatabaseTableApi
from .api.product_sku import ProductSkuApi
from .api.skill import SkillApi
from .api.skill_package import SkillPackageApi
from .api.short_url import ShortUrlApi
from .api.shop import ShopApi
from .api.share import ShareApi
from .api.share_visit_record import ShareVisitRecordApi
from .api.sharding_key import ShardingKeyApi
from .api.api_security_policy import ApiSecurityPolicyApi
from .api.schema import SchemaApi
from .api.rbac_role import RbacRoleApi
from .api.role_permission import RolePermissionApi
from .api.invocation_record import InvocationRecordApi
from .api.rbac_user_role import RbacUserRoleApi
from .api.prompt import PromptApi
from .api.project import ProjectApi
from .api.product import ProductApi
from .api.ppt_template import PptTemplateApi
from .api.ppt_template_slide import PptTemplateSlideApi
from .api.rbac_permission import RbacPermissionApi
from .api.partner import PartnerApi
from .api.chat_participant import ChatParticipantApi
from .api.oss_bucket import OssBucketApi
from .api.organization import OrganizationApi
from .api.position import PositionApi
from .api.member_relations import MemberRelationsApi
from .api.organization_member import OrganizationMemberApi
from .api.notification import NotificationApi
from .api.notes import NotesApi
from .api.news import NewsApi
from .api.net import NetApi
from .api.dns_record import DnsRecordApi
from .api.music import MusicApi
from .api.model_information import ModelInformationApi
from .api.model_price import ModelPriceApi
from .api.chat_message import ChatMessageApi
from .api.member_level import MemberLevelApi
from .api.member_card import MemberCardApi
from .api.knowledge_base import KnowledgeBaseApi
from .api.invitation_relation import InvitationRelationApi
from .api.invitation_code import InvitationCodeApi
from .api.image import ImageApi
from .api.chat_group import ChatGroupApi
from .api.generation import GenerationApi
from .api.generation_content import GenerationContentApi
from .api.file import FileApi
from .api.file_part import FilePartApi
from .api.file_content import FileContentApi
from .api.feeds import FeedsApi
from .api.feedback import FeedbackApi
from .api.favorite import FavoriteApi
from .api.file_disk import FileDiskApi
from .api.disk_member import DiskMemberApi
from .api.detail import DetailApi
from .api.department import DepartmentApi
from .api.datasource import DatasourceApi
from .api.coupon import CouponApi
from .api.coupon_template import CouponTemplateApi
from .api.conversation import ConversationApi
from .api.content_writing import ContentWritingApi
from .api.comment import CommentApi
from .api.column import ColumnApi
from .api.collection import CollectionApi
from .api.collection_item import CollectionItemApi
from .api.character import CharacterApi
from .api.channel import ChannelApi
from .api.channel_resource import ChannelResourceApi
from .api.channel_proxy import ChannelProxyApi
from .api.channel_account import ChannelAccountApi
from .api.category import CategoryApi
from .api.membership_card import MembershipCardApi
from .api.card_template import CardTemplateApi
from .api.attribute import AttributeApi
from .api.article import ArticleApi
from .api.app import AppApi
from .api.api_key import ApiKeyApi
from .api.agent import AgentApi
from .api.agent_tool_relationship import AgentToolRelationshipApi
from .api.account import AccountApi
from .api.account_history import AccountHistoryApi
from .api.account_exchange_config import AccountExchangeConfigApi
from .api.invoice import InvoiceApi
from .api.search_chat import SearchChatApi
from .api.ppt_template_rendering import PptTemplateRenderingApi
from .api.ppt_template_chat import PptTemplateChatApi
from .api.knowledge_base_file import KnowledgeBaseFileApi
from .api.knowledge_base_chat import KnowledgeBaseChatApi
from .api.im_message import ImMessageApi
from .api.voice_speaker_generation import VoiceSpeakerGenerationApi
from .api.video_generation import VideoGenerationApi
from .api.music_generation import MusicGenerationApi
from .api.image_generation import ImageGenerationApi
from .api.character_generation import CharacterGenerationApi
from .api.audio_generation import AudioGenerationApi
from .api.audio_effect_generation import AudioEffectGenerationApi
from .api.chat import ChatApi
from .api.auth import AuthApi
from .api.agent_chat import AgentChatApi


class SdkworkBackendClient:
    """sdkwork-backend-sdk SDK Client."""

    def __init__(self, config: SdkConfig):
        self._client = HttpClient(config)
        self.workspace: WorkspaceApi
        self.content_vote: ContentVoteApi
        self.voice_speaker: VoiceSpeakerApi
        self.visit_history: VisitHistoryApi
        self.vip_user: VipUserApi
        self.vip_recharge: VipRechargeApi
        self.vip_recharge_package: VipRechargePackageApi
        self.vip_point_change: VipPointChangeApi
        self.vip_package_group: VipPackageGroupApi
        self.vip_package: VipPackageApi
        self.vip_level: VipLevelApi
        self.vip_level_benefit: VipLevelBenefitApi
        self.vip_benefit: VipBenefitApi
        self.vip_benefit_usage: VipBenefitUsageApi
        self.video: VideoApi
        self.user: UserApi
        self.user_oauth_account: UserOauthAccountApi
        self.user_coupon: UserCouponApi
        self.user_card: UserCardApi
        self.user_address: UserAddressApi
        self.usage_record: UsageRecordApi
        self.shopping_cart: ShoppingCartApi
        self.shopping_cart_item: ShoppingCartItemApi
        self.refund: RefundApi
        self.payment: PaymentApi
        self.order: OrderApi
        self.order_item: OrderItemApi
        self.tool: ToolApi
        self.tenant: TenantApi
        self.database_table: DatabaseTableApi
        self.product_sku: ProductSkuApi
        self.skill: SkillApi
        self.skill_package: SkillPackageApi
        self.short_url: ShortUrlApi
        self.shop: ShopApi
        self.share: ShareApi
        self.share_visit_record: ShareVisitRecordApi
        self.sharding_key: ShardingKeyApi
        self.api_security_policy: ApiSecurityPolicyApi
        self.schema: SchemaApi
        self.rbac_role: RbacRoleApi
        self.role_permission: RolePermissionApi
        self.invocation_record: InvocationRecordApi
        self.rbac_user_role: RbacUserRoleApi
        self.prompt: PromptApi
        self.project: ProjectApi
        self.product: ProductApi
        self.ppt_template: PptTemplateApi
        self.ppt_template_slide: PptTemplateSlideApi
        self.rbac_permission: RbacPermissionApi
        self.partner: PartnerApi
        self.chat_participant: ChatParticipantApi
        self.oss_bucket: OssBucketApi
        self.organization: OrganizationApi
        self.position: PositionApi
        self.member_relations: MemberRelationsApi
        self.organization_member: OrganizationMemberApi
        self.notification: NotificationApi
        self.notes: NotesApi
        self.news: NewsApi
        self.net: NetApi
        self.dns_record: DnsRecordApi
        self.music: MusicApi
        self.model_information: ModelInformationApi
        self.model_price: ModelPriceApi
        self.chat_message: ChatMessageApi
        self.member_level: MemberLevelApi
        self.member_card: MemberCardApi
        self.knowledge_base: KnowledgeBaseApi
        self.invitation_relation: InvitationRelationApi
        self.invitation_code: InvitationCodeApi
        self.image: ImageApi
        self.chat_group: ChatGroupApi
        self.generation: GenerationApi
        self.generation_content: GenerationContentApi
        self.file: FileApi
        self.file_part: FilePartApi
        self.file_content: FileContentApi
        self.feeds: FeedsApi
        self.feedback: FeedbackApi
        self.favorite: FavoriteApi
        self.file_disk: FileDiskApi
        self.disk_member: DiskMemberApi
        self.detail: DetailApi
        self.department: DepartmentApi
        self.datasource: DatasourceApi
        self.coupon: CouponApi
        self.coupon_template: CouponTemplateApi
        self.conversation: ConversationApi
        self.content_writing: ContentWritingApi
        self.comment: CommentApi
        self.column: ColumnApi
        self.collection: CollectionApi
        self.collection_item: CollectionItemApi
        self.character: CharacterApi
        self.channel: ChannelApi
        self.channel_resource: ChannelResourceApi
        self.channel_proxy: ChannelProxyApi
        self.channel_account: ChannelAccountApi
        self.category: CategoryApi
        self.membership_card: MembershipCardApi
        self.card_template: CardTemplateApi
        self.attribute: AttributeApi
        self.article: ArticleApi
        self.app: AppApi
        self.api_key: ApiKeyApi
        self.agent: AgentApi
        self.agent_tool_relationship: AgentToolRelationshipApi
        self.account: AccountApi
        self.account_history: AccountHistoryApi
        self.account_exchange_config: AccountExchangeConfigApi
        self.invoice: InvoiceApi
        self.search_chat: SearchChatApi
        self.ppt_template_rendering: PptTemplateRenderingApi
        self.ppt_template_chat: PptTemplateChatApi
        self.knowledge_base_file: KnowledgeBaseFileApi
        self.knowledge_base_chat: KnowledgeBaseChatApi
        self.im_message: ImMessageApi
        self.voice_speaker_generation: VoiceSpeakerGenerationApi
        self.video_generation: VideoGenerationApi
        self.music_generation: MusicGenerationApi
        self.image_generation: ImageGenerationApi
        self.character_generation: CharacterGenerationApi
        self.audio_generation: AudioGenerationApi
        self.audio_effect_generation: AudioEffectGenerationApi
        self.chat: ChatApi
        self.auth: AuthApi
        self.agent_chat: AgentChatApi

        # Initialize API modules
        self.workspace = WorkspaceApi(self._client)
        self.content_vote = ContentVoteApi(self._client)
        self.voice_speaker = VoiceSpeakerApi(self._client)
        self.visit_history = VisitHistoryApi(self._client)
        self.vip_user = VipUserApi(self._client)
        self.vip_recharge = VipRechargeApi(self._client)
        self.vip_recharge_package = VipRechargePackageApi(self._client)
        self.vip_point_change = VipPointChangeApi(self._client)
        self.vip_package_group = VipPackageGroupApi(self._client)
        self.vip_package = VipPackageApi(self._client)
        self.vip_level = VipLevelApi(self._client)
        self.vip_level_benefit = VipLevelBenefitApi(self._client)
        self.vip_benefit = VipBenefitApi(self._client)
        self.vip_benefit_usage = VipBenefitUsageApi(self._client)
        self.video = VideoApi(self._client)
        self.user = UserApi(self._client)
        self.user_oauth_account = UserOauthAccountApi(self._client)
        self.user_coupon = UserCouponApi(self._client)
        self.user_card = UserCardApi(self._client)
        self.user_address = UserAddressApi(self._client)
        self.usage_record = UsageRecordApi(self._client)
        self.shopping_cart = ShoppingCartApi(self._client)
        self.shopping_cart_item = ShoppingCartItemApi(self._client)
        self.refund = RefundApi(self._client)
        self.payment = PaymentApi(self._client)
        self.order = OrderApi(self._client)
        self.order_item = OrderItemApi(self._client)
        self.tool = ToolApi(self._client)
        self.tenant = TenantApi(self._client)
        self.database_table = DatabaseTableApi(self._client)
        self.product_sku = ProductSkuApi(self._client)
        self.skill = SkillApi(self._client)
        self.skill_package = SkillPackageApi(self._client)
        self.short_url = ShortUrlApi(self._client)
        self.shop = ShopApi(self._client)
        self.share = ShareApi(self._client)
        self.share_visit_record = ShareVisitRecordApi(self._client)
        self.sharding_key = ShardingKeyApi(self._client)
        self.api_security_policy = ApiSecurityPolicyApi(self._client)
        self.schema = SchemaApi(self._client)
        self.rbac_role = RbacRoleApi(self._client)
        self.role_permission = RolePermissionApi(self._client)
        self.invocation_record = InvocationRecordApi(self._client)
        self.rbac_user_role = RbacUserRoleApi(self._client)
        self.prompt = PromptApi(self._client)
        self.project = ProjectApi(self._client)
        self.product = ProductApi(self._client)
        self.ppt_template = PptTemplateApi(self._client)
        self.ppt_template_slide = PptTemplateSlideApi(self._client)
        self.rbac_permission = RbacPermissionApi(self._client)
        self.partner = PartnerApi(self._client)
        self.chat_participant = ChatParticipantApi(self._client)
        self.oss_bucket = OssBucketApi(self._client)
        self.organization = OrganizationApi(self._client)
        self.position = PositionApi(self._client)
        self.member_relations = MemberRelationsApi(self._client)
        self.organization_member = OrganizationMemberApi(self._client)
        self.notification = NotificationApi(self._client)
        self.notes = NotesApi(self._client)
        self.news = NewsApi(self._client)
        self.net = NetApi(self._client)
        self.dns_record = DnsRecordApi(self._client)
        self.music = MusicApi(self._client)
        self.model_information = ModelInformationApi(self._client)
        self.model_price = ModelPriceApi(self._client)
        self.chat_message = ChatMessageApi(self._client)
        self.member_level = MemberLevelApi(self._client)
        self.member_card = MemberCardApi(self._client)
        self.knowledge_base = KnowledgeBaseApi(self._client)
        self.invitation_relation = InvitationRelationApi(self._client)
        self.invitation_code = InvitationCodeApi(self._client)
        self.image = ImageApi(self._client)
        self.chat_group = ChatGroupApi(self._client)
        self.generation = GenerationApi(self._client)
        self.generation_content = GenerationContentApi(self._client)
        self.file = FileApi(self._client)
        self.file_part = FilePartApi(self._client)
        self.file_content = FileContentApi(self._client)
        self.feeds = FeedsApi(self._client)
        self.feedback = FeedbackApi(self._client)
        self.favorite = FavoriteApi(self._client)
        self.file_disk = FileDiskApi(self._client)
        self.disk_member = DiskMemberApi(self._client)
        self.detail = DetailApi(self._client)
        self.department = DepartmentApi(self._client)
        self.datasource = DatasourceApi(self._client)
        self.coupon = CouponApi(self._client)
        self.coupon_template = CouponTemplateApi(self._client)
        self.conversation = ConversationApi(self._client)
        self.content_writing = ContentWritingApi(self._client)
        self.comment = CommentApi(self._client)
        self.column = ColumnApi(self._client)
        self.collection = CollectionApi(self._client)
        self.collection_item = CollectionItemApi(self._client)
        self.character = CharacterApi(self._client)
        self.channel = ChannelApi(self._client)
        self.channel_resource = ChannelResourceApi(self._client)
        self.channel_proxy = ChannelProxyApi(self._client)
        self.channel_account = ChannelAccountApi(self._client)
        self.category = CategoryApi(self._client)
        self.membership_card = MembershipCardApi(self._client)
        self.card_template = CardTemplateApi(self._client)
        self.attribute = AttributeApi(self._client)
        self.article = ArticleApi(self._client)
        self.app = AppApi(self._client)
        self.api_key = ApiKeyApi(self._client)
        self.agent = AgentApi(self._client)
        self.agent_tool_relationship = AgentToolRelationshipApi(self._client)
        self.account = AccountApi(self._client)
        self.account_history = AccountHistoryApi(self._client)
        self.account_exchange_config = AccountExchangeConfigApi(self._client)
        self.invoice = InvoiceApi(self._client)
        self.search_chat = SearchChatApi(self._client)
        self.ppt_template_rendering = PptTemplateRenderingApi(self._client)
        self.ppt_template_chat = PptTemplateChatApi(self._client)
        self.knowledge_base_file = KnowledgeBaseFileApi(self._client)
        self.knowledge_base_chat = KnowledgeBaseChatApi(self._client)
        self.im_message = ImMessageApi(self._client)
        self.voice_speaker_generation = VoiceSpeakerGenerationApi(self._client)
        self.video_generation = VideoGenerationApi(self._client)
        self.music_generation = MusicGenerationApi(self._client)
        self.image_generation = ImageGenerationApi(self._client)
        self.character_generation = CharacterGenerationApi(self._client)
        self.audio_generation = AudioGenerationApi(self._client)
        self.audio_effect_generation = AudioEffectGenerationApi(self._client)
        self.chat = ChatApi(self._client)
        self.auth = AuthApi(self._client)
        self.agent_chat = AgentChatApi(self._client)

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
