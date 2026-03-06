from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AppPublishConfig:
    """应用发布配置"""
    stores: List[AppStoreListingConfig] = None
