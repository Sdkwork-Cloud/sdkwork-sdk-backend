using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusPptTheme
    {
        public List<string>? ThemeColors { get; set; }
        public List<string>? SubColors { get; set; }
        public List<string>? ExportThemeColors { get; set; }
        public string? FontColor { get; set; }
        public string? FontName { get; set; }
        public string? BackgroundColor { get; set; }
        public PlusPptThemeShadow? Shadow { get; set; }
        public PlusPptThemeOutline? Outline { get; set; }
    }
}
