from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AgentDefinition:
    id: int = None
    uuid: str = None
    name: str = None
    instructions: str = None
    description: str = None
    type: str = None
    biz_type: str = None
    agents: TeamAgentMembers = None
    tool_config: AgentToolConfig = None
    base_config: PlusAiAgentConfig = None
    knowledge_config: AgentKnowledgeConfig = None
    memory_config: AgentMemoryConfig = None
    speech_config: SpeechConfig = None
    chat_options: ChatOptions = None
