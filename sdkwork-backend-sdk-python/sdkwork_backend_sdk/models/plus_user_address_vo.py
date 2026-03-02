from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusUserAddressVO:
    """用户地址VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    name: str = None
    phone: str = None
    country_code: str = None
    province_code: str = None
    city_code: str = None
    district_code: str = None
    address_detail: str = None
    postal_code: str = None
    is_default: bool = None
    tags: TagsContent = None
