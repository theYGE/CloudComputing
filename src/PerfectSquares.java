import parcs.AM;
import parcs.AMInfo;
import parcs.channel;
import parcs.point;

public class PerfectSquares implements AM {

    public void run(AMInfo info){
        Range range = (Range) info.parent.readObject();

        long a = range.getLeftRange();
        long b = range.getRightRange();
        long res = 0;

        point p = null;
        channel c = null;

        long N = range.getN();

        if (range.getNext() != null)
        {
            p = info.createPoint();
            c = p.createChannel();

            p.execute("PerfectSquares");
            c.write(range.getNext());
        }

        for (long n = a; n < b; n++)
        {
            if (isPerfectSquare(n)) {
                res += 1;
            }
        }
        System.out.println("Range (" + range.getLeftRange() + ", " +  range.getRightRange() + ")" + res);
        if (range.getNext() != null) {
            res += c.readLong();
        }
        info.parent.write(res);
    }

    public boolean isPerfectSquare(long num)
    {
        for (int i = 2; i < Math.sqrt(num) + 1; i++)
        {
            if (i*i == num) {
                System.out.println(num + "is a perfect square of: " + i);
                return true;
            }
        }

        return false;
    }
}
