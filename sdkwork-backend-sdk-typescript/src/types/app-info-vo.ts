import type { AppPlatforms } from './app-platforms';
import type { AssetMediaResourceList } from './asset-media-resource-list';
import type { ImageMediaResource } from './image-media-resource';

/** 应用信息视图对象 */
export interface AppInfoVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 应用ID */
  id?: number;
  /** 应用名称 */
  name?: string;
  /** 应用版本 */
  version?: string;
  /** 应用描述 */
  description?: string;
  /** 项目ID */
  projectId?: number;
  /** 应用图标 */
  icon?: ImageMediaResource;
  /** 应用资源列表 */
  resourceList?: AssetMediaResourceList;
  /** 应用图标URL */
  iconUrl?: string;
  /** 应用访问URL */
  accessUrl?: string;
  /** 应用状态 */
  status?: string;
  /** 应用类型 */
  appType?: 'NONE' | 'SDK' | 'PPT' | 'APP_HTML' | 'APP_VUE' | 'APP_FLUTTER' | 'APP_UNIAPP' | 'APP_REACT' | 'APP_UNITY' | 'VIDEO' | 'POSTER';
  /** 支持的平台 */
  platforms?: AppPlatforms;
  /** 应用包名 */
  packageName?: string;
  /** 应用Bundle ID */
  bundleId?: string;
  /** 应用商店URL */
  storeUrl?: string;
  /** 应用下载URL */
  downloadUrl?: string;
  /** 构建时间 */
  buildTime?: string;
  /** 启动时间 */
  startTime?: string;
  /** 运行环境 */
  environment?: string;
}
