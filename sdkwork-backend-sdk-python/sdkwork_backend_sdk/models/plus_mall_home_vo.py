from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusMallHomeVO:
    """Mall Home Value Object - Represents the home page data of the mall including various product lists"""
    created_at: str = None
    updated_at: str = None
    grid_categories: List[PlusCategoryVO] = None
    products: List[PlusProductVO] = None
    banners: List[PlusProductVO] = None
    hot_products: List[PlusProductVO] = None
    new_products: List[PlusProductVO] = None
    recommend_products: List[PlusProductVO] = None
    hot_sales_products: List[PlusProductVO] = None
