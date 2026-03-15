from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusUserAddressForm:
    """Address creation form data"""
    name: str
    phone: str
    country_code: str = None
    province_code: str = None
    city_code: str = None
    district_code: str = None
    address_detail: str
    postal_code: str = None
    is_default: bool = None
    tags: TagsContent = None
