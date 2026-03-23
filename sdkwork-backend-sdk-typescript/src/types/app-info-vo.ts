import type { AppInstallConfig } from './app-install-config';
import type { AppInstallSkill } from './app-install-skill';
import type { AppPlatforms } from './app-platforms';
import type { AssetMediaResourceList } from './asset-media-resource-list';
import type { ImageMediaResource } from './image-media-resource';

/** åºç¨ä¿¡æ¯è§å¾å¯¹è±¡ */
export interface AppInfoVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** åºç¨ID */
  id?: number;
  /** åºç¨åç§° */
  name?: string;
  /** åºç¨çæ¬ */
  version?: string;
  /** åºç¨æè¿° */
  description?: string;
  /** é¡¹ç®ID */
  projectId?: number;
  /** åºç¨å¾æ  */
  icon?: ImageMediaResource;
  /** åºç¨èµæºåè¡¨ */
  resourceList?: AssetMediaResourceList;
  /** åºç¨å¾æ URL */
  iconUrl?: string;
  /** åºç¨è®¿é®URL */
  accessUrl?: string;
  /** åºç¨ç¶æ */
  status?: string;
  /** åºç¨ç±»å */
  appType?: 'NONE' | 'SDK' | 'PPT' | 'APP_HTML' | 'APP_VUE' | 'APP_FLUTTER' | 'APP_UNIAPP' | 'APP_REACT' | 'APP_UNITY' | 'VIDEO' | 'POSTER';
  /** æ¯æçå¹³å° */
  platforms?: AppPlatforms;
  /** æ¯æå®è£çå¹³å° */
  installPlatforms?: AppPlatforms;
  /** åºç¨å®è£æè½ */
  installSkill?: AppInstallSkill;
  /** å®è£éç½® */
  installConfig?: AppInstallConfig;
  /** åºç¨åå */
  packageName?: string;
  /** åºç¨Bundle ID */
  bundleId?: string;
  /** åºç¨ååºURL */
  storeUrl?: string;
  /** åºç¨ä¸è½½URL */
  downloadUrl?: string;
  /** æå»ºæ¶é´ */
  buildTime?: string;
  /** å¯å¨æ¶é´ */
  startTime?: string;
  /** è¿è¡ç¯å¢ */
  environment?: string;
}
