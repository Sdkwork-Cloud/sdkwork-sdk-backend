import type { AssetReference } from './asset-reference';
import type { ContentSegment } from './content-segment';
import type { GenerationContext } from './generation-context';

export interface FileContentObject {
  schemaVersion?: string;
  source?: string;
  text?: string;
  contents?: Record<string, string>;
  metadata?: Record<string, Record<string, unknown>>;
  generation?: GenerationContext;
  segments?: ContentSegment[];
  references?: AssetReference[];
}
