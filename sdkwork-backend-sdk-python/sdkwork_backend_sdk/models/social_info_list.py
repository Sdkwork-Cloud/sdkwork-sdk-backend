from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SocialInfoList:
    wechat: WechatInfo = None
    facebook: FacebookInfo = None
    twitter: TwitterInfo = None
    instagram: InstagramInfo = None
    linkedin: LinkedInInfo = None
    telegram: TelegramInfo = None
    whatsapp: WhatsAppInfo = None
    tiktok: TikTokInfo = None
