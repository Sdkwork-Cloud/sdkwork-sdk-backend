import type { AppInstallPackage } from './app-install-package';

/** åºç¨å®è£éç½® */
export interface AppInstallConfig {
  /** å®è£ååè¡¨ */
  packages?: AppInstallPackage[];
  /** é»è®¤å®è£åID */
  defaultPackageId?: string;
  /** å®è£å½ä»¤æ¨¡æ¿ */
  installCommand?: string;
  /** å¯å¨å½ä»¤æ¨¡æ¿ */
  launchCommand?: string;
  /** å¸è½½å½ä»¤æ¨¡æ¿ */
  uninstallCommand?: string;
  /** æ©å±åæ°æ® */
  metadata?: Record<string, unknown>;
}
