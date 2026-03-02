from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAppForm:
    """Application creation form"""
    name: str
    icon: ImageMediaResource = None
    resource_list: AssetMediaResourceList = None
    project_id: int = None
    description: str = None
    version: str = None
    icon_url: str = None
    access_url: str = None
    config: AppConfig = None
    status: str
    app_type: str
    platforms: AppPlatforms
    package_name: str = None
    bundle_id: str = None
    store_url: str = None
    download_url: str = None
