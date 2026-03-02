import type { MimeType } from './mime-type';

export interface Media {
  id?: string;
  mimeType?: MimeType;
  data?: unknown;
  name?: string;
  dataAsByteArray?: string;
}
