from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AppStoreListingConfig:
    """应用商店发布配置"""
    platform: str = None
    store_app_id: str = None
    package_name: str = None
    bundle_id: str = None
    release_track: str = None
    privacy_policy_url: str = None
    terms_of_service_url: str = None
    support_url: str = None
    support_email: str = None
    marketing_url: str = None
    category: str = None
    subcategory: str = None
    content_rating: str = None
    languages: List[str] = None
    countries: List[str] = None
    screenshot_urls: List[str] = None
