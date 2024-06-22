package stringmethods.url;

public class UrlManager {

    private String protocol;
    private Integer port;
    private String host;
    private String path;
    private String query;

    public UrlManager(String url) {
        findProtocolInUrl(url);
        findPortInUrl(url);
        findHostInUrl(url);
        findPathInUrl(url);
        findQueryInUrl(url);
    }

    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public String getQuery() {
        return query;
    }

    public boolean hasProperty(String key) {
        if (query == null) {
            return false;
        }
        String[] properties = query.split("&");
        for (String property : properties) {
            if (property.split("=")[0].equals(key)) {
                return true;
            }
        }
        return false;
    }

    public String getProperty(String key) {
        String[] properties = query.split("&");
        for (String property : properties) {
            if (property.split("=")[0].equals(key)) {
                return property.split("=")[1];
            }
        }
        return null;
    }

    private void findProtocolInUrl(String url) {
        protocol = url.split(":")[0].toLowerCase();
    }

    private void findPortInUrl(String url) {
        String[] parts = url.split(":");
        if (parts.length >= 3) {
            port = Integer.parseInt(parts[2].split("/")[0]);
        }
    }

    private void findHostInUrl(String url) {
        host = url.split("/")[2].split(":")[0].toLowerCase();
    }

    private void findPathInUrl(String url) {
        int start = url.toLowerCase().indexOf(host) + host.length();
        if (port != null) {
            start += String.valueOf(port).length() + 1;
        }
        path = url.substring(start).split("\\?")[0];
    }

    private void findQueryInUrl(String url) {
        if (url.contains("?")) {
            query = url.split("\\?")[1];
        }
    }
}
