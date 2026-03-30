import type { AssetMediaResource } from './asset-media-resource';
import type { VideoMediaResource } from './video-media-resource';

/** 视频媒体资源列表 */
export interface VideoMediaResourceList {
  /** 视频资源列表 */
  videos?: VideoMediaResource[];
  /** 通用资源列表 */
  resources?: AssetMediaResource[];
}
