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
from .api.ai_usage_record import AiUsageRecordApi
from .api.shopping_cart import ShoppingCartApi
from .api.shopping_cart_item import ShoppingCartItemApi
from .api.refund import RefundApi
from .api.payment import PaymentApi
from .api.order import OrderApi
from .api.order_item import OrderItemApi
from .api.ai_tool import AiToolApi
from .api.tenant import TenantApi
from .api.database_table import DatabaseTableApi
from .api.product_sku import ProductSkuApi
from .api.short_url import ShortUrlApi
from .api.shop import ShopApi
from .api.share import ShareApi
from .api.share_visit_record import ShareVisitRecordApi
from .api.sharding_key import ShardingKeyApi
from .api.schema import SchemaApi
from .api.rbac_role import RbacRoleApi
from .api.role_permission import RolePermissionApi
from .api.invocation_record import InvocationRecordApi
from .api.rbac_user_role import RbacUserRoleApi
from .api.ai_prompt import AiPromptApi
from .api.project import ProjectApi
from .api.product import ProductApi
from .api.ppt_template import PptTemplateApi
from .api.ppt_template_slide import PptTemplateSlideApi
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
from .api.host import HostApi
from .api.dns_record import DnsRecordApi
from .api.music import MusicApi
from .api.ai_model_information import AiModelInformationApi
from .api.ai_model_price import AiModelPriceApi
from .api.chat_message import ChatMessageApi
from .api.member_level import MemberLevelApi
from .api.member_card import MemberCardApi
from .api.knowledge_base import KnowledgeBaseApi
from .api.invitation_relation import InvitationRelationApi
from .api.invitation_code import InvitationCodeApi
from .api.image import ImageApi
from .api.chat_group import ChatGroupApi
from .api.ai_generation import AiGenerationApi
from .api.ai_generation_content import AiGenerationContentApi
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
from .api.ai_conversation import AiConversationApi
from .api.comment import CommentApi
from .api.column import ColumnApi
from .api.collection import CollectionApi
from .api.collection_item import CollectionItemApi
from .api.character import CharacterApi
from .api.channel_resource import ChannelResourceApi
from .api.channel_account import ChannelAccountApi
from .api.ai_category import AiCategoryApi
from .api.membership_card import MembershipCardApi
from .api.card_template import CardTemplateApi
from .api.attribute import AttributeApi
from .api.ai_article import AiArticleApi
from .api.application import ApplicationApi
from .api.api_key import ApiKeyApi
from .api.ai_agent import AiAgentApi
from .api.ai_agent_tool_relationship import AiAgentToolRelationshipApi
from .api.account import AccountApi
from .api.account_history import AccountHistoryApi
from .api.search_chat import SearchChatApi
from .api.ppt_template_rendering import PptTemplateRenderingApi
from .api.ppt_template_chat import PptTemplateChatApi
from .api.knowledge_base_file import KnowledgeBaseFileApi
from .api.knowledge_base_chat import KnowledgeBaseChatApi
from .api.im_message import ImMessageApi
from .api.ai_voice_speaker_generation import AiVoiceSpeakerGenerationApi
from .api.ai_video_generation import AiVideoGenerationApi
from .api.ai_music_generation import AiMusicGenerationApi
from .api.ai_image_generation import AiImageGenerationApi
from .api.ai_character_generation import AiCharacterGenerationApi
from .api.ai_audio_generation import AiAudioGenerationApi
from .api.ai_audio_effect_generation import AiAudioEffectGenerationApi
from .api.ai_chat import AiChatApi
from .api.verification import VerificationApi
from .api.oauth_authentication import OauthAuthenticationApi
from .api.authorization import AuthorizationApi
from .api.authentication import AuthenticationApi
from .api.app import AppApi
from .api.ai_agent_chat import AiAgentChatApi


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
        self.ai_usage_record: AiUsageRecordApi
        self.shopping_cart: ShoppingCartApi
        self.shopping_cart_item: ShoppingCartItemApi
        self.refund: RefundApi
        self.payment: PaymentApi
        self.order: OrderApi
        self.order_item: OrderItemApi
        self.ai_tool: AiToolApi
        self.tenant: TenantApi
        self.database_table: DatabaseTableApi
        self.product_sku: ProductSkuApi
        self.short_url: ShortUrlApi
        self.shop: ShopApi
        self.share: ShareApi
        self.share_visit_record: ShareVisitRecordApi
        self.sharding_key: ShardingKeyApi
        self.schema: SchemaApi
        self.rbac_role: RbacRoleApi
        self.role_permission: RolePermissionApi
        self.invocation_record: InvocationRecordApi
        self.rbac_user_role: RbacUserRoleApi
        self.ai_prompt: AiPromptApi
        self.project: ProjectApi
        self.product: ProductApi
        self.ppt_template: PptTemplateApi
        self.ppt_template_slide: PptTemplateSlideApi
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
        self.host: HostApi
        self.dns_record: DnsRecordApi
        self.music: MusicApi
        self.ai_model_information: AiModelInformationApi
        self.ai_model_price: AiModelPriceApi
        self.chat_message: ChatMessageApi
        self.member_level: MemberLevelApi
        self.member_card: MemberCardApi
        self.knowledge_base: KnowledgeBaseApi
        self.invitation_relation: InvitationRelationApi
        self.invitation_code: InvitationCodeApi
        self.image: ImageApi
        self.chat_group: ChatGroupApi
        self.ai_generation: AiGenerationApi
        self.ai_generation_content: AiGenerationContentApi
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
        self.ai_conversation: AiConversationApi
        self.comment: CommentApi
        self.column: ColumnApi
        self.collection: CollectionApi
        self.collection_item: CollectionItemApi
        self.character: CharacterApi
        self.channel_resource: ChannelResourceApi
        self.channel_account: ChannelAccountApi
        self.ai_category: AiCategoryApi
        self.membership_card: MembershipCardApi
        self.card_template: CardTemplateApi
        self.attribute: AttributeApi
        self.ai_article: AiArticleApi
        self.application: ApplicationApi
        self.api_key: ApiKeyApi
        self.ai_agent: AiAgentApi
        self.ai_agent_tool_relationship: AiAgentToolRelationshipApi
        self.account: AccountApi
        self.account_history: AccountHistoryApi
        self.search_chat: SearchChatApi
        self.ppt_template_rendering: PptTemplateRenderingApi
        self.ppt_template_chat: PptTemplateChatApi
        self.knowledge_base_file: KnowledgeBaseFileApi
        self.knowledge_base_chat: KnowledgeBaseChatApi
        self.im_message: ImMessageApi
        self.ai_voice_speaker_generation: AiVoiceSpeakerGenerationApi
        self.ai_video_generation: AiVideoGenerationApi
        self.ai_music_generation: AiMusicGenerationApi
        self.ai_image_generation: AiImageGenerationApi
        self.ai_character_generation: AiCharacterGenerationApi
        self.ai_audio_generation: AiAudioGenerationApi
        self.ai_audio_effect_generation: AiAudioEffectGenerationApi
        self.ai_chat: AiChatApi
        self.verification: VerificationApi
        self.oauth_authentication: OauthAuthenticationApi
        self.authorization: AuthorizationApi
        self.authentication: AuthenticationApi
        self.app: AppApi
        self.ai_agent_chat: AiAgentChatApi

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
        self.ai_usage_record = AiUsageRecordApi(self._client)
        self.shopping_cart = ShoppingCartApi(self._client)
        self.shopping_cart_item = ShoppingCartItemApi(self._client)
        self.refund = RefundApi(self._client)
        self.payment = PaymentApi(self._client)
        self.order = OrderApi(self._client)
        self.order_item = OrderItemApi(self._client)
        self.ai_tool = AiToolApi(self._client)
        self.tenant = TenantApi(self._client)
        self.database_table = DatabaseTableApi(self._client)
        self.product_sku = ProductSkuApi(self._client)
        self.short_url = ShortUrlApi(self._client)
        self.shop = ShopApi(self._client)
        self.share = ShareApi(self._client)
        self.share_visit_record = ShareVisitRecordApi(self._client)
        self.sharding_key = ShardingKeyApi(self._client)
        self.schema = SchemaApi(self._client)
        self.rbac_role = RbacRoleApi(self._client)
        self.role_permission = RolePermissionApi(self._client)
        self.invocation_record = InvocationRecordApi(self._client)
        self.rbac_user_role = RbacUserRoleApi(self._client)
        self.ai_prompt = AiPromptApi(self._client)
        self.project = ProjectApi(self._client)
        self.product = ProductApi(self._client)
        self.ppt_template = PptTemplateApi(self._client)
        self.ppt_template_slide = PptTemplateSlideApi(self._client)
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
        self.host = HostApi(self._client)
        self.dns_record = DnsRecordApi(self._client)
        self.music = MusicApi(self._client)
        self.ai_model_information = AiModelInformationApi(self._client)
        self.ai_model_price = AiModelPriceApi(self._client)
        self.chat_message = ChatMessageApi(self._client)
        self.member_level = MemberLevelApi(self._client)
        self.member_card = MemberCardApi(self._client)
        self.knowledge_base = KnowledgeBaseApi(self._client)
        self.invitation_relation = InvitationRelationApi(self._client)
        self.invitation_code = InvitationCodeApi(self._client)
        self.image = ImageApi(self._client)
        self.chat_group = ChatGroupApi(self._client)
        self.ai_generation = AiGenerationApi(self._client)
        self.ai_generation_content = AiGenerationContentApi(self._client)
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
        self.ai_conversation = AiConversationApi(self._client)
        self.comment = CommentApi(self._client)
        self.column = ColumnApi(self._client)
        self.collection = CollectionApi(self._client)
        self.collection_item = CollectionItemApi(self._client)
        self.character = CharacterApi(self._client)
        self.channel_resource = ChannelResourceApi(self._client)
        self.channel_account = ChannelAccountApi(self._client)
        self.ai_category = AiCategoryApi(self._client)
        self.membership_card = MembershipCardApi(self._client)
        self.card_template = CardTemplateApi(self._client)
        self.attribute = AttributeApi(self._client)
        self.ai_article = AiArticleApi(self._client)
        self.application = ApplicationApi(self._client)
        self.api_key = ApiKeyApi(self._client)
        self.ai_agent = AiAgentApi(self._client)
        self.ai_agent_tool_relationship = AiAgentToolRelationshipApi(self._client)
        self.account = AccountApi(self._client)
        self.account_history = AccountHistoryApi(self._client)
        self.search_chat = SearchChatApi(self._client)
        self.ppt_template_rendering = PptTemplateRenderingApi(self._client)
        self.ppt_template_chat = PptTemplateChatApi(self._client)
        self.knowledge_base_file = KnowledgeBaseFileApi(self._client)
        self.knowledge_base_chat = KnowledgeBaseChatApi(self._client)
        self.im_message = ImMessageApi(self._client)
        self.ai_voice_speaker_generation = AiVoiceSpeakerGenerationApi(self._client)
        self.ai_video_generation = AiVideoGenerationApi(self._client)
        self.ai_music_generation = AiMusicGenerationApi(self._client)
        self.ai_image_generation = AiImageGenerationApi(self._client)
        self.ai_character_generation = AiCharacterGenerationApi(self._client)
        self.ai_audio_generation = AiAudioGenerationApi(self._client)
        self.ai_audio_effect_generation = AiAudioEffectGenerationApi(self._client)
        self.ai_chat = AiChatApi(self._client)
        self.verification = VerificationApi(self._client)
        self.oauth_authentication = OauthAuthenticationApi(self._client)
        self.authorization = AuthorizationApi(self._client)
        self.authentication = AuthenticationApi(self._client)
        self.app = AppApi(self._client)
        self.ai_agent_chat = AiAgentChatApi(self._client)

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
