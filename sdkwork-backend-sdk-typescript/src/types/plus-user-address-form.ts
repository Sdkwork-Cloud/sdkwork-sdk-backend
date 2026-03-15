import type { TagsContent } from './tags-content';

/** Address creation form data */
export interface PlusUserAddressForm {
  /** Recipient name */
  name: string;
  /** Phone number */
  phone: string;
  /** Country code */
  countryCode?: string;
  /** Province code */
  provinceCode?: string;
  /** City code */
  cityCode?: string;
  /** District code */
  districtCode?: string;
  /** Detailed address */
  addressDetail: string;
  /** Postal code */
  postalCode?: string;
  /** Whether this is the default address */
  isDefault?: 'true' | 'false';
  /** Address tags */
  tags?: TagsContent;
}
