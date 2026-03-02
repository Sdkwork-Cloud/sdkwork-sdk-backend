from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MiniProgramSdkConfigVO:
    """微信小程序SDK配置"""
    app_id: str = None
    timestamp: int = None
    nonce_str: str = None
    signature: str = None
    js_api_list: List[str] = None
