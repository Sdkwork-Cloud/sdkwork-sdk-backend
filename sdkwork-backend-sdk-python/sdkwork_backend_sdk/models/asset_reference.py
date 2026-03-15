from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AssetReference:
    file_id: int = None
    file_uuid: str = None
    file_path: str = None
    asset_type: str = None
    mime_type: str = None
    url: str = None
