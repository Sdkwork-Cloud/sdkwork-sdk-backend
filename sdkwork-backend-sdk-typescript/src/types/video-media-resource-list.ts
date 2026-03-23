import type { AssetMediaResource } from './asset-media-resource';
import type { VideoMediaResource } from './video-media-resource';

/** è§é¢åªä½èµæºåè¡¨ */
export interface VideoMediaResourceList {
  /** è§é¢èµæºåè¡¨ */
  videos?: VideoMediaResource[];
  /** éç¨èµæºåè¡¨ */
  resources?: AssetMediaResource[];
}
