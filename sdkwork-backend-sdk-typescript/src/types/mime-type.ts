export interface MimeType {
  type?: string;
  subtype?: string;
  parameters?: Record<string, string>;
  charset?: string;
  concrete?: boolean;
  wildcardSubtype?: boolean;
  wildcardType?: boolean;
  subtypeSuffix?: string;
}
