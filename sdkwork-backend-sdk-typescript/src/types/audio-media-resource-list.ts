import type { AssetMediaResource } from './asset-media-resource';
import type { AudioMediaResource } from './audio-media-resource';

/** 音频媒体资源列表 */
export interface AudioMediaResourceList {
  /** 音频资源列表 */
  audios?: AudioMediaResource[];
  /** 通用资源列表 */
  resources?: AssetMediaResource[];
}
