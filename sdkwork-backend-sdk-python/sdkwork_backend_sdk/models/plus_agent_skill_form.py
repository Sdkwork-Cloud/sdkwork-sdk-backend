from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAgentSkillForm:
    """技能创建/更新表单"""
    user_id: int = None
    skill_key: str = None
    name: str = None
    summary: str = None
    description: str = None
    icon: str = None
    cover_image: str = None
    category_id: int = None
    package_id: int = None
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
    visibility: str = None
    enabled: bool = None
    price: float = None
    currency: str = None
    tags: List[str] = None
    capabilities: List[str] = None
    config_schema: Dict[str, Any] = None
    default_config: Dict[str, Any] = None
