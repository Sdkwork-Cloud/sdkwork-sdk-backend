using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class OrderWorkerDispatchMetadata
    {
        public List<string>? EnabledTaskCodes { get; set; }
        public Dictionary<string, int>? TaskConcurrentOverrides { get; set; }
    }
}
