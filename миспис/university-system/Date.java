public class Date {
    private long timestamp;
    
    public Date() {
        this.timestamp = System.currentTimeMillis();
    }
    
    public Date(long timestamp) {
        this.timestamp = timestamp;
    }
    
    @Override
    public String toString() {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(new java.util.Date(timestamp));
    }
    
    public long getTime() {
        return timestamp;
    }
}