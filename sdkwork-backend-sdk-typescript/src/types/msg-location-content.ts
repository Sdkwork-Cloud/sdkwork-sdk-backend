import type { GeoPoint } from './geo-point';

/** IM位置消息内容类 */
export interface MsgLocationContent {
  /** 消息内容 */
  content?: string;
  /** 地理位置坐标 */
  location?: GeoPoint;
  /** 位置的地址信息 */
  address?: string;
  /** 位置或地点名称 */
  name?: string;
  /** 位置精度半径(米) */
  radius?: number;
}
