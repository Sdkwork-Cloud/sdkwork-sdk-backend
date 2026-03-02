using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PoolConfig
    {
        public int? MinIdle { get; set; }
        public int? MaxPoolSize { get; set; }
        public int? ConnectionTimeout { get; set; }
        public int? IdleTimeout { get; set; }
        public int? MaxLifetime { get; set; }
        public bool? AutoCommit { get; set; }
        public string? ConnectionTestQuery { get; set; }
        public string? PoolName { get; set; }
    }
}
