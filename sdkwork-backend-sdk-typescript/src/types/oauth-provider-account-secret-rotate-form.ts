/** OAuth provider account secret rotate form */
export interface OAuthProviderAccountSecretRotateForm {
  /** New OAuth app secret or client secret */
  appSecret?: string;
  /** New OAuth token */
  token?: string;
  /** New OAuth encoding AES key */
  encodingAESKey?: string;
}
