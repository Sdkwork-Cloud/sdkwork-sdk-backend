import type { ImageMediaResource } from './image-media-resource';

export interface AuthorInfo {
  id?: number;
  faceImage?: ImageMediaResource;
  name?: string;
  email?: string;
  bio?: string;
  website?: string;
}
