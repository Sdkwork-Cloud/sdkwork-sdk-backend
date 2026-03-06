from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAgentSkillPackageForm:
    """技能分包创建/更新表单"""
    user_id: int = None
    package_key: str = None
    name: str = None
    summary: str = None
    description: str = None
    icon: str = None
    cover_image: str = None
    category_id: int = None
    enabled: bool = None
    featured: bool = None
    sort_weight: int = None
    tags: List[str] = None
