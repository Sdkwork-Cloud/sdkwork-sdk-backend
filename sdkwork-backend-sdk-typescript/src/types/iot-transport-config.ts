/** IoT transport configuration */
export interface IotTransportConfig {
  /** Transport type (e.g., MQTT, HTTP, CoAP) */
  type?: 'websocket' | 'mqtt' | 'wukongim' | 'udp';
  /** Transport URL */
  url?: string;
  /** Connection timeout in milliseconds */
  connectionTimeout?: number;
  /** Keep alive interval in seconds */
  keepAliveInterval?: number;
  /** Quality of Service level (0, 1, or 2 for MQTT) */
  qos?: number;
  /** Client ID for the connection */
  clientId?: string;
  /** Authentication token for the connection */
  authToken?: string;
  /** Username for authentication */
  username?: string;
  /** Password for authentication */
  password?: string;
  /** SSL/TLS enabled flag */
  sslEnabled?: boolean;
  /** Clean session flag */
  cleanSession?: boolean;
  /** Last will topic */
  willTopic?: string;
  /** Last will message */
  willMessage?: string;
  /** Last will QoS */
  willQos?: number;
  /** Retain last will message */
  willRetain?: boolean;
  /** MQTT publish topics */
  publishTopics?: string[];
  /** MQTT subscribe topics */
  subscribeTopics?: string[];
}
