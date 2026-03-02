from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusShopVO:
    """Shop VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    user_id: int = None
    name: str = None
    description: str = None
    logo: ImageMediaResource = None
    cover: ImageMediaResource = None
    contact_phone: str = None
    contact_email: str = None
    location: GeoPoint = None
    address: str = None
    license_number: str = None
    tags: List[str] = None
    status: str = None
    business_hours: str = None
