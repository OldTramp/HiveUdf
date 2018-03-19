package gridu;

        import org.apache.commons.net.util.SubnetUtils;
        import org.apache.hadoop.hive.ql.exec.Description;
        import org.apache.hadoop.hive.ql.exec.UDF;
        import org.apache.hadoop.io.Text;

@Description(
        name="gridu.SubnetAddressChecker",
        value="Returns address belongs to subnet",
        extended="select gridu.SubnetAddressChecker(ipAddres, subnet) from hivesampletable limit 10;"
)
public final class SubnetAddressChecker extends UDF {


    public boolean evaluate(final Text address, final Text subnet) {

        return new SubnetUtils(subnet.toString()).getInfo().isInRange(address.toString());
    }

}