from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusShopForm:
    """Shop creation form"""
    name: str
    description: str = None
    logo: ImageMediaResource = None
    cover: ImageMediaResource = None
    contact_phone: str = None
    contact_email: str = None
    location: GeoPoint = None
    address: str = None
    license_number: str = None
    tags: List[str] = None
    status: str
    business_hours: str = None
