public class Mockito {
    public static void main(String[] args) {
        ExternalApi mockApi = new MockExternalApi();
        MyService service = new MyService(mockApi);
        String result = service.fetchData();
        if ("Mock Data".equals(result)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed: Expected 'Mock Data', got '" + result + "'");
        }
    }
}
interface ExternalApi {
    String getData();
}
class MyService {
    private ExternalApi api;
    public MyService(ExternalApi api) {
        this.api = api;
    }
    public String fetchData() {
        return api.getData();
    }
}
class MockExternalApi implements ExternalApi {
    public String getData() {
        return "Mock Data"; 
    }
}
