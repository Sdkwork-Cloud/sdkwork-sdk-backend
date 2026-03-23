import type { AssetMediaResource } from './asset-media-resource';
import type { AudioMediaResource } from './audio-media-resource';
import type { FileMediaResource } from './file-media-resource';
import type { ImageMediaResource } from './image-media-resource';
import type { MusicMediaResource } from './music-media-resource';
import type { VideoMediaResource } from './video-media-resource';

/** åªä½èµæºåè¡¨ */
export interface AssetMediaResourceList {
  /** å¾çèµæºåè¡¨ */
  images?: ImageMediaResource[];
  /** è§é¢èµæºåè¡¨ */
  videos?: VideoMediaResource[];
  /** é³é¢èµæºåè¡¨ */
  audios?: AudioMediaResource[];
  /** æä»¶èµæºåè¡¨ */
  files?: FileMediaResource[];
  /** é³ä¹èµæºåè¡¨ */
  musics?: MusicMediaResource[];
  /** éç¨èµæºåè¡¨ */
  resources?: AssetMediaResource[];
}
