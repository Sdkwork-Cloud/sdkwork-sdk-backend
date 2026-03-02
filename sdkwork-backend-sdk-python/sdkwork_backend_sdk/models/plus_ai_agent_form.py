from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAiAgentForm:
    """AI agent creation form with configuration details"""
    name: str
    face_image: ImageMediaResource = None
    face_video: VideoMediaResource = None
    owner: str = None
    owner_id: int = None
    channel: str = None
    channel_id: str = None
    icon: str = None
    description: str = None
    tags: TagsContent = None
    type: str
    biz_type: str = None
    status: str
    base_config: PlusAiAgentConfig = None
    knowledge_config: AgentKnowledgeConfig = None
    memory_config: AgentMemoryConfig = None
    speech_config: SpeechConfig = None
    tool_config: AgentToolConfig = None
    members: TeamAgentMembers = None
    cate_id: int = None
    knowledge_base_id: int = None
    chat_options: PlusChatOptions = None
    prompt: AiAgentSystemPrompt = None
