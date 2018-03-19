package gridu;

import org.apache.hadoop.io.Text;

public class Main {

    public static void main(String[] args) {
        SubnetAddressChecker ia = new SubnetAddressChecker();

        System.out.println(ia.evaluate(new Text("88.144.0.1"), new Text("88.147.213.79/12")));
        System.out.println(ia.evaluate(new Text("88.159.255.254"), new Text("88.147.213.79/12")));
        System.out.println(ia.evaluate(new Text("88.150.150.2"), new Text("88.147.213.79/12")));
        System.out.println(ia.evaluate(new Text("88.160.1.1"), new Text("88.147.213.79/12")));
        System.out.println(ia.evaluate(new Text("88.143.255.255"), new Text("88.147.213.79/12")));

    }
}
