from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAiAgentConfig:
    """Configuration for AI agent behavior and settings"""
    welcome: str = None
    questions: List[str] = None
    save_files: bool = None
    enable_memory: bool = None
    max_history_messages: int = None
    use_knowledge_base: bool = None
    properties: Dict[str, Any] = None
