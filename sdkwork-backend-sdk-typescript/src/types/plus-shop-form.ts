import type { GeoPoint } from './geo-point';
import type { ImageMediaResource } from './image-media-resource';

/** Shop creation form */
export interface PlusShopForm {
  /** Shop name */
  name: string;
  /** Description */
  description?: string;
  /** Logo */
  logo?: ImageMediaResource;
  /** Cover image */
  cover?: ImageMediaResource;
  /** Contact phone */
  contactPhone?: string;
  /** Contact email */
  contactEmail?: string;
  /** Location coordinates */
  location?: GeoPoint;
  /** Address */
  address?: string;
  /** Business license number */
  licenseNumber?: string;
  /** Tags */
  tags?: string[];
  /** Status */
  status: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  /** Business hours */
  businessHours?: string;
}
