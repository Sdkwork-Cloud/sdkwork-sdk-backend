from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAiAgentVO:
    """AI Agent Value Object (Represents an AI model agent with configuration and associations)"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    name: str = None
    face_image: ImageMediaResource = None
    face_video: VideoMediaResource = None
    owner: str = None
    owner_id: int = None
    channel: str = None
    channel_id: str = None
    icon: str = None
    description: str = None
    tags: TagsContent = None
    type: str = None
    biz_type: str = None
    status: str = None
    base_config: PlusAiAgentConfig = None
    knowledge_config: AgentKnowledgeConfig = None
    memory_config: AgentMemoryConfig = None
    speech_config: SpeechConfig = None
    tool_config: AgentToolConfig = None
    members: TeamAgentMembers = None
    knowledge_base_id: int = None
    prompt_id: int = None
    category_id: int = None
    chat_options: PlusChatOptions = None
    config: PlusAiAgentConfig = None
    usage_count: int = None
