from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusChannelAccountVO:
    """渠道账户VO，用于展示第三方渠道连接账户信息，如微信公众号、钉钉机器人等"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    user_id: int = None
    name: str = None
    channel: str = None
    configs: ChannelConfigInfo = None
    status: str = None
    description: str = None
