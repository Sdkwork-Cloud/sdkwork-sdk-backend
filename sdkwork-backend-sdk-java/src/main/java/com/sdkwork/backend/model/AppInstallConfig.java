package com.sdkwork.backend.model;

public class AppInstallConfig {
    private List<AppInstallPackage> packages;
    private String defaultPackageId;
    private String installCommand;
    private String launchCommand;
    private String uninstallCommand;
    private Map<String, Object> metadata;

    public List<AppInstallPackage> getPackages() {
        return this.packages;
    }
    
    public void setPackages(List<AppInstallPackage> packages) {
        this.packages = packages;
    }

    public String getDefaultPackageId() {
        return this.defaultPackageId;
    }
    
    public void setDefaultPackageId(String defaultPackageId) {
        this.defaultPackageId = defaultPackageId;
    }

    public String getInstallCommand() {
        return this.installCommand;
    }
    
    public void setInstallCommand(String installCommand) {
        this.installCommand = installCommand;
    }

    public String getLaunchCommand() {
        return this.launchCommand;
    }
    
    public void setLaunchCommand(String launchCommand) {
        this.launchCommand = launchCommand;
    }

    public String getUninstallCommand() {
        return this.uninstallCommand;
    }
    
    public void setUninstallCommand(String uninstallCommand) {
        this.uninstallCommand = uninstallCommand;
    }

    public Map<String, Object> getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }
}
