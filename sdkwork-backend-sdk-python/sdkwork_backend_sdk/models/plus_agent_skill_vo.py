from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAgentSkillVO:
    """技能管理VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    tenant_id: int = None
    organization_id: int = None
    user_id: int = None
    skill_key: str = None
    name: str = None
    summary: str = None
    description: str = None
    icon: str = None
    cover_image: str = None
    category_id: int = None
    category_name: str = None
    package_id: int = None
    package_name: str = None
    provider: str = None
    version: str = None
    runtime: str = None
    entrypoint: str = None
    manifest_url: str = None
    repository_url: str = None
    homepage_url: str = None
    documentation_url: str = None
    license_name: str = None
    source_type: str = None
    market_status: str = None
    visibility: str = None
    review_status: str = None
    review_comment: str = None
    reviewed_by: int = None
    reviewed_at: str = None
    builtin: bool = None
    enabled: bool = None
    featured: bool = None
    recommend_weight: int = None
    price: float = None
    currency: str = None
    install_count: int = None
    rating_avg: float = None
    rating_count: int = None
    tags: List[str] = None
    capabilities: List[str] = None
    config_schema: Dict[str, Any] = None
    default_config: Dict[str, Any] = None
    latest_published_at: str = None
