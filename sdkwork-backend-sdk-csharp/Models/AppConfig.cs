using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class AppConfig
    {
        public OfficialAccountConfig? OfficialAccount { get; set; }
        public AppPublishConfig? Publish { get; set; }
    }
}
