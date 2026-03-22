package oop;

public class Browser {
    public void navigate(String address) {
        String ip = findIpAddress(address);
        String html = sendHttpRequest(ip, true);
        System.out.println(html);
    }

    private String sendHttpRequest(String ip, boolean cache) {
        return "<html></html>";
    }

    private String findIpAddress(String address) {
        return "127.0.0.1";
    }


}
