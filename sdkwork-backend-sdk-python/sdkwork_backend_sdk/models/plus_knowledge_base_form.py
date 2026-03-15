from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusKnowledgeBaseForm:
    """Knowledge base creation form"""
    name: str
    disk_id: int
    channel: str
    channel_id: str
    project_id: int
    description: str = None
