using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class AppPublishConfig
    {
        public List<AppStoreListingConfig>? Stores { get; set; }
    }
}
