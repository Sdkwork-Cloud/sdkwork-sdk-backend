from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusKnowledgeBaseForm:
    """Knowledge base creation form"""
    name: str
    description: str = None
