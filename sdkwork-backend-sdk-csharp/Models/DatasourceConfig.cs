using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class DatasourceConfig
    {
        public string? Type { get; set; }
        public string? Host { get; set; }
        public int? Port { get; set; }
        public string? Database { get; set; }
        public string? Username { get; set; }
        public string? Password { get; set; }
        public string? Params { get; set; }
        public PoolConfig? PoolConfig { get; set; }
        public string? DriverClassName { get; set; }
        public string? JdbcUrl { get; set; }
    }
}
