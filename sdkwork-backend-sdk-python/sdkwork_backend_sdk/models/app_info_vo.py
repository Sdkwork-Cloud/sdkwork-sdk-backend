from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AppInfoVO:
    """应用信息视图对象"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    name: str = None
    version: str = None
    description: str = None
    project_id: int = None
    icon: ImageMediaResource = None
    resource_list: AssetMediaResourceList = None
    icon_url: str = None
    access_url: str = None
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
    build_time: str = None
    start_time: str = None
    environment: str = None
