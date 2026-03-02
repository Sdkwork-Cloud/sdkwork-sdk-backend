package com.sdkwork.backend.model;

public class DnsServers {
    private List<DnsServer> servers;
    private Boolean empty;

    public List<DnsServer> getServers() {
        return this.servers;
    }
    
    public void setServers(List<DnsServer> servers) {
        this.servers = servers;
    }

    public Boolean getEmpty() {
        return this.empty;
    }
    
    public void setEmpty(Boolean empty) {
        this.empty = empty;
    }
}
