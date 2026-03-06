from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAppVO:
    """Application Value Object"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    name: str = None
    icon: ImageMediaResource = None
    resource_list: AssetMediaResourceList = None
    project_id: int = None
    description: str = None
    version: str = None
    icon_url: str = None
    access_url: str = None
    config: AppConfig = None
    status: str = None
    app_type: str = None
    platforms: AppPlatforms = None
    install_platforms: AppPlatforms = None
    install_skill: AppInstallSkill = None
    install_config: AppInstallConfig = None
    package_name: str = None
    bundle_id: str = None
    store_url: str = None
    download_url: str = None
