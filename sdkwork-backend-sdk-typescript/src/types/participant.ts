import type { ImageMediaResource } from './image-media-resource';

/** 消息参与者实体类 */
export interface Participant {
  /** 参与者ID */
  id?: number;
  /** 参与者UUID */
  uuid?: string;
  /** 开放平台OpenID */
  openId?: string;
  /** 开放平台UnionID */
  unionId?: string;
  /** 参与者名称 */
  name?: string;
  /** 参与者头像 */
  face?: ImageMediaResource;
  /** 设备ID */
  deviceId?: number;
  /** 设备UUID */
  deviceUuid?: string;
  device?: boolean;
}
