from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusKnowledgeBaseVO:
    """知识库 Value Object"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    name: str = None
    description: str = None
