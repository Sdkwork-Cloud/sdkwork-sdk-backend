export interface NotaryMatterRequest {
  id?: string;
  name?: string;
  code?: string;
  materials?: string[];
  supportVideo?: boolean;
  status?: string;
  price?: number;
}
