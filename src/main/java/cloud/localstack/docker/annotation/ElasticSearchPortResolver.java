package cloud.localstack.docker.annotation;

public class ElasticSearchPortResolver implements IPortResolver {

    @Override
    public String getPort() { return "4571"; }
}
