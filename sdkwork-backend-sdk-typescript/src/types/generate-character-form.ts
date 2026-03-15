/** 瑙掕壊鐢熸垚琛ㄥ崟锛岀敤浜庝紶閫掕鑹茬敓鎴愮殑涓氬姟鍙傛暟 */
export interface GenerateCharacterForm {
  /** 瑙掕壊鍚嶇О */
  name: string;
  /** 瑙掕壊鎻忚堪 */
  description: string;
  /** 瑙掕壊澶栬鎻忚堪 */
  appearance?: string;
  /** 瑙掕壊鎬ф牸鐗圭偣 */
  personality?: string;
  /** 瑙掕壊鑳屾櫙鏁呬簨 */
  background?: string;
  /** 鐢熸垚椋庢牸 */
  style?: string;
  /** 杈撳嚭鏍煎紡 */
  responseFormat?: string;
  /** 鐢熸垚妯″瀷 */
  model?: string;
  /** 鐢熸垚鏁伴噺 */
  n: number;
  /** 鍥惧儚瀹藉害 */
  width?: number;
  /** 鍥惧儚楂樺害 */
  height?: number;
  /** 鐢熸垚璐ㄩ噺 */
  quality?: string;
  /** P ro mp t */
  prompt?: string;
  /** N eg at iv eP ro mp t */
  negativePrompt?: string;
}
