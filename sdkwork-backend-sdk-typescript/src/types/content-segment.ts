export interface ContentSegment {
  id?: string;
  order?: number;
  type?: string;
  text?: string;
  startMs?: number;
  endMs?: number;
  metadata?: Record<string, unknown>;
}
