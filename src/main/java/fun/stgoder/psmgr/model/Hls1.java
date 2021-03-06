package fun.stgoder.psmgr.model;

import fun.stgoder.psmgr.ps.live.Hls;

public class Hls1 {
    private String key;
    private String source;
    private boolean keepAlive;
    private long cancelAfterSeconds;
    private long birthTime;
    private long upTime;
    private boolean alive;

    public static Hls1 fromHls(Hls hls) {
        Hls1 hls1 = new Hls1();
        hls1.setKey(hls.key());
        hls1.setSource(hls.source());
        hls1.setKeepAlive(hls.keepAlive());
        hls1.setCancelAfterSeconds(hls.cancelAfterSeconds());
        hls1.setBirthTime(hls.birthTime());
        hls1.setUpTime(hls.upTime());
        hls1.setAlive(hls.isAlive());
        return hls1;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public boolean isKeepAlive() {
        return keepAlive;
    }

    public void setKeepAlive(boolean keepAlive) {
        this.keepAlive = keepAlive;
    }

    public long getCancelAfterSeconds() {
        return cancelAfterSeconds;
    }

    public void setCancelAfterSeconds(long cancelAfterSeconds) {
        this.cancelAfterSeconds = cancelAfterSeconds;
    }

    public long getBirthTime() {
        return birthTime;
    }

    public void setBirthTime(long birthTime) {
        this.birthTime = birthTime;
    }

    public long getUpTime() {
        return upTime;
    }

    public void setUpTime(long upTime) {
        this.upTime = upTime;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
