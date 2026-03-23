import type { AudioMediaResource } from './audio-media-resource';
import type { CharacterMediaResource } from './character-media-resource';
import type { FileMediaResource } from './file-media-resource';
import type { ImageMediaResource } from './image-media-resource';
import type { MusicMediaResource } from './music-media-resource';
import type { TagsContent } from './tags-content';
import type { VideoMediaResource } from './video-media-resource';

/** åªä½èµæºåè£ç±» */
export interface AssetMediaResource {
  /** èµæºID */
  id?: number;
  /** èµæºUUID */
  uuid?: string;
  /** èµæºURL */
  url?: string;
  /** èµæºå­èæ°æ® */
  bytes?: string;
  /** æ¬å°æä»¶ */
  localFile?: unknown;
  /** èµæºBase64ç¼ç  */
  base64?: string;
  /** èµæºç±»å */
  type?: 'IMAGE' | 'VIDEO' | 'AUDIO' | 'DOCUMENT' | 'FILE' | 'MUSIC' | 'CHARACTER' | 'MODEL_3D' | 'PPT' | 'CODE';
  /** èµæºMIMEç±»å */
  mimeType?: string;
  /** èµæºå¤§å°(å­è) */
  size?: number;
  /** èµæºåç§° */
  name?: string;
  /** èµæºæ©å±å */
  extension?: string;
  /** èµæºæ ç­¾ */
  tags?: TagsContent;
  /** èµæºåæ°æ® */
  metadata?: Record<string, unknown>;
  /** AIçææç¤ºè¯ */
  prompt?: string;
  /** å¾çèµæº */
  image?: ImageMediaResource;
  /** è§é¢èµæº */
  video?: VideoMediaResource;
  /** é³é¢èµæº */
  audio?: AudioMediaResource;
  /** é³ä¹èµæº */
  music?: MusicMediaResource;
  /** æ°å­äºº/è§è²èµæº */
  character?: CharacterMediaResource;
  /** æä»¶èµæº */
  file?: FileMediaResource;
  /** æ©å±å±æ§ */
  extraProps?: Record<string, unknown>;
}
