import parcs.*;

import java.util.ArrayList;
import java.util.List;

public class Fib implements AM{
    public void run(AMInfo info){
        long n, minimum, r;
        n = info.parent.readLong();
        System.out.print("Working with: ");
        System.out.println(n);

        if (n == 1) {
            r = 1;
        } else {
            minimum = 1;

            int numberOfChannels = 2;
            List<point> points = new ArrayList<>();
            List<channel> channels = new ArrayList<>();

            for (int i =0; i<numberOfChannels; i++) {
                points.add(info.createPoint());
//                channels.add(points.get(i).createChannel());
            }

            for (int i =1; i < ((int) Math.floor(Math.sqrt(n))) + 1; i++) {
                int reminder = i%numberOfChannels;

                System.out.print("Sending to: ");
                System.out.println(reminder);

                channel chan = points.get(reminder).createChannel();
                points.get(reminder).execute("Fib");
                chan.write(n-i*i);
//                channels.get(reminder).write(n-i*i);

                long newComputation = channels.get(reminder).readLong();
                newComputation += 1;

                if (minimum > newComputation) {
                    minimum = newComputation;
                }
            }

            r = minimum;
        }

//        //System.out.println("n="+n);
//        if (n<2) r=n;
//        else {
//            point p1 = info.createPoint();
//            channel c1 = p1.createChannel();
//            p1.execute("Fib");
//            c1.write(n-2);
//
//
//            point p2 = info.createPoint();
//            channel c2 = p2.createChannel();
//            p2.execute("Fib");
//            c2.write(n-1);
//
//            r1=c1.readLong();
//            r2=c2.readLong();
//            //if ((r1==0)||(r2==0)) System.out.println("n="+n+" r1="+r1+" r2="+r2);
//            r=r1+r2;
//        }
        info.parent.write(r);
    }
}
