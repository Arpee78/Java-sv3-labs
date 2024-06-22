package stringmethods.url;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UrlManagerTest {

    UrlManager urlManager;

    @Test
    void testSimpleUrl() {
        String url = "HTTPS://EarthQuake.USgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";
        this.urlManager = new UrlManager(url);

        assertEquals("https", this.urlManager.getProtocol());
        assertEquals("earthquake.usgs.gov", this.urlManager.getHost());
        assertEquals("/fdsnws/event/1/query", this.urlManager.getPath());
        assertNull(this.urlManager.getPort());
    }

    @Test
    void testUrlWithPortAtEnd() {
        String urlWithPortAtEnd = "HTTPS://EarthQuake.USgs.gov:80";
        urlManager = new UrlManager(urlWithPortAtEnd);

        assertEquals("https", urlManager.getProtocol());
        assertEquals("earthquake.usgs.gov", urlManager.getHost());
        assertEquals("", urlManager.getPath());
        assertEquals(80, urlManager.getPort());
    }

    @Test
    void testUrlWithPort() {
        String urlWithPort = "HTTPS://EarthQuake.USgs.gov:80/query?a=4";
        urlManager = new UrlManager(urlWithPort);

        assertEquals("https", urlManager.getProtocol());
        assertEquals("earthquake.usgs.gov", urlManager.getHost());
        assertEquals("/query", urlManager.getPath());
        assertEquals(80, urlManager.getPort());
    }

    @Test
    void testUrlWithProperty() {
        String urlWithProperty = "HTTPS://EarthQuake.USgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";
        urlManager = new UrlManager(urlWithProperty);

        assertEquals(true, urlManager.hasProperty("format"));
        assertEquals("geojson", urlManager.getProperty("format"));
        assertEquals(false, urlManager.hasProperty("place"));
        assertNull(urlManager.getProperty("place"));
        assertEquals(false, urlManager.hasProperty("time"));
        assertNull(urlManager.getProperty("time"));
    }
}