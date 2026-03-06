from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAgentSkillPackageVO:
    """技能分包管理VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    tenant_id: int = None
    organization_id: int = None
    user_id: int = None
    package_key: str = None
    name: str = None
    summary: str = None
    description: str = None
    icon: str = None
    cover_image: str = None
    category_id: int = None
    category_name: str = None
    tags: List[str] = None
    enabled: bool = None
    featured: bool = None
    sort_weight: int = None
    skill_count: int = None
    latest_published_at: str = None
