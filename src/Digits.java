public class Digits {
    private int num, record;
    private long realRecord;

    public Digits(int num, int record) {
        this.num = num;
        this.record = record;
    }
    public Digits(int num, long record) {
        this.num = num;
        realRecord = record;
    }

    public int number() {
        int available = 0;
        for (int i = 0; i < num; i++) {
            int keepTrack = num - i;
            if (i * keepTrack > record) {
                available++;
            }
        }
        return available;
    }
    public int part2() {
        int available = 0;
        for (int i = 0; i < num; i++) {
            int keepTrack = num - i;
            if ((long) i * keepTrack > realRecord) {
                available++;
            }
        }
        return available;
    }
}
