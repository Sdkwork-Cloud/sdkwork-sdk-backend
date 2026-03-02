import type { AppConfig } from './app-config';
import type { AppPlatforms } from './app-platforms';
import type { AssetMediaResourceList } from './asset-media-resource-list';
import type { ImageMediaResource } from './image-media-resource';

/** Application creation form */
export interface PlusAppForm {
  /** 应用名称 */
  name: string;
  /** 应用图标 */
  icon?: ImageMediaResource;
  /** 应用资源列表 */
  resourceList?: AssetMediaResourceList;
  /** 项目ID */
  projectId?: number;
  /** 应用描述 */
  description?: string;
  /** 应用版本 */
  version?: string;
  /** 应用图标URL */
  iconUrl?: string;
  /** 应用访问URL */
  accessUrl?: string;
  /** 应用配置 */
  config?: AppConfig;
  /** 应用状态 */
  status: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  /** 应用类型 */
  appType: 'NONE' | 'SDK' | 'PPT' | 'APP_HTML' | 'APP_VUE' | 'APP_FLUTTER' | 'APP_UNIAPP' | 'APP_REACT' | 'APP_UNITY' | 'VIDEO' | 'POSTER';
  /** 支持平台 */
  platforms: AppPlatforms;
  /** 应用包名 */
  packageName?: string;
  /** 应用Bundle ID */
  bundleId?: string;
  /** 应用商店URL */
  storeUrl?: string;
  /** 应用下载URL */
  downloadUrl?: string;
}
