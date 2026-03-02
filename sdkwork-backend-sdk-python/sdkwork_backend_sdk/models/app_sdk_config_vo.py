from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AppSdkConfigVO:
    """App SDK配置"""
    created_at: str = None
    updated_at: str = None
    platform: str = None
    official_account: OfficialAccountSdkConfigVO = None
    mini_program: MiniProgramSdkConfigVO = None
    app: MobileAppSdkConfigVO = None
