using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class AppInstallConfig
    {
        public List<AppInstallPackage>? Packages { get; set; }
        public string? DefaultPackageId { get; set; }
        public string? InstallCommand { get; set; }
        public string? LaunchCommand { get; set; }
        public string? UninstallCommand { get; set; }
        public Dictionary<string, object>? Metadata { get; set; }
    }
}
