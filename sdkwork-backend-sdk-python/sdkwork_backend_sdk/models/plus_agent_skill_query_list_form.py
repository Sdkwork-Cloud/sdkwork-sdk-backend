from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAgentSkillQueryListForm:
    """技能分页查询参数"""
    id: int = None
    created_at_from: str = None
    created_at_to: str = None
    keyword: str = None
    user_id: int = None
    category_id: int = None
    package_id: int = None
    market_status: str = None
    visibility: str = None
    source_type: str = None
    review_status: str = None
    builtin: bool = None
    enabled: bool = None
    featured: bool = None
