import type { AssetMediaResource } from './asset-media-resource';
import type { AudioMediaResource } from './audio-media-resource';

/** é³é¢åªä½èµæºåè¡¨ */
export interface AudioMediaResourceList {
  /** é³é¢èµæºåè¡¨ */
  audios?: AudioMediaResource[];
  /** éç¨èµæºåè¡¨ */
  resources?: AssetMediaResource[];
}
