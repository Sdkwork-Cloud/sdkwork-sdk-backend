import type { InstallAppList } from './install-app-list';

/** Install app list */
export interface PlusOrganizationForm {
  /** Organization name */
  name: string;
  /** Organization code */
  code: string;
  /** Organization status */
  status: 'ACTIVE' | 'INACTIVE' | 'DISABLED' | 'DELETED';
  /** Organization description */
  description?: string;
  /** Parent organization ID */
  parentId?: number;
  /** Installed applications */
  installAppList?: InstallAppList;
}
