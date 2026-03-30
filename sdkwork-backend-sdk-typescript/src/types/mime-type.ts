export interface MimeType {
  type?: string;
  subtype?: string;
  parameters?: Record<string, string>;
  charset?: string;
  concrete?: boolean;
  subtypeSuffix?: string;
  wildcardSubtype?: boolean;
  wildcardType?: boolean;
}
