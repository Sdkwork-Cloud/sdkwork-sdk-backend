import type { MimeType } from './mime-type';

export interface Media {
  id?: string;
  mimeType?: MimeType;
  data?: Record<string, unknown>;
  name?: string;
  dataAsByteArray?: string;
}
