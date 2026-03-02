from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ModelConfig:
    id: int = None
    uuid: str = None
    weight: int = None
    channel: str = None
    product: str = None
    agent: AgentAccountConfig = None
    app_store: AppStoreAccountConfig = None
    apikey: ApiKeyAccountConfig = None
    audio: AudioAccountConfig = None
    cloud: CloudAccountConfig = None
    datasource: DatasourceAccountConfig = None
    embedding: EmbeddingAccountConfig = None
    files: FilesAccountConfig = None
    im: ImAccountConfig = None
    image: ImageAccountConfig = None
    iot: IotAccountConfig = None
    knowledge: KnowledgeAccountConfig = None
    llm: LlmAccountConfig = None
    memory: MemoryAccountConfig = None
    moderation: ModerationAccountConfig = None
    music: MusicAccountConfig = None
    mini_program: MiniProgramAccountConfig = None
    news: NewsAccountConfig = None
    ocr: OcrAccountConfig = None
    official: OfficialAccountConfig = None
    oss: OssAccountConfig = None
    pay: PayAccountConfig = None
    rtc: RtcAccountConfig = None
    search: SearchAccountConfig = None
    sms: SmsAccountConfig = None
    tool: ToolAccountConfig = None
    vector: VectorAccountConfig = None
    video: VideoAccountConfig = None
    voice: AudioAccountConfig = None
    resources: ChannelResourceInfo = None
    properties: Dict[str, Any] = None
    oauth: OAuthAccountConfig = None
