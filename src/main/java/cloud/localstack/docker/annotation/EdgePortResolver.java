package cloud.localstack.docker.annotation;

public class EdgePortResolver implements IPortResolver {

    @Override
    public String getPort() { return "4566"; }
}
