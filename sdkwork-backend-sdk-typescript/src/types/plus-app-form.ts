import type { AppConfig } from './app-config';
import type { AppInstallConfig } from './app-install-config';
import type { AppInstallSkill } from './app-install-skill';
import type { AppPlatforms } from './app-platforms';
import type { AssetMediaResourceList } from './asset-media-resource-list';
import type { ImageMediaResource } from './image-media-resource';

/** Application creation form */
export interface PlusAppForm {
  /** Application name */
  name: string;
  /** Application icon */
  icon?: ImageMediaResource;
  /** Application resource list */
  resourceList?: AssetMediaResourceList;
  /** Project ID */
  projectId?: number;
  /** Application description */
  description?: string;
  /** Application version */
  version?: string;
  /** Application icon URL */
  iconUrl?: string;
  /** Application access URL */
  accessUrl?: string;
  /** Application configuration */
  config?: AppConfig;
  /** Application status */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  /** Application type */
  appType: 'NONE' | 'SDK' | 'PPT' | 'APP_HTML' | 'APP_VUE' | 'APP_FLUTTER' | 'APP_UNIAPP' | 'APP_REACT' | 'APP_UNITY' | 'VIDEO' | 'POSTER';
  /** Supported platforms */
  platforms: AppPlatforms;
  /** Supported installation platforms */
  installPlatforms?: AppPlatforms;
  /** Installation skill */
  installSkill: AppInstallSkill;
  /** Installation configuration */
  installConfig: AppInstallConfig;
  /** Application package name */
  packageName?: string;
  /** Application bundle ID */
  bundleId?: string;
  /** Store URL */
  storeUrl?: string;
  /** Download URL */
  downloadUrl?: string;
}
