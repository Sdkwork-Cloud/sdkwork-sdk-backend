/** 角色生成表单，用于传递角色生成的业务参数 */
export interface GenerateCharacterForm {
  /** 角色名称 */
  name: string;
  /** 角色描述 */
  description: string;
  /** 角色外观描述 */
  appearance?: string;
  /** 角色性格特点 */
  personality?: string;
  /** 角色背景故事 */
  background?: string;
  /** 生成风格 */
  style?: string;
  /** 输出格式 */
  responseFormat?: string;
  /** 生成模型 */
  model?: string;
  /** 生成数量 */
  n: number;
  /** 图像宽度 */
  width?: number;
  /** 图像高度 */
  height?: number;
  /** 生成质量 */
  quality?: string;
  /** 提示词 */
  prompt?: string;
  /** 反向提示词 */
  negativePrompt?: string;
}
