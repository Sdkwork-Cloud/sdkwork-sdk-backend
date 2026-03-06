from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAgentSkillPackageQueryListForm:
    """技能分包查询参数"""
    id: int = None
    created_at_from: str = None
    created_at_to: str = None
    keyword: str = None
    user_id: int = None
    category_id: int = None
    enabled: bool = None
    featured: bool = None
