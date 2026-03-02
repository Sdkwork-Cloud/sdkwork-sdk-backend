from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MobileAppSdkConfigVO:
    """移动应用SDK配置"""
    package_name: str = None
    version: str = None
    app_key: str = None
    push_token: str = None
