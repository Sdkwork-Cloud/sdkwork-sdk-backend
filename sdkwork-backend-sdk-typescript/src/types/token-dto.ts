export interface TokenDTO {
  token?: string;
  refreshToken?: string;
  expiresIn?: number;
  refreshExpiresIn?: number;
  userId?: number;
  im?: Record<string, unknown>;
}
